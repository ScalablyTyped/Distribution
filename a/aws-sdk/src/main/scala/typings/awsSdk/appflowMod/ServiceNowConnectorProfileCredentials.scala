package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceNowConnectorProfileCredentials extends js.Object {
  
  /**
    *  The password that corresponds to the user name. 
    */
  var password: Password = js.native
  
  /**
    *  The name of the user. 
    */
  var username: Username = js.native
}
object ServiceNowConnectorProfileCredentials {
  
  @scala.inline
  def apply(password: Password, username: Username): ServiceNowConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit class ServiceNowConnectorProfileCredentialsOps[Self <: ServiceNowConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPassword(value: Password): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: Username): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
