package typings.auth0Js.mod

import typings.auth0Js.anon.CountryCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0-js", "Authentication")
@js.native
open class Authentication protected () extends StObject {
  def this(options: AuthOptions) = this()
  
  /**
    * Builds and returns the `/authorize` url in order to initialize a new authN/authZ transaction
    *
    * @param options: https://auth0.github.io/auth0.js/global.html#buildAuthorizeUrl
    * @see {@link https://auth0.com/docs/api/authentication#authorize-client}
    * @see {@link https://auth0.com/docs/api/authentication#social}
    */
  def buildAuthorizeUrl(options: AuthorizeUrlOptions): String = js.native
  
  /**
    * Builds and returns the Logout url in order to initialize a new authN/authZ transaction
    *
    * @param options: https://auth0.com/docs/api/authentication#!#get--v2-logout
    */
  def buildLogoutUrl(): String = js.native
  def buildLogoutUrl(options: LogoutOptions): String = js.native
  
  var dbConnection: DBConnection = js.native
  
  /**
    * Makes a call to the `/delegation` endpoint
    *
    * @param options: https://auth0.com/docs/api/authentication#!#post--delegation
    */
  def delegation(options: DelegationOptions, callback: Auth0Callback[Auth0DelegationToken, Auth0Error]): Any = js.native
  
  /**
    * Makes a call to the `/ssodata` endpoint
    *
    */
  def getSSOData(): Unit = js.native
  def getSSOData(callback: Auth0Callback[js.UndefOr[SsoDataResult], Auth0Error]): Unit = js.native
  /**
    * Makes a call to the `/ssodata` endpoint
    *
    */
  def getSSOData(withActiveDirectories: Boolean): Unit = js.native
  def getSSOData(withActiveDirectories: Boolean, callback: Auth0Callback[js.UndefOr[SsoDataResult], Auth0Error]): Unit = js.native
  
  /**
    * Fetches the user country based on the ip.
    *
    */
  def getUserCountry(callback: Auth0Callback[CountryCode, Auth0Error]): Unit = js.native
  
  /**
    * Makes a call to the `oauth/token` endpoint with `password-realm` grant type
    */
  def login(options: DefaultLoginOptions, callback: Auth0Callback[Any, Auth0Error]): Unit = js.native
  
  /**
    * Makes a call to the `oauth/token` endpoint with `password` grant type
    *
    * @param options: https://auth0.com/docs/api-auth/grant/password
    */
  def loginWithDefaultDirectory(options: DefaultDirectoryLoginOptions, callback: Auth0Callback[Any, Auth0Error]): Unit = js.native
  
  /**
    * Makes a call to the `/ro` endpoint
    * @deprecated `loginWithResourceOwner` will be soon deprecated, user `login` instead.
    */
  def loginWithResourceOwner(options: ResourceOwnerLoginOptions, callback: Auth0Callback[Any, Auth0Error]): Unit = js.native
  
  /**
    * Makes a call to the `oauth/token` endpoint
    */
  def oauthToken(options: Any, callback: Auth0Callback[Any, Auth0Error]): Unit = js.native
  
  var passwordless: PasswordlessAuthentication = js.native
  
  /**
    * Makes a call to the `/userinfo` endpoint and returns the user profile
    *
    */
  def userInfo(accessToken: String, callback: Auth0Callback[Auth0UserProfile, Auth0Error]): Unit = js.native
}
