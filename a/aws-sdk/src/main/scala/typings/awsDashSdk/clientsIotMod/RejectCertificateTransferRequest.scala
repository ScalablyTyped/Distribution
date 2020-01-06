package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectCertificateTransferRequest extends js.Object {
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId = js.native
  /**
    * The reason the certificate transfer was rejected.
    */
  var rejectReason: js.UndefOr[Message] = js.native
}

object RejectCertificateTransferRequest {
  @scala.inline
  def apply(certificateId: CertificateId, rejectReason: Message = null): RejectCertificateTransferRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    if (rejectReason != null) __obj.updateDynamic("rejectReason")(rejectReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectCertificateTransferRequest]
  }
}

