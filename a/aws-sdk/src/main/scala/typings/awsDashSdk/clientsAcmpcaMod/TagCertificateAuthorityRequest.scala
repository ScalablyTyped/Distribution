package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagCertificateAuthorityRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn
  /**
    * List of tags to be associated with the CA.
    */
  var Tags: TagList
}

object TagCertificateAuthorityRequest {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn, Tags: TagList): TagCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn, Tags = Tags)
  
    __obj.asInstanceOf[TagCertificateAuthorityRequest]
  }
}

