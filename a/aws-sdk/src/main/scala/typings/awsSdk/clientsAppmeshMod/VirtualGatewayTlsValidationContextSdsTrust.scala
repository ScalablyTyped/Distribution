package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayTlsValidationContextSdsTrust extends StObject {
  
  /**
    * A reference to an object that represents the name of the secret for a virtual gateway's Transport Layer Security (TLS) Secret Discovery Service validation context trust.
    */
  var secretName: VirtualGatewaySdsSecretName
}
object VirtualGatewayTlsValidationContextSdsTrust {
  
  inline def apply(secretName: VirtualGatewaySdsSecretName): VirtualGatewayTlsValidationContextSdsTrust = {
    val __obj = js.Dynamic.literal(secretName = secretName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayTlsValidationContextSdsTrust]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VirtualGatewayTlsValidationContextSdsTrust] (val x: Self) extends AnyVal {
    
    inline def setSecretName(value: VirtualGatewaySdsSecretName): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
  }
}
