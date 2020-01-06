package typings.awsDashSdk.clientsAcmpcaMod

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
  var PermanentDeletionTimeInDays: js.UndefOr[typings.awsDashSdk.clientsAcmpcaMod.PermanentDeletionTimeInDays] = js.native
}

object DeleteCertificateAuthorityRequest {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn, PermanentDeletionTimeInDays: Int | Double = null): DeleteCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    if (PermanentDeletionTimeInDays != null) __obj.updateDynamic("PermanentDeletionTimeInDays")(PermanentDeletionTimeInDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCertificateAuthorityRequest]
  }
}

