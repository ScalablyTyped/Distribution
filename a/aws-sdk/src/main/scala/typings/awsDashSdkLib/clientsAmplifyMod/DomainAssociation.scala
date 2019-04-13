package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainAssociation extends js.Object {
  /**
    *  DNS Record for certificate verification. 
    */
  var certificateVerificationDNSRecord: CertificateVerificationDNSRecord
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
    certificateVerificationDNSRecord: CertificateVerificationDNSRecord,
    domainAssociationArn: DomainAssociationArn,
    domainName: DomainName,
    domainStatus: DomainStatus,
    enableAutoSubDomain: EnableAutoSubDomain,
    statusReason: StatusReason,
    subDomains: SubDomains
  ): DomainAssociation = {
    val __obj = js.Dynamic.literal(certificateVerificationDNSRecord = certificateVerificationDNSRecord, domainAssociationArn = domainAssociationArn, domainName = domainName, domainStatus = domainStatus.asInstanceOf[js.Any], enableAutoSubDomain = enableAutoSubDomain, statusReason = statusReason, subDomains = subDomains)
  
    __obj.asInstanceOf[DomainAssociation]
  }
}

