package typings.awsSdk.clientsAcmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateSummary extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the certificate. This is of the form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs).
    */
  var CertificateArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time at which the certificate was requested.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Fully qualified domain name (FQDN), such as www.example.com or example.com, for the certificate.
    */
  var DomainName: js.UndefOr[DomainNameString] = js.undefined
  
  /**
    * Indicates whether the certificate has been exported. This value exists only when the certificate type is PRIVATE.
    */
  var Exported: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for which the certificate public key can be used and consists of a name and an object identifier (OID). 
    */
  var ExtendedKeyUsages: js.UndefOr[ExtendedKeyUsageNames] = js.undefined
  
  /**
    * When called by ListCertificates, indicates whether the full list of subject alternative names has been included in the response. If false, the response includes all of the subject alternative names included in the certificate. If true, the response only includes the first 100 subject alternative names included in the certificate. To display the full list of subject alternative names, use DescribeCertificate.
    */
  var HasAdditionalSubjectAlternativeNames: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The date and time when the certificate was imported. This value exists only when the certificate type is IMPORTED. 
    */
  var ImportedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether the certificate is currently in use by any Amazon Web Services resources.
    */
  var InUse: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * The time at which the certificate was issued. This value exists only when the certificate type is AMAZON_ISSUED. 
    */
  var IssuedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The algorithm that was used to generate the public-private key pair.
    */
  var KeyAlgorithm: js.UndefOr[typings.awsSdk.clientsAcmMod.KeyAlgorithm] = js.undefined
  
  /**
    * A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose of the public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE, KEY_ENCHIPHERMENT, NON_REPUDIATION, and more.
    */
  var KeyUsages: js.UndefOr[KeyUsageNames] = js.undefined
  
  /**
    * The time after which the certificate is not valid.
    */
  var NotAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time before which the certificate is not valid.
    */
  var NotBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies whether the certificate is eligible for renewal. At this time, only exported private certificates can be renewed with the RenewCertificate command.
    */
  var RenewalEligibility: js.UndefOr[typings.awsSdk.clientsAcmMod.RenewalEligibility] = js.undefined
  
  /**
    * The time at which the certificate was revoked. This value exists only when the certificate status is REVOKED. 
    */
  var RevokedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the certificate. A certificate enters status PENDING_VALIDATION upon being requested, unless it fails for any of the reasons given in the troubleshooting topic Certificate request fails. ACM makes repeated attempts to validate a certificate for 72 hours and then times out. If a certificate shows status FAILED or VALIDATION_TIMED_OUT, delete the request, correct the issue with DNS validation or Email validation, and try again. If validation succeeds, the certificate enters status ISSUED. 
    */
  var Status: js.UndefOr[CertificateStatus] = js.undefined
  
  /**
    * One or more domain names (subject alternative names) included in the certificate. This list contains the domain names that are bound to the public key that is contained in the certificate. The subject alternative names include the canonical domain name (CN) of the certificate and additional domain names that can be used to connect to the website.  When called by ListCertificates, this parameter will only return the first 100 subject alternative names included in the certificate. To display the full list of subject alternative names, use DescribeCertificate.
    */
  var SubjectAlternativeNameSummaries: js.UndefOr[DomainList] = js.undefined
  
  /**
    * The source of the certificate. For certificates provided by ACM, this value is AMAZON_ISSUED. For certificates that you imported with ImportCertificate, this value is IMPORTED. ACM does not provide managed renewal for imported certificates. For more information about the differences between certificates that you import and those that ACM provides, see Importing Certificates in the Certificate Manager User Guide. 
    */
  var Type: js.UndefOr[CertificateType] = js.undefined
}
object CertificateSummary {
  
  inline def apply(): CertificateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateSummary]
  }
  
  extension [Self <: CertificateSummary](x: Self) {
    
    inline def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDomainName(value: DomainNameString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setExported(value: NullableBoolean): Self = StObject.set(x, "Exported", value.asInstanceOf[js.Any])
    
    inline def setExportedUndefined: Self = StObject.set(x, "Exported", js.undefined)
    
    inline def setExtendedKeyUsages(value: ExtendedKeyUsageNames): Self = StObject.set(x, "ExtendedKeyUsages", value.asInstanceOf[js.Any])
    
    inline def setExtendedKeyUsagesUndefined: Self = StObject.set(x, "ExtendedKeyUsages", js.undefined)
    
    inline def setExtendedKeyUsagesVarargs(value: ExtendedKeyUsageName*): Self = StObject.set(x, "ExtendedKeyUsages", js.Array(value*))
    
    inline def setHasAdditionalSubjectAlternativeNames(value: NullableBoolean): Self = StObject.set(x, "HasAdditionalSubjectAlternativeNames", value.asInstanceOf[js.Any])
    
    inline def setHasAdditionalSubjectAlternativeNamesUndefined: Self = StObject.set(x, "HasAdditionalSubjectAlternativeNames", js.undefined)
    
    inline def setImportedAt(value: js.Date): Self = StObject.set(x, "ImportedAt", value.asInstanceOf[js.Any])
    
    inline def setImportedAtUndefined: Self = StObject.set(x, "ImportedAt", js.undefined)
    
    inline def setInUse(value: NullableBoolean): Self = StObject.set(x, "InUse", value.asInstanceOf[js.Any])
    
    inline def setInUseUndefined: Self = StObject.set(x, "InUse", js.undefined)
    
    inline def setIssuedAt(value: js.Date): Self = StObject.set(x, "IssuedAt", value.asInstanceOf[js.Any])
    
    inline def setIssuedAtUndefined: Self = StObject.set(x, "IssuedAt", js.undefined)
    
    inline def setKeyAlgorithm(value: KeyAlgorithm): Self = StObject.set(x, "KeyAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyAlgorithmUndefined: Self = StObject.set(x, "KeyAlgorithm", js.undefined)
    
    inline def setKeyUsages(value: KeyUsageNames): Self = StObject.set(x, "KeyUsages", value.asInstanceOf[js.Any])
    
    inline def setKeyUsagesUndefined: Self = StObject.set(x, "KeyUsages", js.undefined)
    
    inline def setKeyUsagesVarargs(value: KeyUsageName*): Self = StObject.set(x, "KeyUsages", js.Array(value*))
    
    inline def setNotAfter(value: js.Date): Self = StObject.set(x, "NotAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "NotAfter", js.undefined)
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "NotBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "NotBefore", js.undefined)
    
    inline def setRenewalEligibility(value: RenewalEligibility): Self = StObject.set(x, "RenewalEligibility", value.asInstanceOf[js.Any])
    
    inline def setRenewalEligibilityUndefined: Self = StObject.set(x, "RenewalEligibility", js.undefined)
    
    inline def setRevokedAt(value: js.Date): Self = StObject.set(x, "RevokedAt", value.asInstanceOf[js.Any])
    
    inline def setRevokedAtUndefined: Self = StObject.set(x, "RevokedAt", js.undefined)
    
    inline def setStatus(value: CertificateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubjectAlternativeNameSummaries(value: DomainList): Self = StObject.set(x, "SubjectAlternativeNameSummaries", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeNameSummariesUndefined: Self = StObject.set(x, "SubjectAlternativeNameSummaries", js.undefined)
    
    inline def setSubjectAlternativeNameSummariesVarargs(value: DomainNameString*): Self = StObject.set(x, "SubjectAlternativeNameSummaries", js.Array(value*))
    
    inline def setType(value: CertificateType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
