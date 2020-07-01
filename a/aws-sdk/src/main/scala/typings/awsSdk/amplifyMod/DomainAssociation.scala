package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainAssociation extends js.Object {
  /**
    *  Sets branch patterns for automatic subdomain creation. 
    */
  var autoSubDomainCreationPatterns: js.UndefOr[AutoSubDomainCreationPatterns] = js.native
  /**
    *  The required AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) for automatically creating subdomains. 
    */
  var autoSubDomainIAMRole: js.UndefOr[AutoSubDomainIAMRole] = js.native
  /**
    *  The DNS record for certificate verification. 
    */
  var certificateVerificationDNSRecord: js.UndefOr[CertificateVerificationDNSRecord] = js.native
  /**
    *  The Amazon Resource Name (ARN) for the domain association. 
    */
  var domainAssociationArn: DomainAssociationArn = js.native
  /**
    *  The name of the domain. 
    */
  var domainName: DomainName = js.native
  /**
    *  The current status of the domain association. 
    */
  var domainStatus: DomainStatus = js.native
  /**
    *  Enables the automated creation of subdomains for branches. 
    */
  var enableAutoSubDomain: EnableAutoSubDomain = js.native
  /**
    *  The reason for the current status of the domain association. 
    */
  var statusReason: StatusReason = js.native
  /**
    *  The subdomains for the domain association. 
    */
  var subDomains: SubDomains = js.native
}

object DomainAssociation {
  @scala.inline
  def apply(
    domainAssociationArn: DomainAssociationArn,
    domainName: DomainName,
    domainStatus: DomainStatus,
    enableAutoSubDomain: EnableAutoSubDomain,
    statusReason: StatusReason,
    subDomains: SubDomains,
    autoSubDomainCreationPatterns: AutoSubDomainCreationPatterns = null,
    autoSubDomainIAMRole: AutoSubDomainIAMRole = null,
    certificateVerificationDNSRecord: CertificateVerificationDNSRecord = null
  ): DomainAssociation = {
    val __obj = js.Dynamic.literal(domainAssociationArn = domainAssociationArn.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], domainStatus = domainStatus.asInstanceOf[js.Any], enableAutoSubDomain = enableAutoSubDomain.asInstanceOf[js.Any], statusReason = statusReason.asInstanceOf[js.Any], subDomains = subDomains.asInstanceOf[js.Any])
    if (autoSubDomainCreationPatterns != null) __obj.updateDynamic("autoSubDomainCreationPatterns")(autoSubDomainCreationPatterns.asInstanceOf[js.Any])
    if (autoSubDomainIAMRole != null) __obj.updateDynamic("autoSubDomainIAMRole")(autoSubDomainIAMRole.asInstanceOf[js.Any])
    if (certificateVerificationDNSRecord != null) __obj.updateDynamic("certificateVerificationDNSRecord")(certificateVerificationDNSRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainAssociation]
  }
}

