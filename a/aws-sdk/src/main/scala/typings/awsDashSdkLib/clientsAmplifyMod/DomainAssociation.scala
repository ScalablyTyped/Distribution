package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainAssociation extends js.Object {
  /**
    *  DNS Record for certificate verification. 
    */
  var certificateVerificationDNSRecord: js.UndefOr[CertificateVerificationDNSRecord] = js.undefined
  /**
    *  ARN for the Domain Association. 
    */
  var domainAssociationArn: DomainAssociationArn
  /**
    *  Name of the domain. 
    */
  var domainName: DomainName
  /**
    *  Status fo the Domain Association. 
    */
  var domainStatus: DomainStatus
  /**
    *  Enables automated creation of Subdomains for branches. 
    */
  var enableAutoSubDomain: EnableAutoSubDomain
  /**
    *  Reason for the current status of the Domain Association. 
    */
  var statusReason: StatusReason
  /**
    *  Subdomains for the Domain Association. 
    */
  var subDomains: SubDomains
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
    val __obj = js.Dynamic.literal(domainAssociationArn = domainAssociationArn, domainName = domainName, domainStatus = domainStatus.asInstanceOf[js.Any], enableAutoSubDomain = enableAutoSubDomain, statusReason = statusReason, subDomains = subDomains)
    if (certificateVerificationDNSRecord != null) __obj.updateDynamic("certificateVerificationDNSRecord")(certificateVerificationDNSRecord)
    __obj.asInstanceOf[DomainAssociation]
  }
}

