package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterCertificateWithoutCARequest extends StObject {
  
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: CertificatePem
  
  /**
    * The status of the register certificate request.
    */
  var status: js.UndefOr[CertificateStatus] = js.undefined
}
object RegisterCertificateWithoutCARequest {
  
  inline def apply(certificatePem: CertificatePem): RegisterCertificateWithoutCARequest = {
    val __obj = js.Dynamic.literal(certificatePem = certificatePem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateWithoutCARequest]
  }
  
  extension [Self <: RegisterCertificateWithoutCARequest](x: Self) {
    
    inline def setCertificatePem(value: CertificatePem): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CertificateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
