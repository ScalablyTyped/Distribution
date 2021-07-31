package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`credential-create`
import typings.arcgisJsApi.arcgisJsApiStrings.`dialog-create`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityManager
  extends StObject
     with Evented {
  
  /**
    * Returns a [credential](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-Credential.html) if the user has already signed in to access the given resource and is allowed to do so when using the given application id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#checkAppAccess)
    */
  def checkAppAccess(resUrl: String, appId: String): js.Promise[js.Any] = js.native
  
  /**
    * Returns the [Credential](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-Credential.html) if the user has already signed in to access the given resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#checkSignInStatus)
    */
  def checkSignInStatus(resUrl: String): js.Promise[Credential] = js.native
  
  /**
    * Destroys all credentials.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#destroyCredentials)
    */
  def destroyCredentials(): Unit = js.native
  
  /**
    * Dialog box widget used to challenge the user for their credentials when the application attempts to access a secure resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#dialog)
    */
  var dialog: Widget_ = js.native
  
  /**
    * Returns the [Credential](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-Credential.html) for the resource identified by the specified url.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#findCredential)
    */
  def findCredential(url: String): Credential = js.native
  def findCredential(url: String, userId: String): Credential = js.native
  
  /**
    * Returns the [OAuthInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html) configuration for the passed in Portal server URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#findOAuthInfo)
    */
  def findOAuthInfo(url: String): OAuthInfo = js.native
  
  /**
    * Returns information about the server that is hosting the specified URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#findServerInfo)
    */
  def findServerInfo(url: String): ServerInfo = js.native
  
  /**
    * Returns an object containing a token and its expiration time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#generateToken)
    */
  def generateToken(serverInfo: ServerInfo, userInfo: js.Any): js.Promise[js.Any] = js.native
  def generateToken(serverInfo: ServerInfo, userInfo: js.Any, options: IdentityManagerGenerateTokenOptions): js.Promise[js.Any] = js.native
  
  /**
    * Returns a [Credential](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-Credential.html) object that can be used to access the secured resource identified by the input URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#getCredential)
    */
  def getCredential(url: String): js.Promise[Credential] = js.native
  def getCredential(url: String, options: IdentityManagerGetCredentialOptions): js.Promise[Credential] = js.native
  
  /**
    * Call this method during application initialization with the JSON previously obtained from the [toJSON()](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#toJSON) method used to re-hydrate the state of IdentityManager.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#initialize)
    */
  def initialize(json: js.Any): Unit = js.native
  
  /**
    * Indicates if the IdentityManager is busy accepting user input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#isBusy)
    */
  def isBusy(): Boolean = js.native
  
  @JSName("on")
  def on_credentialcreate(name: `credential-create`, eventHandler: IdentityManagerCredentialCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_dialogcreate(name: `dialog-create`, eventHandler: IdentityManagerDialogCreateEventHandler): IHandle = js.native
  
  /**
    * Registers OAuth 2.0 configurations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#registerOAuthInfos)
    */
  def registerOAuthInfos(oAuthInfos: js.Array[OAuthInfo]): Unit = js.native
  
  /**
    * Register secure servers and the token endpoints.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#registerServers)
    */
  def registerServers(serverInfos: js.Array[ServerInfo]): Unit = js.native
  
  /**
    * Registers the given OAuth 2.0 access token or ArcGIS Server token with the IdentityManager.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#registerToken)
    */
  def registerToken(properties: IdentityManagerRegisterTokenProperties): Unit = js.native
  
  /**
    * Once a user successfully logs in, they are redirected back to the application.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setOAuthRedirectionHandler)
    */
  def setOAuthRedirectionHandler(handlerFunction: HandlerCallback): Unit = js.native
  
  /**
    * Use this method in the popup callback page to pass the token and other values back to the IdentityManager.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setOAuthResponseHash)
    */
  def setOAuthResponseHash(hash: String): Unit = js.native
  
  /**
    * When accessing secured resources, the IdentityManager may prompt for username and password and send them to the server using a secure connection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setProtocolErrorHandler)
    */
  def setProtocolErrorHandler(handlerFunction: IdentityManagerSetProtocolErrorHandlerHandlerFunction): Unit = js.native
  
  /**
    * If your application is on the same domain as *.arcgis.com or ArcGIS Enterprise Server, the IdentityManager will redirect the user to its sign-in page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#setRedirectionHandler)
    */
  def setRedirectionHandler(handlerFunction: IdentityManagerSetRedirectionHandlerHandlerFunction): Unit = js.native
  
  /**
    * Return properties of this object in JSON format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#toJSON)
    */
  def toJSON(): js.Any = js.native
  
  /**
    * The suggested lifetime of the token in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#tokenValidity)
    */
  var tokenValidity: Double = js.native
  
  /**
    * If your application is on the same domain as *.arcgis.com or ArcGIS Enterprise Server, the IdentityManager will redirect the user to its sign-in page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#useSignInPage)
    */
  var useSignInPage: Boolean = js.native
}
