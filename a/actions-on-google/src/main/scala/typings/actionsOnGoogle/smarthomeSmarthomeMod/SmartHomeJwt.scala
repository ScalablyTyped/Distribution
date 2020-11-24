package typings.actionsOnGoogle.smarthomeSmarthomeMod

import typings.actionsOnGoogle.actionsOnGoogleStrings.service_account
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeJwt extends js.Object {
  
  var auth_provider_x509_cert_url: String = js.native
  
  var auth_uri: String = js.native
  
  var client_email: String = js.native
  
  var client_id: String = js.native
  
  var client_x509_cert_url: String = js.native
  
  var private_key: String = js.native
  
  var private_key_id: String = js.native
  
  var project_id: String = js.native
  
  var token_uri: String = js.native
  
  var `type`: service_account = js.native
}
object SmartHomeJwt {
  
  @scala.inline
  def apply(
    auth_provider_x509_cert_url: String,
    auth_uri: String,
    client_email: String,
    client_id: String,
    client_x509_cert_url: String,
    private_key: String,
    private_key_id: String,
    project_id: String,
    token_uri: String,
    `type`: service_account
  ): SmartHomeJwt = {
    val __obj = js.Dynamic.literal(auth_provider_x509_cert_url = auth_provider_x509_cert_url.asInstanceOf[js.Any], auth_uri = auth_uri.asInstanceOf[js.Any], client_email = client_email.asInstanceOf[js.Any], client_id = client_id.asInstanceOf[js.Any], client_x509_cert_url = client_x509_cert_url.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any], private_key_id = private_key_id.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], token_uri = token_uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeJwt]
  }
  
  @scala.inline
  implicit class SmartHomeJwtOps[Self <: SmartHomeJwt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth_provider_x509_cert_url(value: String): Self = this.set("auth_provider_x509_cert_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuth_uri(value: String): Self = this.set("auth_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_email(value: String): Self = this.set("client_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_x509_cert_url(value: String): Self = this.set("client_x509_cert_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate_key(value: String): Self = this.set("private_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate_key_id(value: String): Self = this.set("private_key_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject_id(value: String): Self = this.set("project_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken_uri(value: String): Self = this.set("token_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: service_account): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
