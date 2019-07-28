package typings.awsDashSdk.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCertificateResponse extends js.Object {
  /**
    * Metadata about an ACM certificate.
    */
  var Certificate: js.UndefOr[CertificateDetail] = js.undefined
}

object DescribeCertificateResponse {
  @scala.inline
  def apply(Certificate: CertificateDetail = null): DescribeCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate)
    __obj.asInstanceOf[DescribeCertificateResponse]
  }
}

