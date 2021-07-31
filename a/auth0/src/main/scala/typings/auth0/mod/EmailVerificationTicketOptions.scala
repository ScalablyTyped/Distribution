package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailVerificationTicketOptions extends StObject {
  
  var result_url: String
  
  var user_id: String
}
object EmailVerificationTicketOptions {
  
  @scala.inline
  def apply(result_url: String, user_id: String): EmailVerificationTicketOptions = {
    val __obj = js.Dynamic.literal(result_url = result_url.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailVerificationTicketOptions]
  }
  
  @scala.inline
  implicit class EmailVerificationTicketOptionsMutableBuilder[Self <: EmailVerificationTicketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult_url(value: String): Self = StObject.set(x, "result_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
