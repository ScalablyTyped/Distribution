package typings.auth0.mod

import typings.auth0.anon.Methods
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainVerification extends Domain {
  
  var cname_api_key: js.UndefOr[String] = js.native
}
object DomainVerification {
  
  @scala.inline
  def apply(
    custom_domain_id: String,
    domain: String,
    primary: Boolean,
    status: CustomDomainStatus,
    `type`: CustomDomainType,
    verification: Methods
  ): DomainVerification = {
    val __obj = js.Dynamic.literal(custom_domain_id = custom_domain_id.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainVerification]
  }
  
  @scala.inline
  implicit class DomainVerificationOps[Self <: DomainVerification] (val x: Self) extends AnyVal {
    
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
    def setCname_api_key(value: String): Self = this.set("cname_api_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCname_api_key: Self = this.set("cname_api_key", js.undefined)
  }
}
