package typings
package authmosphereLib.authmosphereMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val authenticationMiddleware: authmosphereLib.libSrcExpressDashToolingMod.authenticationMiddleware = js.native
  val defaultCacheConfig: authmosphereLib.libSrcTypesTokenCacheConfigMod.CacheConfig = js.native
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
  val getTokenInfo: authmosphereLib.libSrcTypesGetTokenInfoMod.GetTokenInfo[js.Object] = js.native
  val requireScopesMiddleware: authmosphereLib.libSrcExpressDashToolingMod.requireScopesMiddleware = js.native
  /**
    * Removes generated tokens and mocked endpoints.
    */
  def cleanMock(): scala.Unit = js.native
  /**
    * Returns URI to request authorization code with the given parameters.
    *
    * @param authorizationEndpoint - OAuth authorization endpoint
    * @param redirectUri - absolute URI specifying the endpoint the authorization code is responded
    * @param clientId - client id of requesting application
    * @param queryParams - optional set of key-value pairs which will be added as query parameters to the request
    * @returns {string}
    */
  def createAuthCodeRequestUri(authorizationEndpoint: java.lang.String, redirectUri: java.lang.String, clientId: java.lang.String): java.lang.String = js.native
  def createAuthCodeRequestUri(
    authorizationEndpoint: java.lang.String,
    redirectUri: java.lang.String,
    clientId: java.lang.String,
    queryParams: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): java.lang.String = js.native
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
  def getAccessToken(options: authmosphereLib.libSrcTypesOAuthConfigMod.OAuthConfig): js.Promise[authmosphereLib.libSrcTypesTokenMod.Token[js.Object]] = js.native
  def getAccessToken(
    options: authmosphereLib.libSrcTypesOAuthConfigMod.OAuthConfig,
    logger: authmosphereLib.libSrcTypesLoggerMod.Logger
  ): js.Promise[authmosphereLib.libSrcTypesTokenMod.Token[js.Object]] = js.native
  /**
    * Creates a __very basic__ mock of token endpoint as defined in [RFC 6749](https://tools.ietf.org/html/rfc6749).
    *
    * @param options
    * @returns {nock.Scope}
    *
    * @throws on parse error of options.url
    */
  def mockAccessTokenEndpoint(options: authmosphereLib.libSrcTypesMockOptionsMod.MockOptions): nockLib.nockMod.nockNs.Scope = js.native
  def mockAccessTokenEndpointWithErrorResponse(options: authmosphereLib.libSrcTypesMockOptionsMod.MockOptions, httpStatus: scala.Double): nockLib.nockMod.nockNs.Scope = js.native
  def mockAccessTokenEndpointWithErrorResponse(
    options: authmosphereLib.libSrcTypesMockOptionsMod.MockOptions,
    httpStatus: scala.Double,
    responseBody: js.Object
  ): nockLib.nockMod.nockNs.Scope = js.native
  /**
    * Creates a __very basic__ mock of a token validation endpoint.
    *
    * @param options
    * @returns {nock.Scope}
    *
    * @throws on parse error of options.url
    */
  def mockTokeninfoEndpoint(options: authmosphereLib.libSrcTypesMockOptionsMod.MockOptions): nockLib.nockMod.nockNs.Scope = js.native
  def mockTokeninfoEndpoint(
    options: authmosphereLib.libSrcTypesMockOptionsMod.MockOptions,
    tokens: js.Array[authmosphereLib.Anon_Accesstoken]
  ): nockLib.nockMod.nockNs.Scope = js.native
  def mockTokeninfoEndpointWithErrorResponse(options: authmosphereLib.libSrcTypesMockOptionsMod.MockOptions, httpStatus: scala.Double): nockLib.nockMod.nockNs.Scope = js.native
  def mockTokeninfoEndpointWithErrorResponse(
    options: authmosphereLib.libSrcTypesMockOptionsMod.MockOptions,
    httpStatus: scala.Double,
    responseBody: js.Object
  ): nockLib.nockMod.nockNs.Scope = js.native
  def safeLogger(): authmosphereLib.libSrcTypesLoggerMod.Logger = js.native
  def safeLogger(logger: authmosphereLib.libSrcTypesLoggerMod.Logger): authmosphereLib.libSrcTypesLoggerMod.Logger = js.native
}

