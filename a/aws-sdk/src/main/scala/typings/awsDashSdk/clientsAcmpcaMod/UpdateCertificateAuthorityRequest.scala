package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCertificateAuthorityRequest extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn
  /**
    * Revocation information for your private CA.
    */
  var RevocationConfiguration: js.UndefOr[typings.awsDashSdk.clientsAcmpcaMod.RevocationConfiguration] = js.undefined
  /**
    * Status of your private CA.
    */
  var Status: js.UndefOr[CertificateAuthorityStatus] = js.undefined
}

object UpdateCertificateAuthorityRequest {
  @scala.inline
  def apply(
    CertificateAuthorityArn: Arn,
    RevocationConfiguration: RevocationConfiguration = null,
    Status: CertificateAuthorityStatus = null
  ): UpdateCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn)
    if (RevocationConfiguration != null) __obj.updateDynamic("RevocationConfiguration")(RevocationConfiguration)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCertificateAuthorityRequest]
  }
}

