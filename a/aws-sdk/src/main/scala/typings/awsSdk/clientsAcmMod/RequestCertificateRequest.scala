package typings.awsSdk.clientsAcmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestCertificateRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to issue the certificate. If you do not provide an ARN and you are trying to request a private certificate, ACM will attempt to issue a public certificate. For more information about private CAs, see the Amazon Web Services Private Certificate Authority user guide. The ARN must have the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 
    */
  var CertificateAuthorityArn: js.UndefOr[PcaArn] = js.undefined
  
  /**
    * Fully qualified domain name (FQDN), such as www.example.com, that you want to secure with an ACM certificate. Use an asterisk (*) to create a wildcard certificate that protects several sites in the same domain. For example, *.example.com protects www.example.com, site.example.com, and images.example.com.  In compliance with RFC 5280, the length of the domain name (technically, the Common Name) that you provide cannot exceed 64 octets (characters), including periods. To add a longer domain name, specify it in the Subject Alternative Name field, which supports names up to 253 octets in length. 
    */
  var DomainName: DomainNameString
  
  /**
    * The domain name that you want ACM to use to send you emails so that you can validate domain ownership.
    */
  var DomainValidationOptions: js.UndefOr[DomainValidationOptionList] = js.undefined
  
  /**
    * Customer chosen string that can be used to distinguish between calls to RequestCertificate. Idempotency tokens time out after one hour. Therefore, if you call RequestCertificate multiple times with the same idempotency token within one hour, ACM recognizes that you are requesting only one certificate and will issue only one. If you change the idempotency token for each call, ACM recognizes that you are requesting multiple certificates.
    */
  var IdempotencyToken: js.UndefOr[typings.awsSdk.clientsAcmMod.IdempotencyToken] = js.undefined
  
  /**
    * Specifies the algorithm of the public and private key pair that your certificate uses to encrypt data. RSA is the default key algorithm for ACM certificates. Elliptic Curve Digital Signature Algorithm (ECDSA) keys are smaller, offering security comparable to RSA keys but with greater computing efficiency. However, ECDSA is not supported by all network clients. Some AWS services may require RSA keys, or only support ECDSA keys of a particular size, while others allow the use of either RSA and ECDSA keys to ensure that compatibility is not broken. Check the requirements for the AWS service where you plan to deploy your certificate. Default: RSA_2048
    */
  var KeyAlgorithm: js.UndefOr[typings.awsSdk.clientsAcmMod.KeyAlgorithm] = js.undefined
  
  /**
    * Currently, you can use this parameter to specify whether to add the certificate to a certificate transparency log. Certificate transparency makes it possible to detect SSL/TLS certificates that have been mistakenly or maliciously issued. Certificates that have not been logged typically produce an error message in a browser. For more information, see Opting Out of Certificate Transparency Logging.
    */
  var Options: js.UndefOr[CertificateOptions] = js.undefined
  
  /**
    * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM certificate. For example, add the name www.example.net to a certificate for which the DomainName field is www.example.com if users can reach your site by using either name. The maximum number of domain names that you can add to an ACM certificate is 100. However, the initial quota is 10 domain names. If you need more than 10 names, you must request a quota increase. For more information, see Quotas.  The maximum length of a SAN DNS name is 253 octets. The name is made up of multiple labels separated by periods. No label can be longer than 63 octets. Consider the following examples:     (63 octets).(63 octets).(63 octets).(61 octets) is legal because the total length is 253 octets (63+1+63+1+63+1+61) and no label exceeds 63 octets.    (64 octets).(63 octets).(63 octets).(61 octets) is not legal because the total length exceeds 253 octets (64+1+63+1+63+1+61) and the first label exceeds 63 octets.    (63 octets).(63 octets).(63 octets).(62 octets) is not legal because the total length of the DNS name (63+1+63+1+63+1+62) exceeds 253 octets.  
    */
  var SubjectAlternativeNames: js.UndefOr[DomainList] = js.undefined
  
  /**
    * One or more resource tags to associate with the certificate.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The method you want to use if you are requesting a public certificate to validate that you own or control domain. You can validate with DNS or validate with email. We recommend that you use DNS validation. 
    */
  var ValidationMethod: js.UndefOr[typings.awsSdk.clientsAcmMod.ValidationMethod] = js.undefined
}
object RequestCertificateRequest {
  
  inline def apply(DomainName: DomainNameString): RequestCertificateRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCertificateRequest]
  }
  
  extension [Self <: RequestCertificateRequest](x: Self) {
    
    inline def setCertificateAuthorityArn(value: PcaArn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArnUndefined: Self = StObject.set(x, "CertificateAuthorityArn", js.undefined)
    
    inline def setDomainName(value: DomainNameString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainValidationOptions(value: DomainValidationOptionList): Self = StObject.set(x, "DomainValidationOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainValidationOptionsUndefined: Self = StObject.set(x, "DomainValidationOptions", js.undefined)
    
    inline def setDomainValidationOptionsVarargs(value: DomainValidationOption*): Self = StObject.set(x, "DomainValidationOptions", js.Array(value*))
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    inline def setKeyAlgorithm(value: KeyAlgorithm): Self = StObject.set(x, "KeyAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyAlgorithmUndefined: Self = StObject.set(x, "KeyAlgorithm", js.undefined)
    
    inline def setOptions(value: CertificateOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setSubjectAlternativeNames(value: DomainList): Self = StObject.set(x, "SubjectAlternativeNames", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeNamesUndefined: Self = StObject.set(x, "SubjectAlternativeNames", js.undefined)
    
    inline def setSubjectAlternativeNamesVarargs(value: DomainNameString*): Self = StObject.set(x, "SubjectAlternativeNames", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setValidationMethod(value: ValidationMethod): Self = StObject.set(x, "ValidationMethod", value.asInstanceOf[js.Any])
    
    inline def setValidationMethodUndefined: Self = StObject.set(x, "ValidationMethod", js.undefined)
  }
}
