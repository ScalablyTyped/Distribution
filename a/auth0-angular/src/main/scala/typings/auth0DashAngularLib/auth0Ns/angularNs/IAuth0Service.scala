package typings
package auth0DashAngularLib.auth0Ns.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuth0Service extends js.Object {
  // Properties
  var accessToken: java.lang.String = js.native
  var config: js.Any = js.native
  var idToken: java.lang.String = js.native
  var isAuthenticated: scala.Boolean = js.native
  var profile: js.Any = js.native
  /**
    * Reauthenticates the user by using a stored profile and token without going through the login flow.
    * @param profile Profile of the user
    * @param idToken Id token
    * @param accessToken Access token
    * @param state State
    * @param refreshToken Flag to indicate refreshing the token
    */
  def authenticate(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def authenticate(profile: js.Any): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def authenticate(profile: js.Any, idToken: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def authenticate(profile: js.Any, idToken: java.lang.String, accessToken: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def authenticate(profile: js.Any, idToken: java.lang.String, accessToken: java.lang.String, state: js.Any): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def authenticate(
    profile: js.Any,
    idToken: java.lang.String,
    accessToken: java.lang.String,
    state: js.Any,
    refreshToken: scala.Boolean
  ): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
    * Gets the user's profile
    * @param idToken Id token
    */
  def getProfile(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def getProfile(idToken: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
    * Performs a token delegation request exchanging th ecurrent token for another one.
    * @param options Token options
    */
  def getToken(): angularLib.angularMod.angularNs.IPromise[_] = js.native
  def getToken(options: ITokenOptions): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
    * Hooks to internal Angular events so that a user will be redirected to the login page if trying to visit a restricted resource
    */
  def hookEvents(): scala.Unit = js.native
  /**
    * Refreshes the Id token
    * @param refreshToken Refresh token to use when renewing
    */
  def refreshIdToken(refreshToken: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
    * Renews the Id Token with the same scopes as the original token
    * @param id_token Id Token
    */
  def renewIdToken(id_token: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
    * Performs the "forgot your password" flow.
    * @param options Options to bypass displaying the Lock UI
    * @param successCallback Callback on successful reset
    * @param errorCallback Callback on failed reset
    */
  def reset(): scala.Unit = js.native
  def reset(options: IAuth0Options): scala.Unit = js.native
  def reset(options: IAuth0Options, successCallback: ISuccessCallback): scala.Unit = js.native
  def reset(options: IAuth0Options, successCallback: ISuccessCallback, errorCallback: IErrorCallback): scala.Unit = js.native
  /**
    * Logs in a user, returning tokens and profile information
    * @param options Options to bypass displaying the Lock UI
    * @param successCallback Callback on successful login
    * @param errorCallback Callback on failed login
    */
  def signin(): scala.Unit = js.native
  def signin(options: IAuth0Options): scala.Unit = js.native
  def signin(options: IAuth0Options, successCallback: ISuccessCallback): scala.Unit = js.native
  def signin(options: IAuth0Options, successCallback: ISuccessCallback, errorCallback: IErrorCallback): scala.Unit = js.native
  /**
    * Logs the user out locally by deleting their token from local storage.
    */
  def signout(): scala.Unit = js.native
  /**
    * Displays Lock in signup mode, and logs the user in immediately after a successful signup.
    * @param options Options to bypass displaying the Lock UI
    * @param successCallback Callback on successful signup
    * @param errorCallback Callback on failed signup
    */
  def signup(): scala.Unit = js.native
  def signup(options: IAuth0Options): scala.Unit = js.native
  def signup(options: IAuth0Options, successCallback: ISuccessCallback): scala.Unit = js.native
  def signup(options: IAuth0Options, successCallback: ISuccessCallback, errorCallback: IErrorCallback): scala.Unit = js.native
  /**
    * Validates the user
    * @param options Options to bypass displaying the Lock UI
    * @param successCallback Callback on successful validation
    * @param errorCallback Callback on failed validation
    */
  def validateUser(options: IAuth0Options): scala.Unit = js.native
  def validateUser(options: IAuth0Options, successCallback: ISuccessCallback): scala.Unit = js.native
  def validateUser(options: IAuth0Options, successCallback: ISuccessCallback, errorCallback: IErrorCallback): scala.Unit = js.native
}

