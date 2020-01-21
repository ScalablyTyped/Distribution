package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainAssociation extends js.Object {
  /**
    *  DNS Record for certificate verification. 
    */
  var certificateVerificationDNSRecord: js.UndefOr[CertificateVerificationDNSRecord] = js.native
  /**
    *  ARN for the Domain Association. 
    */
  var domainAssociationArn: DomainAssociationArn = js.native
  /**
    *  Name of the domain. 
    */
  var domainName: DomainName = js.native
  /**
    *  Status fo the Domain Association. 
    */
  var domainStatus: DomainStatus = js.native
  /**
    *  Enables automated creation of Subdomains for branches. (Currently not supported) 
    */
  var enableAutoSubDomain: EnableAutoSubDomain = js.native
  /**
    *  Reason for the current status of the Domain Association. 
    */
  var statusReason: StatusReason = js.native
  /**
    *  Subdomains for the Domain Association. 
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
    certificateVerificationDNSRecord: CertificateVerificationDNSRecord = null
  ): DomainAssociation = {
    val __obj = js.Dynamic.literal(domainAssociationArn = domainAssociationArn.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], domainStatus = domainStatus.asInstanceOf[js.Any], enableAutoSubDomain = enableAutoSubDomain.asInstanceOf[js.Any], statusReason = statusReason.asInstanceOf[js.Any], subDomains = subDomains.asInstanceOf[js.Any])
    if (certificateVerificationDNSRecord != null) __obj.updateDynamic("certificateVerificationDNSRecord")(certificateVerificationDNSRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainAssociation]
  }
}

