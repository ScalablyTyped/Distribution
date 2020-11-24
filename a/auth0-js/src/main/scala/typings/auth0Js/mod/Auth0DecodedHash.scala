package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0DecodedHash extends js.Object {
  
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
  implicit class Auth0DecodedHashOps[Self <: Auth0DecodedHash] (val x: Self) extends AnyVal {
    
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
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    
    @scala.inline
    def setAppState(value: js.Any): Self = this.set("appState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppState: Self = this.set("appState", js.undefined)
    
    @scala.inline
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiresIn: Self = this.set("expiresIn", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = this.set("idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdToken: Self = this.set("idToken", js.undefined)
    
    @scala.inline
    def setIdTokenPayload(value: js.Any): Self = this.set("idTokenPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdTokenPayload: Self = this.set("idTokenPayload", js.undefined)
    
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTokenType(value: String): Self = this.set("tokenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenType: Self = this.set("tokenType", js.undefined)
  }
}
