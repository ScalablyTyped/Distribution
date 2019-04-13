package typings
package asanaLib.asanaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asana", "auth")
@js.native
object authNs extends js.Object {
  @js.native
  trait App extends js.Object {
    var asanaBaseUrl: java.lang.String = js.native
    var scope: java.lang.String = js.native
    /**
      * @param {String} code An authorization code obtained via `asanaAuthorizeUrl`.
      * @param {Object} options  Overrides to the app's defaults
      * @option {String} asanaBaseUrl
      * @option {String} redirectUri
      * @return {Promise<Object>} The token, which will include the `access_token`
      *     used for API access, as well as a `refresh_token` which can be stored
      *     to get a new access token without going through the flow again.
      * @param code
      * @param options
      * @return
      */
    def accessTokenFromCode(code: java.lang.String): bluebirdLib.bluebirdMod.^[Credentials] = js.native
    def accessTokenFromCode(code: java.lang.String, options: AsanaAuthorizeUrlOptions): bluebirdLib.bluebirdMod.^[Credentials] = js.native
    /**
      * @param {String} refreshToken A refresh token obtained via Oauth.
      * @param {Object} options Overrides to the app's defaults
      * @option {String} asanaBaseUrl
      * @option {String} redirectUri
      * @return {Promise<Object>} The token, which will include the `access_token`
      *     used for API access.
      * @param refreshToken
      * @param options
      * @return
      */
    def accessTokenFromRefreshToken(refreshToken: java.lang.String, options: AsanaAuthorizeUrlOptions): bluebirdLib.bluebirdMod.^[Credentials] = js.native
    /**
      * @param {Object} options  Overrides to the app's defaults
      * @option {String} asanaBaseUrl
      * @option {String} redirectUri
      * @returns {String} The URL used to authorize a user for the app.
      * @param options
      * @return
      */
    def asanaAuthorizeUrl(): java.lang.String = js.native
    def asanaAuthorizeUrl(options: AsanaAuthorizeUrlOptions): java.lang.String = js.native
    /**
      * @param {Object} options  Overrides to the app's defaults
      * @option {String} asanaBaseUrl
      * @option {String} redirectUri
      * @returns {String} The URL used to acquire an access token.
      * @param options
      * @return
      */
    def asanaTokenUrl(): java.lang.String = js.native
    def asanaTokenUrl(options: AsanaAuthorizeUrlOptions): java.lang.String = js.native
  }
  
  @js.native
  class AppCls protected () extends App {
    /**
      * An abstraction around an App used with Asana.
      *
      * @options {Object} Options to construct the app
      * @option {String} clientId       The ID of the app
      * @option {String} [clientSecret] The secret key, if available here
      * @option {String} [redirectUri]  The default redirect URI
      * @option {String} [scope]        Scope to use, supports `default` and `scim`
      * @option {String} [asanaBaseUrl] Base URL to use for Asana, for debugging
      * @constructor
      */
    def this(options: AppOptions) = this()
  }
  
  trait AppOptions extends AsanaAuthorizeUrlOptions {
    var clientId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
    var clientSecret: js.UndefOr[java.lang.String] = js.undefined
    var scope: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  trait AppStatic
    extends /**
    * An abstraction around an App used with Asana.
    *
    * @options {Object} Options to construct the app
    * @option {String} clientId       The ID of the app
    * @option {String} [clientSecret] The secret key, if available here
    * @option {String} [redirectUri]  The default redirect URI
    * @option {String} [scope]        Scope to use, supports `default` and `scim`
    * @option {String} [asanaBaseUrl] Base URL to use for Asana, for debugging
    * @constructor
    */
  org.scalablytyped.runtime.Instantiable1[/* options */ AppOptions, App]
  
  trait AsanaAuthorizeUrlOptions extends js.Object {
    var asanaBaseUrl: js.UndefOr[java.lang.String] = js.undefined
    var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
    * A layer to abstract the differences between using different types of
    * authentication (Oauth vs. Basic). The Authenticator is responsible for
    * establishing credentials and applying them to outgoing requests.
    * @constructor
    */
  trait Authenticator extends js.Object {
    /**
      * Establishes credentials.
      *
      * @return {Promise} Resolves when initial credentials have been
      *     completed and `authenticateRequest` calls can expect to succeed.
      * @return
      */
    def establishCredentials(): bluebirdLib.bluebirdMod.^[scala.Unit]
    /**
      * Attempts to refresh credentials, if possible, given the current credentials.
      *
      * @return {Promise} Resolves to `true` if credentials have been successfully
      *     established and `authenticateRequests` can expect to succeed, else
      *     resolves to `false`.
      * @return
      */
    def refreshCredentials(): bluebirdLib.bluebirdMod.^[scala.Boolean]
  }
  
  trait BaseBrowserFlow extends Flow {
    /**
      * @return {String} The URL to redirect to that will receive the
      * @return
      */
    def asanaBaseUrl(): java.lang.String
    /**
      * @return {Promise<Object>} Credentials returned from Oauth.
      * @param state
      */
    def finishAuthorization(state: java.lang.String): scala.Unit
    /**
      * @returns {String} Generate a new unique state parameter for a request.
      * @return
      */
    def getStateParam(): java.lang.String
    /**
      * @return {String} The URL to redirect to that will receive the
      * @return
      */
    def receiverUrl(): java.lang.String
    /**
      * @param {String} authUrl The URL the user should be navigated to in order
      *     to authorize the app.
      * @param {String} state   The unique state generated for this auth request.
      * @return {Promise} Resolved when authorization has successfully started,
      *     i.e. the user has been navigated to a page requesting authorization.
      * @param authUrl
      * @param state
      * @return
      */
    def startAuthorization(authUrl: java.lang.String, state: java.lang.String): js.Any
  }
  
  @js.native
  class BaseBrowserFlowCls protected () extends BaseBrowserFlow {
    /**
      * A base class for any flow that runs in the browser. All subclasses use the
      * "implicit grant" flow to authenticate via the browser.
      * @param {Object} options
      * @option {App} app The app this flow is for
      * @option {String} [redirectUri] The URL that Asana should redirect to once
      *     user authorization is complete. Defaults to the URL configured in
      *     the app, and if none then the current page URL.
      * @constructor
      */
    def this(options: js.Any) = this()
    /**
      * @return {String} The URL to redirect to that will receive the
      * @return
      */
    /* CompleteClass */
    override def asanaBaseUrl(): java.lang.String = js.native
    /**
      * @returns {String} The URL used to authorize the user for the app.
      * @return
      */
    /* CompleteClass */
    override def authorizeUrl(): java.lang.String = js.native
    /**
      * @return {Promise<Object>} Credentials returned from Oauth.
      * @param state
      */
    /* CompleteClass */
    override def finishAuthorization(state: java.lang.String): scala.Unit = js.native
    /**
      * @returns {String} Generate a new unique state parameter for a request.
      * @return
      */
    /* CompleteClass */
    override def getStateParam(): java.lang.String = js.native
    /**
      * @return {String} The URL to redirect to that will receive the
      * @return
      */
    /* CompleteClass */
    override def receiverUrl(): java.lang.String = js.native
    /**
      * Run the appropriate parts of the Oauth flow, attempting to establish user
      * authorization.
      * @returns {Promise<Object>} A promise that resolves to the Oauth credentials.
      */
    /* CompleteClass */
    override def run(): scala.Unit = js.native
    /**
      * @param {String} authUrl The URL the user should be navigated to in order
      *     to authorize the app.
      * @param {String} state   The unique state generated for this auth request.
      * @return {Promise} Resolved when authorization has successfully started,
      *     i.e. the user has been navigated to a page requesting authorization.
      * @param authUrl
      * @param state
      * @return
      */
    /* CompleteClass */
    override def startAuthorization(authUrl: java.lang.String, state: java.lang.String): js.Any = js.native
  }
  
  @js.native
  trait BaseBrowserFlowStatic extends FlowType
  
  trait BasicAuthenticator extends Authenticator {
    /**
      * @param {Object} request The request to modify, for the `request` library.
      * @return {Object} The `request` parameter, modified to include authentication
      *     information using the stored credentials.
      * @param request
      * @return
      */
    def authenticateRequest(request: BasicAuthenticatorRequest): BasicAuthenticatorRequest
  }
  
  @js.native
  class BasicAuthenticatorCls protected () extends BasicAuthenticator {
    /**
      * @param apiKey
      */
    def this(apiKey: java.lang.String) = this()
    /**
      * @param {Object} request The request to modify, for the `request` library.
      * @return {Object} The `request` parameter, modified to include authentication
      *     information using the stored credentials.
      * @param request
      * @return
      */
    /* CompleteClass */
    override def authenticateRequest(request: BasicAuthenticatorRequest): BasicAuthenticatorRequest = js.native
    /**
      * Establishes credentials.
      *
      * @return {Promise} Resolves when initial credentials have been
      *     completed and `authenticateRequest` calls can expect to succeed.
      * @return
      */
    /* CompleteClass */
    override def establishCredentials(): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
    /**
      * Attempts to refresh credentials, if possible, given the current credentials.
      *
      * @return {Promise} Resolves to `true` if credentials have been successfully
      *     established and `authenticateRequests` can expect to succeed, else
      *     resolves to `false`.
      * @return
      */
    /* CompleteClass */
    override def refreshCredentials(): bluebirdLib.bluebirdMod.^[scala.Boolean] = js.native
  }
  
  trait BasicAuthenticatorRequest extends js.Object {
    var auth: asanaLib.Anon_Password
  }
  
  @js.native
  trait BasicAuthenticatorStatic
    extends /**
    * @param apiKey
    */
  org.scalablytyped.runtime.Instantiable1[/* apiKey */ java.lang.String, BasicAuthenticator]
  
  trait ChromeExtensionFlow extends BaseBrowserFlow {
    /**
      * Runs the receiver code to send the Oauth result to the requesting tab.
      */
    def runReceiver(): scala.Unit
  }
  
  @js.native
  class ChromeExtensionFlowCls protected () extends ChromeExtensionFlow {
    /**
      * An Oauth flow that runs in a Chrome browser extension and requests user
      * authorization by opening a temporary tab to prompt the user.
      * @param {Object} options See `BaseBrowserFlow` for options, plus the below:
      * @options {String} [receiverPath] Full path and filename from the base
      *     directory of the extension to the receiver page. This is an HTML file
      *     that has been made web-accessible, and that calls the receiver method
      *     `Asana.auth.ChromeExtensionFlow.runReceiver();`.
      * @constructor
      */
    def this(options: js.Any) = this()
    /**
      * @return {String} The URL to redirect to that will receive the
      * @return
      */
    /* CompleteClass */
    override def asanaBaseUrl(): java.lang.String = js.native
    /**
      * @returns {String} The URL used to authorize the user for the app.
      * @return
      */
    /* CompleteClass */
    override def authorizeUrl(): java.lang.String = js.native
    /**
      * @return {Promise<Object>} Credentials returned from Oauth.
      * @param state
      */
    /* CompleteClass */
    override def finishAuthorization(state: java.lang.String): scala.Unit = js.native
    /**
      * @returns {String} Generate a new unique state parameter for a request.
      * @return
      */
    /* CompleteClass */
    override def getStateParam(): java.lang.String = js.native
    /**
      * @return {String} The URL to redirect to that will receive the
      * @return
      */
    /* CompleteClass */
    override def receiverUrl(): java.lang.String = js.native
    /**
      * Run the appropriate parts of the Oauth flow, attempting to establish user
      * authorization.
      * @returns {Promise<Object>} A promise that resolves to the Oauth credentials.
      */
    /* CompleteClass */
    override def run(): scala.Unit = js.native
    /**
      * Runs the receiver code to send the Oauth result to the requesting tab.
      */
    /* CompleteClass */
    override def runReceiver(): scala.Unit = js.native
    /**
      * @param {String} authUrl The URL the user should be navigated to in order
      *     to authorize the app.
      * @param {String} state   The unique state generated for this auth request.
      * @return {Promise} Resolved when authorization has successfully started,
      *     i.e. the user has been navigated to a page requesting authorization.
      * @param authUrl
      * @param state
      * @return
      */
    /* CompleteClass */
    override def startAuthorization(authUrl: java.lang.String, state: java.lang.String): js.Any = js.native
  }
  
  @js.native
  trait ChromeExtensionFlowStatic extends FlowType
  
  trait Credentials extends js.Object {
    var access_token: js.UndefOr[java.lang.String] = js.undefined
    var refresh_token: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Flow extends js.Object {
    /**
      * @returns {String} The URL used to authorize the user for the app.
      * @return
      */
    def authorizeUrl(): java.lang.String
    /**
      * Run the appropriate parts of the Oauth flow, attempting to establish user
      * authorization.
      * @returns {Promise<Object>} A promise that resolves to the Oauth credentials.
      */
    def run(): scala.Unit
  }
  
  @js.native
  trait FlowType
    extends org.scalablytyped.runtime.Instantiable1[/* options */ js.Any, Flow]
  
  trait NativeFlow extends Flow {
    /**
      * @param {String} code An authorization code obtained via `asanaAuthorizeUrl`.
      * @return {Promise<Object>} The token, which will include the `access_token`
      *     used for API access, as well as a `refresh_token` which can be stored
      *     to get a new access token without going through the flow again.
      * @param code
      */
    def accessToken(code: java.lang.String): scala.Unit
    /**
      * @return {Promise} The access token, which will include a refresh token
      *     that can be stored in the future to create a client without going
      *     through the Oauth flow.
      * @param url
      * @return
      */
    def promptForCode(url: java.lang.String): js.Any
  }
  
  @js.native
  class NativeFlowCls protected () extends NativeFlow {
    /**
      * An Oauth flow that can be run from the console or an app that does
      * not have the ability to open and manage a browser on its own.
      * @param {Object} options
      * @option {App} app App to authenticate for
      * @option {String function(String)} [instructions] Function returning the
      *     instructions to output to the user. Passed the authorize url.
      * @option {String function()} [prompt] String to output immediately before
      *     waiting for a line from stdin.
      * @constructor
      */
    def this(options: js.Any) = this()
    /**
      * @param {String} code An authorization code obtained via `asanaAuthorizeUrl`.
      * @return {Promise<Object>} The token, which will include the `access_token`
      *     used for API access, as well as a `refresh_token` which can be stored
      *     to get a new access token without going through the flow again.
      * @param code
      */
    /* CompleteClass */
    override def accessToken(code: java.lang.String): scala.Unit = js.native
    /**
      * @returns {String} The URL used to authorize the user for the app.
      * @return
      */
    /* CompleteClass */
    override def authorizeUrl(): java.lang.String = js.native
    /**
      * @return {Promise} The access token, which will include a refresh token
      *     that can be stored in the future to create a client without going
      *     through the Oauth flow.
      * @param url
      * @return
      */
    /* CompleteClass */
    override def promptForCode(url: java.lang.String): js.Any = js.native
    /**
      * Run the appropriate parts of the Oauth flow, attempting to establish user
      * authorization.
      * @returns {Promise<Object>} A promise that resolves to the Oauth credentials.
      */
    /* CompleteClass */
    override def run(): scala.Unit = js.native
  }
  
  @js.native
  trait NativeFlowStatic extends FlowType
  
  trait OauthAuthenticator extends Authenticator {
    /**
      * @param {Object} request The request to modify, for the `request` library.
      * @return {Object} The `request` parameter, modified to include authentication
      *     information using the stored credentials.
      * @param request
      * @return
      */
    def authenticateRequest(request: OauthAuthenticatorRequest): OauthAuthenticatorRequest
  }
  
  @js.native
  class OauthAuthenticatorCls protected () extends OauthAuthenticator {
    /**
      * Creates an authenticator that uses Oauth for authentication.
      *
      * @param {Object} options Configure the authenticator; must specify one
      *     of `flow` or `credentials`.
      * @option {App}           app           The app being authenticated for.
      * @option {OauthFlow}     [flow]        The flow to use to get credentials
      *     when needed.
      * @option {String|Object} [credentials] Initial credentials to use. This can
      *     be either the object returned from an access token request (which
      *     contains the token and some other metadata) or just the `access_token`
      *     field.
      * @constructor
      */
    def this(options: OauthAuthenticatorOptions) = this()
    /**
      * @param {Object} request The request to modify, for the `request` library.
      * @return {Object} The `request` parameter, modified to include authentication
      *     information using the stored credentials.
      * @param request
      * @return
      */
    /* CompleteClass */
    override def authenticateRequest(request: OauthAuthenticatorRequest): OauthAuthenticatorRequest = js.native
    /**
      * Establishes credentials.
      *
      * @return {Promise} Resolves when initial credentials have been
      *     completed and `authenticateRequest` calls can expect to succeed.
      * @return
      */
    /* CompleteClass */
    override def establishCredentials(): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
    /**
      * Attempts to refresh credentials, if possible, given the current credentials.
      *
      * @return {Promise} Resolves to `true` if credentials have been successfully
      *     established and `authenticateRequests` can expect to succeed, else
      *     resolves to `false`.
      * @return
      */
    /* CompleteClass */
    override def refreshCredentials(): bluebirdLib.bluebirdMod.^[scala.Boolean] = js.native
  }
  
  trait OauthAuthenticatorOptions extends js.Object {
    var credentials: js.UndefOr[Credentials | java.lang.String] = js.undefined
    var flowType: js.UndefOr[FlowType] = js.undefined
  }
  
  trait OauthAuthenticatorRequest extends js.Object {
    /**
      * When browserify-d, the `auth` component of the `request` library
      * doesn't work so well, so we just manually set the bearer token instead.
      */
    var headers: asanaLib.Anon_Authorization
  }
  
  @js.native
  trait OauthAuthenticatorStatic
    extends /**
    * Creates an authenticator that uses Oauth for authentication.
    *
    * @param {Object} options Configure the authenticator; must specify one
    *     of `flow` or `credentials`.
    * @option {App}           app           The app being authenticated for.
    * @option {OauthFlow}     [flow]        The flow to use to get credentials
    *     when needed.
    * @option {String|Object} [credentials] Initial credentials to use. This can
    *     be either the object returned from an access token request (which
    *     contains the token and some other metadata) or just the `access_token`
    *     field.
    * @constructor
    */
  org.scalablytyped.runtime.Instantiable1[/* options */ OauthAuthenticatorOptions, OauthAuthenticator]
  
  @js.native
  class OauthErrorCls protected () extends OauthError {
    /**
      * @param options {Object} A data blob parsed from a query string or JSON
      * response from the Asana API
      * @option {String} error The string code identifying the error.
      * @option {String} [error_uri] A link to help and information about the error.
      * @option {String} [error_description] A description of the error.
      * @constructor
      */
    def this(options: OauthErrorOptions) = this()
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
  }
  
  trait OauthErrorOptions extends js.Object {
    var error: js.UndefOr[java.lang.String] = js.undefined
    var error_description: js.UndefOr[java.lang.String] = js.undefined
    var error_uri: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  trait OauthErrorStatic
    extends /**
    * @param options {Object} A data blob parsed from a query string or JSON
    * response from the Asana API
    * @option {String} error The string code identifying the error.
    * @option {String} [error_uri] A link to help and information about the error.
    * @option {String} [error_description] A description of the error.
    * @constructor
    */
  org.scalablytyped.runtime.Instantiable1[/* options */ OauthErrorOptions, OauthError]
  
  trait PopupFlow extends BaseBrowserFlow {
    /**
      * @param popupWidth
      * @param popupHeight
      */
    def _popupParams(popupWidth: scala.Double, popupHeight: scala.Double): scala.Unit
    def runReceiver(): scala.Unit
  }
  
  @js.native
  class PopupFlowCls protected () extends PopupFlow {
    /**
      * An Oauth flow that runs in the browser and requests user authorization by
      * popping up a window and prompting the user.
      * @param {Object} options See `BaseBrowserFlow` for options.
      * @constructor
      */
    def this(options: js.Any) = this()
    /**
      * @param popupWidth
      * @param popupHeight
      */
    /* CompleteClass */
    override def _popupParams(popupWidth: scala.Double, popupHeight: scala.Double): scala.Unit = js.native
    /**
      * @return {String} The URL to redirect to that will receive the
      * @return
      */
    /* CompleteClass */
    override def asanaBaseUrl(): java.lang.String = js.native
    /**
      * @returns {String} The URL used to authorize the user for the app.
      * @return
      */
    /* CompleteClass */
    override def authorizeUrl(): java.lang.String = js.native
    /**
      * @return {Promise<Object>} Credentials returned from Oauth.
      * @param state
      */
    /* CompleteClass */
    override def finishAuthorization(state: java.lang.String): scala.Unit = js.native
    /**
      * @returns {String} Generate a new unique state parameter for a request.
      * @return
      */
    /* CompleteClass */
    override def getStateParam(): java.lang.String = js.native
    /**
      * @return {String} The URL to redirect to that will receive the
      * @return
      */
    /* CompleteClass */
    override def receiverUrl(): java.lang.String = js.native
    /**
      * Run the appropriate parts of the Oauth flow, attempting to establish user
      * authorization.
      * @returns {Promise<Object>} A promise that resolves to the Oauth credentials.
      */
    /* CompleteClass */
    override def run(): scala.Unit = js.native
    /* CompleteClass */
    override def runReceiver(): scala.Unit = js.native
    /**
      * @param {String} authUrl The URL the user should be navigated to in order
      *     to authorize the app.
      * @param {String} state   The unique state generated for this auth request.
      * @return {Promise} Resolved when authorization has successfully started,
      *     i.e. the user has been navigated to a page requesting authorization.
      * @param authUrl
      * @param state
      * @return
      */
    /* CompleteClass */
    override def startAuthorization(authUrl: java.lang.String, state: java.lang.String): js.Any = js.native
  }
  
  @js.native
  trait PopupFlowStatic extends FlowType
  
  @js.native
  class RedirectFlowCls protected () extends RedirectFlow {
    /**
      * An Oauth flow that runs in the browser and requests user authorization by
      * redirecting to an authorization page on Asana, and redirecting back with
      * the credentials.
      * @param {Object} options See `BaseBrowserFlow` for options.
      * @constructor
      */
    def this(options: js.Any) = this()
    /**
      * @return {String} The URL to redirect to that will receive the
      * @return
      */
    /* CompleteClass */
    override def asanaBaseUrl(): java.lang.String = js.native
    /**
      * @returns {String} The URL used to authorize the user for the app.
      * @return
      */
    /* CompleteClass */
    override def authorizeUrl(): java.lang.String = js.native
    /**
      * @return {Promise<Object>} Credentials returned from Oauth.
      * @param state
      */
    /* CompleteClass */
    override def finishAuthorization(state: java.lang.String): scala.Unit = js.native
    /**
      * @returns {String} Generate a new unique state parameter for a request.
      * @return
      */
    /* CompleteClass */
    override def getStateParam(): java.lang.String = js.native
    /**
      * @return {String} The URL to redirect to that will receive the
      * @return
      */
    /* CompleteClass */
    override def receiverUrl(): java.lang.String = js.native
    /**
      * Run the appropriate parts of the Oauth flow, attempting to establish user
      * authorization.
      * @returns {Promise<Object>} A promise that resolves to the Oauth credentials.
      */
    /* CompleteClass */
    override def run(): scala.Unit = js.native
    /**
      * @param {String} authUrl The URL the user should be navigated to in order
      *     to authorize the app.
      * @param {String} state   The unique state generated for this auth request.
      * @return {Promise} Resolved when authorization has successfully started,
      *     i.e. the user has been navigated to a page requesting authorization.
      * @param authUrl
      * @param state
      * @return
      */
    /* CompleteClass */
    override def startAuthorization(authUrl: java.lang.String, state: java.lang.String): js.Any = js.native
  }
  
  @js.native
  trait RedirectFlowStatic extends FlowType
  
  var App: AppStatic = js.native
  var BaseBrowserFlow: BaseBrowserFlowStatic = js.native
  var BasicAuthenticator: BasicAuthenticatorStatic = js.native
  var ChromeExtensionFlow: ChromeExtensionFlowStatic = js.native
  var NativeFlow: NativeFlowStatic = js.native
  var OauthAuthenticator: OauthAuthenticatorStatic = js.native
  var OauthError: OauthErrorStatic = js.native
  var PopupFlow: PopupFlowStatic = js.native
  var RedirectFlow: RedirectFlowStatic = js.native
  /**
    * Auto-detects the type of Oauth flow to use that's appropriate to the
    * environment.
    *
    * @returns {Function|null} The type of Oauth flow to use, or null if no
    *     appropriate type could be determined.
    * @param env
    * @return
    */
  def autoDetect(env: js.Any): js.Function = js.native
  type OauthError = stdLib.Error
  type RedirectFlow = BaseBrowserFlow
}

