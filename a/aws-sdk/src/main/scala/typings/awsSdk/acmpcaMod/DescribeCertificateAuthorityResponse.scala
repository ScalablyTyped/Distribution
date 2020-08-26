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
  def apply(): DescribeCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCertificateAuthorityResponse]
  }
  @scala.inline
  implicit class DescribeCertificateAuthorityResponseOps[Self <: DescribeCertificateAuthorityResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificateAuthority(value: CertificateAuthority): Self = this.set("CertificateAuthority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateAuthority: Self = this.set("CertificateAuthority", js.undefined)
  }
  
}

