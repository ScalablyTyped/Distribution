package typings.auth0.mod

import typings.auth0.auth0Strings.email
import typings.auth0.auth0Strings.sms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignInOptions extends StObject {
  
  var audience: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated
    */
  var connection: js.UndefOr[email | sms] = js.undefined
  
  var otp: String
  
  /**
    * @deprecated
    */
  var password: js.UndefOr[String] = js.undefined
  
  var realm: js.UndefOr[email | sms] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var username: String
}
object SignInOptions {
  
  inline def apply(otp: String, username: String): SignInOptions = {
    val __obj = js.Dynamic.literal(otp = otp.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignInOptions]
  }
  
  extension [Self <: SignInOptions](x: Self) {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setConnection(value: email | sms): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setOtp(value: String): Self = StObject.set(x, "otp", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setRealm(value: email | sms): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
