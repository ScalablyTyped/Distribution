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
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], idToken = idToken.asInstanceOf[js.Any], idTokenPayload = idTokenPayload.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    if (appState != null) __obj.updateDynamic("appState")(appState.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthResult]
  }
}

