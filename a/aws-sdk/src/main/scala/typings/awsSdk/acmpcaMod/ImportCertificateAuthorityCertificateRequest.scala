package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportCertificateAuthorityCertificateRequest extends js.Object {
  /**
    * The PEM-encoded certificate for a private CA. This may be a self-signed certificate in the case of a root CA, or it may be signed by another CA that you control.
    */
  var Certificate: CertificateBodyBlob = js.native
  /**
    * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn = js.native
  /**
    * A PEM-encoded file that contains all of your certificates, other than the certificate you're importing, chaining up to your root CA. Your ACM Private CA-hosted or on-premises root certificate is the last in the chain, and each certificate in the chain signs the one preceding.  This parameter must be supplied when you import a subordinate CA. When you import a root CA, there is no chain.
    */
  var CertificateChain: js.UndefOr[CertificateChainBlob] = js.native
}

object ImportCertificateAuthorityCertificateRequest {
  @scala.inline
  def apply(Certificate: CertificateBodyBlob, CertificateAuthorityArn: Arn): ImportCertificateAuthorityCertificateRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateAuthorityCertificateRequest]
  }
  @scala.inline
  implicit class ImportCertificateAuthorityCertificateRequestOps[Self <: ImportCertificateAuthorityCertificateRequest] (val x: Self) extends AnyVal {
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
    def setCertificate(value: CertificateBodyBlob): Self = this.set("Certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = this.set("CertificateAuthorityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateChain(value: CertificateChainBlob): Self = this.set("CertificateChain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateChain: Self = this.set("CertificateChain", js.undefined)
  }
  
}

