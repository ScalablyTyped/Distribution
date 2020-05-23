package typings.auth0Js.anon

import typings.auth0Js.auth0JsStrings.form_post
import typings.auth0Js.auth0JsStrings.fragment
import typings.auth0Js.auth0JsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Audience extends js.Object {
  /** identifier of the resource server who will consume the access token issued after Auth */
  var audience: js.UndefOr[String] = js.undefined
  /** your Auth0 client identifier obtained when creating the client in the Auth0 Dashboard */
  var clientId: js.UndefOr[String] = js.undefined
  /**
    * identity provider whose login page will be displayed in the popup.
    * If omitted the hosted login page is used.
    * {@link https://auth0.com/docs/identityproviders}
    */
  var connection: js.UndefOr[String] = js.undefined
  /** your Auth0 domain */
  var domain: String
  /**
    * value used to mitigate replay attacks when using Implicit Grant.
    * {@link https://auth0.com/docs/api-auth/tutorials/nonce}
    */
  var nonce: js.UndefOr[String] = js.undefined
  /** determines if Auth0 should render the relay page or not and the caller is responsible of handling the response. */
  var owp: js.UndefOr[Boolean] = js.undefined
  /** url that the Auth0 will redirect after Auth with the Authorization Response */
  var redirectUri: String
  /**
    * how the Auth response is encoded and redirected back to the client.
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0.html#ResponseModes}
    */
  var responseMode: js.UndefOr[query | fragment | form_post] = js.undefined
  /**
    * type of the response used by OAuth 2.0 flow.
    * It can be any space separated list of the values `code`, `token`, `id_token`.
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0}
    */
  var responseType: String
  /** scopes to be requested during Auth. e.g. `openid email` */
  var scope: js.UndefOr[String] = js.undefined
  /**
    * value used to mitigate XSRF attacks.
    * {@link https://auth0.com/docs/protocols/oauth2/oauth-state}
    */
  var state: js.UndefOr[String] = js.undefined
}

object Audience {
  @scala.inline
  def apply(
    domain: String,
    redirectUri: String,
    responseType: String,
    audience: String = null,
    clientId: String = null,
    connection: String = null,
    nonce: String = null,
    owp: js.UndefOr[Boolean] = js.undefined,
    responseMode: query | fragment | form_post = null,
    scope: String = null,
    state: String = null
  ): Audience = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (!js.isUndefined(owp)) __obj.updateDynamic("owp")(owp.get.asInstanceOf[js.Any])
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audience]
  }
}

