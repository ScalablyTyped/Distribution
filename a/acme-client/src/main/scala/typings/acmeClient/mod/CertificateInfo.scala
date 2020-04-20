package typings.acmeClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateInfo extends js.Object {
  var domains: CsrDomains
  var notAfter: String
  var notBefore: String
}

object CertificateInfo {
  @scala.inline
  def apply(domains: CsrDomains, notAfter: String, notBefore: String): CertificateInfo = {
    val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any], notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfo]
  }
}

