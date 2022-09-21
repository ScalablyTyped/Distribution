package typings.authmosphere

import org.scalablytyped.runtime.StringDictionary
import typings.authmosphere.getTokenInfoMod.GetTokenInfo
import typings.authmosphere.loggerMod.Logger
import typings.authmosphere.mockOptionsMod.MockOptions
import typings.authmosphere.oauthconfigMod.OAuthConfig
import typings.authmosphere.oauthconfigMod.TokenCacheOAuthConfig
import typings.authmosphere.tokenCacheConfigMod.CacheConfig
import typings.authmosphere.tokenCacheConfigMod.TokenCacheOptions
import typings.authmosphere.tokenMod.Token
import typings.nock.mod.Scope
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("authmosphere", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("authmosphere", "OAuthGrantType")
  @js.native
  object OAuthGrantType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.authmosphere.oauthgranttypeMod.OAuthGrantType & String] = js.native
    
    /* "authorization_code" */ val AUTHORIZATION_CODE_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.AUTHORIZATION_CODE_GRANT & String = js.native
    
    /* "client_credentials" */ val CLIENT_CREDENTIALS_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.CLIENT_CREDENTIALS_GRANT & String = js.native
    
    /* "password" */ val PASSWORD_CREDENTIALS_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.PASSWORD_CREDENTIALS_GRANT & String = js.native
    
    /* "refresh_token" */ val REFRESH_TOKEN_GRANT: typings.authmosphere.oauthgranttypeMod.OAuthGrantType.REFRESH_TOKEN_GRANT & String = js.native
  }
  
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
  @JSImport("authmosphere", "TokenCache")
  @js.native
  open class TokenCache protected ()
    extends typings.authmosphere.tokenCacheMod.TokenCache {
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
  
  @JSImport("authmosphere", "authenticationMiddleware")
  @js.native
  val authenticationMiddleware: typings.authmosphere.expressToolingMod.authenticationMiddleware = js.native
  
  /**
    * Removes generated tokens and mocked endpoints.
    */
  inline def cleanMock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanMock")().asInstanceOf[Unit]
  
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
  
  @JSImport("authmosphere", "defaultCacheConfig")
  @js.native
  val defaultCacheConfig: CacheConfig = js.native
  
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
  @JSImport("authmosphere", "getTokenInfo")
  @js.native
  val getTokenInfo: GetTokenInfo[Record[String | Double | js.Symbol, Any]] = js.native
  
  /**
    * Creates a __very basic__ mock of token endpoint as defined in [RFC 6749](https://tools.ietf.org/html/rfc6749).
    *
    * @param options
    * @returns {nock.Scope}
    *
    * @throws on parse error of options.url
    */
  inline def mockAccessTokenEndpoint(options: MockOptions): Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("mockAccessTokenEndpoint")(options.asInstanceOf[js.Any]).asInstanceOf[Scope]
  
  inline def mockAccessTokenEndpointWithErrorResponse(options: MockOptions, httpStatus: Double): Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("mockAccessTokenEndpointWithErrorResponse")(options.asInstanceOf[js.Any], httpStatus.asInstanceOf[js.Any])).asInstanceOf[Scope]
  inline def mockAccessTokenEndpointWithErrorResponse(options: MockOptions, httpStatus: Double, responseBody: Record[String | Double | js.Symbol, Any]): Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("mockAccessTokenEndpointWithErrorResponse")(options.asInstanceOf[js.Any], httpStatus.asInstanceOf[js.Any], responseBody.asInstanceOf[js.Any])).asInstanceOf[Scope]
  
  /**
    * Creates a __very basic__ mock of a token validation endpoint.
    *
    * @param options
    * @returns {nock.Scope}
    *
    * @throws on parse error of options.url
    */
  inline def mockTokeninfoEndpoint(options: MockOptions): Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("mockTokeninfoEndpoint")(options.asInstanceOf[js.Any]).asInstanceOf[Scope]
  inline def mockTokeninfoEndpoint(options: MockOptions, tokens: js.Array[Token[Record[String | Double | js.Symbol, Any]]]): Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("mockTokeninfoEndpoint")(options.asInstanceOf[js.Any], tokens.asInstanceOf[js.Any])).asInstanceOf[Scope]
  
  inline def mockTokeninfoEndpointWithErrorResponse(options: MockOptions, httpStatus: Double): Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("mockTokeninfoEndpointWithErrorResponse")(options.asInstanceOf[js.Any], httpStatus.asInstanceOf[js.Any])).asInstanceOf[Scope]
  inline def mockTokeninfoEndpointWithErrorResponse(options: MockOptions, httpStatus: Double, responseBody: Record[String | Double | js.Symbol, Any]): Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("mockTokeninfoEndpointWithErrorResponse")(options.asInstanceOf[js.Any], httpStatus.asInstanceOf[js.Any], responseBody.asInstanceOf[js.Any])).asInstanceOf[Scope]
  
  @JSImport("authmosphere", "requireScopesMiddleware")
  @js.native
  val requireScopesMiddleware: typings.authmosphere.expressToolingMod.requireScopesMiddleware = js.native
  
  inline def safeLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("safeLogger")().asInstanceOf[Logger]
  inline def safeLogger(logger: Logger): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("safeLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[Logger]
}
