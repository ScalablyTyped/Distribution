package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityManager extends Evented {
  /**
    * Dialog box widget used to challenge the user for their credentials when the application attempts to access a secure resource. This property is available after the dialog-create event has fired.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#dialog)
    */
  var dialog: js.Any = js.native
  /**
    * The suggested lifetime of the token in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#tokenValidity)
    *
    * @default 60
    */
  var tokenValidity: Double = js.native
  /**
    * If your application is on the same domain as *.arcgis.com or ArcGIS Enterprise Server, the IdentityManager will redirect the user to its sign-in page. For instance, let's say an application accesses secure resources from ArcGIS.com or one of its subdomains. Once the application attempts to access this resource, the IdentityManager redirects the user to the ArcGIS.com sign-in page. Once a user successfully logs in, they are redirected back to the application. The same holds true if the application accesses secure resources from ArcGIS Enterprise as the IdentityManager will redirect the user to its sign-in page. If you do not wish for the application to automatically redirect, set this property to `false`.
    * > Please note that this is not a common scenario. For most, using the OAuth sign-in behavior should handle most of their authentication needs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#useSignInPage)
    *
    * @default true
    */
  var useSignInPage: Boolean = js.native
  /**
    * Returns the [Credential](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-Credential.html) if the user has already signed in to access the given resource and is allowed to do so when using the given application id. If the user has not signed in or does not have access, then the promise will be rejected and its error callback will be called.
    * > This scenario is generally not common unless you are building a licensed app. Also, please note that this method should only be used if your application is on the same domain as `*.arcgis.com` or ArcGIS Enterprise Server and is only applicable to applications registered as items in the `Esri` organization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#checkAppAccess)
    *
    * @param resUrl The resource URL.
    * @param appId The registered OAuth application id.
    *
    */
  def checkAppAccess(resUrl: String, appId: String): IPromise[_] = js.native
  /**
    * Returns the [Credential](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-Credential.html) if the user has already signed in to access the given resource. If the user has not signed in, then the promise will be rejected and its error callback will be called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#checkSignInStatus)
    *
    * @param resUrl The resource URL.
    *
    */
  def checkSignInStatus(resUrl: String): IPromise[Credential] = js.native
  /**
    * Destroys all credentials. It is good practice to call this method if working with an application that contains sign-out functionality as any tokens generated via OAuth will automatically be revoked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#destroyCredentials)
    *
    *
    */
  def destroyCredentials(): Unit = js.native
  /**
    * Returns the [Credential](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-Credential.html) for the resource identified by the specified url. Optionally, you can provide a userId to find credentials for a specific user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#findCredential)
    *
    * @param url The URL to a server.
    * @param userId The userId for which you want to obtain credentials.
    *
    */
  def findCredential(url: String): Credential = js.native
  def findCredential(url: String, userId: String): Credential = js.native
  /**
    * Returns the [OAuthInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html) configuration for the passed in Portal server URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#findOAuthInfo)
    *
    * @param url The URL to a Portal.
    *
    */
  def findOAuthInfo(url: String): OAuthInfo = js.native
  /**
    * Returns information about the server that is hosting the specified URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#findServerinfo)
    *
    * @param url The URL to the server
    *
    */
  def findServerinfo(url: String): ServerInfo = js.native
  /**
    * Returns an object containing a token and its expiration time. It is necessary to provide the [ServerInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-ServerInfo.html) object that contains a token service URL and a user info object containing username and password. This is a helper method typically called by sub-classes to generate tokens.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#generateToken)
    *
    * @param serverInfo A ServerInfo object that contains a token service URL.
    * @param userInfo A user info object containing a user name and password.
    * @param options See the table below for the structure of this object.
    * @param options.serverUrl The server URL.
    * @param options.token The server token.
    * @param options.ssl Indicates if the server requires SSL.
    *
    */
  def generateToken(serverInfo: ServerInfo, userInfo: js.Any): IPromise[_] = js.native
  def generateToken(serverInfo: ServerInfo, userInfo: js.Any, options: IdentityManagerGenerateTokenOptions): IPromise[_] = js.native
  /**
    * Returns a [Credential](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-Credential.html) object that can be used to access the secured resource identified by the input URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#getCredential)
    *
    * @param url The URL for the secure resource
    * @param options See the table below for the structure of the **options** object.
    * @param options.error Error object returned by the server from a previous attempt to fetch the given URL.
    * @param options.oAuthPopupConfirmation If set to *false*, the user will not be shown a dialog before the OAuth popup window is opened.
    * @param options.token Token used for a previous unsuccessful attempt to fetch the given URL.
    *
    */
  def getCredential(url: String): IPromise[Credential] = js.native
  def getCredential(url: String, options: IdentityManagerGetCredentialOptions): IPromise[Credential] = js.native
  /**
    * Call this method during application initialization with the JSON previously obtained from the [toJSON()](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#toJSON) method used to re-hydrate the state of IdentityManager.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#initialize)
    *
    * @param json The JSON obtained from the [toJSON()](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#toJSON) method.
    *
    */
  def initialize(json: js.Any): Unit = js.native
  /**
    * Indicates if the IdentityManager is busy accepting user input. For example, it returns `true` if the user has invoked [signIn](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#signIn) and is waiting for a response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#isBusy)
    *
    *
    */
  def isBusy(): Boolean = js.native
  /**
    * Registers OAuth 2.0 configurations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#registerOAuthInfos)
    *
    * @param oAuthInfos An array of OAuthInfo objects that defines the OAuth configurations.
    *
    */
  def registerOAuthInfos(oAuthInfos: js.Array[OAuthInfo]): Unit = js.native
  /**
    * Register secure servers and the token endpoints.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#registerServers)
    *
    * @param serverInfos An array of ServerInfos objects that defines the secure service and token endpoint. The IdentityManager makes its best guess to determine the location of the secure server and token endpoint. Therefore, in most cases calling this method is not necessary. However, if the location of your server or token endpoint is not standard, use this method to register the location.
    *
    */
  def registerServers(serverInfos: js.Array[ServerInfo]): Unit = js.native
  /**
    * Registers the given OAuth 2.0 access token or ArcGIS Server token with the IdentityManager. See [registerOAuthInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#registerOAuthInfos) for additional information. The `registerToken` method is an advanced workflow for pre-registering long-term tokens for when you don't want users to sign in. See also [resource-proxy](https://github.com/Esri/resource-proxy) for another workflow to achieve this result.  Once a user logs in, the access token is registered with the IdentityManager. Subsequently, every AJAX request made by the application forwards this token when accessing web maps and other items stored in ArcGIS Online, or resources on your server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#registerToken)
    *
    * @param properties See the table below for the structure of the **properties** object.
    * @param properties.expires Token expiration time specified as number of milliseconds since 1 January 1970 00:00:00 UTC.
    * @param properties.server For ArcGIS Online or Portal, this is https://www.arcgis.com/sharing/rest or similar to https://www.example.com/portal/sharing/rest. For ArcGIS Server this is similar to https://www.example.com/arcgis/rest/services.
    * @param properties.ssl Set this to `true` if the user has an ArcGIS Online organizational account and the organization is configured to allow access to resources only through SSL.
    * @param properties.token The access token.
    * @param properties.userId The id of the user who owns the access token.
    *
    */
  def registerToken(properties: IdentityManagerRegisterTokenProperties): Unit = js.native
  /**
    * Once a user successfully logs in, they are redirected back to the application. Use this method if the application needs to execute custom logic before the page is redirected. The IdentityManager calls the custom handler function with an object containing redirection properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setOAuthRedirectionHandler)
    *
    * @param handlerFunction When called, the callback passed to `setOAuthRedirectionHandler` receives an object containing the redirection properties.
    *
    */
  def setOAuthRedirectionHandler(handlerFunction: HandlerCallback): Unit = js.native
  /**
    * Use this method in the popup callback page to pass the token and other values back to the IdentityManager.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setOAuthResponseHash)
    *
    * @param hash The token information in addition to any other values needed to be passed back to the IdentityManager.
    *
    */
  def setOAuthResponseHash(hash: String): Unit = js.native
  /**
    * When accessing secured resources, the IdentityManager may prompt for username and password and send them to the server using a secure connection. Due to potential browser limitations, it may not be possible to establish a secure connection with the server if the application is being run over HTTP protocol. In such cases, the Identity Manager will abort the request to fetch the secured resource. To resolve this issue, configure your web application server with HTTPS support and run the application over HTTPS. This is the recommended solution for production environments. However, for internal development environments that don't have HTTPS support, you can define a protocol error handler that allows the Identity Manager to continue with the process over HTTP protocol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setProtocolErrorHandler)
    *
    * @param handlerFunction The function to call when the protocol is mismatched.
    * @param handlerFunction.resourceUrl The secure resource URL.
    * @param handlerFunction.serverInfo ServerInfo object describing the server where the secure resource is hosted.
    *
    */
  def setProtocolErrorHandler(handlerFunction: IdentityManagerSetProtocolErrorHandlerHandlerFunction): Unit = js.native
  /**
    * If your application is on the same domain as *.arcgis.com or ArcGIS Enterprise Server, the IdentityManager will redirect the user to its sign-in page. For instance, let's say an application accesses secure resources from ArcGIS.com or one of its subdomains. Once the application attempts to access this resource, the IdentityManager redirects the user to the ArcGIS.com sign-in page. Once a user successfully logs in, they are redirected back to the application. The same holds true if the application accesses secure resources from ArcGIS Enterprise as the IdentityManager will redirect the user to its sign-in page. Use this method if the application needs to execute custom logic before the page is redirected by creating a custom redirection handler. The IdentityManager calls the custom handler function with an object containing the redirection properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    *
    * @param handlerFunction The function passed to setRedirectionHandler receives an object containing redirection properties. These properties are listed in the table below.
    * @param handlerFunction.resourceUrl The URL of the secure resource that triggers the redirection to the ArcGIS.com sign-in page.
    * @param handlerFunction.returnUrlParamName The application URL where the sign-in page redirects after a successful login. To create the return URL, append the application's URL to signInPage as a parameter. The *returnUrlParamName* contains the name of the parameter.
    * @param handlerFunction.serverInfo The ServerInfo object describing the server where the secure resource is hosted.
    * @param handlerFunction.signInPage URL of the sign-in page where users will be redirected.
    *
    */
  def setRedirectionHandler(handlerFunction: IdentityManagerSetRedirectionHandlerHandlerFunction): Unit = js.native
  /**
    * Return properties of this object in JSON format. It can be stored in a cookie or persisted in HTML5 LocalStorage and later used to:
    *   * Initialize the IdentityManager the next time a user opens your application.
    *   * Share the state of the IdentityManager between multiple web pages of your website. This way users will not be asked to sign in repeatedly when they launch your app multiple times or when navigating between multiple web pages in your website.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#toJSON)
    *
    *
    */
  def toJSON(): js.Any = js.native
}

@JSGlobal("__esri.IdentityManager")
@js.native
object IdentityManager extends TopLevel[IdentityManagerConstructor]

