package typings.adalAngular

import org.scalablytyped.runtime.StringDictionary
import typings.adalAngular.adalAngularNumbers.`483`
import typings.adalAngular.adalAngularNumbers.`600`
import typings.adalAngular.adalAngularStrings.Canceled
import typings.adalAngular.adalAngularStrings.Completed
import typings.adalAngular.adalAngularStrings.Verticalline
import typings.adalAngular.adalAngularStrings.`6000`
import typings.adalAngular.adalAngularStrings.`In Progress`
import typings.adalAngular.adalAngularStrings.access_token
import typings.adalAngular.adalAngularStrings.error_description
import typings.adalAngular.adalAngularStrings.expires_in
import typings.adalAngular.adalAngularStrings.id_token
import typings.adalAngular.adalAngularStrings.localStorage
import typings.adalAngular.adalAngularStrings.sessionStorage
import typings.adalAngular.adalAngularStrings.session_state
import typings.adalAngular.anon.ACCESSTOKENKEY
import typings.adalAngular.anon.ERROR
import typings.adalAngular.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // This class is defined globally in not in a module context
  @JSImport("adal-angular", JSImport.Namespace)
  @js.native
  class ^ protected () extends AuthenticationContext {
    def this(options: Options) = this()
  }
  
  @JSImport("adal-angular", "inject")
  @js.native
  def inject(config: Options): AuthenticationContext = js.native
  
  // This class is defined globally in not in a module context
  @js.native
  trait AuthenticationContext extends StObject {
    
    var CONSTANTS: Constants = js.native
    
    /**
      * Enum for request type
      */
    var REQUEST_TYPE: RequestType = js.native
    
    var RESPONSE_TYPE: ResponseType = js.native
    
    /**
      * Acquires token from the cache if it is not expired. Otherwise sends request to AAD to obtain a new token.
      * @param resource Resource URI identifying the target resource.
      * @param callback The callback provided by the caller. It will be called with token or error.
      */
    def acquireToken(resource: String, callback: TokenCallback): Unit = js.native
    
    def acquireTokenPopup(
      resource: String,
      extraQueryParameters: js.UndefOr[scala.Nothing],
      claims: js.UndefOr[scala.Nothing],
      callback: TokenCallback
    ): Unit = js.native
    def acquireTokenPopup(
      resource: String,
      extraQueryParameters: js.UndefOr[scala.Nothing],
      claims: String,
      callback: TokenCallback
    ): Unit = js.native
    def acquireTokenPopup(
      resource: String,
      extraQueryParameters: js.UndefOr[scala.Nothing],
      claims: Null,
      callback: TokenCallback
    ): Unit = js.native
    def acquireTokenPopup(
      resource: String,
      extraQueryParameters: String,
      claims: js.UndefOr[scala.Nothing],
      callback: TokenCallback
    ): Unit = js.native
    /**
      * Acquires token (interactive flow using a popup window) by sending request to AAD to obtain a new token.
      * @param resource Resource URI identifying the target resource.
      * @param extraQueryParameters Query parameters to add to the authentication request.
      * @param claims Claims to add to the authentication request.
      * @param callback The callback provided by the caller. It will be called with token or error.
      */
    def acquireTokenPopup(resource: String, extraQueryParameters: String, claims: String, callback: TokenCallback): Unit = js.native
    def acquireTokenPopup(resource: String, extraQueryParameters: String, claims: Null, callback: TokenCallback): Unit = js.native
    def acquireTokenPopup(
      resource: String,
      extraQueryParameters: Null,
      claims: js.UndefOr[scala.Nothing],
      callback: TokenCallback
    ): Unit = js.native
    def acquireTokenPopup(resource: String, extraQueryParameters: Null, claims: String, callback: TokenCallback): Unit = js.native
    def acquireTokenPopup(resource: String, extraQueryParameters: Null, claims: Null, callback: TokenCallback): Unit = js.native
    
    /**
      * Acquires token (interactive flow using a redirect) by sending request to AAD to obtain a new token. In this case the callback passed in the authentication request constructor will be called.
      * @param resource Resource URI identifying the target resource.
      * @param extraQueryParameters Query parameters to add to the authentication request.
      * @param claims Claims to add to the authentication request.
      */
    def acquireTokenRedirect(resource: String): Unit = js.native
    def acquireTokenRedirect(resource: String, extraQueryParameters: js.UndefOr[scala.Nothing], claims: String): Unit = js.native
    def acquireTokenRedirect(resource: String, extraQueryParameters: String): Unit = js.native
    def acquireTokenRedirect(resource: String, extraQueryParameters: String, claims: String): Unit = js.native
    def acquireTokenRedirect(resource: String, extraQueryParameters: Null, claims: String): Unit = js.native
    
    def callback(errorDesc: String, token: String, error: js.Any): Unit = js.native
    def callback(errorDesc: String, token: Null, error: js.Any): Unit = js.native
    def callback(errorDesc: Null, token: String, error: js.Any): Unit = js.native
    def callback(errorDesc: Null, token: Null, error: js.Any): Unit = js.native
    @JSName("callback")
    var callback_Original: TokenCallback = js.native
    
    /**
      * Clears cache items.
      */
    def clearCache(): Unit = js.native
    
    /**
      * Clears cache items for a given resource.
      * @param resource Resource URI identifying the target resource.
      */
    def clearCacheForResource(resource: String): Unit = js.native
    
    var config: Options = js.native
    
    /**
      * Logs messages when logging level is set to 0.
      * @param message Message to log.
      * @param error Error to log.
      */
    def error(message: String, error: js.Any): Unit = js.native
    
    /**
      * Logs Pii messages when Logging Level is set to 0 and window.piiLoggingEnabled is set to true.
      * @param message Message to log.
      * @param error Error to log.
      */
    def errorPii(message: String, error: js.Any): Unit = js.native
    
    /**
      * Gets token for the specified resource from the cache.
      * @param resource A URI that identifies the resource for which the token is requested.
      */
    def getCachedToken(resource: String): String = js.native
    
    /**
      * If user object exists, returns it. Else creates a new user object by decoding `id_token` from the cache.
      */
    def getCachedUser(): UserInfo = js.native
    
    /**
      * Gets login error.
      */
    def getLoginError(): String = js.native
    
    /**
      * Creates a request info object from the URL fragment and returns it.
      */
    def getRequestInfo(hash: String): RequestInfo = js.native
    
    /**
      * Gets resource for given endpoint if mapping is provided with config.
      * @param endpoint Resource URI identifying the target resource.
      */
    def getResourceForEndpoint(resource: String): String = js.native
    
    /**
      * Calls the passed in callback with the user object or error message related to the user.
      * @param callback The callback provided by the caller. It will be called with user or error.
      */
    def getUser(callback: UserCallback): Unit = js.native
    
    /**
      * This method must be called for processing the response received from AAD. It extracts the hash, processes the token or error, saves it in the cache and calls the callbacks with the result.
      * @param hash Hash fragment of URL. Defaults to `window.location.hash`.
      */
    def handleWindowCallback(): Unit = js.native
    def handleWindowCallback(hash: String): Unit = js.native
    
    /**
      * Logs messages when logging level is set to 2.
      * @param message Message to log.
      */
    def info(message: String): Unit = js.native
    
    /**
      * Logs messages when Logging Level is set to 2 and window.piiLoggingEnabled is set to true.
      * @param message Message to log.
      */
    def infoPii(message: String): Unit = js.native
    
    var instance: String = js.native
    
    var isAngular: Boolean = js.native
    
    /**
      * Checks if the URL fragment contains access token, id token or error description.
      * @param hash Hash passed from redirect page.
      */
    def isCallback(hash: String): Boolean = js.native
    
    /**
      * Checks the logging Level, constructs the log message and logs it. Users need to implement/override this method to turn on logging.
      * @param level Level can be set 0, 1, 2 and 3 which turns on 'error', 'warning', 'info' or 'verbose' level logging respectively.
      * @param message Message to log.
      * @param error Error to log.
      */
    def log(level: LoggingLevel, message: String, error: js.Any): Unit = js.native
    
    /**
      * Redirects user to logout endpoint. After logout, it will redirect to `postLogoutRedirectUri` if added as a property on the config object.
      */
    def logOut(): Unit = js.native
    
    /**
      * Initiates the login process by redirecting the user to Azure AD authorization endpoint.
      */
    def login(): Unit = js.native
    
    /**
      * Returns whether a login is in progress.
      */
    def loginInProgress(): Boolean = js.native
    
    var popUp: Boolean = js.native
    
    /**
      * Redirects the browser to Azure AD authorization endpoint.
      * @param urlNavigate URL of the authorization endpoint.
      */
    def promptUser(urlNavigate: String): Unit = js.native
    
    /**
      * Adds the passed callback to the array of callbacks for the specified resource.
      * @param resource A URI that identifies the resource for which the token is requested.
      * @param expectedState A unique identifier (guid).
      * @param callback The callback provided by the caller. It will be called with token or error.
      */
    def registerCallback(expectedState: String, resource: String, callback: TokenCallback): Unit = js.native
    
    /**
      * Saves token or error received in the response from AAD in the cache. In case of `id_token`, it also creates the user object.
      */
    def saveTokenFromHash(requestInfo: RequestInfo): Unit = js.native
    
    /**
      * Logs messages when logging level is set to 3.
      * @param message Message to log.
      */
    def verbose(message: String): Unit = js.native
    
    /**
      * Logs messages when Logging Level is set to 3 and window.piiLoggingEnabled is set to true.
      * @param message Message to log.
      */
    def verbosePii(message: String): Unit = js.native
    
    /**
      * Logs messages when logging level is set to 1.
      * @param message Message to log.
      */
    def warn(message: String): Unit = js.native
    
    /**
      * Logs  Pii messages when Logging Level is set to 1 and window.piiLoggingEnabled is set to true.
      * @param message Message to log.
      */
    def warnPii(message: String): Unit = js.native
  }
  
  /**
    * Enum for storage constants
    */
  @js.native
  trait Constants extends StObject {
    
    var ACCESS_TOKEN: access_token = js.native
    
    var ERROR_DESCRIPTION: error_description = js.native
    
    var EXPIRES_IN: expires_in = js.native
    
    var ID_TOKEN: id_token = js.native
    
    var LEVEL_STRING_MAP: `0` = js.native
    
    var LOADFRAME_TIMEOUT: `6000` = js.native
    
    var LOGGING_LEVEL: ERROR = js.native
    
    var POPUP_HEIGHT: `600` = js.native
    
    var POPUP_WIDTH: `483` = js.native
    
    var RESOURCE_DELIMETER: Verticalline = js.native
    
    var SESSION_STATE: session_state = js.native
    
    var STORAGE: ACCESSTOKENKEY = js.native
    
    var TOKEN_RENEW_STATUS_CANCELED: Canceled = js.native
    
    var TOKEN_RENEW_STATUS_COMPLETED: Completed = js.native
    
    var TOKEN_RENEW_STATUS_IN_PROGRESS: `In Progress` = js.native
  }
  object Constants {
    
    @scala.inline
    def apply(
      ACCESS_TOKEN: access_token,
      ERROR_DESCRIPTION: error_description,
      EXPIRES_IN: expires_in,
      ID_TOKEN: id_token,
      LEVEL_STRING_MAP: `0`,
      LOADFRAME_TIMEOUT: `6000`,
      LOGGING_LEVEL: ERROR,
      POPUP_HEIGHT: `600`,
      POPUP_WIDTH: `483`,
      RESOURCE_DELIMETER: Verticalline,
      SESSION_STATE: session_state,
      STORAGE: ACCESSTOKENKEY,
      TOKEN_RENEW_STATUS_CANCELED: Canceled,
      TOKEN_RENEW_STATUS_COMPLETED: Completed,
      TOKEN_RENEW_STATUS_IN_PROGRESS: `In Progress`
    ): Constants = {
      val __obj = js.Dynamic.literal(ACCESS_TOKEN = ACCESS_TOKEN.asInstanceOf[js.Any], ERROR_DESCRIPTION = ERROR_DESCRIPTION.asInstanceOf[js.Any], EXPIRES_IN = EXPIRES_IN.asInstanceOf[js.Any], ID_TOKEN = ID_TOKEN.asInstanceOf[js.Any], LEVEL_STRING_MAP = LEVEL_STRING_MAP.asInstanceOf[js.Any], LOADFRAME_TIMEOUT = LOADFRAME_TIMEOUT.asInstanceOf[js.Any], LOGGING_LEVEL = LOGGING_LEVEL.asInstanceOf[js.Any], POPUP_HEIGHT = POPUP_HEIGHT.asInstanceOf[js.Any], POPUP_WIDTH = POPUP_WIDTH.asInstanceOf[js.Any], RESOURCE_DELIMETER = RESOURCE_DELIMETER.asInstanceOf[js.Any], SESSION_STATE = SESSION_STATE.asInstanceOf[js.Any], STORAGE = STORAGE.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_CANCELED = TOKEN_RENEW_STATUS_CANCELED.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_COMPLETED = TOKEN_RENEW_STATUS_COMPLETED.asInstanceOf[js.Any], TOKEN_RENEW_STATUS_IN_PROGRESS = TOKEN_RENEW_STATUS_IN_PROGRESS.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constants]
    }
    
    @scala.inline
    implicit class ConstantsMutableBuilder[Self <: Constants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setACCESS_TOKEN(value: access_token): Self = StObject.set(x, "ACCESS_TOKEN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERROR_DESCRIPTION(value: error_description): Self = StObject.set(x, "ERROR_DESCRIPTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEXPIRES_IN(value: expires_in): Self = StObject.set(x, "EXPIRES_IN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setID_TOKEN(value: id_token): Self = StObject.set(x, "ID_TOKEN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEVEL_STRING_MAP(value: `0`): Self = StObject.set(x, "LEVEL_STRING_MAP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLOADFRAME_TIMEOUT(value: `6000`): Self = StObject.set(x, "LOADFRAME_TIMEOUT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLOGGING_LEVEL(value: ERROR): Self = StObject.set(x, "LOGGING_LEVEL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPOPUP_HEIGHT(value: `600`): Self = StObject.set(x, "POPUP_HEIGHT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPOPUP_WIDTH(value: `483`): Self = StObject.set(x, "POPUP_WIDTH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRESOURCE_DELIMETER(value: Verticalline): Self = StObject.set(x, "RESOURCE_DELIMETER", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSESSION_STATE(value: session_state): Self = StObject.set(x, "SESSION_STATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTORAGE(value: ACCESSTOKENKEY): Self = StObject.set(x, "STORAGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOKEN_RENEW_STATUS_CANCELED(value: Canceled): Self = StObject.set(x, "TOKEN_RENEW_STATUS_CANCELED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOKEN_RENEW_STATUS_COMPLETED(value: Completed): Self = StObject.set(x, "TOKEN_RENEW_STATUS_COMPLETED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOKEN_RENEW_STATUS_IN_PROGRESS(value: `In Progress`): Self = StObject.set(x, "TOKEN_RENEW_STATUS_IN_PROGRESS", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoggingConfig extends StObject {
    
    var level: LoggingLevel = js.native
    
    def log(message: String): Unit = js.native
    
    var piiLoggingEnabled: Boolean = js.native
  }
  object LoggingConfig {
    
    @scala.inline
    def apply(level: LoggingLevel, log: String => Unit, piiLoggingEnabled: Boolean): LoggingConfig = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], log = js.Any.fromFunction1(log), piiLoggingEnabled = piiLoggingEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggingConfig]
    }
    
    @scala.inline
    implicit class LoggingConfigMutableBuilder[Self <: LoggingConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: LoggingLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPiiLoggingEnabled(value: Boolean): Self = StObject.set(x, "piiLoggingEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.adalAngular.adalAngularNumbers.`0`
    - typings.adalAngular.adalAngularNumbers.`1`
    - typings.adalAngular.adalAngularNumbers.`2`
    - typings.adalAngular.adalAngularNumbers.`3`
  */
  trait LoggingLevel extends StObject
  object LoggingLevel {
    
    @scala.inline
    def `0`: typings.adalAngular.adalAngularNumbers.`0` = 0.asInstanceOf[typings.adalAngular.adalAngularNumbers.`0`]
    
    @scala.inline
    def `1`: typings.adalAngular.adalAngularNumbers.`1` = 1.asInstanceOf[typings.adalAngular.adalAngularNumbers.`1`]
    
    @scala.inline
    def `2`: typings.adalAngular.adalAngularNumbers.`2` = 2.asInstanceOf[typings.adalAngular.adalAngularNumbers.`2`]
    
    @scala.inline
    def `3`: typings.adalAngular.adalAngularNumbers.`3` = 3.asInstanceOf[typings.adalAngular.adalAngularNumbers.`3`]
  }
  
  /**
    * Configuration options for Authentication Context
    */
  @js.native
  trait Options extends StObject {
    
    /**
      * Array of keywords or URIs. Adal will not attach a token to outgoing requests that have these keywords or URIs.
      */
    var anonymousEndpoints: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Sets browser storage to either 'localStorage' or sessionStorage'. Defaults to `sessionStorage`.
      */
    var cacheLocation: js.UndefOr[localStorage | sessionStorage] = js.native
    
    /**
      * Callback to be invoked when a token is acquired.
      */
    var callback: js.UndefOr[TokenCallback] = js.native
    
    /**
      * Client ID assigned to your app by Azure Active Directory.
      */
    var clientId: String = js.native
    
    /**
      * Unique identifier used to map the request with the response. Defaults to RFC4122 version 4 guid (128 bits).
      */
    var correlationId: js.UndefOr[String] = js.native
    
    /**
      * User defined function of handling the navigation to Azure AD authorization endpoint in case of login.
      */
    var displayCall: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.native
    
    /**
      * Array of keywords or URIs. Adal will attach a token to outgoing requests that have these keywords or URIs.
      */
    var endpoints: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * If the cached token is about to be expired in the expireOffsetSeconds (in seconds), Adal will renew the token instead of using the cached token. Defaults to 300 seconds.
      */
    var expireOffsetSeconds: js.UndefOr[Double] = js.native
    
    /**
      * Query parameters to add to the authentication request.
      */
    var extraQueryParameter: js.UndefOr[String] = js.native
    
    /**
      * Azure Active Directory instance. Defaults to `https://login.microsoftonline.com/`.
      */
    var instance: js.UndefOr[String] = js.native
    
    /**
      * The number of milliseconds of inactivity before a token renewal response from AAD should be considered timed out. Defaults to 6 seconds.
      */
    var loadFrameTimeout: js.UndefOr[Double] = js.native
    
    /**
      * Set this to redirect the user to a custom login page.
      */
    var localLoginUrl: js.UndefOr[String] = js.native
    
    /**
      * Set this to redirect the user to a custom logout page.
      */
    var logOutUri: js.UndefOr[String] = js.native
    
    /**
      * Set this to the resource to request on login. Defaults to `clientId`.
      */
    var loginResource: js.UndefOr[String] = js.native
    
    /**
      * Redirects to start page after login. Defaults to `true`.
      */
    var navigateToLoginRequestUrl: js.UndefOr[Boolean] = js.native
    
    /**
      * Set this to true to enable login in a popup winodow instead of a full redirect. Defaults to `false`.
      */
    var popUp: js.UndefOr[Boolean] = js.native
    
    /**
      * Redirects the user to postLogoutRedirectUri after logout. Defaults to `redirectUri`.
      */
    var postLogoutRedirectUri: js.UndefOr[String] = js.native
    
    /**
      * Endpoint at which you expect to receive tokens.Defaults to `window.location.href`.
      */
    var redirectUri: js.UndefOr[String] = js.native
    
    /**
      * Your target tenant. Defaults to `common`.
      */
    var tenant: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(clientId: String): Options = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnonymousEndpoints(value: js.Array[String]): Self = StObject.set(x, "anonymousEndpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnonymousEndpointsUndefined: Self = StObject.set(x, "anonymousEndpoints", js.undefined)
      
      @scala.inline
      def setAnonymousEndpointsVarargs(value: String*): Self = StObject.set(x, "anonymousEndpoints", js.Array(value :_*))
      
      @scala.inline
      def setCacheLocation(value: localStorage | sessionStorage): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheLocationUndefined: Self = StObject.set(x, "cacheLocation", js.undefined)
      
      @scala.inline
      def setCallback(value: (/* errorDesc */ String | Null, /* token */ String | Null, /* error */ js.Any) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorrelationId(value: String): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCorrelationIdUndefined: Self = StObject.set(x, "correlationId", js.undefined)
      
      @scala.inline
      def setDisplayCall(value: /* url */ String => Unit): Self = StObject.set(x, "displayCall", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisplayCallUndefined: Self = StObject.set(x, "displayCall", js.undefined)
      
      @scala.inline
      def setEndpoints(value: StringDictionary[String]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
      
      @scala.inline
      def setExpireOffsetSeconds(value: Double): Self = StObject.set(x, "expireOffsetSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpireOffsetSecondsUndefined: Self = StObject.set(x, "expireOffsetSeconds", js.undefined)
      
      @scala.inline
      def setExtraQueryParameter(value: String): Self = StObject.set(x, "extraQueryParameter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraQueryParameterUndefined: Self = StObject.set(x, "extraQueryParameter", js.undefined)
      
      @scala.inline
      def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      @scala.inline
      def setLoadFrameTimeout(value: Double): Self = StObject.set(x, "loadFrameTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadFrameTimeoutUndefined: Self = StObject.set(x, "loadFrameTimeout", js.undefined)
      
      @scala.inline
      def setLocalLoginUrl(value: String): Self = StObject.set(x, "localLoginUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalLoginUrlUndefined: Self = StObject.set(x, "localLoginUrl", js.undefined)
      
      @scala.inline
      def setLogOutUri(value: String): Self = StObject.set(x, "logOutUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogOutUriUndefined: Self = StObject.set(x, "logOutUri", js.undefined)
      
      @scala.inline
      def setLoginResource(value: String): Self = StObject.set(x, "loginResource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginResourceUndefined: Self = StObject.set(x, "loginResource", js.undefined)
      
      @scala.inline
      def setNavigateToLoginRequestUrl(value: Boolean): Self = StObject.set(x, "navigateToLoginRequestUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigateToLoginRequestUrlUndefined: Self = StObject.set(x, "navigateToLoginRequestUrl", js.undefined)
      
      @scala.inline
      def setPopUp(value: Boolean): Self = StObject.set(x, "popUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopUpUndefined: Self = StObject.set(x, "popUp", js.undefined)
      
      @scala.inline
      def setPostLogoutRedirectUri(value: String): Self = StObject.set(x, "postLogoutRedirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostLogoutRedirectUriUndefined: Self = StObject.set(x, "postLogoutRedirectUri", js.undefined)
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      @scala.inline
      def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
    }
  }
  
  @js.native
  trait RequestInfo extends StObject {
    
    /**
      * Object comprising of fields such as id_token/error, session_state, state, e.t.c.
      */
    var parameters: js.Any = js.native
    
    /**
      * Request type.
      */
    var requestType: RequestType = js.native
    
    /**
      * Whether state is valid.
      */
    var stateMatch: Boolean = js.native
    
    /**
      * Unique guid used to match the response with the request.
      */
    var stateResponse: String = js.native
    
    /**
      * Whether `requestType` contains `id_token`, `access_token` or error.
      */
    var valid: Boolean = js.native
  }
  object RequestInfo {
    
    @scala.inline
    def apply(
      parameters: js.Any,
      requestType: RequestType,
      stateMatch: Boolean,
      stateResponse: String,
      valid: Boolean
    ): RequestInfo = {
      val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], stateMatch = stateMatch.asInstanceOf[js.Any], stateResponse = stateResponse.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestInfo]
    }
    
    @scala.inline
    implicit class RequestInfoMutableBuilder[Self <: RequestInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParameters(value: js.Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestType(value: RequestType): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateMatch(value: Boolean): Self = StObject.set(x, "stateMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateResponse(value: String): Self = StObject.set(x, "stateResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.adalAngular.adalAngularStrings.LOGIN
    - typings.adalAngular.adalAngularStrings.RENEW_TOKEN
    - typings.adalAngular.adalAngularStrings.UNKNOWN
  */
  trait RequestType extends StObject
  object RequestType {
    
    @scala.inline
    def LOGIN: typings.adalAngular.adalAngularStrings.LOGIN = "LOGIN".asInstanceOf[typings.adalAngular.adalAngularStrings.LOGIN]
    
    @scala.inline
    def RENEW_TOKEN: typings.adalAngular.adalAngularStrings.RENEW_TOKEN = "RENEW_TOKEN".asInstanceOf[typings.adalAngular.adalAngularStrings.RENEW_TOKEN]
    
    @scala.inline
    def UNKNOWN: typings.adalAngular.adalAngularStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.adalAngular.adalAngularStrings.UNKNOWN]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.adalAngular.adalAngularStrings.`id_token token`
    - typings.adalAngular.adalAngularStrings.token
  */
  trait ResponseType extends StObject
  object ResponseType {
    
    @scala.inline
    def `id_token token`: typings.adalAngular.adalAngularStrings.`id_token token` = ("id_token token").asInstanceOf[typings.adalAngular.adalAngularStrings.`id_token token`]
    
    @scala.inline
    def token: typings.adalAngular.adalAngularStrings.token = "token".asInstanceOf[typings.adalAngular.adalAngularStrings.token]
  }
  
  type TokenCallback = js.Function3[/* errorDesc */ String | Null, /* token */ String | Null, /* error */ js.Any, Unit]
  
  type UserCallback = js.Function2[/* errorDesc */ String | Null, /* user */ UserInfo | Null, Unit]
  
  @js.native
  trait UserInfo extends StObject {
    
    /**
      * Properties parsed from `id_token`.
      */
    var profile: js.Any = js.native
    
    /**
      * Username assigned from UPN or email.
      */
    var userName: String = js.native
  }
  object UserInfo {
    
    @scala.inline
    def apply(profile: js.Any, userName: String): UserInfo = {
      val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserInfo]
    }
    
    @scala.inline
    implicit class UserInfoMutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProfile(value: js.Any): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      var Logging: LoggingConfig = js.native
    }
    object Window {
      
      @scala.inline
      def apply(Logging: LoggingConfig): Window = {
        val __obj = js.Dynamic.literal(Logging = Logging.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLogging(value: LoggingConfig): Self = StObject.set(x, "Logging", value.asInstanceOf[js.Any])
      }
    }
  }
}
