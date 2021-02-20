package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDomainData extends StObject {
  
  var custom_client_ip_header: js.UndefOr[String] = js.native
  
  var domain: String = js.native
  
  var tls_policy: js.UndefOr[String] = js.native
  
  var `type`: CustomDomainType = js.native
  
  var verification_method: js.UndefOr[CustomDomainVerificationMethod] = js.native
}
object CreateDomainData {
  
  @scala.inline
  def apply(domain: String, `type`: CustomDomainType): CreateDomainData = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainData]
  }
  
  @scala.inline
  implicit class CreateDomainDataMutableBuilder[Self <: CreateDomainData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom_client_ip_header(value: String): Self = StObject.set(x, "custom_client_ip_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_client_ip_headerUndefined: Self = StObject.set(x, "custom_client_ip_header", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTls_policy(value: String): Self = StObject.set(x, "tls_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTls_policyUndefined: Self = StObject.set(x, "tls_policy", js.undefined)
    
    @scala.inline
    def setType(value: CustomDomainType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerification_method(value: CustomDomainVerificationMethod): Self = StObject.set(x, "verification_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerification_methodUndefined: Self = StObject.set(x, "verification_method", js.undefined)
  }
}
