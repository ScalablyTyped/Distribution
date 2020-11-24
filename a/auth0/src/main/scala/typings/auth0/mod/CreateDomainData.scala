package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDomainData extends js.Object {
  
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
  implicit class CreateDomainDataOps[Self <: CreateDomainData] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CustomDomainType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_client_ip_header(value: String): Self = this.set("custom_client_ip_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_client_ip_header: Self = this.set("custom_client_ip_header", js.undefined)
    
    @scala.inline
    def setTls_policy(value: String): Self = this.set("tls_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls_policy: Self = this.set("tls_policy", js.undefined)
    
    @scala.inline
    def setVerification_method(value: CustomDomainVerificationMethod): Self = this.set("verification_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerification_method: Self = this.set("verification_method", js.undefined)
  }
}
