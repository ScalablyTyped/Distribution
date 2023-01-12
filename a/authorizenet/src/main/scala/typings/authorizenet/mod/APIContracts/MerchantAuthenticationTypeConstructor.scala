package typings.authorizenet.mod.APIContracts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MerchantAuthenticationTypeConstructor extends StObject {
  
  var accessToken: js.UndefOr[String] = js.undefined
  
  var clientKey: js.UndefOr[String] = js.undefined
  
  var fingerprint: js.UndefOr[js.Object] = js.undefined
  
  var impersonationAuthentication: js.UndefOr[ImpersonationAuthenticationType] = js.undefined
  
  var mobileDeviceId: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var sessionToken: js.UndefOr[String] = js.undefined
  
  var transactionKey: js.UndefOr[String] = js.undefined
}
object MerchantAuthenticationTypeConstructor {
  
  inline def apply(): MerchantAuthenticationTypeConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantAuthenticationTypeConstructor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MerchantAuthenticationTypeConstructor] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
    
    inline def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
    
    inline def setFingerprint(value: js.Object): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setImpersonationAuthentication(value: ImpersonationAuthenticationType): Self = StObject.set(x, "impersonationAuthentication", value.asInstanceOf[js.Any])
    
    inline def setImpersonationAuthenticationUndefined: Self = StObject.set(x, "impersonationAuthentication", js.undefined)
    
    inline def setMobileDeviceId(value: String): Self = StObject.set(x, "mobileDeviceId", value.asInstanceOf[js.Any])
    
    inline def setMobileDeviceIdUndefined: Self = StObject.set(x, "mobileDeviceId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    
    inline def setTransactionKey(value: String): Self = StObject.set(x, "transactionKey", value.asInstanceOf[js.Any])
    
    inline def setTransactionKeyUndefined: Self = StObject.set(x, "transactionKey", js.undefined)
  }
}
