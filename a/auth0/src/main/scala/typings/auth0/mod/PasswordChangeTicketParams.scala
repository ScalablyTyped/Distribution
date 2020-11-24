package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordChangeTicketParams extends js.Object {
  
  var connection_id: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var includeEmailInRedirect: js.UndefOr[Boolean] = js.native
  
  var mark_email_as_verified: js.UndefOr[Boolean] = js.native
  
  var new_password: js.UndefOr[String] = js.native
  
  var result_url: js.UndefOr[String] = js.native
  
  var ttl_sec: js.UndefOr[Double] = js.native
  
  var user_id: js.UndefOr[String] = js.native
}
object PasswordChangeTicketParams {
  
  @scala.inline
  def apply(): PasswordChangeTicketParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordChangeTicketParams]
  }
  
  @scala.inline
  implicit class PasswordChangeTicketParamsOps[Self <: PasswordChangeTicketParams] (val x: Self) extends AnyVal {
    
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
    def setConnection_id(value: String): Self = this.set("connection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnection_id: Self = this.set("connection_id", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setIncludeEmailInRedirect(value: Boolean): Self = this.set("includeEmailInRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeEmailInRedirect: Self = this.set("includeEmailInRedirect", js.undefined)
    
    @scala.inline
    def setMark_email_as_verified(value: Boolean): Self = this.set("mark_email_as_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMark_email_as_verified: Self = this.set("mark_email_as_verified", js.undefined)
    
    @scala.inline
    def setNew_password(value: String): Self = this.set("new_password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_password: Self = this.set("new_password", js.undefined)
    
    @scala.inline
    def setResult_url(value: String): Self = this.set("result_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult_url: Self = this.set("result_url", js.undefined)
    
    @scala.inline
    def setTtl_sec(value: Double): Self = this.set("ttl_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl_sec: Self = this.set("ttl_sec", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = this.set("user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_id: Self = this.set("user_id", js.undefined)
  }
}
