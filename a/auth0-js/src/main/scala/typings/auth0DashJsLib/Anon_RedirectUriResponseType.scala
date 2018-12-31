package typings
package auth0DashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RedirectUriResponseType extends js.Object {
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

