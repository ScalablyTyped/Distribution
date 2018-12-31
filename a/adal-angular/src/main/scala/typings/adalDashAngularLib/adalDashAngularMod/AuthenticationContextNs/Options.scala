package typings
package adalDashAngularLib.adalDashAngularMod.AuthenticationContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration options for Authentication Context
  */
trait Options extends js.Object {
  /**
    * Array of keywords or URIs. Adal will not attach a token to outgoing requests that have these keywords or URIs.
    */
  var anonymousEndpoints: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Sets browser storage to either 'localStorage' or sessionStorage'. Defaults to `sessionStorage`.
    */
  var cacheLocation: js.UndefOr[
    adalDashAngularLib.adalDashAngularLibStrings.localStorage | adalDashAngularLib.adalDashAngularLibStrings.sessionStorage
  ] = js.undefined
  /**
    * Callback to be invoked when a token is acquired.
    */
  var callback: js.UndefOr[TokenCallback] = js.undefined
  /**
    * Client ID assigned to your app by Azure Active Directory.
    */
  var clientId: java.lang.String
  /**
    * Unique identifier used to map the request with the response. Defaults to RFC4122 version 4 guid (128 bits).
    */
  var correlationId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * User defined function of handling the navigation to Azure AD authorization endpoint in case of login.
    */
  var displayCall: js.UndefOr[js.Function1[/* url */ java.lang.String, scala.Unit]] = js.undefined
  /**
    * Array of keywords or URIs. Adal will attach a token to outgoing requests that have these keywords or URIs.
    */
  var endpoints: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
    * If the cached token is about to be expired in the expireOffsetSeconds (in seconds), Adal will renew the token instead of using the cached token. Defaults to 300 seconds.
    */
  var expireOffsetSeconds: js.UndefOr[scala.Double] = js.undefined
  /**
    * Query parameters to add to the authentication request.
    */
  var extraQueryParameter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Azure Active Directory instance. Defaults to `https://login.microsoftonline.com/`.
    */
  var instance: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of milliseconds of inactivity before a token renewal response from AAD should be considered timed out. Defaults to 6 seconds.
    */
  var loadFrameTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set this to redirect the user to a custom login page.
    */
  var localLoginUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set this to redirect the user to a custom logout page.
    */
  var logOutUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set this to the resource to request on login. Defaults to `clientId`.
    */
  var loginResource: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Redirects to start page after login. Defaults to `true`.
    */
  var navigateToLoginRequestUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set this to true to enable login in a popup winodow instead of a full redirect. Defaults to `false`.
    */
  var popUp: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Redirects the user to postLogoutRedirectUri after logout. Defaults to `redirectUri`.
    */
  var postLogoutRedirectUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Endpoint at which you expect to receive tokens.Defaults to `window.location.href`.
    */
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Your target tenant. Defaults to `common`.
    */
  var tenant: js.UndefOr[java.lang.String] = js.undefined
}

