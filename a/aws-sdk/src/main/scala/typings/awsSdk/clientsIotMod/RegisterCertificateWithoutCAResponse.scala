package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterCertificateWithoutCAResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the registered certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * The ID of the registered certificate. (The last part of the certificate ARN contains the certificate ID.
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
}
object RegisterCertificateWithoutCAResponse {
  
  inline def apply(): RegisterCertificateWithoutCAResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterCertificateWithoutCAResponse]
  }
  
  extension [Self <: RegisterCertificateWithoutCAResponse](x: Self) {
    
    inline def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
  }
}
