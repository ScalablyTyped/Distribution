package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCertificateAuthorityCertificateResponse extends StObject {
  
  /**
    * Base64-encoded certificate authority (CA) certificate.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.undefined
  
  /**
    * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. If this is a root CA, the value will be null.
    */
  var CertificateChain: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.CertificateChain] = js.undefined
}
object GetCertificateAuthorityCertificateResponse {
  
  inline def apply(): GetCertificateAuthorityCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificateAuthorityCertificateResponse]
  }
  
  extension [Self <: GetCertificateAuthorityCertificateResponse](x: Self) {
    
    inline def setCertificate(value: CertificateBody): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateChain(value: CertificateChain): Self = StObject.set(x, "CertificateChain", value.asInstanceOf[js.Any])
    
    inline def setCertificateChainUndefined: Self = StObject.set(x, "CertificateChain", js.undefined)
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
