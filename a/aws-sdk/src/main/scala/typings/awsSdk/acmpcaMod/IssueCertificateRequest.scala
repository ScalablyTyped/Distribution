package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssueCertificateRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn = js.native
  
  /**
    * The certificate signing request (CSR) for the certificate you want to issue. You can use the following OpenSSL command to create the CSR and a 2048 bit RSA private key.   openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr  If you have a configuration file, you can use the following OpenSSL command. The usr_cert block in the configuration file contains your X509 version 3 extensions.   openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr  Note: A CSR must provide either a subject name or a subject alternative name or the request will be rejected. 
    */
  var Csr: CsrBlob = js.native
  
  /**
    * Custom string that can be used to distinguish between calls to the IssueCertificate action. Idempotency tokens time out after one hour. Therefore, if you call IssueCertificate multiple times with the same idempotency token within 5 minutes, ACM Private CA recognizes that you are requesting only one certificate and will issue only one. If you change the idempotency token for each call, PCA recognizes that you are requesting multiple certificates.
    */
  var IdempotencyToken: js.UndefOr[typings.awsSdk.acmpcaMod.IdempotencyToken] = js.native
  
  /**
    * The name of the algorithm that will be used to sign the certificate to be issued.  This parameter should not be confused with the SigningAlgorithm parameter used to sign a CSR.
    */
  var SigningAlgorithm: typings.awsSdk.acmpcaMod.SigningAlgorithm = js.native
  
  /**
    * Specifies a custom configuration template to use when issuing a certificate. If this parameter is not provided, ACM Private CA defaults to the EndEntityCertificate/V1 template. For CA certificates, you should choose the shortest path length that meets your needs. The path length is indicated by the PathLenN portion of the ARN, where N is the CA depth. Note: The CA depth configured on a subordinate CA certificate must not exceed the limit set by its parents in the CA hierarchy. The following service-owned TemplateArn values are supported by ACM Private CA:    arn:aws:acm-pca:::template/CodeSigningCertificate/V1   arn:aws:acm-pca:::template/CodeSigningCertificate_CSRPassthrough/V1   arn:aws:acm-pca:::template/EndEntityCertificate/V1   arn:aws:acm-pca:::template/EndEntityCertificate_CSRPassthrough/V1   arn:aws:acm-pca:::template/EndEntityClientAuthCertificate/V1   arn:aws:acm-pca:::template/EndEntityClientAuthCertificate_CSRPassthrough/V1   arn:aws:acm-pca:::template/EndEntityServerAuthCertificate/V1   arn:aws:acm-pca:::template/EndEntityServerAuthCertificate_CSRPassthrough/V1   arn:aws:acm-pca:::template/OCSPSigningCertificate/V1   arn:aws:acm-pca:::template/OCSPSigningCertificate_CSRPassthrough/V1   arn:aws:acm-pca:::template/RootCACertificate/V1   arn:aws:acm-pca:::template/SubordinateCACertificate_PathLen0/V1   arn:aws:acm-pca:::template/SubordinateCACertificate_PathLen1/V1   arn:aws:acm-pca:::template/SubordinateCACertificate_PathLen2/V1   arn:aws:acm-pca:::template/SubordinateCACertificate_PathLen3/V1   For more information, see Using Templates.
    */
  var TemplateArn: js.UndefOr[Arn] = js.native
  
  /**
    * Information describing the validity period of the certificate. When issuing a certificate, ACM Private CA sets the "Not Before" date in the validity field to date and time minus 60 minutes. This is intended to compensate for time inconsistencies across systems of 60 minutes or less.  The validity period configured on a certificate must not exceed the limit set by its parents in the CA hierarchy.
    */
  var Validity: typings.awsSdk.acmpcaMod.Validity = js.native
}
object IssueCertificateRequest {
  
  @scala.inline
  def apply(CertificateAuthorityArn: Arn, Csr: CsrBlob, SigningAlgorithm: SigningAlgorithm, Validity: Validity): IssueCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any], Csr = Csr.asInstanceOf[js.Any], SigningAlgorithm = SigningAlgorithm.asInstanceOf[js.Any], Validity = Validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueCertificateRequest]
  }
  
  @scala.inline
  implicit class IssueCertificateRequestOps[Self <: IssueCertificateRequest] (val x: Self) extends AnyVal {
    
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
    def setCertificateAuthorityArn(value: Arn): Self = this.set("CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsr(value: CsrBlob): Self = this.set("Csr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningAlgorithm(value: SigningAlgorithm): Self = this.set("SigningAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidity(value: Validity): Self = this.set("Validity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyToken(value: IdempotencyToken): Self = this.set("IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdempotencyToken: Self = this.set("IdempotencyToken", js.undefined)
    
    @scala.inline
    def setTemplateArn(value: Arn): Self = this.set("TemplateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateArn: Self = this.set("TemplateArn", js.undefined)
  }
}
