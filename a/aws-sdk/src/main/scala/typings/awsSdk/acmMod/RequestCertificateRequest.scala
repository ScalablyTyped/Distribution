package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestCertificateRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to issue the certificate. If you do not provide an ARN and you are trying to request a private certificate, ACM will attempt to issue a public certificate. For more information about private CAs, see the AWS Certificate Manager Private Certificate Authority (PCA) user guide. The ARN must have the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
  
  /**
    *  Fully qualified domain name (FQDN), such as www.example.com, that you want to secure with an ACM certificate. Use an asterisk (*) to create a wildcard certificate that protects several sites in the same domain. For example, *.example.com protects www.example.com, site.example.com, and images.example.com.   The first domain name you enter cannot exceed 64 octets, including periods. Each subsequent Subject Alternative Name (SAN), however, can be up to 253 octets in length. 
    */
  var DomainName: DomainNameString
  
  /**
    * The domain name that you want ACM to use to send you emails so that you can validate domain ownership.
    */
  var DomainValidationOptions: js.UndefOr[DomainValidationOptionList] = js.undefined
  
  /**
    * Customer chosen string that can be used to distinguish between calls to RequestCertificate. Idempotency tokens time out after one hour. Therefore, if you call RequestCertificate multiple times with the same idempotency token within one hour, ACM recognizes that you are requesting only one certificate and will issue only one. If you change the idempotency token for each call, ACM recognizes that you are requesting multiple certificates.
    */
  var IdempotencyToken: js.UndefOr[typings.awsSdk.acmMod.IdempotencyToken] = js.undefined
  
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
  var ValidationMethod: js.UndefOr[typings.awsSdk.acmMod.ValidationMethod] = js.undefined
}
object RequestCertificateRequest {
  
  @scala.inline
  def apply(DomainName: DomainNameString): RequestCertificateRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestCertificateRequest]
  }
  
  @scala.inline
  implicit class RequestCertificateRequestMutableBuilder[Self <: RequestCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityArnUndefined: Self = StObject.set(x, "CertificateAuthorityArn", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainNameString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainValidationOptions(value: DomainValidationOptionList): Self = StObject.set(x, "DomainValidationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainValidationOptionsUndefined: Self = StObject.set(x, "DomainValidationOptions", js.undefined)
    
    @scala.inline
    def setDomainValidationOptionsVarargs(value: DomainValidationOption*): Self = StObject.set(x, "DomainValidationOptions", js.Array(value :_*))
    
    @scala.inline
    def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    @scala.inline
    def setOptions(value: CertificateOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setSubjectAlternativeNames(value: DomainList): Self = StObject.set(x, "SubjectAlternativeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectAlternativeNamesUndefined: Self = StObject.set(x, "SubjectAlternativeNames", js.undefined)
    
    @scala.inline
    def setSubjectAlternativeNamesVarargs(value: DomainNameString*): Self = StObject.set(x, "SubjectAlternativeNames", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setValidationMethod(value: ValidationMethod): Self = StObject.set(x, "ValidationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationMethodUndefined: Self = StObject.set(x, "ValidationMethod", js.undefined)
  }
}
