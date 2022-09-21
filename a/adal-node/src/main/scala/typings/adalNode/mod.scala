package typings.adalNode

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("adal-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("adal-node", "AuthenticationContext")
  @js.native
  open class AuthenticationContext protected () extends StObject {
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
    def this(authority: String, validateAuthority: Boolean, cache: TokenCache) = this()
    def this(authority: String, validateAuthority: Unit, cache: TokenCache) = this()
    def this(authority: String, validateAuthority: Boolean, cache: Unit, aadApiVersion: String) = this()
    def this(authority: String, validateAuthority: Boolean, cache: TokenCache, aadApiVersion: String) = this()
    def this(authority: String, validateAuthority: Unit, cache: Unit, aadApiVersion: String) = this()
    def this(authority: String, validateAuthority: Unit, cache: TokenCache, aadApiVersion: String) = this()
    
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
    var options: Any = js.native
  }
  
  @JSImport("adal-node", "AuthenticationParameters")
  @js.native
  open class AuthenticationParameters protected () extends StObject {
    /**
      * @constructor Provides an instance of AuthenticationParameters
      * @param {string} authorizationUri The URI of an authority that can issues tokens for the resource that issued the challenge.
      * @param {string} resource         The resource for a which a token should be requested from the authority.
      */
    def this(authorizationUri: String, resource: String) = this()
    
    var authorizationUri: String = js.native
    
    var resource: String = js.native
  }
  
  @JSImport("adal-node", "Logging")
  @js.native
  open class Logging () extends StObject
  /* static members */
  object Logging {
    
    @JSImport("adal-node", "Logging")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @property {LoggingLevel} LOGGING_LEVEL Provides information about the logging levels.
      * ERROR: 0,
      * WARN: 1,
      * INFO: 2,
      * VERBOSE: 3
      */
    @JSImport("adal-node", "Logging.LOGGING_LEVEL")
    @js.native
    def LOGGING_LEVEL: LoggingLevel = js.native
    inline def LOGGING_LEVEL_=(x: LoggingLevel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOGGING_LEVEL")(x.asInstanceOf[js.Any])
    
    /**
      * Get's the current global logging options.
      * @return {LoggingOptions}
      */
    inline def getLoggingOptions(): LoggingOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggingOptions")().asInstanceOf[LoggingOptions]
    
    /**
      * Sets global logging options for ADAL.
      * @param {LoggingOptions} options
      */
    inline def setLoggingOptions(options: LoggingOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLoggingOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("adal-node", "MemoryCache")
  @js.native
  /**
    * @constructor Creates an instance of MemoryCache
    */
  open class MemoryCache ()
    extends StObject
       with TokenCache {
    
    /**
      * @private
      * @property {Array<TokenResponse>} _entries An array of entries in the TokenCache.
      */
    /* private */ var _entries: js.Array[TokenResponse] = js.native
    
    /**
      * Adds a collection of entries to the cache in a single batch operation.
      * @param {Array}   entries  An array of entries to add to the cache.
      * @param  {Function} callback This function is called when the operation is complete.  Any error is provided as the
      *                             first parameter.
      */
    /* CompleteClass */
    override def add(
      entries: js.Array[TokenResponse],
      callback: js.Function2[/* err */ js.Error, /* result */ Boolean, Unit]
    ): Unit = js.native
    
    /**
      * Finds all entries in the cache that match all of the passed in values.
      * @param  {object}   query    This object will be compared to each entry in the cache.  Any entries that
      *                             match all of the values in this object will be returned.  All the values
      *                             in the passed in object must match values in a potentialy returned object
      *                             exactly.  The returned object may have more values than the passed in query
      *                             object. Please take a look at http://underscorejs.org/#where for an example 
      *                             on how to provide query.
      * @param  {TokenCacheFindCallback} callback
      */
    /* CompleteClass */
    override def find(query: Any, callback: js.Function2[/* err */ js.Error, /* results */ js.Array[Any], Unit]): Unit = js.native
    
    /**
      * Removes a collection of entries from the cache in a single batch operation.
      * @param  {Array}   entries  An array of cache entries to remove.
      * @param  {Function} callback This function is called when the operation is complete.  Any error is provided as the
      *                             first parameter.
      */
    /* CompleteClass */
    override def remove(
      entires: js.Array[TokenResponse],
      callback: js.Function2[/* err */ js.Error, /* result */ Null, Unit]
    ): Unit = js.native
  }
  
  inline def createAuthenticationContext(authority: String): AuthenticationContext = ^.asInstanceOf[js.Dynamic].applyDynamic("createAuthenticationContext")(authority.asInstanceOf[js.Any]).asInstanceOf[AuthenticationContext]
  inline def createAuthenticationContext(authority: String, validateAuthority: Boolean): AuthenticationContext = (^.asInstanceOf[js.Dynamic].applyDynamic("createAuthenticationContext")(authority.asInstanceOf[js.Any], validateAuthority.asInstanceOf[js.Any])).asInstanceOf[AuthenticationContext]
  
  inline def createAuthenticationParametersFromHeader(challenge: String): AuthenticationParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("createAuthenticationParametersFromHeader")(challenge.asInstanceOf[js.Any]).asInstanceOf[AuthenticationParameters]
  
  inline def createAuthenticationParametersFromResponse(response: IncomingMessage): AuthenticationParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("createAuthenticationParametersFromResponse")(response.asInstanceOf[js.Any]).asInstanceOf[AuthenticationParameters]
  
  inline def createAuthenticationParametersFromUrl(
    url: String,
    callback: js.Function2[/* error */ js.Error, /* parameters */ AuthenticationParameters, Unit]
  ): AuthenticationParameters = (^.asInstanceOf[js.Dynamic].applyDynamic("createAuthenticationParametersFromUrl")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[AuthenticationParameters]
  inline def createAuthenticationParametersFromUrl(
    url: String,
    callback: js.Function2[/* error */ js.Error, /* parameters */ AuthenticationParameters, Unit],
    correlationId: String
  ): AuthenticationParameters = (^.asInstanceOf[js.Dynamic].applyDynamic("createAuthenticationParametersFromUrl")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], correlationId.asInstanceOf[js.Any])).asInstanceOf[AuthenticationParameters]
  
  inline def getGlobalADALOptions(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalADALOptions")().asInstanceOf[Any]
  
  inline def setGlobalADALOptions(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalADALOptions")().asInstanceOf[Any]
  
  type AcquireTokenCallback = js.Function2[/* error */ js.Error, /* response */ TokenResponse | ErrorResponse, Unit]
  
  type AcquireUserCodeCallback = js.Function2[/* error */ js.Error, /* response */ UserCodeInfo, Unit]
  
  trait ErrorResponse extends StObject {
    
    var error: String
    
    var errorDescription: String
  }
  object ErrorResponse {
    
    inline def apply(error: String, errorDescription: String): ErrorResponse = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorDescription = errorDescription.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorResponse]
    }
    
    extension [Self <: ErrorResponse](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorDescription(value: String): Self = StObject.set(x, "errorDescription", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @callback LoggingCallback
    * @memberOf Logging
    * @param {LoggingLevel} level The level of this log entry.
    * @param {string} message The text content of the log entry.
    * @param {Error}  [error] An Error object if this is an {@link Logging.LOGGING_LEVEL.ERROR|ERROR} level log entry.
    */
  type LoggingCallback = js.Function3[/* level */ LoggingLevel, /* message */ String, /* error */ js.UndefOr[js.Error], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.adalNode.adalNodeNumbers.`0`
    - typings.adalNode.adalNodeNumbers.`1`
    - typings.adalNode.adalNodeNumbers.`2`
    - typings.adalNode.adalNodeNumbers.`3`
  */
  trait LoggingLevel extends StObject
  object LoggingLevel {
    
    inline def `0`: typings.adalNode.adalNodeNumbers.`0` = 0.asInstanceOf[typings.adalNode.adalNodeNumbers.`0`]
    
    inline def `1`: typings.adalNode.adalNodeNumbers.`1` = 1.asInstanceOf[typings.adalNode.adalNodeNumbers.`1`]
    
    inline def `2`: typings.adalNode.adalNodeNumbers.`2` = 2.asInstanceOf[typings.adalNode.adalNodeNumbers.`2`]
    
    inline def `3`: typings.adalNode.adalNodeNumbers.`3` = 3.asInstanceOf[typings.adalNode.adalNodeNumbers.`3`]
  }
  
  /**
    * @typedef LoggingOptions
    * @memberOf Logging
    * @property {LoggingCallback} [log] The function to call when ADAL generates a log entry.
    * @property {LoggingLevel} [level] The maximum level of log entries to generate.
    * @property {boolean} [loggingWithPII] This value indicts if personal identity related information such as token and claims should be logged. The default value is false.
    */
  trait LoggingOptions extends StObject {
    
    var level: js.UndefOr[LoggingLevel] = js.undefined
    
    var log: js.UndefOr[LoggingCallback] = js.undefined
    
    var loggingWithPII: js.UndefOr[Boolean] = js.undefined
  }
  object LoggingOptions {
    
    inline def apply(): LoggingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggingOptions]
    }
    
    extension [Self <: LoggingOptions](x: Self) {
      
      inline def setLevel(value: LoggingLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLog(value: (/* level */ LoggingLevel, /* message */ String, /* error */ js.UndefOr[js.Error]) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction3(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setLoggingWithPII(value: Boolean): Self = StObject.set(x, "loggingWithPII", value.asInstanceOf[js.Any])
      
      inline def setLoggingWithPIIUndefined: Self = StObject.set(x, "loggingWithPII", js.undefined)
    }
  }
  
  trait TokenCache extends StObject {
    
    /**
      * Adds a collection of entries to the cache in a single batch operation.
      * @param {Array}   entries  An array of entries to add to the cache.
      * @param  {Function} callback This function is called when the operation is complete.  Any error is provided as the
      *                             first parameter.
      */
    def add(
      entries: js.Array[TokenResponse],
      callback: js.Function2[/* err */ js.Error, /* result */ Boolean, Unit]
    ): Unit
    
    /**
      * Finds all entries in the cache that match all of the passed in values.
      * @param  {object}   query    This object will be compared to each entry in the cache.  Any entries that
      *                             match all of the values in this object will be returned.  All the values
      *                             in the passed in object must match values in a potentialy returned object
      *                             exactly.  The returned object may have more values than the passed in query
      *                             object. Please take a look at http://underscorejs.org/#where for an example 
      *                             on how to provide query.
      * @param  {TokenCacheFindCallback} callback
      */
    def find(query: Any, callback: js.Function2[/* err */ js.Error, /* results */ js.Array[Any], Unit]): Unit
    
    /**
      * Removes a collection of entries from the cache in a single batch operation.
      * @param  {Array}   entries  An array of cache entries to remove.
      * @param  {Function} callback This function is called when the operation is complete.  Any error is provided as the
      *                             first parameter.
      */
    def remove(
      entires: js.Array[TokenResponse],
      callback: js.Function2[/* err */ js.Error, /* result */ Null, Unit]
    ): Unit
  }
  object TokenCache {
    
    inline def apply(
      add: (js.Array[TokenResponse], js.Function2[/* err */ js.Error, /* result */ Boolean, Unit]) => Unit,
      find: (Any, js.Function2[/* err */ js.Error, /* results */ js.Array[Any], Unit]) => Unit,
      remove: (js.Array[TokenResponse], js.Function2[/* err */ js.Error, /* result */ Null, Unit]) => Unit
    ): TokenCache = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), find = js.Any.fromFunction2(find), remove = js.Any.fromFunction2(remove))
      __obj.asInstanceOf[TokenCache]
    }
    
    extension [Self <: TokenCache](x: Self) {
      
      inline def setAdd(
        value: (js.Array[TokenResponse], js.Function2[/* err */ js.Error, /* result */ Boolean, Unit]) => Unit
      ): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setFind(value: (Any, js.Function2[/* err */ js.Error, /* results */ js.Array[Any], Unit]) => Unit): Self = StObject.set(x, "find", js.Any.fromFunction2(value))
      
      inline def setRemove(
        value: (js.Array[TokenResponse], js.Function2[/* err */ js.Error, /* result */ Null, Unit]) => Unit
      ): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    }
  }
  
  trait TokenResponse
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    /**
      * @property {string} accessToken The returned access token.
      */
    var accessToken: String
    
    /**
      * @property {Date} [createdOn] The date on which the access token was created.
      */
    var createdOn: js.UndefOr[js.Date | String] = js.undefined
    
    /**
      * @property {any} [error] Provides information about error if any.
      */
    var error: js.UndefOr[Any] = js.undefined
    
    /**
      * @property {any} [errorDescription] Short description about error if any.
      */
    var errorDescription: js.UndefOr[Any] = js.undefined
    
    /**
      *  @property {int} expiresIn The amount of time, in seconds, for which the token is valid.
      */
    var expiresIn: Double
    
    /**
      *  @property {Date} expiresOn The Date on which the access token expires.
      */
    var expiresOn: js.Date | String
    
    /**
      * @property {string} [familyName] The family name of the principal represented by the access token.
      */
    var familyName: js.UndefOr[String] = js.undefined
    
    /**
      * @property {string} [givenName] The given name of the principal represented by the access token.
      */
    var givenName: js.UndefOr[String] = js.undefined
    
    /**
      * @property {string} [identityProvider] Identifies the identity provider that issued the access token.
      */
    var identityProvider: js.UndefOr[String] = js.undefined
    
    /**
      * @property {boolean}   [isUserIdDisplayable] Indicates whether the user_id property will be meaningful if displayed to a user.
      */
    var isUserIdDisplayable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @property {string} [oid] The object id of the user in the tenant
      */
    var oid: js.UndefOr[String] = js.undefined
    
    /**
      * @property {string} [refreshToken] A refresh token.
      */
    var refreshToken: js.UndefOr[String] = js.undefined
    
    /**
      * @property {string} resource The resource for which the token was requested for. Example: 'https://management.core.windows.net/'.
      */
    var resource: String
    
    /**
      * @property {string} [tenantId] The identifier of the tenant under which the access token was issued.
      */
    var tenantId: js.UndefOr[String] = js.undefined
    
    /**
      * @property {string} tokenType The type of token returned. Example 'Bearer'.
      */
    var tokenType: String
    
    /**
      * @property {string} [userId] An id for the user.  May be a displayable value if is_user_id_displayable is true.
      */
    var userId: js.UndefOr[String] = js.undefined
  }
  object TokenResponse {
    
    inline def apply(
      accessToken: String,
      expiresIn: Double,
      expiresOn: js.Date | String,
      resource: String,
      tokenType: String
    ): TokenResponse = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], expiresOn = expiresOn.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenResponse]
    }
    
    extension [Self <: TokenResponse](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setCreatedOn(value: js.Date | String): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
      
      inline def setCreatedOnUndefined: Self = StObject.set(x, "createdOn", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorDescription(value: Any): Self = StObject.set(x, "errorDescription", value.asInstanceOf[js.Any])
      
      inline def setErrorDescriptionUndefined: Self = StObject.set(x, "errorDescription", js.undefined)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresOn(value: js.Date | String): Self = StObject.set(x, "expiresOn", value.asInstanceOf[js.Any])
      
      inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
      
      inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
      
      inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
      
      inline def setIdentityProvider(value: String): Self = StObject.set(x, "identityProvider", value.asInstanceOf[js.Any])
      
      inline def setIdentityProviderUndefined: Self = StObject.set(x, "identityProvider", js.undefined)
      
      inline def setIsUserIdDisplayable(value: Boolean): Self = StObject.set(x, "isUserIdDisplayable", value.asInstanceOf[js.Any])
      
      inline def setIsUserIdDisplayableUndefined: Self = StObject.set(x, "isUserIdDisplayable", js.undefined)
      
      inline def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
      
      inline def setOidUndefined: Self = StObject.set(x, "oid", js.undefined)
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  trait UserCodeInfo
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    var deviceCode: String
    
    var error: js.UndefOr[Any] = js.undefined
    
    var errorDescription: js.UndefOr[Any] = js.undefined
    
    var expiresIn: Double
    
    var interval: Double
    
    var message: String
    
    var userCode: String
    
    var verificationUrl: String
  }
  object UserCodeInfo {
    
    inline def apply(
      deviceCode: String,
      expiresIn: Double,
      interval: Double,
      message: String,
      userCode: String,
      verificationUrl: String
    ): UserCodeInfo = {
      val __obj = js.Dynamic.literal(deviceCode = deviceCode.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], userCode = userCode.asInstanceOf[js.Any], verificationUrl = verificationUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserCodeInfo]
    }
    
    extension [Self <: UserCodeInfo](x: Self) {
      
      inline def setDeviceCode(value: String): Self = StObject.set(x, "deviceCode", value.asInstanceOf[js.Any])
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorDescription(value: Any): Self = StObject.set(x, "errorDescription", value.asInstanceOf[js.Any])
      
      inline def setErrorDescriptionUndefined: Self = StObject.set(x, "errorDescription", js.undefined)
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setUserCode(value: String): Self = StObject.set(x, "userCode", value.asInstanceOf[js.Any])
      
      inline def setVerificationUrl(value: String): Self = StObject.set(x, "verificationUrl", value.asInstanceOf[js.Any])
    }
  }
}
