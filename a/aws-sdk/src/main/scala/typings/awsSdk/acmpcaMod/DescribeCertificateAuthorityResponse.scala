package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCertificateAuthorityResponse extends js.Object {
  /**
    * A CertificateAuthority structure that contains information about your private CA.
    */
  var CertificateAuthority: js.UndefOr[typings.awsSdk.acmpcaMod.CertificateAuthority] = js.native
}

object DescribeCertificateAuthorityResponse {
  @scala.inline
  def apply(CertificateAuthority: CertificateAuthority = null): DescribeCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    if (CertificateAuthority != null) __obj.updateDynamic("CertificateAuthority")(CertificateAuthority.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCertificateAuthorityResponse]
  }
}

