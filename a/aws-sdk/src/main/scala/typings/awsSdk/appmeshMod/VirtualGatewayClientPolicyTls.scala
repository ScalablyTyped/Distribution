package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewayClientPolicyTls extends js.Object {
  
  /**
    * Whether the policy is enforced. The default is True, if a value isn't specified.
    */
  var enforce: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more ports that the policy is enforced for.
    */
  var ports: js.UndefOr[PortSet] = js.native
  
  /**
    * A reference to an object that represents a TLS validation context.
    */
  var validation: VirtualGatewayTlsValidationContext = js.native
}
object VirtualGatewayClientPolicyTls {
  
  @scala.inline
  def apply(validation: VirtualGatewayTlsValidationContext): VirtualGatewayClientPolicyTls = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayClientPolicyTls]
  }
  
  @scala.inline
  implicit class VirtualGatewayClientPolicyTlsOps[Self <: VirtualGatewayClientPolicyTls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setValidation(value: VirtualGatewayTlsValidationContext): Self = this.set("validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforce(value: Boolean): Self = this.set("enforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforce: Self = this.set("enforce", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: PortNumber*): Self = this.set("ports", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: PortSet): Self = this.set("ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePorts: Self = this.set("ports", js.undefined)
  }
}
