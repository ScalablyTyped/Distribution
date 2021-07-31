package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagementOptions extends StObject {
  
  var audience: js.UndefOr[String] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var clientSecret: js.UndefOr[String] = js.undefined
  
  var domain: String
  
  var scope: js.UndefOr[String] = js.undefined
  
  var telemetry: js.UndefOr[Boolean] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
  
  var tokenProvider: js.UndefOr[TokenProvider] = js.undefined
}
object ManagementOptions {
  
  @scala.inline
  def apply(domain: String): ManagementOptions = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementOptions]
  }
  
  @scala.inline
  implicit class ManagementOptionsMutableBuilder[Self <: ManagementOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setTelemetry(value: Boolean): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenProvider(value: TokenProvider): Self = StObject.set(x, "tokenProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenProviderUndefined: Self = StObject.set(x, "tokenProvider", js.undefined)
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
