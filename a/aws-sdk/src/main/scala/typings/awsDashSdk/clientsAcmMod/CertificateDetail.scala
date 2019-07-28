package typings.awsDashSdk.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateDetail extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the certificate. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var CertificateArn: js.UndefOr[Arn] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the ACM PCA private certificate authority (CA) that issued the certificate. This has the following format:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.undefined
  /**
    * The time at which the certificate was requested. This value exists only when the certificate type is AMAZON_ISSUED. 
    */
  var CreatedAt: js.UndefOr[TStamp] = js.undefined
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
    * The reason the certificate request failed. This value exists only when the certificate status is FAILED. For more information, see Certificate Request Failed in the AWS Certificate Manager User Guide. 
    */
  var FailureReason: js.UndefOr[typings.awsDashSdk.clientsAcmMod.FailureReason] = js.undefined
  /**
    * The date and time at which the certificate was imported. This value exists only when the certificate type is IMPORTED. 
    */
  var ImportedAt: js.UndefOr[TStamp] = js.undefined
  /**
    * A list of ARNs for the AWS resources that are using the certificate. A certificate can be used by multiple AWS resources. 
    */
  var InUseBy: js.UndefOr[InUseList] = js.undefined
  /**
    * The time at which the certificate was issued. This value exists only when the certificate type is AMAZON_ISSUED. 
    */
  var IssuedAt: js.UndefOr[TStamp] = js.undefined
  /**
    * The name of the certificate authority that issued and signed the certificate.
    */
  var Issuer: js.UndefOr[String] = js.undefined
  /**
    * The algorithm that was used to generate the public-private key pair.
    */
  var KeyAlgorithm: js.UndefOr[typings.awsDashSdk.clientsAcmMod.KeyAlgorithm] = js.undefined
  /**
    * A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose of the public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE, KEY_ENCHIPHERMENT, NON_REPUDIATION, and more.
    */
  var KeyUsages: js.UndefOr[KeyUsageList] = js.undefined
  /**
    * The time after which the certificate is not valid.
    */
  var NotAfter: js.UndefOr[TStamp] = js.undefined
  /**
    * The time before which the certificate is not valid.
    */
  var NotBefore: js.UndefOr[TStamp] = js.undefined
  /**
    * Value that specifies whether to add the certificate to a transparency log. Certificate transparency makes it possible to detect SSL certificates that have been mistakenly or maliciously issued. A browser might respond to certificate that has not been logged by showing an error message. The logs are cryptographically secure. 
    */
  var Options: js.UndefOr[CertificateOptions] = js.undefined
  /**
    * Specifies whether the certificate is eligible for renewal. At this time, only exported private certificates can be renewed with the RenewCertificate command.
    */
  var RenewalEligibility: js.UndefOr[typings.awsDashSdk.clientsAcmMod.RenewalEligibility] = js.undefined
  /**
    * Contains information about the status of ACM's managed renewal for the certificate. This field exists only when the certificate type is AMAZON_ISSUED.
    */
  var RenewalSummary: js.UndefOr[typings.awsDashSdk.clientsAcmMod.RenewalSummary] = js.undefined
  /**
    * The reason the certificate was revoked. This value exists only when the certificate status is REVOKED. 
    */
  var RevocationReason: js.UndefOr[typings.awsDashSdk.clientsAcmMod.RevocationReason] = js.undefined
  /**
    * The time at which the certificate was revoked. This value exists only when the certificate status is REVOKED. 
    */
  var RevokedAt: js.UndefOr[TStamp] = js.undefined
  /**
    * The serial number of the certificate.
    */
  var Serial: js.UndefOr[String] = js.undefined
  /**
    * The algorithm that was used to sign the certificate.
    */
  var SignatureAlgorithm: js.UndefOr[String] = js.undefined
  /**
    * The status of the certificate.
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
    * The source of the certificate. For certificates provided by ACM, this value is AMAZON_ISSUED. For certificates that you imported with ImportCertificate, this value is IMPORTED. ACM does not provide managed renewal for imported certificates. For more information about the differences between certificates that you import and those that ACM provides, see Importing Certificates in the AWS Certificate Manager User Guide. 
    */
  var Type: js.UndefOr[CertificateType] = js.undefined
}

object CertificateDetail {
  @scala.inline
  def apply(
    CertificateArn: Arn = null,
    CertificateAuthorityArn: Arn = null,
    CreatedAt: TStamp = null,
    DomainName: DomainNameString = null,
    DomainValidationOptions: DomainValidationList = null,
    ExtendedKeyUsages: ExtendedKeyUsageList = null,
    FailureReason: FailureReason = null,
    ImportedAt: TStamp = null,
    InUseBy: InUseList = null,
    IssuedAt: TStamp = null,
    Issuer: String = null,
    KeyAlgorithm: KeyAlgorithm = null,
    KeyUsages: KeyUsageList = null,
    NotAfter: TStamp = null,
    NotBefore: TStamp = null,
    Options: CertificateOptions = null,
    RenewalEligibility: RenewalEligibility = null,
    RenewalSummary: RenewalSummary = null,
    RevocationReason: RevocationReason = null,
    RevokedAt: TStamp = null,
    Serial: String = null,
    SignatureAlgorithm: String = null,
    Status: CertificateStatus = null,
    Subject: String = null,
    SubjectAlternativeNames: DomainList = null,
    Type: CertificateType = null
  ): CertificateDetail = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    if (CertificateAuthorityArn != null) __obj.updateDynamic("CertificateAuthorityArn")(CertificateAuthorityArn)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    if (DomainValidationOptions != null) __obj.updateDynamic("DomainValidationOptions")(DomainValidationOptions)
    if (ExtendedKeyUsages != null) __obj.updateDynamic("ExtendedKeyUsages")(ExtendedKeyUsages)
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (ImportedAt != null) __obj.updateDynamic("ImportedAt")(ImportedAt)
    if (InUseBy != null) __obj.updateDynamic("InUseBy")(InUseBy)
    if (IssuedAt != null) __obj.updateDynamic("IssuedAt")(IssuedAt)
    if (Issuer != null) __obj.updateDynamic("Issuer")(Issuer)
    if (KeyAlgorithm != null) __obj.updateDynamic("KeyAlgorithm")(KeyAlgorithm.asInstanceOf[js.Any])
    if (KeyUsages != null) __obj.updateDynamic("KeyUsages")(KeyUsages)
    if (NotAfter != null) __obj.updateDynamic("NotAfter")(NotAfter)
    if (NotBefore != null) __obj.updateDynamic("NotBefore")(NotBefore)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    if (RenewalEligibility != null) __obj.updateDynamic("RenewalEligibility")(RenewalEligibility.asInstanceOf[js.Any])
    if (RenewalSummary != null) __obj.updateDynamic("RenewalSummary")(RenewalSummary)
    if (RevocationReason != null) __obj.updateDynamic("RevocationReason")(RevocationReason.asInstanceOf[js.Any])
    if (RevokedAt != null) __obj.updateDynamic("RevokedAt")(RevokedAt)
    if (Serial != null) __obj.updateDynamic("Serial")(Serial)
    if (SignatureAlgorithm != null) __obj.updateDynamic("SignatureAlgorithm")(SignatureAlgorithm)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    if (SubjectAlternativeNames != null) __obj.updateDynamic("SubjectAlternativeNames")(SubjectAlternativeNames)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateDetail]
  }
}

