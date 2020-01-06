package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateAuthorityCertificateRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of your private CA. This is of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn = js.native
}

object GetCertificateAuthorityCertificateRequest {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn): GetCertificateAuthorityCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCertificateAuthorityCertificateRequest]
  }
}

