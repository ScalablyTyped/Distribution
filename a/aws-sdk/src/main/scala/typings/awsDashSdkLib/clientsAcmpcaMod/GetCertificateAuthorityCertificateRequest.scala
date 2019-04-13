package typings
package awsDashSdkLib.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateAuthorityCertificateRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of your private CA. This is of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn
}

object GetCertificateAuthorityCertificateRequest {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn): GetCertificateAuthorityCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn)
  
    __obj.asInstanceOf[GetCertificateAuthorityCertificateRequest]
  }
}

