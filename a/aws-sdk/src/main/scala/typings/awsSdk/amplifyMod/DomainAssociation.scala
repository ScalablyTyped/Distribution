package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    subDomains: SubDomains
  ): DomainAssociation = {
    val __obj = js.Dynamic.literal(domainAssociationArn = domainAssociationArn.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], domainStatus = domainStatus.asInstanceOf[js.Any], enableAutoSubDomain = enableAutoSubDomain.asInstanceOf[js.Any], statusReason = statusReason.asInstanceOf[js.Any], subDomains = subDomains.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainAssociation]
  }
  
  @scala.inline
  implicit class DomainAssociationOps[Self <: DomainAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomainAssociationArn(value: DomainAssociationArn): Self = this.set("domainAssociationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainStatus(value: DomainStatus): Self = this.set("domainStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoSubDomain(value: EnableAutoSubDomain): Self = this.set("enableAutoSubDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReason(value: StatusReason): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDomainsVarargs(value: SubDomain*): Self = this.set("subDomains", js.Array(value :_*))
    
    @scala.inline
    def setSubDomains(value: SubDomains): Self = this.set("subDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSubDomainCreationPatternsVarargs(value: AutoSubDomainCreationPattern*): Self = this.set("autoSubDomainCreationPatterns", js.Array(value :_*))
    
    @scala.inline
    def setAutoSubDomainCreationPatterns(value: AutoSubDomainCreationPatterns): Self = this.set("autoSubDomainCreationPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSubDomainCreationPatterns: Self = this.set("autoSubDomainCreationPatterns", js.undefined)
    
    @scala.inline
    def setAutoSubDomainIAMRole(value: AutoSubDomainIAMRole): Self = this.set("autoSubDomainIAMRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSubDomainIAMRole: Self = this.set("autoSubDomainIAMRole", js.undefined)
    
    @scala.inline
    def setCertificateVerificationDNSRecord(value: CertificateVerificationDNSRecord): Self = this.set("certificateVerificationDNSRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateVerificationDNSRecord: Self = this.set("certificateVerificationDNSRecord", js.undefined)
  }
}
