package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0-js", "WebAuth")
@js.native
class WebAuth protected () extends js.Object {
  def this(options: AuthOptions) = this()
  var client: Authentication = js.native
  var crossOriginAuthentication: CrossOriginAuthentication = js.native
  var popup: Popup = js.native
  var redirect: Redirect = js.native
  /**
       * Redirects to the hosted login page (`/authorize`) in order to initialize a new authN/authZ transaction
       *
       * @param options: https://auth0.com/docs/api/authentication#!#get--authorize_db
       */
  def authorize(): scala.Unit = js.native
  /**
       * Redirects to the hosted login page (`/authorize`) in order to initialize a new authN/authZ transaction
       *
       * @param options: https://auth0.com/docs/api/authentication#!#get--authorize_db
       */
  def authorize(options: AuthorizeOptions): scala.Unit = js.native
  /**
       * Initialices a change password transaction
       *
       * @param options: https://auth0.com/docs/api/authentication#!#post--dbconnections-change_password
       */
  def changePassword(options: ChangePasswordOptions, callback: Auth0Callback[_, Auth0Error]): scala.Unit = js.native
  /**
       * Renews an existing session on Auth0's servers using `response_mode=web_message` (i.e. Auth0's hosted login page)
       *
       * @param options options used in {@link authorize} call
       * @param callback: any(err, token_payload)
       */
  def checkSession(options: CheckSessionOptions, callback: Auth0Callback[_, Auth0Error]): scala.Unit = js.native
  /**
       * Runs the callback code for the cross origin authentication call. This method is meant to be called by the cross origin authentication callback url.
       *
       */
  def crossOriginAuthenticationCallback(): scala.Unit = js.native
  /**
       * Logs in the user with username and password using the cross origin authentication (/co/authenticate) flow.
       * You can use either `username` or `email` to identify the user, but `username` will take precedence over `email`.
       *
       * This only works when 3rd party cookies are enabled in the browser.
       * After the /co/authenticate call, you'll have to use the {@link parseHash} function at the `redirectUri` specified in the constructor.
       *
       * @param options options used in the {@link authorize} call after the login_ticket is acquired
       * @param cb Callback function called only when an authentication error, like invalid username or password, occurs.
       * For other types of errors, there will be a redirect to the `redirectUri`.
       */
  def login(options: CrossOriginLoginOptions, callback: Auth0Callback[_, Auth0Error]): scala.Unit = js.native
  /**
       * Redirects to the auth0 logout endpoint
       *
       * If you want to navigate the user to a specific URL after the logout, set that URL at the returnTo parameter. The URL should be included in any the appropriate Allowed Logout URLs list:
       *
       * - If the client_id parameter is included, the returnTo URL must be listed in the Allowed Logout URLs set at the client level (see Setting Allowed Logout URLs at the App Level).
       * - If the client_id parameter is NOT included, the returnTo URL must be listed in the Allowed Logout URLs set at the account level (see Setting Allowed Logout URLs at the Account Level).
       *
       * @see   {@link https://auth0.com/docs/api/authentication#logout}
       */
  def logout(options: LogoutOptions): scala.Unit = js.native
  /**
       * Parse the url hash and extract the returned tokens depending on the transaction.
       *
       * Only validates id_tokens signed by Auth0 using the RS256 algorithm using the public key exposed
       * by the `/.well-known/jwks.json` endpoint. Id tokens signed with other algorithms will not be
       * accepted.
       *
       * @param callback: any(err, token_payload)
       */
  def parseHash(callback: Auth0Callback[Auth0DecodedHash | scala.Null, Auth0ParseHashError]): scala.Unit = js.native
  /**
       * Parse the url hash and extract the returned tokens depending on the transaction.
       *
       * Only validates id_tokens signed by Auth0 using the RS256 algorithm using the public key exposed
       * by the `/.well-known/jwks.json` endpoint. Id tokens signed with other algorithms will not be
       * accepted.
       *
       * @param callback: any(err, token_payload)
       */
  def parseHash(
    options: ParseHashOptions,
    callback: Auth0Callback[Auth0DecodedHash | scala.Null, Auth0ParseHashError]
  ): scala.Unit = js.native
  /**
       * Initialices a passwordless authentication transaction
       *
       * @param options: https://auth0.com/docs/api/authentication#passwordless
       */
  def passwordlessStart(options: PasswordlessStartOptions, callback: Auth0Callback[_, Auth0Error]): scala.Unit = js.native
  /**
       * Verifies the passwordless TOTP and redirects to finish the passwordless transaction
       *
       * @param options:
       */
  def passwordlessVerify(options: PasswordlessVerifyOptions, callback: Auth0Callback[_, Auth0Error]): scala.Unit = js.native
  /**
       * Executes a silent authentication transaction under the hood in order to fetch a new tokens for the current session.
       * This method requires that all Auth is performed with {@link authorize}
       * Watch out! If you're not using the hosted login page to do social logins, you have to use your own [social connection keys](https://manage.auth0.com/#/connections/social).
       * If you use Auth0's dev keys, you'll always get `login_required` as an error when calling this method.
       *
       * @param options: any valid oauth2 parameter to be sent to the `/authorize` endpoint
       */
  def renewAuth(options: RenewAuthOptions, callback: Auth0Callback[_, Auth0Error]): scala.Unit = js.native
  /**
       * Signs up a new user
       *
       * @param options: https://auth0.com/docs/api/authentication#!#post--dbconnections-signup
       */
  def signup(options: DbSignUpOptions, callback: Auth0Callback[_, Auth0Error]): scala.Unit = js.native
  /**
       * Signs up a new user, automatically logs the user in after the signup and returns the user token.
       * The login will be done using /oauth/token with password-realm grant type.
       *
       * @param options: https://auth0.com/docs/api/authentication#!#post--dbconnections-signup
       */
  def signupAndAuthorize(options: DbSignUpOptions, callback: Auth0Callback[_, Auth0Error]): scala.Unit = js.native
  /**
       * Decodes the id_token and verifies  the nonce.
       *
       * @param callback: function(err, {payload, transaction})
       */
  def validateToken(token: java.lang.String, nonce: java.lang.String, callback: Auth0Callback[_, Auth0Error]): scala.Unit = js.native
}

