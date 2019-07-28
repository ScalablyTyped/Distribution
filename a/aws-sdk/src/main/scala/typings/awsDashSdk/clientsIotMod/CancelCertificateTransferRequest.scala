package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelCertificateTransferRequest extends js.Object {
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId
}

object CancelCertificateTransferRequest {
  @scala.inline
  def apply(certificateId: CertificateId): CancelCertificateTransferRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId)
  
    __obj.asInstanceOf[CancelCertificateTransferRequest]
  }
}

