package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerTlsSdsCertificate extends StObject {
  
  /**
    * A reference to an object that represents the name of the secret requested from the Secret Discovery Service provider representing Transport Layer Security (TLS) materials like a certificate or certificate chain.
    */
  var secretName: SdsSecretName
}
object ListenerTlsSdsCertificate {
  
  inline def apply(secretName: SdsSecretName): ListenerTlsSdsCertificate = {
    val __obj = js.Dynamic.literal(secretName = secretName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerTlsSdsCertificate]
  }
  
  extension [Self <: ListenerTlsSdsCertificate](x: Self) {
    
    inline def setSecretName(value: SdsSecretName): Self = StObject.set(x, "secretName", value.asInstanceOf[js.Any])
  }
}
