package com.kfit.entity;

import java.io.Serializable;

public class userInfo implements Serializable{
private static final long serialVersionUID = -1L;
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

private String username;
private String password;
}
