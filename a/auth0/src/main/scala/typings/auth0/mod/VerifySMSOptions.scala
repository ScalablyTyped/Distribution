package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifySMSOptions extends StObject {
  
  var otp: String
  
  var username: String
}
object VerifySMSOptions {
  
  inline def apply(otp: String, username: String): VerifySMSOptions = {
    val __obj = js.Dynamic.literal(otp = otp.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifySMSOptions]
  }
  
  extension [Self <: VerifySMSOptions](x: Self) {
    
    inline def setOtp(value: String): Self = StObject.set(x, "otp", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
