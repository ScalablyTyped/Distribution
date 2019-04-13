package typings
package awsDashSdkLib.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagCertificateAuthorityRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn
  /**
    * List of tags to be removed from the CA.
    */
  var Tags: TagList
}

object UntagCertificateAuthorityRequest {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn, Tags: TagList): UntagCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn, Tags = Tags)
  
    __obj.asInstanceOf[UntagCertificateAuthorityRequest]
  }
}

