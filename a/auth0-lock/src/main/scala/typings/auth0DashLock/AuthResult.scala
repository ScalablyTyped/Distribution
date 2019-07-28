package typings.auth0DashLock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthResult extends js.Object {
  var accessToken: String
  var appState: js.UndefOr[js.Any] = js.undefined
  var expiresIn: Double
  var idToken: String
  var idTokenPayload: Anon_Aud
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
    idTokenPayload: Anon_Aud,
    state: String,
    tokenType: String,
    appState: js.Any = null,
    refreshToken: String = null,
    scope: String = null
  ): AuthResult = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, expiresIn = expiresIn, idToken = idToken, idTokenPayload = idTokenPayload, state = state, tokenType = tokenType)
    if (appState != null) __obj.updateDynamic("appState")(appState)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[AuthResult]
  }
}

