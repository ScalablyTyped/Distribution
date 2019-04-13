package typings
package awsDashSdkLib.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCertificateAuthorityResponse extends js.Object {
  /**
    * If successful, the Amazon Resource Name (ARN) of the certificate authority (CA). This is of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
}

object CreateCertificateAuthorityResponse {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn = null): CreateCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    if (CertificateAuthorityArn != null) __obj.updateDynamic("CertificateAuthorityArn")(CertificateAuthorityArn)
    __obj.asInstanceOf[CreateCertificateAuthorityResponse]
  }
}

