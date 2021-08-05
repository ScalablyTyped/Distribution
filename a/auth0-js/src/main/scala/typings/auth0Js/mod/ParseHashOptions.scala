package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseHashOptions extends StObject {
  
  /** indicates that you want to allow IdP-Initiated flows. See {@link https://auth0.com/docs/protocols/saml/idp-initiated-sso#lock-auth0-js} */
  var __enableIdPInitiatedLogin: js.UndefOr[Boolean] = js.undefined
  
  var _idTokenVerification: js.UndefOr[Boolean] = js.undefined
  
  var hash: js.UndefOr[String] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object ParseHashOptions {
  
  inline def apply(): ParseHashOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseHashOptions]
  }
  
  extension [Self <: ParseHashOptions](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def set__enableIdPInitiatedLogin(value: Boolean): Self = StObject.set(x, "__enableIdPInitiatedLogin", value.asInstanceOf[js.Any])
    
    inline def set__enableIdPInitiatedLoginUndefined: Self = StObject.set(x, "__enableIdPInitiatedLogin", js.undefined)
    
    inline def set_idTokenVerification(value: Boolean): Self = StObject.set(x, "_idTokenVerification", value.asInstanceOf[js.Any])
    
    inline def set_idTokenVerificationUndefined: Self = StObject.set(x, "_idTokenVerification", js.undefined)
  }
}
