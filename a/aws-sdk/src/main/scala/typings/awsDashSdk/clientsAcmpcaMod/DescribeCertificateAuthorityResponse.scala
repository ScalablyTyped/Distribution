package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCertificateAuthorityResponse extends js.Object {
  /**
    * A CertificateAuthority structure that contains information about your private CA.
    */
  var CertificateAuthority: js.UndefOr[typings.awsDashSdk.clientsAcmpcaMod.CertificateAuthority] = js.undefined
}

object DescribeCertificateAuthorityResponse {
  @scala.inline
  def apply(CertificateAuthority: CertificateAuthority = null): DescribeCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    if (CertificateAuthority != null) __obj.updateDynamic("CertificateAuthority")(CertificateAuthority)
    __obj.asInstanceOf[DescribeCertificateAuthorityResponse]
  }
}

