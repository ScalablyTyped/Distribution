package typings.auth0Js.mod

import typings.auth0Js.anon.Jwksuri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthOptions extends StObject {
  
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
  implicit class AuthOptionsMutableBuilder[Self <: AuthOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJwksURI(value: String): Self = StObject.set(x, "jwksURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJwksURIUndefined: Self = StObject.set(x, "jwksURI", js.undefined)
    
    @scala.inline
    def setLeeway(value: Double): Self = StObject.set(x, "leeway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeewayUndefined: Self = StObject.set(x, "leeway", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    @scala.inline
    def setOverrides(value: Jwksuri): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPopupOrigin(value: String): Self = StObject.set(x, "popupOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupOriginUndefined: Self = StObject.set(x, "popupOrigin", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    @scala.inline
    def setResponseMode(value: String): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
    
    @scala.inline
    def setUniversalLoginPage(value: Boolean): Self = StObject.set(x, "universalLoginPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniversalLoginPageUndefined: Self = StObject.set(x, "universalLoginPage", js.undefined)
    
    @scala.inline
    def set__tryLocalStorageFirst(value: Boolean): Self = StObject.set(x, "__tryLocalStorageFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__tryLocalStorageFirstUndefined: Self = StObject.set(x, "__tryLocalStorageFirst", js.undefined)
    
    @scala.inline
    def set_csrf(value: String): Self = StObject.set(x, "_csrf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_csrfUndefined: Self = StObject.set(x, "_csrf", js.undefined)
    
    @scala.inline
    def set_disableDeprecationWarnings(value: Boolean): Self = StObject.set(x, "_disableDeprecationWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_disableDeprecationWarningsUndefined: Self = StObject.set(x, "_disableDeprecationWarnings", js.undefined)
    
    @scala.inline
    def set_intstate(value: String): Self = StObject.set(x, "_intstate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_intstateUndefined: Self = StObject.set(x, "_intstate", js.undefined)
    
    @scala.inline
    def set_sendTelemetry(value: Boolean): Self = StObject.set(x, "_sendTelemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sendTelemetryUndefined: Self = StObject.set(x, "_sendTelemetry", js.undefined)
    
    @scala.inline
    def set_telemetryInfo(value: js.Any): Self = StObject.set(x, "_telemetryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_telemetryInfoUndefined: Self = StObject.set(x, "_telemetryInfo", js.undefined)
    
    @scala.inline
    def set_timesToRetryFailedRequests(value: Double): Self = StObject.set(x, "_timesToRetryFailedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timesToRetryFailedRequestsUndefined: Self = StObject.set(x, "_timesToRetryFailedRequests", js.undefined)
  }
}
