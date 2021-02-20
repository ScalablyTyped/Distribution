package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagementClientOptions extends StObject {
  
  var audience: js.UndefOr[String] = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  var clientSecret: js.UndefOr[String] = js.native
  
  var domain: String = js.native
  
  var retry: js.UndefOr[RetryOptions] = js.native
  
  var scope: js.UndefOr[String] = js.native
  
  var token: js.UndefOr[String] = js.native
  
  var tokenProvider: js.UndefOr[TokenProvider] = js.native
}
object ManagementClientOptions {
  
  @scala.inline
  def apply(domain: String): ManagementClientOptions = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagementClientOptions]
  }
  
  @scala.inline
  implicit class ManagementClientOptionsMutableBuilder[Self <: ManagementClientOptions] (val x: Self) extends AnyVal {
    
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
    def setRetry(value: RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
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
