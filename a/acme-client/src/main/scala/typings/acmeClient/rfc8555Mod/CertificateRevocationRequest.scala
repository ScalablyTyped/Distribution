package typings.acmeClient.rfc8555Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateRevocationRequest extends js.Object {
  var reason: js.UndefOr[CertificateRevocationReason] = js.undefined
}

object CertificateRevocationRequest {
  @scala.inline
  def apply(reason: CertificateRevocationReason = null): CertificateRevocationRequest = {
    val __obj = js.Dynamic.literal()
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateRevocationRequest]
  }
}

