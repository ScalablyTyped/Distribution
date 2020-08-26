package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenewAuthOptions extends js.Object {
  /**
    * identifier of the resource server who will consume the access token issued after Auth
    */
  var audience: js.UndefOr[String] = js.native
  /**
    * your Auth0 client identifier obtained when creating the client in the Auth0 Dashboard
    */
  var clientID: js.UndefOr[String] = js.native
  /**
    * your Auth0 domain
    */
  var domain: js.UndefOr[String] = js.native
  /**
    * value used to mitigate replay attacks when using Implicit Grant.
    * {@link https://auth0.com/docs/api-auth/tutorials/nonce}
    */
  var nonce: js.UndefOr[String] = js.native
  /**
    * identifier data type to look for in postMessage event data, where events are initiated
    * from silent callback urls, before accepting a message event is the event expected.
    * A value of false means any postMessage event will trigger a callback.
    */
  var postMessageDataType: js.UndefOr[String] = js.native
  /**
    * origin of redirectUri to expect postMessage response from.
    * Defaults to the origin of the receiving window. Only used if usePostMessage is truthy.
    */
  var postMessageOrigin: js.UndefOr[String] = js.native
  /**
    * url that the Auth0 will redirect after Auth with the Authorization Response
    */
  var redirectUri: js.UndefOr[String] = js.native
  /**
    * how the Auth response is encoded and redirected back to the client.
    * Supported values are `query`, `fragment` and `form_post`.
    * The `query` value is only supported when `responseType` is `code`.
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0.html#ResponseModes}
    */
  var responseMode: js.UndefOr[String] = js.native
  /**
    * type of the response used by OAuth 2.0 flow. It can be any space separated
    * list of the values `code`, `token`, `id_token`.
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0}
    */
  var responseType: js.UndefOr[String] = js.native
  /**
    * scopes to be requested during Auth. e.g. `openid email`
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * value used to mitigate XSRF attacks.
    * {@link https://auth0.com/docs/protocols/oauth2/oauth-state}
    */
  var state: js.UndefOr[String] = js.native
  /**
    * value in milliseconds used to timeout when the `/authorize` call is failing
    * as part of the silent authentication with postmessage enabled due to a configuration.
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * use postMessage to comunicate between the silent callback and the SPA.
    * When false the SDK will attempt to parse the url hash should ignore the url hash
    * and no extra behaviour is needed
    * @default false
    */
  var usePostMessage: js.UndefOr[Boolean] = js.native
}

object RenewAuthOptions {
  @scala.inline
  def apply(): RenewAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenewAuthOptions]
  }
  @scala.inline
  implicit class RenewAuthOptionsOps[Self <: RenewAuthOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    @scala.inline
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientID: Self = this.set("clientID", js.undefined)
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setPostMessageDataType(value: String): Self = this.set("postMessageDataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostMessageDataType: Self = this.set("postMessageDataType", js.undefined)
    @scala.inline
    def setPostMessageOrigin(value: String): Self = this.set("postMessageOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostMessageOrigin: Self = this.set("postMessageOrigin", js.undefined)
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
    @scala.inline
    def setResponseMode(value: String): Self = this.set("responseMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMode: Self = this.set("responseMode", js.undefined)
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUsePostMessage(value: Boolean): Self = this.set("usePostMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePostMessage: Self = this.set("usePostMessage", js.undefined)
  }
  
}

