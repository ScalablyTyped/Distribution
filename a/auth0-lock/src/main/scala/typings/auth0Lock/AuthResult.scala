package typings.auth0Lock

import typings.auth0Lock.anon.Aud
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthResult extends js.Object {
  
  var accessToken: String = js.native
  
  var appState: js.UndefOr[js.Any] = js.native
  
  var expiresIn: Double = js.native
  
  var idToken: String = js.native
  
  var idTokenPayload: Aud = js.native
  
  var refreshToken: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var state: String = js.native
  
  var tokenType: String = js.native
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
  implicit class AuthResultOps[Self <: AuthResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenPayload(value: Aud): Self = this.set("idTokenPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenType(value: String): Self = this.set("tokenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppState(value: js.Any): Self = this.set("appState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppState: Self = this.set("appState", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
