package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCertificateAuthorityRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must have the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn = js.native
  /**
    * The number of days to make a CA restorable after it has been deleted. This can be anywhere from 7 to 30 days, with 30 being the default.
    */
  var PermanentDeletionTimeInDays: js.UndefOr[typings.awsSdk.acmpcaMod.PermanentDeletionTimeInDays] = js.native
}

object DeleteCertificateAuthorityRequest {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn): DeleteCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCertificateAuthorityRequest]
  }
  @scala.inline
  implicit class DeleteCertificateAuthorityRequestOps[Self <: DeleteCertificateAuthorityRequest] (val x: Self) extends AnyVal {
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
    def setPermanentDeletionTimeInDays(value: PermanentDeletionTimeInDays): Self = this.set("PermanentDeletionTimeInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermanentDeletionTimeInDays: Self = this.set("PermanentDeletionTimeInDays", js.undefined)
  }
  
}

