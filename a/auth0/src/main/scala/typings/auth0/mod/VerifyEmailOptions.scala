package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyEmailOptions extends StObject {
  
  var email: String
  
  var otp: String
}
object VerifyEmailOptions {
  
  inline def apply(email: String, otp: String): VerifyEmailOptions = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], otp = otp.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyEmailOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyEmailOptions] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setOtp(value: String): Self = StObject.set(x, "otp", value.asInstanceOf[js.Any])
  }
}
