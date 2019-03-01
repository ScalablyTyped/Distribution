package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0DecodedHash extends js.Object {
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  var appState: js.UndefOr[js.Any] = js.undefined
  var expiresIn: js.UndefOr[scala.Double] = js.undefined
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  var idTokenPayload: js.UndefOr[js.Any] = js.undefined
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
  var tokenType: js.UndefOr[java.lang.String] = js.undefined
}

object Auth0DecodedHash {
  @scala.inline
  def apply(
    accessToken: java.lang.String = null,
    appState: js.Any = null,
    expiresIn: scala.Int | scala.Double = null,
    idToken: java.lang.String = null,
    idTokenPayload: js.Any = null,
    refreshToken: java.lang.String = null,
    scope: java.lang.String = null,
    state: java.lang.String = null,
    tokenType: java.lang.String = null
  ): Auth0DecodedHash = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (appState != null) __obj.updateDynamic("appState")(appState)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (idTokenPayload != null) __obj.updateDynamic("idTokenPayload")(idTokenPayload)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (state != null) __obj.updateDynamic("state")(state)
    if (tokenType != null) __obj.updateDynamic("tokenType")(tokenType)
    __obj.asInstanceOf[Auth0DecodedHash]
  }
}

