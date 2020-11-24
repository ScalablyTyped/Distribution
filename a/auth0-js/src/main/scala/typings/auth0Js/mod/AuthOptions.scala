package typings.auth0Js.mod

import typings.auth0Js.anon.Jwksuri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthOptions extends js.Object {
  
  var __tryLocalStorageFirst: js.UndefOr[Boolean] = js.native
  
  var _csrf: js.UndefOr[String] = js.native
  
  var _disableDeprecationWarnings: js.UndefOr[Boolean] = js.native
  
  var _intstate: js.UndefOr[String] = js.native
  
  var _sendTelemetry: js.UndefOr[Boolean] = js.native
  
  var _telemetryInfo: js.UndefOr[js.Any] = js.native
  
  var _timesToRetryFailedRequests: js.UndefOr[Double] = js.native
  
  var audience: js.UndefOr[String] = js.native
  
  var clientID: String = js.native
  
  var domain: String = js.native
  
  var jwksURI: js.UndefOr[String] = js.native
  
  var leeway: js.UndefOr[Double] = js.native
  
  /**
    * maximum elapsed time in seconds since the last time the user
    * was actively authenticated by the authorization server.
    */
  var maxAge: js.UndefOr[Double] = js.native
  
  var overrides: js.UndefOr[Jwksuri] = js.native
  
  var plugins: js.UndefOr[js.Any] = js.native
  
  var popupOrigin: js.UndefOr[String] = js.native
  
  var protocol: js.UndefOr[String] = js.native
  
  var redirectUri: js.UndefOr[String] = js.native
  
  var responseMode: js.UndefOr[String] = js.native
  
  var responseType: js.UndefOr[String] = js.native
  
  var response_type: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
  
  var tenant: js.UndefOr[String] = js.native
  
  var universalLoginPage: js.UndefOr[Boolean] = js.native
}
object AuthOptions {
  
  @scala.inline
  def apply(clientID: String, domain: String): AuthOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOptions]
  }
  
  @scala.inline
  implicit class AuthOptionsOps[Self <: AuthOptions] (val x: Self) extends AnyVal {
    
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
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__tryLocalStorageFirst(value: Boolean): Self = this.set("__tryLocalStorageFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__tryLocalStorageFirst: Self = this.set("__tryLocalStorageFirst", js.undefined)
    
    @scala.inline
    def set_csrf(value: String): Self = this.set("_csrf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_csrf: Self = this.set("_csrf", js.undefined)
    
    @scala.inline
    def set_disableDeprecationWarnings(value: Boolean): Self = this.set("_disableDeprecationWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_disableDeprecationWarnings: Self = this.set("_disableDeprecationWarnings", js.undefined)
    
    @scala.inline
    def set_intstate(value: String): Self = this.set("_intstate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_intstate: Self = this.set("_intstate", js.undefined)
    
    @scala.inline
    def set_sendTelemetry(value: Boolean): Self = this.set("_sendTelemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_sendTelemetry: Self = this.set("_sendTelemetry", js.undefined)
    
    @scala.inline
    def set_telemetryInfo(value: js.Any): Self = this.set("_telemetryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_telemetryInfo: Self = this.set("_telemetryInfo", js.undefined)
    
    @scala.inline
    def set_timesToRetryFailedRequests(value: Double): Self = this.set("_timesToRetryFailedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_timesToRetryFailedRequests: Self = this.set("_timesToRetryFailedRequests", js.undefined)
    
    @scala.inline
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setJwksURI(value: String): Self = this.set("jwksURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJwksURI: Self = this.set("jwksURI", js.undefined)
    
    @scala.inline
    def setLeeway(value: Double): Self = this.set("leeway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeeway: Self = this.set("leeway", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    
    @scala.inline
    def setOverrides(value: Jwksuri): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Any): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setPopupOrigin(value: String): Self = this.set("popupOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupOrigin: Self = this.set("popupOrigin", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = this.set("redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUri: Self = this.set("redirectUri", js.undefined)
    
    @scala.inline
    def setResponseMode(value: String): Self = this.set("responseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseMode: Self = this.set("responseMode", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
    
    @scala.inline
    def setResponse_type(value: String): Self = this.set("response_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse_type: Self = this.set("response_type", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTenant(value: String): Self = this.set("tenant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenant: Self = this.set("tenant", js.undefined)
    
    @scala.inline
    def setUniversalLoginPage(value: Boolean): Self = this.set("universalLoginPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniversalLoginPage: Self = this.set("universalLoginPage", js.undefined)
  }
}
