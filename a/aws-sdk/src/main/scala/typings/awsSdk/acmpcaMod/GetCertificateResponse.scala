package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCertificateResponse extends StObject {
  
  /**
    * The base64 PEM-encoded certificate specified by the CertificateArn parameter.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.undefined
  
  /**
    * The base64 PEM-encoded certificate chain that chains up to the on-premises root CA certificate that you used to sign your private CA certificate. 
    */
  var CertificateChain: js.UndefOr[typings.awsSdk.acmpcaMod.CertificateChain] = js.undefined
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
