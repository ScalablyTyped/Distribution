package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseAuthOptions extends StObject {
  
  var __instate: js.UndefOr[String] = js.undefined
  
  var _csrf: js.UndefOr[String] = js.undefined
  
  var audience: js.UndefOr[String] = js.undefined
  
  var clientID: js.UndefOr[String] = js.undefined
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var redirectUri: js.UndefOr[String] = js.undefined
  
  var responseType: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object BaseAuthOptions {
  
  inline def apply(): BaseAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseAuthOptions]
  }
  
  extension [Self <: BaseAuthOptions](x: Self) {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    inline def setClientIDUndefined: Self = StObject.set(x, "clientID", js.undefined)
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def set__instate(value: String): Self = StObject.set(x, "__instate", value.asInstanceOf[js.Any])
    
    inline def set__instateUndefined: Self = StObject.set(x, "__instate", js.undefined)
    
    inline def set_csrf(value: String): Self = StObject.set(x, "_csrf", value.asInstanceOf[js.Any])
    
    inline def set_csrfUndefined: Self = StObject.set(x, "_csrf", js.undefined)
  }
}
