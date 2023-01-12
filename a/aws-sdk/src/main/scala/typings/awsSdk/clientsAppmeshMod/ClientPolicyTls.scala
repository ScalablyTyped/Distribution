package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientPolicyTls extends StObject {
  
  /**
    * A reference to an object that represents a client's TLS certificate.
    */
  var certificate: js.UndefOr[ClientTlsCertificate] = js.undefined
  
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
  var validation: TlsValidationContext
}
object ClientPolicyTls {
  
  inline def apply(validation: TlsValidationContext): ClientPolicyTls = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPolicyTls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientPolicyTls] (val x: Self) extends AnyVal {
    
    inline def setCertificate(value: ClientTlsCertificate): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setEnforce(value: Boolean): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    inline def setPorts(value: PortSet): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setPortsVarargs(value: PortNumber*): Self = StObject.set(x, "ports", js.Array(value*))
    
    inline def setValidation(value: TlsValidationContext): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
  }
}
