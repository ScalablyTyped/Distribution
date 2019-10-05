package typings.ably.ablyMod.Types

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  ] = js.undefined
  var authHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var authMethod: js.UndefOr[HTTPMethods] = js.undefined
  var authParams: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
  		 * A URL that the library may use to obtain a token string (in plain text format), or a signed TokenRequest or TokenDetails (in JSON format).
  		 **/
  var authUrl: js.UndefOr[String] = js.undefined
  /**
  		 * Optional clientId that can be used to specify the identity for this client. In most cases
  		 * it is preferable to instead specift a clientId in the token issued to this client.
  		 */
  var clientId: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var queryTime: js.UndefOr[Boolean] = js.undefined
  var token: js.UndefOr[TokenDetails | String] = js.undefined
  var tokenDetails: js.UndefOr[TokenDetails] = js.undefined
  var useTokenAuth: js.UndefOr[Boolean] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(
    authCallback: (/* data */ TokenParams, /* callback */ js.Function2[
      /* error */ ErrorInfo | String, 
      /* tokenRequestOrDetails */ TokenDetails | TokenRequest | String, 
      Unit
    ]) => Unit = null,
    authHeaders: StringDictionary[String] = null,
    authMethod: HTTPMethods = null,
    authParams: StringDictionary[String] = null,
    authUrl: String = null,
    clientId: String = null,
    key: String = null,
    queryTime: js.UndefOr[Boolean] = js.undefined,
    token: TokenDetails | String = null,
    tokenDetails: TokenDetails = null,
    useTokenAuth: js.UndefOr[Boolean] = js.undefined
  ): AuthOptions = {
    val __obj = js.Dynamic.literal()
    if (authCallback != null) __obj.updateDynamic("authCallback")(js.Any.fromFunction2(authCallback))
    if (authHeaders != null) __obj.updateDynamic("authHeaders")(authHeaders)
    if (authMethod != null) __obj.updateDynamic("authMethod")(authMethod.asInstanceOf[js.Any])
    if (authParams != null) __obj.updateDynamic("authParams")(authParams)
    if (authUrl != null) __obj.updateDynamic("authUrl")(authUrl)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(queryTime)) __obj.updateDynamic("queryTime")(queryTime)
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (tokenDetails != null) __obj.updateDynamic("tokenDetails")(tokenDetails)
    if (!js.isUndefined(useTokenAuth)) __obj.updateDynamic("useTokenAuth")(useTokenAuth)
    __obj.asInstanceOf[AuthOptions]
  }
}

