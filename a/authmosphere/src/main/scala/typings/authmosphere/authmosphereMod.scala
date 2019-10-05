package typings.authmosphere

import org.scalablytyped.runtime.StringDictionary
import typings.authmosphere.libSrcTypesGetTokenInfoMod.GetTokenInfo
import typings.authmosphere.libSrcTypesLoggerMod.Logger
import typings.authmosphere.libSrcTypesMockOptionsMod.MockOptions
import typings.authmosphere.libSrcTypesOAuthConfigMod.OAuthConfig
import typings.authmosphere.libSrcTypesOAuthConfigMod.TokenCacheOAuthConfig
import typings.authmosphere.libSrcTypesTokenCacheConfigMod.CacheConfig
import typings.authmosphere.libSrcTypesTokenCacheConfigMod.TokenCacheOptions
import typings.authmosphere.libSrcTypesTokenMod.Token
import typings.nock.nockMod.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere", JSImport.Namespace)
@js.native
object authmosphereMod extends js.Object {
  /**
    * Class to request and cache tokens on client-side.
    *
    * Usage:
    *  const tokenCache = new TokenCache({
    *    'nucleus': ['write.all', 'read.all']
    *  }, oAuthConfig, options);
    *
    *  tokenCache.get('nucleus')
    *  .then((token) => {
    *    console.log(token.access_token);
    *  });
    *
    */
  @js.native
  class TokenCache protected ()
    extends typings.authmosphere.libSrcTokenDashCacheMod.TokenCache {
    /**
      * @param tokenConfig
      * @param oauthConfig
      */
    def this(tokenConfig: StringDictionary[js.Array[String]], oauthConfig: TokenCacheOAuthConfig) = this()
    def this(
      tokenConfig: StringDictionary[js.Array[String]],
      oauthConfig: TokenCacheOAuthConfig,
      options: TokenCacheOptions
    ) = this()
  }
  
  val authenticationMiddleware: typings.authmosphere.libSrcExpressDashToolingMod.authenticationMiddleware = js.native
  val defaultCacheConfig: CacheConfig = js.native
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
  val getTokenInfo: GetTokenInfo[js.Object] = js.native
  val requireScopesMiddleware: typings.authmosphere.libSrcExpressDashToolingMod.requireScopesMiddleware = js.native
  /**
    * Removes generated tokens and mocked endpoints.
    */
  def cleanMock(): Unit = js.native
  /**
    * Returns URI to request authorization code with the given parameters.
    *
    * @param authorizationEndpoint - OAuth authorization endpoint
    * @param redirectUri - absolute URI specifying the endpoint the authorization code is responded
    * @param clientId - client id of requesting application
    * @param queryParams - optional set of key-value pairs which will be added as query parameters to the request
    * @returns {string}
    */
  def createAuthCodeRequestUri(authorizationEndpoint: String, redirectUri: String, clientId: String): String = js.native
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
  def getAccessToken(options: OAuthConfig): js.Promise[Token[js.Object]] = js.native
  def getAccessToken(options: OAuthConfig, logger: Logger): js.Promise[Token[js.Object]] = js.native
  /**
    * Creates a __very basic__ mock of token endpoint as defined in [RFC 6749](https://tools.ietf.org/html/rfc6749).
    *
    * @param options
    * @returns {nock.Scope}
    *
    * @throws on parse error of options.url
    */
  def mockAccessTokenEndpoint(options: MockOptions): Scope = js.native
  def mockAccessTokenEndpointWithErrorResponse(options: MockOptions, httpStatus: Double): Scope = js.native
  def mockAccessTokenEndpointWithErrorResponse(options: MockOptions, httpStatus: Double, responseBody: js.Object): Scope = js.native
  /**
    * Creates a __very basic__ mock of a token validation endpoint.
    *
    * @param options
    * @returns {nock.Scope}
    *
    * @throws on parse error of options.url
    */
  def mockTokeninfoEndpoint(options: MockOptions): Scope = js.native
  def mockTokeninfoEndpoint(options: MockOptions, tokens: js.Array[Anon_Accesstoken]): Scope = js.native
  def mockTokeninfoEndpointWithErrorResponse(options: MockOptions, httpStatus: Double): Scope = js.native
  def mockTokeninfoEndpointWithErrorResponse(options: MockOptions, httpStatus: Double, responseBody: js.Object): Scope = js.native
  def safeLogger(): Logger = js.native
  def safeLogger(logger: Logger): Logger = js.native
  @js.native
  object OAuthGrantType extends js.Object {
    /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.AUTHORIZATION_CODE_GRANT with String = js.native
    /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.CLIENT_CREDENTIALS_GRANT with String = js.native
    /* "password" */ val PASSWORD_CREDENTIALS_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.PASSWORD_CREDENTIALS_GRANT with String = js.native
    /* "refresh_token" */ val REFRESH_TOKEN_GRANT: typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType.REFRESH_TOKEN_GRANT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.authmosphere.libSrcTypesOAuthGrantTypeMod.OAuthGrantType with String] = js.native
  }
  
}

