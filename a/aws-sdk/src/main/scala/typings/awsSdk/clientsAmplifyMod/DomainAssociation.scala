package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainAssociation extends StObject {
  
  /**
    *  Sets branch patterns for automatic subdomain creation. 
    */
  var autoSubDomainCreationPatterns: js.UndefOr[AutoSubDomainCreationPatterns] = js.undefined
  
  /**
    *  The required AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) for automatically creating subdomains. 
    */
  var autoSubDomainIAMRole: js.UndefOr[AutoSubDomainIAMRole] = js.undefined
  
  /**
    *  The DNS record for certificate verification. 
    */
  var certificateVerificationDNSRecord: js.UndefOr[CertificateVerificationDNSRecord] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) for the domain association. 
    */
  var domainAssociationArn: DomainAssociationArn
  
  /**
    *  The name of the domain. 
    */
  var domainName: DomainName
  
  /**
    *  The current status of the domain association. 
    */
  var domainStatus: DomainStatus
  
  /**
    *  Enables the automated creation of subdomains for branches. 
    */
  var enableAutoSubDomain: EnableAutoSubDomain
  
  /**
    *  The reason for the current status of the domain association. 
    */
  var statusReason: StatusReason
  
  /**
    *  The subdomains for the domain association. 
    */
  var subDomains: SubDomains
}
object DomainAssociation {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: DomainAssociation] (val x: Self) extends AnyVal {
    
    inline def setAutoSubDomainCreationPatterns(value: AutoSubDomainCreationPatterns): Self = StObject.set(x, "autoSubDomainCreationPatterns", value.asInstanceOf[js.Any])
    
    inline def setAutoSubDomainCreationPatternsUndefined: Self = StObject.set(x, "autoSubDomainCreationPatterns", js.undefined)
    
    inline def setAutoSubDomainCreationPatternsVarargs(value: AutoSubDomainCreationPattern*): Self = StObject.set(x, "autoSubDomainCreationPatterns", js.Array(value*))
    
    inline def setAutoSubDomainIAMRole(value: AutoSubDomainIAMRole): Self = StObject.set(x, "autoSubDomainIAMRole", value.asInstanceOf[js.Any])
    
    inline def setAutoSubDomainIAMRoleUndefined: Self = StObject.set(x, "autoSubDomainIAMRole", js.undefined)
    
    inline def setCertificateVerificationDNSRecord(value: CertificateVerificationDNSRecord): Self = StObject.set(x, "certificateVerificationDNSRecord", value.asInstanceOf[js.Any])
    
    inline def setCertificateVerificationDNSRecordUndefined: Self = StObject.set(x, "certificateVerificationDNSRecord", js.undefined)
    
    inline def setDomainAssociationArn(value: DomainAssociationArn): Self = StObject.set(x, "domainAssociationArn", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainStatus(value: DomainStatus): Self = StObject.set(x, "domainStatus", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoSubDomain(value: EnableAutoSubDomain): Self = StObject.set(x, "enableAutoSubDomain", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: StatusReason): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setSubDomains(value: SubDomains): Self = StObject.set(x, "subDomains", value.asInstanceOf[js.Any])
    
    inline def setSubDomainsVarargs(value: SubDomain*): Self = StObject.set(x, "subDomains", js.Array(value*))
  }
}
