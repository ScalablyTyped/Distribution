package typings.authmosphere

import org.scalablytyped.runtime.StringDictionary
import typings.authmosphere.libSrcTypesGetTokenInfoMod.GetTokenInfo
import typings.authmosphere.libSrcTypesLoggerMod.Logger
import typings.authmosphere.libSrcTypesOauthconfigMod.OAuthConfig
import typings.authmosphere.libSrcTypesTokenMod.Token
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcOauthToolingMod {
  
  @JSImport("authmosphere/lib/src/oauth-tooling", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns URI to request authorization code with the given parameters.
    *
    * @param authorizationEndpoint - OAuth authorization endpoint
    * @param redirectUri - absolute URI specifying the endpoint the authorization code is responded
    * @param clientId - client id of requesting application
    * @param queryParams - optional set of key-value pairs which will be added as query parameters to the request
    * @returns {string}
    */
  inline def createAuthCodeRequestUri(authorizationEndpoint: String, redirectUri: String, clientId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createAuthCodeRequestUri")(authorizationEndpoint.asInstanceOf[js.Any], redirectUri.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def createAuthCodeRequestUri(
    authorizationEndpoint: String,
    redirectUri: String,
    clientId: String,
    queryParams: StringDictionary[String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createAuthCodeRequestUri")(authorizationEndpoint.asInstanceOf[js.Any], redirectUri.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], queryParams.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Requests a token based on the given configuration (which specifies the grant type and corresponding parameters).
    *
    * Resolves with object of type `Token` (in case of success).
    * Otherwise, rejects with error message.
    *
    * @param options - OAuthConfig
    * @param logger - optional logger
    * @returns {Promise<T>}
    */
  inline def getAccessToken(options: OAuthConfig): js.Promise[Token[Record[String | Double | js.Symbol, Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessToken")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Token[Record[String | Double | js.Symbol, Any]]]]
  inline def getAccessToken(options: OAuthConfig, logger: Logger): js.Promise[Token[Record[String | Double | js.Symbol, Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAccessToken")(options.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Token[Record[String | Double | js.Symbol, Any]]]]
  
  /**
    * Makes a request to the `tokenInfoUrl` to validate the given `accessToken`.
    * In case of success resolves with a token.
    * Otherwise, rejects with an error message.
    *
    * Specify `T` to extend the type `Token`.
    *
    * @param tokenInfoUrl - OAuth endpoint for validating tokens
    * @param accessToken - access token to be validated
    * @param logger - optional logger
    *
    * @returns { Promise<Token<T>> }
    */
  @JSImport("authmosphere/lib/src/oauth-tooling", "getTokenInfo")
  @js.native
  val getTokenInfo: GetTokenInfo[Record[String | Double | js.Symbol, Any]] = js.native
}
