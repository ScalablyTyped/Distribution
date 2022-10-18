package typings.awsSdk.clientsAcmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCertificateResponse extends StObject {
  
  /**
    * The ACM-issued certificate corresponding to the ARN specified as input.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.undefined
  
  /**
    * Certificates forming the requested certificate's chain of trust. The chain consists of the certificate of the issuing CA and the intermediate certificates of any other subordinate CAs. 
    */
  var CertificateChain: js.UndefOr[typings.awsSdk.clientsAcmMod.CertificateChain] = js.undefined
}
object GetCertificateResponse {
  
  inline def apply(): GetCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCertificateResponse]
  }
  
  extension [Self <: GetCertificateResponse](x: Self) {
    
    inline def setCertificate(value: CertificateBody): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateChain(value: CertificateChain): Self = StObject.set(x, "CertificateChain", value.asInstanceOf[js.Any])
    
    inline def setCertificateChainUndefined: Self = StObject.set(x, "CertificateChain", js.undefined)
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
