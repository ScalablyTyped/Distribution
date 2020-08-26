package typings.acmeClient.rfc8555Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateRevocationRequest extends js.Object {
  var reason: js.UndefOr[CertificateRevocationReason] = js.native
}

object CertificateRevocationRequest {
  @scala.inline
  def apply(): CertificateRevocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateRevocationRequest]
  }
  @scala.inline
  implicit class CertificateRevocationRequestOps[Self <: CertificateRevocationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReason(value: CertificateRevocationReason): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
  
}

