package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenewAuthOptions extends js.Object {
  /**
    * identifier of the resource server who will consume the access token issued after Auth
    */
  var audience: js.UndefOr[String] = js.undefined
  /**
    * your Auth0 client identifier obtained when creating the client in the Auth0 Dashboard
    */
  var clientID: js.UndefOr[String] = js.undefined
  /**
    * your Auth0 domain
    */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * value used to mitigate replay attacks when using Implicit Grant.
    * {@link https://auth0.com/docs/api-auth/tutorials/nonce}
    */
  var nonce: js.UndefOr[String] = js.undefined
  /**
    * identifier data type to look for in postMessage event data, where events are initiated
    * from silent callback urls, before accepting a message event is the event expected.
    * A value of false means any postMessage event will trigger a callback.
    */
  var postMessageDataType: js.UndefOr[String] = js.undefined
  /**
    * origin of redirectUri to expect postMessage response from.
    * Defaults to the origin of the receiving window. Only used if usePostMessage is truthy.
    */
  var postMessageOrigin: js.UndefOr[String] = js.undefined
  /**
    * url that the Auth0 will redirect after Auth with the Authorization Response
    */
  var redirectUri: js.UndefOr[String] = js.undefined
  /**
    * how the Auth response is encoded and redirected back to the client.
    * Supported values are `query`, `fragment` and `form_post`.
    * The `query` value is only supported when `responseType` is `code`.
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0.html#ResponseModes}
    */
  var responseMode: js.UndefOr[String] = js.undefined
  /**
    * type of the response used by OAuth 2.0 flow. It can be any space separated
    * list of the values `code`, `token`, `id_token`.
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0}
    */
  var responseType: js.UndefOr[String] = js.undefined
  /**
    * scopes to be requested during Auth. e.g. `openid email`
    */
  var scope: js.UndefOr[String] = js.undefined
  /**
    * value used to mitigate XSRF attacks.
    * {@link https://auth0.com/docs/protocols/oauth2/oauth-state}
    */
  var state: js.UndefOr[String] = js.undefined
  /**
    * value in milliseconds used to timeout when the `/authorize` call is failing
    * as part of the silent authentication with postmessage enabled due to a configuration.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * use postMessage to comunicate between the silent callback and the SPA.
    * When false the SDK will attempt to parse the url hash should ignore the url hash
    * and no extra behaviour is needed
    * @default false
    */
  var usePostMessage: js.UndefOr[Boolean] = js.undefined
}

object RenewAuthOptions {
  @scala.inline
  def apply(
    audience: String = null,
    clientID: String = null,
    domain: String = null,
    nonce: String = null,
    postMessageDataType: String = null,
    postMessageOrigin: String = null,
    redirectUri: String = null,
    responseMode: String = null,
    responseType: String = null,
    scope: String = null,
    state: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    usePostMessage: js.UndefOr[Boolean] = js.undefined
  ): RenewAuthOptions = {
    val __obj = js.Dynamic.literal()
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (clientID != null) __obj.updateDynamic("clientID")(clientID.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (postMessageDataType != null) __obj.updateDynamic("postMessageDataType")(postMessageDataType.asInstanceOf[js.Any])
    if (postMessageOrigin != null) __obj.updateDynamic("postMessageOrigin")(postMessageOrigin.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    if (responseMode != null) __obj.updateDynamic("responseMode")(responseMode.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usePostMessage)) __obj.updateDynamic("usePostMessage")(usePostMessage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenewAuthOptions]
  }
}

