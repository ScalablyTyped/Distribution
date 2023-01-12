package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayClientPolicyTls extends StObject {
  
  /**
    * A reference to an object that represents a virtual gateway's client's Transport Layer Security (TLS) certificate.
    */
  var certificate: js.UndefOr[VirtualGatewayClientTlsCertificate] = js.undefined
  
  /**
    * Whether the policy is enforced. The default is True, if a value isn't specified.
    */
  var enforce: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more ports that the policy is enforced for.
    */
  var ports: js.UndefOr[PortSet] = js.undefined
  
  /**
    * A reference to an object that represents a Transport Layer Security (TLS) validation context.
    */
  var validation: VirtualGatewayTlsValidationContext
}
object VirtualGatewayClientPolicyTls {
  
  inline def apply(validation: VirtualGatewayTlsValidationContext): VirtualGatewayClientPolicyTls = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayClientPolicyTls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualGatewayClientPolicyTls] (val x: Self) extends AnyVal {
    
    inline def setCertificate(value: VirtualGatewayClientTlsCertificate): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setEnforce(value: Boolean): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    inline def setPorts(value: PortSet): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: PortNumber*): Self = StObject.set(x, "ports", js.Array(value*))
    
    inline def setValidation(value: VirtualGatewayTlsValidationContext): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
  }
}
