package typings.auth0Js.anon

import typings.auth0Js.auth0JsStrings.code
import typings.auth0Js.auth0JsStrings.fragment
import typings.auth0Js.auth0JsStrings.query
import typings.auth0Js.auth0JsStrings.token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseMode extends js.Object {
  /** url that the Auth0 will redirect after Auth with the Authorization Response */
  var redirectUri: js.UndefOr[String] = js.undefined
  /** how the AuthN response is encoded and redirected back to the client. */
  var responseMode: js.UndefOr[query | fragment] = js.undefined
  /** type of the response used. */
  var responseType: js.UndefOr[code | token] = js.undefined
  /** scopes to be requested during AuthN. e.g. `openid email` */
  var scope: js.UndefOr[String] = js.undefined
}

object ResponseMode {
  @scala.inline
  def apply(
    redirectUri: String = null,
    responseMode: query | fragment = null,
    responseType: code | token = null,
    scope: String = null
  ): ResponseMode = {
    val __obj = js.Dynamic.literal()
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseMode]
  }
}

