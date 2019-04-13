package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptCertificateTransferRequest extends js.Object {
  /**
    * The ID of the certificate. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId
  /**
    * Specifies whether the certificate is active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.undefined
}

object AcceptCertificateTransferRequest {
  @scala.inline
  def apply(certificateId: CertificateId, setAsActive: js.UndefOr[SetAsActive] = js.undefined): AcceptCertificateTransferRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId)
    if (!js.isUndefined(setAsActive)) __obj.updateDynamic("setAsActive")(setAsActive)
    __obj.asInstanceOf[AcceptCertificateTransferRequest]
  }
}

