package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportCertificateAuthorityCertificateRequest extends StObject {
  
  /**
    * The PEM-encoded certificate for a private CA. This may be a self-signed certificate in the case of a root CA, or it may be signed by another CA that you control.
    */
  var Certificate: CertificateBodyBlob
  
  /**
    * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn
  
  /**
    * A PEM-encoded file that contains all of your certificates, other than the certificate you're importing, chaining up to your root CA. Your ACM Private CA-hosted or on-premises root certificate is the last in the chain, and each certificate in the chain signs the one preceding.  This parameter must be supplied when you import a subordinate CA. When you import a root CA, there is no chain.
    */
  var CertificateChain: js.UndefOr[CertificateChainBlob] = js.undefined
}
object ImportCertificateAuthorityCertificateRequest {
  
  @scala.inline
  def apply(Certificate: CertificateBodyBlob, CertificateAuthorityArn: Arn): ImportCertificateAuthorityCertificateRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateAuthorityCertificateRequest]
  }
  
  @scala.inline
  implicit class ImportCertificateAuthorityCertificateRequestMutableBuilder[Self <: ImportCertificateAuthorityCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: CertificateBodyBlob): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateChain(value: CertificateChainBlob): Self = StObject.set(x, "CertificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateChainUndefined: Self = StObject.set(x, "CertificateChain", js.undefined)
  }
}
