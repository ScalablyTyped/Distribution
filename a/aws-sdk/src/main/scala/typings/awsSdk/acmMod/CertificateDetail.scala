package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateDetail extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the certificate. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var CertificateArn: js.UndefOr[Arn] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the ACM PCA private certificate authority (CA) that issued the certificate. This has the following format:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.native
  
  /**
    * The time at which the certificate was requested. This value exists only when the certificate type is AMAZON_ISSUED. 
    */
  var CreatedAt: js.UndefOr[TStamp] = js.native
  
  /**
    * The fully qualified domain name for the certificate, such as www.example.com or example.com.
    */
  var DomainName: js.UndefOr[DomainNameString] = js.native
  
  /**
    * Contains information about the initial validation of each domain name that occurs as a result of the RequestCertificate request. This field exists only when the certificate type is AMAZON_ISSUED. 
    */
  var DomainValidationOptions: js.UndefOr[DomainValidationList] = js.native
  
  /**
    * Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for which the certificate public key can be used and consists of a name and an object identifier (OID). 
    */
  var ExtendedKeyUsages: js.UndefOr[ExtendedKeyUsageList] = js.native
  
  /**
    * The reason the certificate request failed. This value exists only when the certificate status is FAILED. For more information, see Certificate Request Failed in the AWS Certificate Manager User Guide. 
    */
  var FailureReason: js.UndefOr[typings.awsSdk.acmMod.FailureReason] = js.native
  
  /**
    * The date and time at which the certificate was imported. This value exists only when the certificate type is IMPORTED. 
    */
  var ImportedAt: js.UndefOr[TStamp] = js.native
  
  /**
    * A list of ARNs for the AWS resources that are using the certificate. A certificate can be used by multiple AWS resources. 
    */
  var InUseBy: js.UndefOr[InUseList] = js.native
  
  /**
    * The time at which the certificate was issued. This value exists only when the certificate type is AMAZON_ISSUED. 
    */
  var IssuedAt: js.UndefOr[TStamp] = js.native
  
  /**
    * The name of the certificate authority that issued and signed the certificate.
    */
  var Issuer: js.UndefOr[String] = js.native
  
  /**
    * The algorithm that was used to generate the public-private key pair.
    */
  var KeyAlgorithm: js.UndefOr[typings.awsSdk.acmMod.KeyAlgorithm] = js.native
  
  /**
    * A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose of the public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE, KEY_ENCHIPHERMENT, NON_REPUDIATION, and more.
    */
  var KeyUsages: js.UndefOr[KeyUsageList] = js.native
  
  /**
    * The time after which the certificate is not valid.
    */
  var NotAfter: js.UndefOr[TStamp] = js.native
  
  /**
    * The time before which the certificate is not valid.
    */
  var NotBefore: js.UndefOr[TStamp] = js.native
  
  /**
    * Value that specifies whether to add the certificate to a transparency log. Certificate transparency makes it possible to detect SSL certificates that have been mistakenly or maliciously issued. A browser might respond to certificate that has not been logged by showing an error message. The logs are cryptographically secure. 
    */
  var Options: js.UndefOr[CertificateOptions] = js.native
  
  /**
    * Specifies whether the certificate is eligible for renewal. At this time, only exported private certificates can be renewed with the RenewCertificate command.
    */
  var RenewalEligibility: js.UndefOr[typings.awsSdk.acmMod.RenewalEligibility] = js.native
  
  /**
    * Contains information about the status of ACM's managed renewal for the certificate. This field exists only when the certificate type is AMAZON_ISSUED.
    */
  var RenewalSummary: js.UndefOr[typings.awsSdk.acmMod.RenewalSummary] = js.native
  
  /**
    * The reason the certificate was revoked. This value exists only when the certificate status is REVOKED. 
    */
  var RevocationReason: js.UndefOr[typings.awsSdk.acmMod.RevocationReason] = js.native
  
  /**
    * The time at which the certificate was revoked. This value exists only when the certificate status is REVOKED. 
    */
  var RevokedAt: js.UndefOr[TStamp] = js.native
  
  /**
    * The serial number of the certificate.
    */
  var Serial: js.UndefOr[String] = js.native
  
  /**
    * The algorithm that was used to sign the certificate.
    */
  var SignatureAlgorithm: js.UndefOr[String] = js.native
  
  /**
    * The status of the certificate.
    */
  var Status: js.UndefOr[CertificateStatus] = js.native
  
  /**
    * The name of the entity that is associated with the public key contained in the certificate.
    */
  var Subject: js.UndefOr[String] = js.native
  
  /**
    * One or more domain names (subject alternative names) included in the certificate. This list contains the domain names that are bound to the public key that is contained in the certificate. The subject alternative names include the canonical domain name (CN) of the certificate and additional domain names that can be used to connect to the website. 
    */
  var SubjectAlternativeNames: js.UndefOr[DomainList] = js.native
  
  /**
    * The source of the certificate. For certificates provided by ACM, this value is AMAZON_ISSUED. For certificates that you imported with ImportCertificate, this value is IMPORTED. ACM does not provide managed renewal for imported certificates. For more information about the differences between certificates that you import and those that ACM provides, see Importing Certificates in the AWS Certificate Manager User Guide. 
    */
  var Type: js.UndefOr[CertificateType] = js.native
}
object CertificateDetail {
  
  @scala.inline
  def apply(): CertificateDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateDetail]
  }
  
  @scala.inline
  implicit class CertificateDetailMutableBuilder[Self <: CertificateDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityArnUndefined: Self = StObject.set(x, "CertificateAuthorityArn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: TStamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainNameString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setDomainValidationOptions(value: DomainValidationList): Self = StObject.set(x, "DomainValidationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainValidationOptionsUndefined: Self = StObject.set(x, "DomainValidationOptions", js.undefined)
    
    @scala.inline
    def setDomainValidationOptionsVarargs(value: DomainValidation*): Self = StObject.set(x, "DomainValidationOptions", js.Array(value :_*))
    
    @scala.inline
    def setExtendedKeyUsages(value: ExtendedKeyUsageList): Self = StObject.set(x, "ExtendedKeyUsages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedKeyUsagesUndefined: Self = StObject.set(x, "ExtendedKeyUsages", js.undefined)
    
    @scala.inline
    def setExtendedKeyUsagesVarargs(value: ExtendedKeyUsage*): Self = StObject.set(x, "ExtendedKeyUsages", js.Array(value :_*))
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setImportedAt(value: TStamp): Self = StObject.set(x, "ImportedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportedAtUndefined: Self = StObject.set(x, "ImportedAt", js.undefined)
    
    @scala.inline
    def setInUseBy(value: InUseList): Self = StObject.set(x, "InUseBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInUseByUndefined: Self = StObject.set(x, "InUseBy", js.undefined)
    
    @scala.inline
    def setInUseByVarargs(value: String*): Self = StObject.set(x, "InUseBy", js.Array(value :_*))
    
    @scala.inline
    def setIssuedAt(value: TStamp): Self = StObject.set(x, "IssuedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuedAtUndefined: Self = StObject.set(x, "IssuedAt", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = StObject.set(x, "Issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "Issuer", js.undefined)
    
    @scala.inline
    def setKeyAlgorithm(value: KeyAlgorithm): Self = StObject.set(x, "KeyAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAlgorithmUndefined: Self = StObject.set(x, "KeyAlgorithm", js.undefined)
    
    @scala.inline
    def setKeyUsages(value: KeyUsageList): Self = StObject.set(x, "KeyUsages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUsagesUndefined: Self = StObject.set(x, "KeyUsages", js.undefined)
    
    @scala.inline
    def setKeyUsagesVarargs(value: KeyUsage*): Self = StObject.set(x, "KeyUsages", js.Array(value :_*))
    
    @scala.inline
    def setNotAfter(value: TStamp): Self = StObject.set(x, "NotAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAfterUndefined: Self = StObject.set(x, "NotAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: TStamp): Self = StObject.set(x, "NotBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBeforeUndefined: Self = StObject.set(x, "NotBefore", js.undefined)
    
    @scala.inline
    def setOptions(value: CertificateOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    @scala.inline
    def setRenewalEligibility(value: RenewalEligibility): Self = StObject.set(x, "RenewalEligibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalEligibilityUndefined: Self = StObject.set(x, "RenewalEligibility", js.undefined)
    
    @scala.inline
    def setRenewalSummary(value: RenewalSummary): Self = StObject.set(x, "RenewalSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenewalSummaryUndefined: Self = StObject.set(x, "RenewalSummary", js.undefined)
    
    @scala.inline
    def setRevocationReason(value: RevocationReason): Self = StObject.set(x, "RevocationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocationReasonUndefined: Self = StObject.set(x, "RevocationReason", js.undefined)
    
    @scala.inline
    def setRevokedAt(value: TStamp): Self = StObject.set(x, "RevokedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevokedAtUndefined: Self = StObject.set(x, "RevokedAt", js.undefined)
    
    @scala.inline
    def setSerial(value: String): Self = StObject.set(x, "Serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialUndefined: Self = StObject.set(x, "Serial", js.undefined)
    
    @scala.inline
    def setSignatureAlgorithm(value: String): Self = StObject.set(x, "SignatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureAlgorithmUndefined: Self = StObject.set(x, "SignatureAlgorithm", js.undefined)
    
    @scala.inline
    def setStatus(value: CertificateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectAlternativeNames(value: DomainList): Self = StObject.set(x, "SubjectAlternativeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectAlternativeNamesUndefined: Self = StObject.set(x, "SubjectAlternativeNames", js.undefined)
    
    @scala.inline
    def setSubjectAlternativeNamesVarargs(value: DomainNameString*): Self = StObject.set(x, "SubjectAlternativeNames", js.Array(value :_*))
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
    
    @scala.inline
    def setType(value: CertificateType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
