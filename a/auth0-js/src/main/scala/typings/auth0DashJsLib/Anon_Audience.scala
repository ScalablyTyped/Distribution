package typings
package auth0DashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Audience extends js.Object {
  /** identifier of the resource server who will consume the access token issued after Auth */
  var audience: js.UndefOr[java.lang.String] = js.undefined
  /** your Auth0 client identifier obtained when creating the client in the Auth0 Dashboard */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * identity provider whose login page will be displayed in the popup.
    * If omitted the hosted login page is used.
    * {@link https://auth0.com/docs/identityproviders}
    */
  var connection: js.UndefOr[java.lang.String] = js.undefined
  /** your Auth0 domain */
  var domain: java.lang.String
  /**
    * value used to mitigate replay attacks when using Implicit Grant.
    * {@link https://auth0.com/docs/api-auth/tutorials/nonce}
    */
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  /** determines if Auth0 should render the relay page or not and the caller is responsible of handling the response. */
  var owp: js.UndefOr[scala.Boolean] = js.undefined
  /** url that the Auth0 will redirect after Auth with the Authorization Response */
  var redirectUri: java.lang.String
  /**
    * how the Auth response is encoded and redirected back to the client.
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0.html#ResponseModes}
    */
  var responseMode: js.UndefOr[
    auth0DashJsLib.auth0DashJsLibStrings.query | auth0DashJsLib.auth0DashJsLibStrings.fragment | auth0DashJsLib.auth0DashJsLibStrings.form_post
  ] = js.undefined
  /**
    * type of the response used by OAuth 2.0 flow.
    * It can be any space separated list of the values `code`, `token`, `id_token`.
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0}
    */
  var responseType: java.lang.String
  /** scopes to be requested during Auth. e.g. `openid email` */
  var scope: js.UndefOr[java.lang.String] = js.undefined
  /**
    * value used to mitigate XSRF attacks.
    * {@link https://auth0.com/docs/protocols/oauth2/oauth-state}
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Audience {
  @scala.inline
  def apply(
    domain: java.lang.String,
    redirectUri: java.lang.String,
    responseType: java.lang.String,
    audience: java.lang.String = null,
    clientId: java.lang.String = null,
    connection: java.lang.String = null,
    nonce: java.lang.String = null,
    owp: js.UndefOr[scala.Boolean] = js.undefined,
    responseMode: auth0DashJsLib.auth0DashJsLibStrings.query | auth0DashJsLib.auth0DashJsLibStrings.fragment | auth0DashJsLib.auth0DashJsLibStrings.form_post = null,
    scope: java.lang.String = null,
    state: java.lang.String = null
  ): Anon_Audience = {
    val __obj = js.Dynamic.literal(domain = domain, redirectUri = redirectUri, responseType = responseType)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (!js.isUndefined(owp)) __obj.updateDynamic("owp")(owp)
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_Audience]
  }
}

