package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDomainNameRequest extends js.Object {
  
  /**
    * The domain name.
    */
  var DomainName: string = js.native
  
  /**
    * The domain name configurations.
    */
  var DomainNameConfigurations: js.UndefOr[typings.awsSdk.apigatewayv2Mod.DomainNameConfigurations] = js.native
  
  /**
    * The mutual TLS authentication configuration for a custom domain name.
    */
  var MutualTlsAuthentication: js.UndefOr[MutualTlsAuthenticationInput] = js.native
}
object UpdateDomainNameRequest {
  
  @scala.inline
  def apply(DomainName: string): UpdateDomainNameRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainNameRequest]
  }
  
  @scala.inline
  implicit class UpdateDomainNameRequestOps[Self <: UpdateDomainNameRequest] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: string): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameConfigurationsVarargs(value: DomainNameConfiguration*): Self = this.set("DomainNameConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setDomainNameConfigurations(value: DomainNameConfigurations): Self = this.set("DomainNameConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainNameConfigurations: Self = this.set("DomainNameConfigurations", js.undefined)
    
    @scala.inline
    def setMutualTlsAuthentication(value: MutualTlsAuthenticationInput): Self = this.set("MutualTlsAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutualTlsAuthentication: Self = this.set("MutualTlsAuthentication", js.undefined)
  }
}
