package typings
package awsDashSdkLib.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportCertificateAuthorityCertificateRequest extends js.Object {
  /**
    * The PEM-encoded certificate for your private CA. This must be signed by using your on-premises CA.
    */
  var Certificate: CertificateBodyBlob
  /**
    * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn
  /**
    * A PEM-encoded file that contains all of your certificates, other than the certificate you're importing, chaining up to your root CA. Your on-premises root certificate is the last in the chain, and each certificate in the chain signs the one preceding. 
    */
  var CertificateChain: CertificateChainBlob
}

object ImportCertificateAuthorityCertificateRequest {
  @scala.inline
  def apply(
    Certificate: CertificateBodyBlob,
    CertificateAuthorityArn: Arn,
    CertificateChain: CertificateChainBlob
  ): ImportCertificateAuthorityCertificateRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], CertificateAuthorityArn = CertificateAuthorityArn, CertificateChain = CertificateChain.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImportCertificateAuthorityCertificateRequest]
  }
}

