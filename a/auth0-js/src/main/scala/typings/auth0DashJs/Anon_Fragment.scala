package typings.auth0DashJs

import typings.auth0DashJs.auth0DashJsStrings.fragment
import typings.auth0DashJs.auth0DashJsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fragment extends js.Object {
  /** url that the Auth0 will redirect after Auth with the Authorization Response */
  var redirectUri: js.UndefOr[String] = js.undefined
  /** how the AuthN response is encoded and redirected back to the client. */
  var responseMode: js.UndefOr[query | fragment] = js.undefined
  /** type of the response used. It can be any of the values `code` and `token` */
  var responseType: js.UndefOr[String] = js.undefined
  /** scopes to be requested during AuthN. e.g. `openid email` */
  var scope: String
}

object Anon_Fragment {
  @scala.inline
  def apply(
    scope: String,
    redirectUri: String = null,
    responseMode: query | fragment = null,
    responseType: String = null
  ): Anon_Fragment = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Fragment]
  }
}

