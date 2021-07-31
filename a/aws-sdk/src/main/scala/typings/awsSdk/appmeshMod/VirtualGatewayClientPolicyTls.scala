package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayClientPolicyTls extends StObject {
  
  /**
    * Whether the policy is enforced. The default is True, if a value isn't specified.
    */
  var enforce: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more ports that the policy is enforced for.
    */
  var ports: js.UndefOr[PortSet] = js.undefined
  
  /**
    * A reference to an object that represents a TLS validation context.
    */
  var validation: VirtualGatewayTlsValidationContext
}
object VirtualGatewayClientPolicyTls {
  
  @scala.inline
  def apply(validation: VirtualGatewayTlsValidationContext): VirtualGatewayClientPolicyTls = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayClientPolicyTls]
  }
  
  @scala.inline
  implicit class VirtualGatewayClientPolicyTlsMutableBuilder[Self <: VirtualGatewayClientPolicyTls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnforce(value: Boolean): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    @scala.inline
    def setPorts(value: PortSet): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: PortNumber*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    @scala.inline
    def setValidation(value: VirtualGatewayTlsValidationContext): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
  }
}
