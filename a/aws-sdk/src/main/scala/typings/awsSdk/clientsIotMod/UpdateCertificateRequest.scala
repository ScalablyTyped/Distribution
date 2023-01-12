package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCertificateRequest extends StObject {
  
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId
  
  /**
    * The new status.  Note: Setting the status to PENDING_TRANSFER or PENDING_ACTIVATION will result in an exception being thrown. PENDING_TRANSFER and PENDING_ACTIVATION are statuses used internally by IoT. They are not intended for developer use.  Note: The status value REGISTER_INACTIVE is deprecated and should not be used.
    */
  var newStatus: CertificateStatus
}
object UpdateCertificateRequest {
  
  inline def apply(certificateId: CertificateId, newStatus: CertificateStatus): UpdateCertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any], newStatus = newStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCertificateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCertificateRequest] (val x: Self) extends AnyVal {
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    inline def setNewStatus(value: CertificateStatus): Self = StObject.set(x, "newStatus", value.asInstanceOf[js.Any])
  }
}
