package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerTlsCertificate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the SSL/TLS certificate.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The time when you created your SSL/TLS certificate.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * The domain name for your SSL/TLS certificate.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
  /**
    * An array of LoadBalancerTlsCertificateDomainValidationRecord objects describing the records.
    */
  var domainValidationRecords: js.UndefOr[LoadBalancerTlsCertificateDomainValidationRecordList] = js.undefined
  /**
    * The reason for the SSL/TLS certificate validation failure.
    */
  var failureReason: js.UndefOr[LoadBalancerTlsCertificateFailureReason] = js.undefined
  /**
    * When true, the SSL/TLS certificate is attached to the Lightsail load balancer.
    */
  var isAttached: js.UndefOr[Boolean] = js.undefined
  /**
    * The time when the SSL/TLS certificate was issued.
    */
  var issuedAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * The issuer of the certificate.
    */
  var issuer: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The algorithm that was used to generate the key pair (the public and private key).
    */
  var keyAlgorithm: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The load balancer name where your SSL/TLS certificate is attached.
    */
  var loadBalancerName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The AWS Region and Availability Zone where you created your certificate.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  /**
    * The name of the SSL/TLS certificate (e.g., my-certificate).
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The timestamp when the SSL/TLS certificate expires.
    */
  var notAfter: js.UndefOr[IsoDate] = js.undefined
  /**
    * The timestamp when the SSL/TLS certificate is first valid.
    */
  var notBefore: js.UndefOr[IsoDate] = js.undefined
  /**
    * An object containing information about the status of Lightsail's managed renewal for the certificate.
    */
  var renewalSummary: js.UndefOr[LoadBalancerTlsCertificateRenewalSummary] = js.undefined
  /**
    * The resource type (e.g., LoadBalancerTlsCertificate).     Instance  - A Lightsail instance (a virtual private server)     StaticIp  - A static IP address     KeyPair  - The key pair used to connect to a Lightsail instance     InstanceSnapshot  - A Lightsail instance snapshot     Domain  - A DNS zone     PeeredVpc  - A peered VPC     LoadBalancer  - A Lightsail load balancer     LoadBalancerTlsCertificate  - An SSL/TLS certificate associated with a Lightsail load balancer     Disk  - A Lightsail block storage disk     DiskSnapshot  - A block storage disk snapshot  
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The reason the certificate was revoked. Valid values are below.
    */
  var revocationReason: js.UndefOr[LoadBalancerTlsCertificateRevocationReason] = js.undefined
  /**
    * The timestamp when the SSL/TLS certificate was revoked.
    */
  var revokedAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * The serial number of the certificate.
    */
  var serial: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The algorithm that was used to sign the certificate.
    */
  var signatureAlgorithm: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The status of the SSL/TLS certificate. Valid values are below.
    */
  var status: js.UndefOr[LoadBalancerTlsCertificateStatus] = js.undefined
  /**
    * The name of the entity that is associated with the public key contained in the certificate.
    */
  var subject: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * One or more domains or subdomains included in the certificate. This list contains the domain names that are bound to the public key that is contained in the certificate. The subject alternative names include the canonical domain name (CNAME) of the certificate and additional domain names that can be used to connect to the website, such as example.com, www.example.com, or m.example.com.
    */
  var subjectAlternativeNames: js.UndefOr[StringList] = js.undefined
  /**
    * The support code. Include this code in your email to support when you have questions about your Lightsail load balancer or SSL/TLS certificate. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object LoadBalancerTlsCertificate {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    createdAt: IsoDate = null,
    domainName: DomainName = null,
    domainValidationRecords: LoadBalancerTlsCertificateDomainValidationRecordList = null,
    failureReason: LoadBalancerTlsCertificateFailureReason = null,
    isAttached: js.UndefOr[Boolean] = js.undefined,
    issuedAt: IsoDate = null,
    issuer: NonEmptyString = null,
    keyAlgorithm: NonEmptyString = null,
    loadBalancerName: ResourceName = null,
    location: ResourceLocation = null,
    name: ResourceName = null,
    notAfter: IsoDate = null,
    notBefore: IsoDate = null,
    renewalSummary: LoadBalancerTlsCertificateRenewalSummary = null,
    resourceType: ResourceType = null,
    revocationReason: LoadBalancerTlsCertificateRevocationReason = null,
    revokedAt: IsoDate = null,
    serial: NonEmptyString = null,
    signatureAlgorithm: NonEmptyString = null,
    status: LoadBalancerTlsCertificateStatus = null,
    subject: NonEmptyString = null,
    subjectAlternativeNames: StringList = null,
    supportCode: String = null,
    tags: TagList = null
  ): LoadBalancerTlsCertificate = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (domainName != null) __obj.updateDynamic("domainName")(domainName)
    if (domainValidationRecords != null) __obj.updateDynamic("domainValidationRecords")(domainValidationRecords)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (!js.isUndefined(isAttached)) __obj.updateDynamic("isAttached")(isAttached)
    if (issuedAt != null) __obj.updateDynamic("issuedAt")(issuedAt)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (keyAlgorithm != null) __obj.updateDynamic("keyAlgorithm")(keyAlgorithm)
    if (loadBalancerName != null) __obj.updateDynamic("loadBalancerName")(loadBalancerName)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (notAfter != null) __obj.updateDynamic("notAfter")(notAfter)
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore)
    if (renewalSummary != null) __obj.updateDynamic("renewalSummary")(renewalSummary)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (revocationReason != null) __obj.updateDynamic("revocationReason")(revocationReason.asInstanceOf[js.Any])
    if (revokedAt != null) __obj.updateDynamic("revokedAt")(revokedAt)
    if (serial != null) __obj.updateDynamic("serial")(serial)
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (subjectAlternativeNames != null) __obj.updateDynamic("subjectAlternativeNames")(subjectAlternativeNames)
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[LoadBalancerTlsCertificate]
  }
}

