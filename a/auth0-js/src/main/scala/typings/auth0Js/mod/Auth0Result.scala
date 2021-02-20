package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0Result extends StObject {
  
  /**
    * token that allows access to the specified resource server (identified by the audience parameter
    * or by default Auth0's /userinfo endpoint)
    */
  var accessToken: js.UndefOr[String] = js.native
  
  /** values that you receive back on the authentication response */
  var appState: js.UndefOr[js.Any] = js.native
  
  /** number of seconds until the access token expires */
  var expiresIn: js.UndefOr[Double] = js.native
  
  /** token that identifies the user */
  var idToken: js.UndefOr[String] = js.native
  
  /**
    * token that can be used to get new access tokens from Auth0.
    * Note that not all Auth0 Applications can request them
    * or the resource server might not allow them.
    */
  var refreshToken: js.UndefOr[String] = js.native
}
object Auth0Result {
  
  @scala.inline
  def apply(): Auth0Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0Result]
  }
  
  @scala.inline
  implicit class Auth0ResultMutableBuilder[Self <: Auth0Result] (val x: Self) extends AnyVal {
    
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
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
