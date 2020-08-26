package typings.amazonCognitoAuthJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoSessionData extends js.Object {
  /**
    * The session's access token.
    */
  var AccessToken: js.UndefOr[CognitoAccessToken] = js.native
  /**
    * The session's Id token.
    */
  var IdToken: js.UndefOr[CognitoIdToken] = js.native
  /**
    * The session's refresh token.
    */
  var RefreshToken: js.UndefOr[CognitoRefreshToken] = js.native
  /**
    * The session's state.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * The session's token scopes.
    */
  var TokenScopes: js.UndefOr[CognitoTokenScopes] = js.native
}

object CognitoSessionData {
  @scala.inline
  def apply(): CognitoSessionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CognitoSessionData]
  }
  @scala.inline
  implicit class CognitoSessionDataOps[Self <: CognitoSessionData] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: CognitoAccessToken): Self = this.set("AccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("AccessToken", js.undefined)
    @scala.inline
    def setIdToken(value: CognitoIdToken): Self = this.set("IdToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdToken: Self = this.set("IdToken", js.undefined)
    @scala.inline
    def setRefreshToken(value: CognitoRefreshToken): Self = this.set("RefreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshToken: Self = this.set("RefreshToken", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTokenScopes(value: CognitoTokenScopes): Self = this.set("TokenScopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenScopes: Self = this.set("TokenScopes", js.undefined)
  }
  
}

