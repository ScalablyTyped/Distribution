package typings
package ablyLib.ablyMod.TypesNs

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
        /* error */ ErrorInfo | java.lang.String, 
        /* tokenRequestOrDetails */ TokenDetails | TokenRequest | java.lang.String, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
  var authHeaders: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var authMethod: js.UndefOr[HTTPMethods] = js.undefined
  var authParams: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
  		 * A URL that the library may use to obtain a token string (in plain text format), or a signed TokenRequest or TokenDetails (in JSON format).
  		 **/
  var authUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Optional clientId that can be used to specify the identity for this client. In most cases
  		 * it is preferable to instead specift a clientId in the token issued to this client.
  		 */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var queryTime: js.UndefOr[scala.Boolean] = js.undefined
  var token: js.UndefOr[TokenDetails | java.lang.String] = js.undefined
  var tokenDetails: js.UndefOr[TokenDetails] = js.undefined
  var useTokenAuth: js.UndefOr[scala.Boolean] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(
    authCallback: js.Function2[
      /* data */ TokenParams, 
      /* callback */ js.Function2[
        /* error */ ErrorInfo | java.lang.String, 
        /* tokenRequestOrDetails */ TokenDetails | TokenRequest | java.lang.String, 
        scala.Unit
      ], 
      scala.Unit
    ] = null,
    authHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    authMethod: HTTPMethods = null,
    authParams: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    authUrl: java.lang.String = null,
    clientId: java.lang.String = null,
    key: java.lang.String = null,
    queryTime: js.UndefOr[scala.Boolean] = js.undefined,
    token: TokenDetails | java.lang.String = null,
    tokenDetails: TokenDetails = null,
    useTokenAuth: js.UndefOr[scala.Boolean] = js.undefined
  ): AuthOptions = {
    val __obj = js.Dynamic.literal()
    if (authCallback != null) __obj.updateDynamic("authCallback")(authCallback)
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

