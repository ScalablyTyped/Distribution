package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateAuthenticationRequest extends StObject {
  
  /**
    * The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in Certificate Manager (ACM).
    */
  var ClientRootCertificateChainArn: js.UndefOr[String] = js.undefined
}
object CertificateAuthenticationRequest {
  
  inline def apply(): CertificateAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthenticationRequest]
  }
  
  extension [Self <: CertificateAuthenticationRequest](x: Self) {
    
    inline def setClientRootCertificateChainArn(value: String): Self = StObject.set(x, "ClientRootCertificateChainArn", value.asInstanceOf[js.Any])
    
    inline def setClientRootCertificateChainArnUndefined: Self = StObject.set(x, "ClientRootCertificateChainArn", js.undefined)
  }
}
