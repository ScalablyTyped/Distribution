package typings.auth0DashAngular.auth0Ns.angularNs

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAuth0Service extends js.Object {
  // Properties
  var accessToken: String = js.native
  var config: js.Any = js.native
  var idToken: String = js.native
  var isAuthenticated: Boolean = js.native
  var profile: js.Any = js.native
  /**
    * Reauthenticates the user by using a stored profile and token without going through the login flow.
    * @param profile Profile of the user
    * @param idToken Id token
    * @param accessToken Access token
    * @param state State
    * @param refreshToken Flag to indicate refreshing the token
    */
  def authenticate(): IPromise[_] = js.native
  def authenticate(profile: js.Any): IPromise[_] = js.native
  def authenticate(profile: js.Any, idToken: String): IPromise[_] = js.native
  def authenticate(profile: js.Any, idToken: String, accessToken: String): IPromise[_] = js.native
  def authenticate(profile: js.Any, idToken: String, accessToken: String, state: js.Any): IPromise[_] = js.native
  def authenticate(profile: js.Any, idToken: String, accessToken: String, state: js.Any, refreshToken: Boolean): IPromise[_] = js.native
  /**
    * Gets the user's profile
    * @param idToken Id token
    */
  def getProfile(): IPromise[_] = js.native
  def getProfile(idToken: String): IPromise[_] = js.native
  /**
    * Performs a token delegation request exchanging th ecurrent token for another one.
    * @param options Token options
    */
  def getToken(): IPromise[_] = js.native
  def getToken(options: ITokenOptions): IPromise[_] = js.native
  /**
    * Hooks to internal Angular events so that a user will be redirected to the login page if trying to visit a restricted resource
    */
  def hookEvents(): Unit = js.native
  /**
    * Refreshes the Id token
    * @param refreshToken Refresh token to use when renewing
    */
  def refreshIdToken(refreshToken: String): IPromise[_] = js.native
  /**
    * Renews the Id Token with the same scopes as the original token
    * @param id_token Id Token
    */
  def renewIdToken(id_token: String): IPromise[_] = js.native
  /**
    * Performs the "forgot your password" flow.
    * @param options Options to bypass displaying the Lock UI
    * @param successCallback Callback on successful reset
    * @param errorCallback Callback on failed reset
    */
  def reset(): Unit = js.native
  def reset(options: IAuth0Options): Unit = js.native
  def reset(options: IAuth0Options, successCallback: ISuccessCallback): Unit = js.native
  def reset(options: IAuth0Options, successCallback: ISuccessCallback, errorCallback: IErrorCallback): Unit = js.native
  /**
    * Logs in a user, returning tokens and profile information
    * @param options Options to bypass displaying the Lock UI
    * @param successCallback Callback on successful login
    * @param errorCallback Callback on failed login
    */
  def signin(): Unit = js.native
  def signin(options: IAuth0Options): Unit = js.native
  def signin(options: IAuth0Options, successCallback: ISuccessCallback): Unit = js.native
  def signin(options: IAuth0Options, successCallback: ISuccessCallback, errorCallback: IErrorCallback): Unit = js.native
  /**
    * Logs the user out locally by deleting their token from local storage.
    */
  def signout(): Unit = js.native
  /**
    * Displays Lock in signup mode, and logs the user in immediately after a successful signup.
    * @param options Options to bypass displaying the Lock UI
    * @param successCallback Callback on successful signup
    * @param errorCallback Callback on failed signup
    */
  def signup(): Unit = js.native
  def signup(options: IAuth0Options): Unit = js.native
  def signup(options: IAuth0Options, successCallback: ISuccessCallback): Unit = js.native
  def signup(options: IAuth0Options, successCallback: ISuccessCallback, errorCallback: IErrorCallback): Unit = js.native
  /**
    * Validates the user
    * @param options Options to bypass displaying the Lock UI
    * @param successCallback Callback on successful validation
    * @param errorCallback Callback on failed validation
    */
  def validateUser(options: IAuth0Options): Unit = js.native
  def validateUser(options: IAuth0Options, successCallback: ISuccessCallback): Unit = js.native
  def validateUser(options: IAuth0Options, successCallback: ISuccessCallback, errorCallback: IErrorCallback): Unit = js.native
}

