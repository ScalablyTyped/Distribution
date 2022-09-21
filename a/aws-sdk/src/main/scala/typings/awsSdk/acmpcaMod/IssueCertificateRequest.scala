package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssueCertificateRequest extends StObject {
  
  /**
    * Specifies X.509 certificate information to be included in the issued certificate. An APIPassthrough or APICSRPassthrough template variant must be selected, or else this parameter is ignored. For more information about using these templates, see Understanding Certificate Templates. If conflicting or duplicate certificate information is supplied during certificate issuance, ACM Private CA applies order of operation rules to determine what information is used.
    */
  var ApiPassthrough: js.UndefOr[typings.awsSdk.acmpcaMod.ApiPassthrough] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must be of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012  
    */
  var CertificateAuthorityArn: Arn
  
  /**
    * The certificate signing request (CSR) for the certificate you want to issue. As an example, you can use the following OpenSSL command to create the CSR and a 2048 bit RSA private key.   openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr  If you have a configuration file, you can then use the following OpenSSL command. The usr_cert block in the configuration file contains your X509 version 3 extensions.   openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr  Note: A CSR must provide either a subject name or a subject alternative name or the request will be rejected. 
    */
  var Csr: CsrBlob
  
  /**
    * Alphanumeric string that can be used to distinguish between calls to the IssueCertificate action. Idempotency tokens for IssueCertificate time out after one minute. Therefore, if you call IssueCertificate multiple times with the same idempotency token within one minute, ACM Private CA recognizes that you are requesting only one certificate and will issue only one. If you change the idempotency token for each call, PCA recognizes that you are requesting multiple certificates.
    */
  var IdempotencyToken: js.UndefOr[typings.awsSdk.acmpcaMod.IdempotencyToken] = js.undefined
  
  /**
    * The name of the algorithm that will be used to sign the certificate to be issued.  This parameter should not be confused with the SigningAlgorithm parameter used to sign a CSR in the CreateCertificateAuthority action.  The specified signing algorithm family (RSA or ECDSA) much match the algorithm family of the CA's secret key. 
    */
  var SigningAlgorithm: typings.awsSdk.acmpcaMod.SigningAlgorithm
  
  /**
    * Specifies a custom configuration template to use when issuing a certificate. If this parameter is not provided, ACM Private CA defaults to the EndEntityCertificate/V1 template. For CA certificates, you should choose the shortest path length that meets your needs. The path length is indicated by the PathLenN portion of the ARN, where N is the CA depth. Note: The CA depth configured on a subordinate CA certificate must not exceed the limit set by its parents in the CA hierarchy. For a list of TemplateArn values supported by ACM Private CA, see Understanding Certificate Templates.
    */
  var TemplateArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Information describing the end of the validity period of the certificate. This parameter sets the “Not After” date for the certificate. Certificate validity is the period of time during which a certificate is valid. Validity can be expressed as an explicit date and time when the certificate expires, or as a span of time after issuance, stated in days, months, or years. For more information, see Validity in RFC 5280.  This value is unaffected when ValidityNotBefore is also specified. For example, if Validity is set to 20 days in the future, the certificate will expire 20 days from issuance time regardless of the ValidityNotBefore value. The end of the validity period configured on a certificate must not exceed the limit set on its parents in the CA hierarchy.
    */
  var Validity: typings.awsSdk.acmpcaMod.Validity
  
  /**
    * Information describing the start of the validity period of the certificate. This parameter sets the “Not Before" date for the certificate. By default, when issuing a certificate, ACM Private CA sets the "Not Before" date to the issuance time minus 60 minutes. This compensates for clock inconsistencies across computer systems. The ValidityNotBefore parameter can be used to customize the “Not Before” value.  Unlike the Validity parameter, the ValidityNotBefore parameter is optional. The ValidityNotBefore value is expressed as an explicit date and time, using the Validity type value ABSOLUTE. For more information, see Validity in this API reference and Validity in RFC 5280.
    */
  var ValidityNotBefore: js.UndefOr[Validity] = js.undefined
}
object IssueCertificateRequest {
  
  inline def apply(CertificateAuthorityArn: Arn, Csr: CsrBlob, SigningAlgorithm: SigningAlgorithm, Validity: Validity): IssueCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any], Csr = Csr.asInstanceOf[js.Any], SigningAlgorithm = SigningAlgorithm.asInstanceOf[js.Any], Validity = Validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueCertificateRequest]
  }
  
  extension [Self <: IssueCertificateRequest](x: Self) {
    
    inline def setApiPassthrough(value: ApiPassthrough): Self = StObject.set(x, "ApiPassthrough", value.asInstanceOf[js.Any])
    
    inline def setApiPassthroughUndefined: Self = StObject.set(x, "ApiPassthrough", js.undefined)
    
    inline def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    inline def setCsr(value: CsrBlob): Self = StObject.set(x, "Csr", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    inline def setSigningAlgorithm(value: SigningAlgorithm): Self = StObject.set(x, "SigningAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setTemplateArn(value: Arn): Self = StObject.set(x, "TemplateArn", value.asInstanceOf[js.Any])
    
    inline def setTemplateArnUndefined: Self = StObject.set(x, "TemplateArn", js.undefined)
    
    inline def setValidity(value: Validity): Self = StObject.set(x, "Validity", value.asInstanceOf[js.Any])
    
    inline def setValidityNotBefore(value: Validity): Self = StObject.set(x, "ValidityNotBefore", value.asInstanceOf[js.Any])
    
    inline def setValidityNotBeforeUndefined: Self = StObject.set(x, "ValidityNotBefore", js.undefined)
  }
}
