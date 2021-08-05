package typings.auth0Js.mod

import typings.auth0Js.anon.Jwksuri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthOptions extends StObject {
  
  var __tryLocalStorageFirst: js.UndefOr[Boolean] = js.undefined
  
  var _csrf: js.UndefOr[String] = js.undefined
  
  var _disableDeprecationWarnings: js.UndefOr[Boolean] = js.undefined
  
  var _intstate: js.UndefOr[String] = js.undefined
  
  var _sendTelemetry: js.UndefOr[Boolean] = js.undefined
  
  var _telemetryInfo: js.UndefOr[js.Any] = js.undefined
  
  var _timesToRetryFailedRequests: js.UndefOr[Double] = js.undefined
  
  var audience: js.UndefOr[String] = js.undefined
  
  var clientID: String
  
  var domain: String
  
  var jwksURI: js.UndefOr[String] = js.undefined
  
  var leeway: js.UndefOr[Double] = js.undefined
  
  /**
    * maximum elapsed time in seconds since the last time the user
    * was actively authenticated by the authorization server.
    */
  var maxAge: js.UndefOr[Double] = js.undefined
  
  var overrides: js.UndefOr[Jwksuri] = js.undefined
  
  var plugins: js.UndefOr[js.Any] = js.undefined
  
  var popupOrigin: js.UndefOr[String] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
  
  var redirectUri: js.UndefOr[String] = js.undefined
  
  var responseMode: js.UndefOr[String] = js.undefined
  
  var responseType: js.UndefOr[String] = js.undefined
  
  var response_type: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
  
  var tenant: js.UndefOr[String] = js.undefined
  
  var universalLoginPage: js.UndefOr[Boolean] = js.undefined
}
object AuthOptions {
  
  inline def apply(clientID: String, domain: String): AuthOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOptions]
  }
  
  extension [Self <: AuthOptions](x: Self) {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setJwksURI(value: String): Self = StObject.set(x, "jwksURI", value.asInstanceOf[js.Any])
    
    inline def setJwksURIUndefined: Self = StObject.set(x, "jwksURI", js.undefined)
    
    inline def setLeeway(value: Double): Self = StObject.set(x, "leeway", value.asInstanceOf[js.Any])
    
    inline def setLeewayUndefined: Self = StObject.set(x, "leeway", js.undefined)
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setOverrides(value: Jwksuri): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPlugins(value: js.Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPopupOrigin(value: String): Self = StObject.set(x, "popupOrigin", value.asInstanceOf[js.Any])
    
    inline def setPopupOriginUndefined: Self = StObject.set(x, "popupOrigin", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
    
    inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    
    inline def setResponseMode(value: String): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
    
    inline def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setResponse_type(value: String): Self = StObject.set(x, "response_type", value.asInstanceOf[js.Any])
    
    inline def setResponse_typeUndefined: Self = StObject.set(x, "response_type", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTenant(value: String): Self = StObject.set(x, "tenant", value.asInstanceOf[js.Any])
    
    inline def setTenantUndefined: Self = StObject.set(x, "tenant", js.undefined)
    
    inline def setUniversalLoginPage(value: Boolean): Self = StObject.set(x, "universalLoginPage", value.asInstanceOf[js.Any])
    
    inline def setUniversalLoginPageUndefined: Self = StObject.set(x, "universalLoginPage", js.undefined)
    
    inline def set__tryLocalStorageFirst(value: Boolean): Self = StObject.set(x, "__tryLocalStorageFirst", value.asInstanceOf[js.Any])
    
    inline def set__tryLocalStorageFirstUndefined: Self = StObject.set(x, "__tryLocalStorageFirst", js.undefined)
    
    inline def set_csrf(value: String): Self = StObject.set(x, "_csrf", value.asInstanceOf[js.Any])
    
    inline def set_csrfUndefined: Self = StObject.set(x, "_csrf", js.undefined)
    
    inline def set_disableDeprecationWarnings(value: Boolean): Self = StObject.set(x, "_disableDeprecationWarnings", value.asInstanceOf[js.Any])
    
    inline def set_disableDeprecationWarningsUndefined: Self = StObject.set(x, "_disableDeprecationWarnings", js.undefined)
    
    inline def set_intstate(value: String): Self = StObject.set(x, "_intstate", value.asInstanceOf[js.Any])
    
    inline def set_intstateUndefined: Self = StObject.set(x, "_intstate", js.undefined)
    
    inline def set_sendTelemetry(value: Boolean): Self = StObject.set(x, "_sendTelemetry", value.asInstanceOf[js.Any])
    
    inline def set_sendTelemetryUndefined: Self = StObject.set(x, "_sendTelemetry", js.undefined)
    
    inline def set_telemetryInfo(value: js.Any): Self = StObject.set(x, "_telemetryInfo", value.asInstanceOf[js.Any])
    
    inline def set_telemetryInfoUndefined: Self = StObject.set(x, "_telemetryInfo", js.undefined)
    
    inline def set_timesToRetryFailedRequests(value: Double): Self = StObject.set(x, "_timesToRetryFailedRequests", value.asInstanceOf[js.Any])
    
    inline def set_timesToRetryFailedRequestsUndefined: Self = StObject.set(x, "_timesToRetryFailedRequests", js.undefined)
  }
}
