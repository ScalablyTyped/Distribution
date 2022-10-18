package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterCertificateResult extends StObject {
  
  /**
    * The identifier of the certificate.
    */
  var CertificateId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.CertificateId] = js.undefined
}
object RegisterCertificateResult {
  
  inline def apply(): RegisterCertificateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterCertificateResult]
  }
  
  extension [Self <: RegisterCertificateResult](x: Self) {
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdUndefined: Self = StObject.set(x, "CertificateId", js.undefined)
  }
}
