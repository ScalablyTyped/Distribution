package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterCertificateRequest extends StObject {
  
  /**
    * The CA certificate used to sign the device certificate being registered.
    */
  var caCertificatePem: js.UndefOr[CertificatePem] = js.undefined
  
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: CertificatePem
  
  /**
    * A boolean value that specifies if the certificate is set to active. Valid values: ACTIVE | INACTIVE 
    */
  var setAsActive: js.UndefOr[SetAsActiveFlag] = js.undefined
  
  /**
    * The status of the register certificate request. Valid values that you can use include ACTIVE, INACTIVE, and REVOKED.
    */
  var status: js.UndefOr[CertificateStatus] = js.undefined
}
object RegisterCertificateRequest {
  
  inline def apply(certificatePem: CertificatePem): RegisterCertificateRequest = {
    val __obj = js.Dynamic.literal(certificatePem = certificatePem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateRequest]
  }
  
  extension [Self <: RegisterCertificateRequest](x: Self) {
    
    inline def setCaCertificatePem(value: CertificatePem): Self = StObject.set(x, "caCertificatePem", value.asInstanceOf[js.Any])
    
    inline def setCaCertificatePemUndefined: Self = StObject.set(x, "caCertificatePem", js.undefined)
    
    inline def setCertificatePem(value: CertificatePem): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
    
    inline def setSetAsActive(value: SetAsActiveFlag): Self = StObject.set(x, "setAsActive", value.asInstanceOf[js.Any])
    
    inline def setSetAsActiveUndefined: Self = StObject.set(x, "setAsActive", js.undefined)
    
    inline def setStatus(value: CertificateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
