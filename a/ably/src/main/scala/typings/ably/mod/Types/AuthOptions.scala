package typings.ably.mod.Types

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthOptions extends js.Object {
  /**
  		 * A function which is called when a new token is required.
  		 * The role of the callback is to either generate a signed TokenRequest which may then be submitted automatically
  		 * by the library to the Ably REST API requestToken; or to provide a valid token in as a TokenDetails object.
  		 **/
  var authCallback: js.UndefOr[
    js.Function2[
      /* data */ TokenParams, 
      /* callback */ js.Function2[
        /* error */ ErrorInfo | String, 
        /* tokenRequestOrDetails */ TokenDetails | TokenRequest | String, 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  var authHeaders: js.UndefOr[StringDictionary[String]] = js.native
  var authMethod: js.UndefOr[HTTPMethods] = js.native
  var authParams: js.UndefOr[StringDictionary[String]] = js.native
  /**
  		 * A URL that the library may use to obtain a token string (in plain text format), or a signed TokenRequest or TokenDetails (in JSON format).
  		 **/
  var authUrl: js.UndefOr[String] = js.native
  /**
  		 * Optional clientId that can be used to specify the identity for this client. In most cases
  		 * it is preferable to instead specift a clientId in the token issued to this client.
  		 */
  var clientId: js.UndefOr[String] = js.native
  var key: js.UndefOr[String] = js.native
  var queryTime: js.UndefOr[Boolean] = js.native
  var token: js.UndefOr[TokenDetails | String] = js.native
  var tokenDetails: js.UndefOr[TokenDetails] = js.native
  var useTokenAuth: js.UndefOr[Boolean] = js.native
}

object AuthOptions {
  @scala.inline
  def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  @scala.inline
  implicit class AuthOptionsOps[Self <: AuthOptions] (val x: Self) extends AnyVal {
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
    def setAuthCallback(
      value: (/* data */ TokenParams, /* callback */ js.Function2[
          /* error */ ErrorInfo | String, 
          /* tokenRequestOrDetails */ TokenDetails | TokenRequest | String, 
          Unit
        ]) => Unit
    ): Self = this.set("authCallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAuthCallback: Self = this.set("authCallback", js.undefined)
    @scala.inline
    def setAuthHeaders(value: StringDictionary[String]): Self = this.set("authHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthHeaders: Self = this.set("authHeaders", js.undefined)
    @scala.inline
    def setAuthMethod(value: HTTPMethods): Self = this.set("authMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthMethod: Self = this.set("authMethod", js.undefined)
    @scala.inline
    def setAuthParams(value: StringDictionary[String]): Self = this.set("authParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthParams: Self = this.set("authParams", js.undefined)
    @scala.inline
    def setAuthUrl(value: String): Self = this.set("authUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthUrl: Self = this.set("authUrl", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setQueryTime(value: Boolean): Self = this.set("queryTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryTime: Self = this.set("queryTime", js.undefined)
    @scala.inline
    def setToken(value: TokenDetails | String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setTokenDetails(value: TokenDetails): Self = this.set("tokenDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenDetails: Self = this.set("tokenDetails", js.undefined)
    @scala.inline
    def setUseTokenAuth(value: Boolean): Self = this.set("useTokenAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTokenAuth: Self = this.set("useTokenAuth", js.undefined)
  }
  
}

