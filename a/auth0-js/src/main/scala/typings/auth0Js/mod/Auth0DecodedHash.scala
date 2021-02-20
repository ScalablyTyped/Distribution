package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0DecodedHash extends StObject {
  
  var accessToken: js.UndefOr[String] = js.native
  
  var appState: js.UndefOr[js.Any] = js.native
  
  var expiresIn: js.UndefOr[Double] = js.native
  
  var idToken: js.UndefOr[String] = js.native
  
  var idTokenPayload: js.UndefOr[js.Any] = js.native
  
  var refreshToken: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
  
  var tokenType: js.UndefOr[String] = js.native
}
object Auth0DecodedHash {
  
  @scala.inline
  def apply(): Auth0DecodedHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0DecodedHash]
  }
  
  @scala.inline
  implicit class Auth0DecodedHashMutableBuilder[Self <: Auth0DecodedHash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setAppState(value: js.Any): Self = StObject.set(x, "appState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStateUndefined: Self = StObject.set(x, "appState", js.undefined)
    
    @scala.inline
    def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenPayload(value: js.Any): Self = StObject.set(x, "idTokenPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenPayloadUndefined: Self = StObject.set(x, "idTokenPayload", js.undefined)
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenTypeUndefined: Self = StObject.set(x, "tokenType", js.undefined)
  }
}
