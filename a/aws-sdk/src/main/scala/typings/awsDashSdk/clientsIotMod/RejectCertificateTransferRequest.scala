package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectCertificateTransferRequest extends js.Object {
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
  @scala.inline
  def apply(certificateId: CertificateId, rejectReason: Message = null): RejectCertificateTransferRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId)
    if (rejectReason != null) __obj.updateDynamic("rejectReason")(rejectReason)
    __obj.asInstanceOf[RejectCertificateTransferRequest]
  }
}

