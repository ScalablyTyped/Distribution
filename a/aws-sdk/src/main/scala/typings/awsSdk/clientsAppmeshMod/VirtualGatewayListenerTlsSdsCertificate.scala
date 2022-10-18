package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayListenerTlsSdsCertificate extends StObject {
  
  /**
    * A reference to an object that represents the name of the secret secret requested from the Secret Discovery Service provider representing Transport Layer Security (TLS) materials like a certificate or certificate chain.
    */
  var secretName: VirtualGatewaySdsSecretName
}
object VirtualGatewayListenerTlsSdsCertificate {
  
  inline def apply(secretName: VirtualGatewaySdsSecretName): VirtualGatewayListenerTlsSdsCertificate = {
    val __obj = js.Dynamic.literal(secretName = secretName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayListenerTlsSdsCertificate]
  }
  
  extension [Self <: VirtualGatewayListenerTlsSdsCertificate](x: Self) {
    
    inline def setSecretName(value: VirtualGatewaySdsSecretName): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
  }
}
