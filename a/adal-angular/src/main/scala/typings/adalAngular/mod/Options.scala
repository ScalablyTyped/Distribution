package typings.adalAngular.mod

import org.scalablytyped.runtime.StringDictionary
import typings.adalAngular.adalAngularStrings.localStorage
import typings.adalAngular.adalAngularStrings.sessionStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options for Authentication Context
  */
@js.native
trait Options extends js.Object {
  
  /**
    * Array of keywords or URIs. Adal will not attach a token to outgoing requests that have these keywords or URIs.
    */
  var anonymousEndpoints: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Sets browser storage to either 'localStorage' or sessionStorage'. Defaults to `sessionStorage`.
    */
  var cacheLocation: js.UndefOr[localStorage | sessionStorage] = js.native
  
  /**
    * Callback to be invoked when a token is acquired.
    */
  var callback: js.UndefOr[TokenCallback] = js.native
  
  /**
    * Client ID assigned to your app by Azure Active Directory.
    */
  var clientId: String = js.native
  
  /**
    * Unique identifier used to map the request with the response. Defaults to RFC4122 version 4 guid (128 bits).
    */
  var correlationId: js.UndefOr[String] = js.native
  
  /**
    * User defined function of handling the navigation to Azure AD authorization endpoint in case of login.
    */
  var displayCall: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.native
  
  /**
    * Array of keywords or URIs. Adal will attach a token to outgoing requests that have these keywords or URIs.
    */
  var endpoints: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * If the cached token is about to be expired in the expireOffsetSeconds (in seconds), Adal will renew the token instead of using the cached token. Defaults to 300 seconds.
    */
  var expireOffsetSeconds: js.UndefOr[Double] = js.native
  
  /**
    * Query parameters to add to the authentication request.
    */
  var extraQueryParameter: js.UndefOr[String] = js.native
  
  /**
    * Azure Active Directory instance. Defaults to `https://login.microsoftonline.com/`.
    */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * The number of milliseconds of inactivity before a token renewal response from AAD should be considered timed out. Defaults to 6 seconds.
    */
  var loadFrameTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Set this to redirect the user to a custom login page.
    */
  var localLoginUrl: js.UndefOr[String] = js.native
  
  /**
    * Set this to redirect the user to a custom logout page.
    */
  var logOutUri: js.UndefOr[String] = js.native
  
  /**
    * Set this to the resource to request on login. Defaults to `clientId`.
    */
  var loginResource: js.UndefOr[String] = js.native
  
  /**
    * Redirects to start page after login. Defaults to `true`.
    */
  var navigateToLoginRequestUrl: js.UndefOr[Boolean] = js.native
  
  /**
    * Set this to true to enable login in a popup winodow instead of a full redirect. Defaults to `false`.
    */
  var popUp: js.UndefOr[Boolean] = js.native
  
  /**
    * Redirects the user to postLogoutRedirectUri after logout. Defaults to `redirectUri`.
    */
  var postLogoutRedirectUri: js.UndefOr[String] = js.native
  
  /**
    * Endpoint at which you expect to receive tokens.Defaults to `window.location.href`.
    */
  var redirectUri: js.UndefOr[String] = js.native
  
  /**
    * Your target tenant. Defaults to `common`.
    */
  var tenant: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(clientId: String): Options = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnonymousEndpointsVarargs(value: String*): Self = this.set("anonymousEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setAnonymousEndpoints(value: js.Array[String]): Self = this.set("anonymousEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnonymousEndpoints: Self = this.set("anonymousEndpoints", js.undefined)
    
    @scala.inline
    def setCacheLocation(value: localStorage | sessionStorage): Self = this.set("cacheLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheLocation: Self = this.set("cacheLocation", js.undefined)
    
    @scala.inline
    def setCallback(value: (/* errorDesc */ String | Null, /* token */ String | Null, /* error */ js.Any) => Unit): Self = this.set("callback", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCorrelationId(value: String): Self = this.set("correlationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrelationId: Self = this.set("correlationId", js.undefined)
    
    @scala.inline
    def setDisplayCall(value: /* url */ String => Unit): Self = this.set("displayCall", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDisplayCall: Self = this.set("displayCall", js.undefined)
    
    @scala.inline
    def setEndpoints(value: StringDictionary[String]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("endpoints", js.undefined)
    
    @scala.inline
    def setExpireOffsetSeconds(value: Double): Self = this.set("expireOffsetSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireOffsetSeconds: Self = this.set("expireOffsetSeconds", js.undefined)
    
    @scala.inline
    def setExtraQueryParameter(value: String): Self = this.set("extraQueryParameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraQueryParameter: Self = this.set("extraQueryParameter", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setLoadFrameTimeout(value: Double): Self = this.set("loadFrameTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadFrameTimeout: Self = this.set("loadFrameTimeout", js.undefined)
    
    @scala.inline
    def setLocalLoginUrl(value: String): Self = this.set("localLoginUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalLoginUrl: Self = this.set("localLoginUrl", js.undefined)
    
    @scala.inline
    def setLogOutUri(value: String): Self = this.set("logOutUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogOutUri: Self = this.set("logOutUri", js.undefined)
    
    @scala.inline
    def setLoginResource(value: String): Self = this.set("loginResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoginResource: Self = this.set("loginResource", js.undefined)
    
    @scala.inline
    def setNavigateToLoginRequestUrl(value: Boolean): Self = this.set("navigateToLoginRequestUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigateToLoginRequestUrl: Self = this.set("navigateToLoginRequestUrl", js.undefined)
    
    @scala.inline
    def setPopUp(value: Boolean): Self = this.set("popUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopUp: Self = this.set("popUp", js.undefined)
    
    @scala.inline
    def setPostLogoutRedirectUri(value: String): Self = this.set("postLogoutRedirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostLogoutRedirectUri: Self = this.set("postLogoutRedirectUri", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
    
    @scala.inline
    def setTenant(value: String): Self = this.set("tenant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenant: Self = this.set("tenant", js.undefined)
  }
}
