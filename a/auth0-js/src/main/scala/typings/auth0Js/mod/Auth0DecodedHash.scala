package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0DecodedHash extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var appState: js.UndefOr[js.Any] = js.undefined
  var expiresIn: js.UndefOr[Double] = js.undefined
  var idToken: js.UndefOr[String] = js.undefined
  var idTokenPayload: js.UndefOr[js.Any] = js.undefined
  var refreshToken: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var tokenType: js.UndefOr[String] = js.undefined
}

object Auth0DecodedHash {
  @scala.inline
  def apply(
    accessToken: String = null,
    appState: js.Any = null,
    expiresIn: Int | Double = null,
    idToken: String = null,
    idTokenPayload: js.Any = null,
    refreshToken: String = null,
    scope: String = null,
    state: String = null,
    tokenType: String = null
  ): Auth0DecodedHash = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (appState != null) __obj.updateDynamic("appState")(appState.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (idTokenPayload != null) __obj.updateDynamic("idTokenPayload")(idTokenPayload.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tokenType != null) __obj.updateDynamic("tokenType")(tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0DecodedHash]
  }
}

