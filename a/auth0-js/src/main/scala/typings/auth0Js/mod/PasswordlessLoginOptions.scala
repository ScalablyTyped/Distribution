package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordlessLoginOptions
  extends StObject
     with BaseAuthOptions {
  
  var connection: String
  
  var email: js.UndefOr[String] = js.undefined
  
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  var verificationCode: String
}
object PasswordlessLoginOptions {
  
  @scala.inline
  def apply(connection: String, verificationCode: String): PasswordlessLoginOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], verificationCode = verificationCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessLoginOptions]
  }
  
  @scala.inline
  implicit class PasswordlessLoginOptionsMutableBuilder[Self <: PasswordlessLoginOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
  }
}
