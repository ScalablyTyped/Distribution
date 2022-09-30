package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateDetail extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the certificate. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var CertificateArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the private certificate authority (CA) that issued the certificate. This has the following format:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time at which the certificate was requested.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The fully qualified domain name for the certificate, such as www.example.com or example.com.
    */
  var DomainName: js.UndefOr[DomainNameString] = js.undefined
  
  /**
    * Contains information about the initial validation of each domain name that occurs as a result of the RequestCertificate request. This field exists only when the certificate type is AMAZON_ISSUED. 
    */
  var DomainValidationOptions: js.UndefOr[DomainValidationList] = js.undefined
  
  /**
    * Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for which the certificate public key can be used and consists of a name and an object identifier (OID). 
    */
  var ExtendedKeyUsages: js.UndefOr[ExtendedKeyUsageList] = js.undefined
  
  /**
    * The reason the certificate request failed. This value exists only when the certificate status is FAILED. For more information, see Certificate Request Failed in the Certificate Manager User Guide. 
    */
  var FailureReason: js.UndefOr[typings.awsSdk.acmMod.FailureReason] = js.undefined
  
  /**
    * The date and time when the certificate was imported. This value exists only when the certificate type is IMPORTED. 
    */
  var ImportedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of ARNs for the Amazon Web Services resources that are using the certificate. A certificate can be used by multiple Amazon Web Services resources. 
    */
  var InUseBy: js.UndefOr[InUseList] = js.undefined
  
  /**
    * The time at which the certificate was issued. This value exists only when the certificate type is AMAZON_ISSUED. 
    */
  var IssuedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the certificate authority that issued and signed the certificate.
    */
  var Issuer: js.UndefOr[String] = js.undefined
  
  /**
    * The algorithm that was used to generate the public-private key pair.
    */
  var KeyAlgorithm: js.UndefOr[typings.awsSdk.acmMod.KeyAlgorithm] = js.undefined
  
  /**
    * A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose of the public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE, KEY_ENCHIPHERMENT, NON_REPUDIATION, and more.
    */
  var KeyUsages: js.UndefOr[KeyUsageList] = js.undefined
  
  /**
    * The time after which the certificate is not valid.
    */
  var NotAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time before which the certificate is not valid.
    */
  var NotBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Value that specifies whether to add the certificate to a transparency log. Certificate transparency makes it possible to detect SSL certificates that have been mistakenly or maliciously issued. A browser might respond to certificate that has not been logged by showing an error message. The logs are cryptographically secure. 
    */
  var Options: js.UndefOr[CertificateOptions] = js.undefined
  
  /**
    * Specifies whether the certificate is eligible for renewal. At this time, only exported private certificates can be renewed with the RenewCertificate command.
    */
  var RenewalEligibility: js.UndefOr[typings.awsSdk.acmMod.RenewalEligibility] = js.undefined
  
  /**
    * Contains information about the status of ACM's managed renewal for the certificate. This field exists only when the certificate type is AMAZON_ISSUED.
    */
  var RenewalSummary: js.UndefOr[typings.awsSdk.acmMod.RenewalSummary] = js.undefined
  
  /**
    * The reason the certificate was revoked. This value exists only when the certificate status is REVOKED. 
    */
  var RevocationReason: js.UndefOr[typings.awsSdk.acmMod.RevocationReason] = js.undefined
  
  /**
    * The time at which the certificate was revoked. This value exists only when the certificate status is REVOKED. 
    */
  var RevokedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The serial number of the certificate.
    */
  var Serial: js.UndefOr[String] = js.undefined
  
  /**
    * The algorithm that was used to sign the certificate.
    */
  var SignatureAlgorithm: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the certificate. A certificate enters status PENDING_VALIDATION upon being requested, unless it fails for any of the reasons given in the troubleshooting topic Certificate request fails. ACM makes repeated attempts to validate a certificate for 72 hours and then times out. If a certificate shows status FAILED or VALIDATION_TIMED_OUT, delete the request, correct the issue with DNS validation or Email validation, and try again. If validation succeeds, the certificate enters status ISSUED. 
    */
  var Status: js.UndefOr[CertificateStatus] = js.undefined
  
  /**
    * The name of the entity that is associated with the public key contained in the certificate.
    */
  var Subject: js.UndefOr[String] = js.undefined
  
  /**
    * One or more domain names (subject alternative names) included in the certificate. This list contains the domain names that are bound to the public key that is contained in the certificate. The subject alternative names include the canonical domain name (CN) of the certificate and additional domain names that can be used to connect to the website. 
    */
  var SubjectAlternativeNames: js.UndefOr[DomainList] = js.undefined
  
  /**
    * The source of the certificate. For certificates provided by ACM, this value is AMAZON_ISSUED. For certificates that you imported with ImportCertificate, this value is IMPORTED. ACM does not provide managed renewal for imported certificates. For more information about the differences between certificates that you import and those that ACM provides, see Importing Certificates in the Certificate Manager User Guide. 
    */
  var Type: js.UndefOr[CertificateType] = js.undefined
}
object CertificateDetail {
  
  inline def apply(): CertificateDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateDetail]
  }
  
  extension [Self <: CertificateDetail](x: Self) {
    
    inline def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    inline def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArnUndefined: Self = StObject.set(x, "CertificateAuthorityArn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDomainName(value: DomainNameString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setDomainValidationOptions(value: DomainValidationList): Self = StObject.set(x, "DomainValidationOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainValidationOptionsUndefined: Self = StObject.set(x, "DomainValidationOptions", js.undefined)
    
    inline def setDomainValidationOptionsVarargs(value: DomainValidation*): Self = StObject.set(x, "DomainValidationOptions", js.Array(value*))
    
    inline def setExtendedKeyUsages(value: ExtendedKeyUsageList): Self = StObject.set(x, "ExtendedKeyUsages", value.asInstanceOf[js.Any])
    
    inline def setExtendedKeyUsagesUndefined: Self = StObject.set(x, "ExtendedKeyUsages", js.undefined)
    
    inline def setExtendedKeyUsagesVarargs(value: ExtendedKeyUsage*): Self = StObject.set(x, "ExtendedKeyUsages", js.Array(value*))
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setImportedAt(value: js.Date): Self = StObject.set(x, "ImportedAt", value.asInstanceOf[js.Any])
    
    inline def setImportedAtUndefined: Self = StObject.set(x, "ImportedAt", js.undefined)
    
    inline def setInUseBy(value: InUseList): Self = StObject.set(x, "InUseBy", value.asInstanceOf[js.Any])
    
    inline def setInUseByUndefined: Self = StObject.set(x, "InUseBy", js.undefined)
    
    inline def setInUseByVarargs(value: String*): Self = StObject.set(x, "InUseBy", js.Array(value*))
    
    inline def setIssuedAt(value: js.Date): Self = StObject.set(x, "IssuedAt", value.asInstanceOf[js.Any])
    
    inline def setIssuedAtUndefined: Self = StObject.set(x, "IssuedAt", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "Issuer", js.undefined)
    
    inline def setKeyAlgorithm(value: KeyAlgorithm): Self = StObject.set(x, "KeyAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyAlgorithmUndefined: Self = StObject.set(x, "KeyAlgorithm", js.undefined)
    
    inline def setKeyUsages(value: KeyUsageList): Self = StObject.set(x, "KeyUsages", value.asInstanceOf[js.Any])
    
    inline def setKeyUsagesUndefined: Self = StObject.set(x, "KeyUsages", js.undefined)
    
    inline def setKeyUsagesVarargs(value: KeyUsage*): Self = StObject.set(x, "KeyUsages", js.Array(value*))
    
    inline def setNotAfter(value: js.Date): Self = StObject.set(x, "NotAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "NotAfter", js.undefined)
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "NotBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "NotBefore", js.undefined)
    
    inline def setOptions(value: CertificateOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setRenewalEligibility(value: RenewalEligibility): Self = StObject.set(x, "RenewalEligibility", value.asInstanceOf[js.Any])
    
    inline def setRenewalEligibilityUndefined: Self = StObject.set(x, "RenewalEligibility", js.undefined)
    
    inline def setRenewalSummary(value: RenewalSummary): Self = StObject.set(x, "RenewalSummary", value.asInstanceOf[js.Any])
    
    inline def setRenewalSummaryUndefined: Self = StObject.set(x, "RenewalSummary", js.undefined)
    
    inline def setRevocationReason(value: RevocationReason): Self = StObject.set(x, "RevocationReason", value.asInstanceOf[js.Any])
    
    inline def setRevocationReasonUndefined: Self = StObject.set(x, "RevocationReason", js.undefined)
    
    inline def setRevokedAt(value: js.Date): Self = StObject.set(x, "RevokedAt", value.asInstanceOf[js.Any])
    
    inline def setRevokedAtUndefined: Self = StObject.set(x, "RevokedAt", js.undefined)
    
    inline def setSerial(value: String): Self = StObject.set(x, "Serial", value.asInstanceOf[js.Any])
    
    inline def setSerialUndefined: Self = StObject.set(x, "Serial", js.undefined)
    
    inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "SignatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "SignatureAlgorithm", js.undefined)
    
    inline def setStatus(value: CertificateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeNames(value: DomainList): Self = StObject.set(x, "SubjectAlternativeNames", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeNamesUndefined: Self = StObject.set(x, "SubjectAlternativeNames", js.undefined)
    
    inline def setSubjectAlternativeNamesVarargs(value: DomainNameString*): Self = StObject.set(x, "SubjectAlternativeNames", js.Array(value*))
    
    inline def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
    
    inline def setType(value: CertificateType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
