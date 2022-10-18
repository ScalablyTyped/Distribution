package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectCertificateTransferRequest extends StObject {
  
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId
  
  /**
    * The reason the certificate transfer was rejected.
    */
  var rejectReason: js.UndefOr[Message] = js.undefined
}
object RejectCertificateTransferRequest {
  
  inline def apply(certificateId: CertificateId): RejectCertificateTransferRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectCertificateTransferRequest]
  }
  
  extension [Self <: RejectCertificateTransferRequest](x: Self) {
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    inline def setRejectReason(value: Message): Self = StObject.set(x, "rejectReason", value.asInstanceOf[js.Any])
    
    inline def setRejectReasonUndefined: Self = StObject.set(x, "rejectReason", js.undefined)
  }
}
