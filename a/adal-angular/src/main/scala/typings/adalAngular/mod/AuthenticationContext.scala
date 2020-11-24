package typings.adalAngular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// This class is defined globally in not in a module context
@js.native
trait AuthenticationContext extends js.Object {
  
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
