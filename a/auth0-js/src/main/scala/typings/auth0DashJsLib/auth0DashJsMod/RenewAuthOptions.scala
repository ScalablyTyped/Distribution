package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RenewAuthOptions extends js.Object {
  /**
       * identifier of the resource server who will consume the access token issued after Auth
       */
  var audience: js.UndefOr[java.lang.String] = js.undefined
  /**
       * your Auth0 client identifier obtained when creating the client in the Auth0 Dashboard
       */
  var clientID: js.UndefOr[java.lang.String] = js.undefined
  /**
       * your Auth0 domain
       */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
       * value used to mitigate replay attacks when using Implicit Grant.
       * {@link https://auth0.com/docs/api-auth/tutorials/nonce}
       */
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  /**
       * identifier data type to look for in postMessage event data, where events are initiated
       * from silent callback urls, before accepting a message event is the event expected.
       * A value of false means any postMessage event will trigger a callback.
       */
  var postMessageDataType: js.UndefOr[java.lang.String] = js.undefined
  /**
       * origin of redirectUri to expect postMessage response from.
       * Defaults to the origin of the receiving window. Only used if usePostMessage is truthy.
       */
  var postMessageOrigin: js.UndefOr[java.lang.String] = js.undefined
  /**
       * url that the Auth0 will redirect after Auth with the Authorization Response
       */
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  /**
       * how the Auth response is encoded and redirected back to the client.
       * Supported values are `query`, `fragment` and `form_post`.
       * The `query` value is only supported when `responseType` is `code`.
       * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0.html#ResponseModes}
       */
  var responseMode: js.UndefOr[java.lang.String] = js.undefined
  /**
       * type of the response used by OAuth 2.0 flow. It can be any space separated
       * list of the values `code`, `token`, `id_token`.
       * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0}
       */
  var responseType: js.UndefOr[java.lang.String] = js.undefined
  /**
       * scopes to be requested during Auth. e.g. `openid email`
       */
  var scope: js.UndefOr[java.lang.String] = js.undefined
  /**
       * value used to mitigate XSRF attacks.
       * {@link https://auth0.com/docs/protocols/oauth2/oauth-state}
       */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /**
       * value in milliseconds used to timeout when the `/authorize` call is failing
       * as part of the silent authentication with postmessage enabled due to a configuration.
       */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
       * use postMessage to comunicate between the silent callback and the SPA.
       * When false the SDK will attempt to parse the url hash should ignore the url hash
       * and no extra behaviour is needed
       * @default false
       */
  var usePostMessage: js.UndefOr[scala.Boolean] = js.undefined
}

