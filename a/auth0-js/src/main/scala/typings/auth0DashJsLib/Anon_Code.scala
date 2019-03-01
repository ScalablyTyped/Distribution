package typings
package auth0DashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  /** url that the Auth0 will redirect after Auth with the Authorization Response */
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  /** how the AuthN response is encoded and redirected back to the client. */
  var responseMode: js.UndefOr[
    auth0DashJsLib.auth0DashJsLibStrings.query | auth0DashJsLib.auth0DashJsLibStrings.fragment
  ] = js.undefined
  /** type of the response used. */
  var responseType: js.UndefOr[
    auth0DashJsLib.auth0DashJsLibStrings.code | auth0DashJsLib.auth0DashJsLibStrings.token
  ] = js.undefined
  /** scopes to be requested during AuthN. e.g. `openid email` */
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(
    redirectUri: java.lang.String = null,
    responseMode: auth0DashJsLib.auth0DashJsLibStrings.query | auth0DashJsLib.auth0DashJsLibStrings.fragment = null,
    responseType: auth0DashJsLib.auth0DashJsLibStrings.code | auth0DashJsLib.auth0DashJsLibStrings.token = null,
    scope: java.lang.String = null
  ): Anon_Code = {
    val __obj = js.Dynamic.literal()
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[Anon_Code]
  }
}

