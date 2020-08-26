package typings.auth0Js.mod

import typings.auth0Js.auth0JsStrings.form_post
import typings.auth0Js.auth0JsStrings.fragment
import typings.auth0Js.auth0JsStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeUrlOptions extends js.Object {
  /**
    * identifier of the resource server who will consume the access token issued after Auth
    */
  var audience: js.UndefOr[String] = js.native
  /**
    * your Auth0 client identifier obtained when creating the client in the Auth0 Dashboard
    */
  var clientID: js.UndefOr[String] = js.native
  /**
    * value used to mitigate replay attacks when using Implicit Grant.
    * {@link https://auth0.com/docs/api-auth/tutorials/nonce}
    */
  var nonce: js.UndefOr[String] = js.native
  /**
    * url that the Auth0 will redirect after Auth with the Authorization Response
    */
  var redirectUri: String = js.native
  /**
    * how the Auth response is encoded and redirected back to the client.
    * Supported values are `query`, `fragment` and `form_post`
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0.html#ResponseModes}
    */
  var responseMode: js.UndefOr[query | fragment | form_post] = js.native
  /**
    * type of the response used by OAuth 2.0 flow. It can be any space separated
    * list of the values `code`, `token`, `id_token`.
    * {@link https://openid.net/specs/oauth-v2-multiple-response-types-1_0}
    */
  var responseType: String = js.native
  /**
    * scopes to be requested during Auth. e.g. `openid email`
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * value used to mitigate XSRF attacks.
    * {@link https://auth0.com/docs/protocols/oauth2/oauth-state}
    */
  var state: js.UndefOr[String] = js.native
}

object AuthorizeUrlOptions {
  @scala.inline
  def apply(redirectUri: String, responseType: String): AuthorizeUrlOptions = {
    val __obj = js.Dynamic.literal(redirectUri = redirectUri.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeUrlOptions]
  }
  @scala.inline
  implicit class AuthorizeUrlOptionsOps[Self <: AuthorizeUrlOptions] (val x: Self) extends AnyVal {
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
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    @scala.inline
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientID: Self = this.set("clientID", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setResponseMode(value: query | fragment | form_post): Self = this.set("responseMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseMode: Self = this.set("responseMode", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

