package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0DecodedHash extends StObject {
  
  var accessToken: js.UndefOr[String] = js.undefined
  
  var appState: js.UndefOr[Any] = js.undefined
  
  var expiresIn: js.UndefOr[Double] = js.undefined
  
  var idToken: js.UndefOr[String] = js.undefined
  
  var idTokenPayload: js.UndefOr[Any] = js.undefined
  
  var refreshToken: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
  
  var tokenType: js.UndefOr[String] = js.undefined
}
object Auth0DecodedHash {
  
  inline def apply(): Auth0DecodedHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0DecodedHash]
  }
  
  extension [Self <: Auth0DecodedHash](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setAppState(value: Any): Self = StObject.set(x, "appState", value.asInstanceOf[js.Any])
    
    inline def setAppStateUndefined: Self = StObject.set(x, "appState", js.undefined)
    
    inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenPayload(value: Any): Self = StObject.set(x, "idTokenPayload", value.asInstanceOf[js.Any])
    
    inline def setIdTokenPayloadUndefined: Self = StObject.set(x, "idTokenPayload", js.undefined)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    
    inline def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
  }
}
