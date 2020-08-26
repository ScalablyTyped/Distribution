package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateDetail extends js.Object {
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
  implicit class CertificateDetailOps[Self <: CertificateDetail] (val x: Self) extends AnyVal {
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
    def setCertificateArn(value: Arn): Self = this.set("CertificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateArn: Self = this.set("CertificateArn", js.undefined)
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = this.set("CertificateAuthorityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateAuthorityArn: Self = this.set("CertificateAuthorityArn", js.undefined)
    @scala.inline
    def setCreatedAt(value: TStamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setDomainName(value: DomainNameString): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    @scala.inline
    def setDomainValidationOptionsVarargs(value: DomainValidation*): Self = this.set("DomainValidationOptions", js.Array(value :_*))
    @scala.inline
    def setDomainValidationOptions(value: DomainValidationList): Self = this.set("DomainValidationOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainValidationOptions: Self = this.set("DomainValidationOptions", js.undefined)
    @scala.inline
    def setExtendedKeyUsagesVarargs(value: ExtendedKeyUsage*): Self = this.set("ExtendedKeyUsages", js.Array(value :_*))
    @scala.inline
    def setExtendedKeyUsages(value: ExtendedKeyUsageList): Self = this.set("ExtendedKeyUsages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedKeyUsages: Self = this.set("ExtendedKeyUsages", js.undefined)
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    @scala.inline
    def setImportedAt(value: TStamp): Self = this.set("ImportedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportedAt: Self = this.set("ImportedAt", js.undefined)
    @scala.inline
    def setInUseByVarargs(value: String*): Self = this.set("InUseBy", js.Array(value :_*))
    @scala.inline
    def setInUseBy(value: InUseList): Self = this.set("InUseBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInUseBy: Self = this.set("InUseBy", js.undefined)
    @scala.inline
    def setIssuedAt(value: TStamp): Self = this.set("IssuedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuedAt: Self = this.set("IssuedAt", js.undefined)
    @scala.inline
    def setIssuer(value: String): Self = this.set("Issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuer: Self = this.set("Issuer", js.undefined)
    @scala.inline
    def setKeyAlgorithm(value: KeyAlgorithm): Self = this.set("KeyAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyAlgorithm: Self = this.set("KeyAlgorithm", js.undefined)
    @scala.inline
    def setKeyUsagesVarargs(value: KeyUsage*): Self = this.set("KeyUsages", js.Array(value :_*))
    @scala.inline
    def setKeyUsages(value: KeyUsageList): Self = this.set("KeyUsages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyUsages: Self = this.set("KeyUsages", js.undefined)
    @scala.inline
    def setNotAfter(value: TStamp): Self = this.set("NotAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotAfter: Self = this.set("NotAfter", js.undefined)
    @scala.inline
    def setNotBefore(value: TStamp): Self = this.set("NotBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotBefore: Self = this.set("NotBefore", js.undefined)
    @scala.inline
    def setOptions(value: CertificateOptions): Self = this.set("Options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("Options", js.undefined)
    @scala.inline
    def setRenewalEligibility(value: RenewalEligibility): Self = this.set("RenewalEligibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenewalEligibility: Self = this.set("RenewalEligibility", js.undefined)
    @scala.inline
    def setRenewalSummary(value: RenewalSummary): Self = this.set("RenewalSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenewalSummary: Self = this.set("RenewalSummary", js.undefined)
    @scala.inline
    def setRevocationReason(value: RevocationReason): Self = this.set("RevocationReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevocationReason: Self = this.set("RevocationReason", js.undefined)
    @scala.inline
    def setRevokedAt(value: TStamp): Self = this.set("RevokedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevokedAt: Self = this.set("RevokedAt", js.undefined)
    @scala.inline
    def setSerial(value: String): Self = this.set("Serial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerial: Self = this.set("Serial", js.undefined)
    @scala.inline
    def setSignatureAlgorithm(value: String): Self = this.set("SignatureAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignatureAlgorithm: Self = this.set("SignatureAlgorithm", js.undefined)
    @scala.inline
    def setStatus(value: CertificateStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("Subject", js.undefined)
    @scala.inline
    def setSubjectAlternativeNamesVarargs(value: DomainNameString*): Self = this.set("SubjectAlternativeNames", js.Array(value :_*))
    @scala.inline
    def setSubjectAlternativeNames(value: DomainList): Self = this.set("SubjectAlternativeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubjectAlternativeNames: Self = this.set("SubjectAlternativeNames", js.undefined)
    @scala.inline
    def setType(value: CertificateType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

