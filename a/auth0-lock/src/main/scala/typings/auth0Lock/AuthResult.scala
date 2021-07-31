package typings.auth0Lock

import typings.auth0Lock.anon.Aud
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthResult extends StObject {
  
  var accessToken: String
  
  var appState: js.UndefOr[js.Any] = js.undefined
  
  var expiresIn: Double
  
  var idToken: String
  
  var idTokenPayload: Aud
  
  var refreshToken: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var state: String
  
  var tokenType: String
}
object AuthResult {
  
  @scala.inline
  def apply(
    accessToken: String,
    expiresIn: Double,
    idToken: String,
    idTokenPayload: Aud,
    state: String,
    tokenType: String
  ): AuthResult = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], idTokenPayload = idTokenPayload.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthResult]
  }
  
  @scala.inline
  implicit class AuthResultMutableBuilder[Self <: AuthResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppState(value: js.Any): Self = StObject.set(x, "appState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStateUndefined: Self = StObject.set(x, "appState", js.undefined)
    
    @scala.inline
    def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenPayload(value: Aud): Self = StObject.set(x, "idTokenPayload", value.asInstanceOf[js.Any])
    
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
    def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
  }
}
