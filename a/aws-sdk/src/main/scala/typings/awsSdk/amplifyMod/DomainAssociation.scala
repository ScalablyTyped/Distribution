package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainAssociation extends StObject {
  
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
  implicit class DomainAssociationMutableBuilder[Self <: DomainAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSubDomainCreationPatterns(value: AutoSubDomainCreationPatterns): Self = StObject.set(x, "autoSubDomainCreationPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSubDomainCreationPatternsUndefined: Self = StObject.set(x, "autoSubDomainCreationPatterns", js.undefined)
    
    @scala.inline
    def setAutoSubDomainCreationPatternsVarargs(value: AutoSubDomainCreationPattern*): Self = StObject.set(x, "autoSubDomainCreationPatterns", js.Array(value :_*))
    
    @scala.inline
    def setAutoSubDomainIAMRole(value: AutoSubDomainIAMRole): Self = StObject.set(x, "autoSubDomainIAMRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSubDomainIAMRoleUndefined: Self = StObject.set(x, "autoSubDomainIAMRole", js.undefined)
    
    @scala.inline
    def setCertificateVerificationDNSRecord(value: CertificateVerificationDNSRecord): Self = StObject.set(x, "certificateVerificationDNSRecord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateVerificationDNSRecordUndefined: Self = StObject.set(x, "certificateVerificationDNSRecord", js.undefined)
    
    @scala.inline
    def setDomainAssociationArn(value: DomainAssociationArn): Self = StObject.set(x, "domainAssociationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainStatus(value: DomainStatus): Self = StObject.set(x, "domainStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoSubDomain(value: EnableAutoSubDomain): Self = StObject.set(x, "enableAutoSubDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReason(value: StatusReason): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDomains(value: SubDomains): Self = StObject.set(x, "subDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDomainsVarargs(value: SubDomain*): Self = StObject.set(x, "subDomains", js.Array(value :_*))
  }
}
