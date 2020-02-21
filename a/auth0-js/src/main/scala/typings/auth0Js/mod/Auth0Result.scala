package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0Result extends js.Object {
  /**
    * token that allows access to the specified resource server (identified by the audience parameter
    * or by default Auth0's /userinfo endpoint)
    */
  var accessToken: js.UndefOr[String] = js.undefined
  /** values that you receive back on the authentication response */
  var appState: js.UndefOr[js.Any] = js.undefined
  /** number of seconds until the access token expires */
  var expiresIn: js.UndefOr[Double] = js.undefined
  /** token that identifies the user */
  var idToken: js.UndefOr[String] = js.undefined
  /**
    * token that can be used to get new access tokens from Auth0.
    * Note that not all Auth0 Applications can request them
    * or the resource server might not allow them.
    */
  var refreshToken: js.UndefOr[String] = js.undefined
}

object Auth0Result {
  @scala.inline
  def apply(
    accessToken: String = null,
    appState: js.Any = null,
    expiresIn: Int | Double = null,
    idToken: String = null,
    refreshToken: String = null
  ): Auth0Result = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (appState != null) __obj.updateDynamic("appState")(appState.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0Result]
  }
}

