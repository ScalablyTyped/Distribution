package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordChangeTicketParams extends StObject {
  
  var connection_id: js.UndefOr[String] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var includeEmailInRedirect: js.UndefOr[Boolean] = js.undefined
  
  var mark_email_as_verified: js.UndefOr[Boolean] = js.undefined
  
  var new_password: js.UndefOr[String] = js.undefined
  
  var result_url: js.UndefOr[String] = js.undefined
  
  var ttl_sec: js.UndefOr[Double] = js.undefined
  
  var user_id: js.UndefOr[String] = js.undefined
}
object PasswordChangeTicketParams {
  
  @scala.inline
  def apply(): PasswordChangeTicketParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordChangeTicketParams]
  }
  
  @scala.inline
  implicit class PasswordChangeTicketParamsMutableBuilder[Self <: PasswordChangeTicketParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection_id(value: String): Self = StObject.set(x, "connection_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_idUndefined: Self = StObject.set(x, "connection_id", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setIncludeEmailInRedirect(value: Boolean): Self = StObject.set(x, "includeEmailInRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeEmailInRedirectUndefined: Self = StObject.set(x, "includeEmailInRedirect", js.undefined)
    
    @scala.inline
    def setMark_email_as_verified(value: Boolean): Self = StObject.set(x, "mark_email_as_verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMark_email_as_verifiedUndefined: Self = StObject.set(x, "mark_email_as_verified", js.undefined)
    
    @scala.inline
    def setNew_password(value: String): Self = StObject.set(x, "new_password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_passwordUndefined: Self = StObject.set(x, "new_password", js.undefined)
    
    @scala.inline
    def setResult_url(value: String): Self = StObject.set(x, "result_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult_urlUndefined: Self = StObject.set(x, "result_url", js.undefined)
    
    @scala.inline
    def setTtl_sec(value: Double): Self = StObject.set(x, "ttl_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtl_secUndefined: Self = StObject.set(x, "ttl_sec", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
