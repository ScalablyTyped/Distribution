package typings.auth0.mod

import typings.auth0.anon.Methods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Domain extends js.Object {
  
  var custom_client_ip_header: js.UndefOr[String] = js.native
  
  var custom_domain_id: String = js.native
  
  var domain: String = js.native
  
  var origin_domain_name: js.UndefOr[String] = js.native
  
  var primary: Boolean = js.native
  
  var status: CustomDomainStatus = js.native
  
  var tls_policy: js.UndefOr[String] = js.native
  
  var `type`: CustomDomainType = js.native
  
  var verification: Methods = js.native
}
object Domain {
  
  @scala.inline
  def apply(
    custom_domain_id: String,
    domain: String,
    primary: Boolean,
    status: CustomDomainStatus,
    `type`: CustomDomainType,
    verification: Methods
  ): Domain = {
    val __obj = js.Dynamic.literal(custom_domain_id = custom_domain_id.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
    
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
    def setCustom_domain_id(value: String): Self = this.set("custom_domain_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: CustomDomainStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CustomDomainType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerification(value: Methods): Self = this.set("verification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_client_ip_header(value: String): Self = this.set("custom_client_ip_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom_client_ip_header: Self = this.set("custom_client_ip_header", js.undefined)
    
    @scala.inline
    def setOrigin_domain_name(value: String): Self = this.set("origin_domain_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin_domain_name: Self = this.set("origin_domain_name", js.undefined)
    
    @scala.inline
    def setTls_policy(value: String): Self = this.set("tls_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTls_policy: Self = this.set("tls_policy", js.undefined)
  }
}
