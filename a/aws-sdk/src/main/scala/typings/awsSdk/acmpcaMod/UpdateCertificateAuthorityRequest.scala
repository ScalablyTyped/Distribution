package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCertificateAuthorityRequest extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn = js.native
  /**
    * Revocation information for your private CA.
    */
  var RevocationConfiguration: js.UndefOr[typings.awsSdk.acmpcaMod.RevocationConfiguration] = js.native
  /**
    * Status of your private CA.
    */
  var Status: js.UndefOr[CertificateAuthorityStatus] = js.native
}

object UpdateCertificateAuthorityRequest {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn): UpdateCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCertificateAuthorityRequest]
  }
  @scala.inline
  implicit class UpdateCertificateAuthorityRequestOps[Self <: UpdateCertificateAuthorityRequest] (val x: Self) extends AnyVal {
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
    def setCertificateAuthorityArn(value: Arn): Self = this.set("CertificateAuthorityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevocationConfiguration(value: RevocationConfiguration): Self = this.set("RevocationConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevocationConfiguration: Self = this.set("RevocationConfiguration", js.undefined)
    @scala.inline
    def setStatus(value: CertificateAuthorityStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

