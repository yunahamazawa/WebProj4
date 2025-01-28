package com.diworksdev.webproj4.action;


import com.opensymphony.xwork2.ActionSupport;

import diworksdev.webproj4.dao.HelloStrutsDAO;

public class HelloStrutsAction extends ActionSupport{
	public String execute() {
		String ret=ERROR;
		HelloStrutsDAO dao=new HelloStrutsDAO();
		boolean b=dao.select();
		if(b==true){
			ret=SUCCESS;
		}else{
			ret=ERROR;
		}
		return ret;
		}

}
