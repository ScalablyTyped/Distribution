package typings.auth0DashJs.auth0DashJsMod

import typings.auth0DashJs.Anon_CountryCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auth0-js", "Authentication")
@js.native
class Authentication protected () extends js.Object {
  def this(options: AuthOptions) = this()
  var dbConnection: DBConnection = js.native
  var passwordless: PasswordlessAuthentication = js.native
  /**
    * Builds and returns the `/authorize` url in order to initialize a new authN/authZ transaction
    *
    * @param options: https://auth0.com/docs/api/authentication#!#get--authorize_db
    */
  def buildAuthorizeUrl(options: js.Any): String = js.native
  /**
    * Builds and returns the Logout url in order to initialize a new authN/authZ transaction
    *
    * @param options: https://auth0.com/docs/api/authentication#!#get--v2-logout
    */
  def buildLogoutUrl(): String = js.native
  def buildLogoutUrl(options: LogoutOptions): String = js.native
  /**
    * Makes a call to the `/delegation` endpoint
    *
    * @param options: https://auth0.com/docs/api/authentication#!#post--delegation
    */
  def delegation(options: DelegationOptions, callback: Auth0Callback[Auth0DelegationToken, Auth0Error]): js.Any = js.native
  /**
    * Makes a call to the `/ssodata` endpoint
    *
    */
  def getSSOData(): Unit = js.native
  def getSSOData(callback: Auth0Callback[_, Auth0Error]): Unit = js.native
  /**
    * Makes a call to the `/ssodata` endpoint
    *
    */
  def getSSOData(withActiveDirectories: Boolean): Unit = js.native
  def getSSOData(withActiveDirectories: Boolean, callback: Auth0Callback[_, Auth0Error]): Unit = js.native
  /**
    * Fetches the user country based on the ip.
    *
    */
  def getUserCountry(callback: Auth0Callback[Anon_CountryCode, Auth0Error]): Unit = js.native
  /**
    * Makes a call to the `oauth/token` endpoint with `password-realm` grant type
    */
  def login(options: DefaultLoginOptions, callback: Auth0Callback[_, Auth0Error]): Unit = js.native
  /**
    * Makes a call to the `oauth/token` endpoint with `password` grant type
    *
    * @param options: https://auth0.com/docs/api-auth/grant/password
    */
  def loginWithDefaultDirectory(options: DefaultDirectoryLoginOptions, callback: Auth0Callback[_, Auth0Error]): Unit = js.native
  /**
    * Makes a call to the `/ro` endpoint
    * @deprecated `loginWithResourceOwner` will be soon deprecated, user `login` instead.
    */
  def loginWithResourceOwner(options: ResourceOwnerLoginOptions, callback: Auth0Callback[_, Auth0Error]): Unit = js.native
  /**
    * Makes a call to the `oauth/token` endpoint
    */
  def oauthToken(options: js.Any, callback: Auth0Callback[_, Auth0Error]): Unit = js.native
  /**
    * Makes a call to the `/userinfo` endpoint and returns the user profile
    *
    */
  def userInfo(accessToken: String, callback: Auth0Callback[Auth0UserProfile, Auth0Error]): Unit = js.native
}

