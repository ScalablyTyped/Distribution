package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0Result extends js.Object {
  
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
  implicit class Auth0ResultOps[Self <: Auth0Result] (val x: Self) extends AnyVal {
    
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
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
  }
}
