package typings.awsSdk.clientsAcmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportCertificateResponse extends StObject {
  
  /**
    * The base64 PEM-encoded certificate.
    */
  var Certificate: js.UndefOr[CertificateBody] = js.undefined
  
  /**
    * The base64 PEM-encoded certificate chain. This does not include the certificate that you are exporting.
    */
  var CertificateChain: js.UndefOr[typings.awsSdk.clientsAcmMod.CertificateChain] = js.undefined
  
  /**
    * The encrypted private key associated with the public key in the certificate. The key is output in PKCS #8 format and is base64 PEM-encoded. 
    */
  var PrivateKey: js.UndefOr[typings.awsSdk.clientsAcmMod.PrivateKey] = js.undefined
}
object ExportCertificateResponse {
  
  inline def apply(): ExportCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportCertificateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportCertificateResponse] (val x: Self) extends AnyVal {
    
    inline def setCertificate(value: CertificateBody): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateChain(value: CertificateChain): Self = StObject.set(x, "CertificateChain", value.asInstanceOf[js.Any])
    
    inline def setCertificateChainUndefined: Self = StObject.set(x, "CertificateChain", js.undefined)
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
    
    inline def setPrivateKey(value: PrivateKey): Self = StObject.set(x, "PrivateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "PrivateKey", js.undefined)
  }
}
