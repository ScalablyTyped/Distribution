package typings.adalNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("adal-node", "AuthenticationContext")
@js.native
class AuthenticationContext protected () extends js.Object {
  /**
    * Creates a new AuthenticationContext object.  By default the authority will be checked against
    * a list of known Azure Active Directory authorities.  If the authority is not recognized as
    * one of these well known authorities then token acquisition will fail.  This behavior can be
    * turned off via the validateAuthority parameter below.
    * @constructor
    * @param {string}  authority            A URL that identifies a token authority.
    * @param {bool}   [validateAuthority]   Turns authority validation on or off.  This parameter default to true.
    * @param {TokenCache}   [cache]         Sets the token cache used by this AuthenticationContext instance.  If this parameter is not set
    *                                       then a default, in memory cache is used.  The default in memory cache is global to the process and is
    *                                       shared by all AuthenticationContexts that are created with an empty cache parameter.  To control the
    *                                       scope and lifetime of a cache you can either create a {@link MemoryCache} instance and pass it when
    *                                       constructing an AuthenticationContext or implement a custom {@link TokenCache} and pass that.  Cache
    *                                       instances passed at AuthenticationContext construction time are only used by that instance of
    *                                       the AuthenticationContext and are not shared unless it has been manually passed during the
    *                                       construction of other AuthenticationContexts.
    *
    */
  def this(authority: String) = this()
  def this(authority: String, validateAuthority: Boolean) = this()
  def this(authority: String, validateAuthority: js.UndefOr[scala.Nothing], cache: TokenCache) = this()
  def this(authority: String, validateAuthority: Boolean, cache: TokenCache) = this()
  def this(
    authority: String,
    validateAuthority: js.UndefOr[scala.Nothing],
    cache: js.UndefOr[scala.Nothing],
    aadApiVersion: String
  ) = this()
  def this(
    authority: String,
    validateAuthority: js.UndefOr[scala.Nothing],
    cache: TokenCache,
    aadApiVersion: String
  ) = this()
  def this(
    authority: String,
    validateAuthority: Boolean,
    cache: js.UndefOr[scala.Nothing],
    aadApiVersion: String
  ) = this()
  def this(authority: String, validateAuthority: Boolean, cache: TokenCache, aadApiVersion: String) = this()
  
  /**
    * Gets a token for a given resource.
    * @param {string}   resource                            A URI that identifies the resource for which the token is valid.
    * @param {string}   userId                              The username of the user on behalf this application is authenticating.
    * @param {string}   clientId                            The OAuth client id of the calling application.
    * @param {AcquireTokenCallback}   callback              The callback function.
    */
  def acquireToken(resource: String, userId: String, clientId: String, callback: AcquireTokenCallback): Unit = js.native
  
  /**
    * Gets a token for a given resource.
    * @param {string}   authorizationCode                   An authorization code returned from a client.
    * @param {string}   redirectUri                         The redirect uri that was used in the authorize call.
    * @param {string}   resource                            A URI that identifies the resource for which the token is valid.
    * @param {string}   clientId                            The OAuth client id of the calling application.
    * @param {string}   clientSecret                        The OAuth client secret of the calling application.
    * @param {AcquireTokenCallback}   callback              The callback function.
    */
  def acquireTokenWithAuthorizationCode(
    authorizationCode: String,
    redirectUri: String,
    resource: String,
    clientId: String,
    clientSecret: String,
    callback: AcquireTokenCallback
  ): Unit = js.native
  
  /**
    * Gets a new access token using via a certificate credential.
    * @param  {string}   resource                            A URI that identifies the resource for which the token is valid.
    * @param  {string}   clientId                            The OAuth client id of the calling application.
    * @param  {string}   certificate                         A PEM encoded certificate private key.
    * @param  {string}   thumbprint                          A hex encoded thumbprint of the certificate.
    * @param  {AcquireTokenCallback}   callback              The callback function.
    */
  def acquireTokenWithClientCertificate(
    resource: String,
    clientId: String,
    certificate: String,
    thumbprint: String,
    callback: AcquireTokenCallback
  ): Unit = js.native
  
  /**
    * Gets a token for a given resource.
    * @param {string}   resource                            A URI that identifies the resource for which the token is valid.
    * @param {string}   clientId                            The OAuth client id of the calling application.
    * @param {string}   clientSecret                        The OAuth client secret of the calling application.
    * @param {AcquireTokenCallback}   callback              The callback function.
    */
  def acquireTokenWithClientCredentials(resource: String, clientId: String, clientSecret: String, callback: AcquireTokenCallback): Unit = js.native
  
  /**
    * Gets a new access token using via a device code.
    * @note This method doesn't look up the cache, it only stores the returned token into cache. To look up cache before making a new request, 
    *       please use acquireToken.  
    * @param  {string}   clientId                            The OAuth client id of the calling application.
    * @param  {object}   userCodeInfo                        Contains device_code, retry interval, and expire time for the request for get the token. 
    * @param  {AcquireTokenCallback}   callback              The callback function.
    */
  def acquireTokenWithDeviceCode(resource: String, clientId: String, userCodeInfo: UserCodeInfo, callback: AcquireTokenCallback): Unit = js.native
  
  def acquireTokenWithRefreshToken(
    refreshToken: String,
    clientId: String,
    clientSecret: String,
    resource: String,
    callback: AcquireTokenCallback
  ): Unit = js.native
  /**
    * Gets a new access token via a previously issued refresh token.
    * @param  {string}   refreshToken                        A refresh token returned in a tokne response from a previous invocation of acquireToken.
    * @param  {string}   clientId                            The OAuth client id of the calling application.
    * @param  {string}   [clientSecret]                      The OAuth client secret of the calling application.  (Note: this parameter is a late addition.
    *                                                        This parameter may be ommitted entirely so that applications built before this change will continue
    *                                                        to work unchanged.)
    * @param  {string}   resource                            The OAuth resource for which a token is being request.  This parameter is optional and can be set to null.
    * @param  {AcquireTokenCallback}   callback              The callback function.
    */
  def acquireTokenWithRefreshToken(refreshToken: String, clientId: String, resource: String, callback: AcquireTokenCallback): Unit = js.native
  
  /**
    * Gets a token for a given resource.
    * @param {string}   resource                            A URI that identifies the resource for which the token is valid.
    * @param {string}   username                            The username of the user on behalf this application is authenticating.
    * @param {string}   password                            The password of the user named in the username parameter.
    * @param {string}   clientId                            The OAuth client id of the calling application.
    * @param {AcquireTokenCallback}   callback              The callback function.
    */
  def acquireTokenWithUsernamePassword(
    resource: String,
    username: String,
    password: String,
    clientId: String,
    callback: AcquireTokenCallback
  ): Unit = js.native
  
  /**
    * Gets the userCodeInfo which contains user_code, device_code for authenticating user on device. 
    * @param  {string}   resource                            A URI that identifies the resource for which the device_code and user_code is valid for.
    * @param  {string}   clientId                            The OAuth client id of the calling application.
    * @param  {string}   language                            The language code specifying how the message should be localized to. 
    * @param  {AcquireUserCodeCallback}   callback              The callback function.
    */
  def acquireUserCode(resource: String, clientId: String, language: String, callback: AcquireUserCodeCallback): Unit = js.native
  
  /**
    * @property {string}  authority A URL that identifies a token authority.
    */
  var authority: String = js.native
  
  /**
    * @property {TokenCache} cache The token cache used by this AuthenticationContext instance
    */
  var cache: TokenCache = js.native
  
  /**
    * Cancels the polling request to get token with device code. 
    * @param  {object}   userCodeInfo                        Contains device_code, retry interval, and expire time for the request for get the token. 
    * @param  {AcquireTokenCallback}   callback              The callback function.
    */
  def cancelRequestToGetTokenWithDeviceCode(userCodeInfo: UserCodeInfo, callback: AcquireTokenCallback): Unit = js.native
  
  /**
    * @property {string} correlationId The correlation id that will be used for the next acquireToken request.
    */
  var correlationId: String = js.native
  
  /**
    * @property {any} options Options that are applied to requests generated by this AuthenticationContext instance.
    */
  var options: js.Any = js.native
}
