package typings.authmosphere

import org.scalablytyped.runtime.StringDictionary
import typings.authmosphere.getTokenInfoMod.GetTokenInfo
import typings.authmosphere.loggerMod.Logger
import typings.authmosphere.oauthconfigMod.OAuthConfig
import typings.authmosphere.tokenMod.Token
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oauthToolingMod {
  
  /**
    * Returns URI to request authorization code with the given parameters.
    *
    * @param authorizationEndpoint - OAuth authorization endpoint
    * @param redirectUri - absolute URI specifying the endpoint the authorization code is responded
    * @param clientId - client id of requesting application
    * @param queryParams - optional set of key-value pairs which will be added as query parameters to the request
    * @returns {string}
    */
  @JSImport("authmosphere/lib/src/oauth-tooling", "createAuthCodeRequestUri")
  @js.native
  def createAuthCodeRequestUri(authorizationEndpoint: String, redirectUri: String, clientId: String): String = js.native
  @JSImport("authmosphere/lib/src/oauth-tooling", "createAuthCodeRequestUri")
  @js.native
  def createAuthCodeRequestUri(
    authorizationEndpoint: String,
    redirectUri: String,
    clientId: String,
    queryParams: StringDictionary[String]
  ): String = js.native
  
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
  @JSImport("authmosphere/lib/src/oauth-tooling", "getAccessToken")
  @js.native
  def getAccessToken(options: OAuthConfig): js.Promise[Token[Record[String, _]]] = js.native
  @JSImport("authmosphere/lib/src/oauth-tooling", "getAccessToken")
  @js.native
  def getAccessToken(options: OAuthConfig, logger: Logger): js.Promise[Token[Record[String, _]]] = js.native
  
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
  val getTokenInfo: GetTokenInfo[Record[String, js.Any]] = js.native
}
