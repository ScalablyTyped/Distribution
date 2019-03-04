package typings
package auth0DashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fragment extends js.Object {
  /** url that the Auth0 will redirect after Auth with the Authorization Response */
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  /** how the AuthN response is encoded and redirected back to the client. */
  var responseMode: js.UndefOr[
    auth0DashJsLib.auth0DashJsLibStrings.query | auth0DashJsLib.auth0DashJsLibStrings.fragment
  ] = js.undefined
  /** type of the response used. It can be any of the values `code` and `token` */
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  /** scopes to be requested during AuthN. e.g. `openid email` */
  var scope: java.lang.String
}

object Anon_Fragment {
  @scala.inline
  def apply(
    scope: java.lang.String,
    redirectUri: java.lang.String = null,
    responseMode: auth0DashJsLib.auth0DashJsLibStrings.query | auth0DashJsLib.auth0DashJsLibStrings.fragment = null,
    responseType: java.lang.String = null
  ): Anon_Fragment = {
    val __obj = js.Dynamic.literal(scope = scope)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType)
    __obj.asInstanceOf[Anon_Fragment]
  }
}

