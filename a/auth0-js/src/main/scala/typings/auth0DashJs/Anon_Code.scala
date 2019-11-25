package typings.auth0DashJs

import typings.auth0DashJs.auth0DashJsStrings.code
import typings.auth0DashJs.auth0DashJsStrings.fragment
import typings.auth0DashJs.auth0DashJsStrings.query
import typings.auth0DashJs.auth0DashJsStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  /** url that the Auth0 will redirect after Auth with the Authorization Response */
  var redirectUri: js.UndefOr[String] = js.undefined
  /** how the AuthN response is encoded and redirected back to the client. */
  var responseMode: js.UndefOr[query | fragment] = js.undefined
  /** type of the response used. */
  var responseType: js.UndefOr[code | token] = js.undefined
  /** scopes to be requested during AuthN. e.g. `openid email` */
  var scope: js.UndefOr[String] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(
    redirectUri: String = null,
    responseMode: query | fragment = null,
    responseType: code | token = null,
    scope: String = null
  ): Anon_Code = {
    val __obj = js.Dynamic.literal()
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Code]
  }
}

