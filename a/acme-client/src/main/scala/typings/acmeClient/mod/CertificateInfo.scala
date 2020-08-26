package typings.acmeClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateInfo extends js.Object {
  var domains: CsrDomains = js.native
  var notAfter: Date = js.native
  var notBefore: Date = js.native
}

object CertificateInfo {
  @scala.inline
  def apply(domains: CsrDomains, notAfter: Date, notBefore: Date): CertificateInfo = {
    val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any], notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfo]
  }
  @scala.inline
  implicit class CertificateInfoOps[Self <: CertificateInfo] (val x: Self) extends AnyVal {
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
    def setDomains(value: CsrDomains): Self = this.set("domains", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotAfter(value: Date): Self = this.set("notAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotBefore(value: Date): Self = this.set("notBefore", value.asInstanceOf[js.Any])
  }
  
}

