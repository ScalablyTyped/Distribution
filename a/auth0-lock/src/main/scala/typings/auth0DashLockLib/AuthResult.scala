package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthResult extends js.Object {
  var accessToken: java.lang.String
  var appState: js.UndefOr[js.Any] = js.undefined
  var expiresIn: scala.Double
  var idToken: java.lang.String
  var idTokenPayload: Anon_Aud
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var state: java.lang.String
  var tokenType: java.lang.String
}

object AuthResult {
  @scala.inline
  def apply(
    accessToken: java.lang.String,
    expiresIn: scala.Double,
    idToken: java.lang.String,
    idTokenPayload: Anon_Aud,
    state: java.lang.String,
    tokenType: java.lang.String,
    appState: js.Any = null,
    refreshToken: java.lang.String = null,
    scope: java.lang.String = null
  ): AuthResult = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, expiresIn = expiresIn, idToken = idToken, idTokenPayload = idTokenPayload, state = state, tokenType = tokenType)
    if (appState != null) __obj.updateDynamic("appState")(appState)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[AuthResult]
  }
}

