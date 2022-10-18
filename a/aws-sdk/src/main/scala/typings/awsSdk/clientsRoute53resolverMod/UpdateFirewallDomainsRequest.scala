package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFirewallDomainsRequest extends StObject {
  
  /**
    * A list of domains to use in the update operation. Each domain specification in your domain list must satisfy the following requirements:    It can optionally start with * (asterisk).   With the exception of the optional starting asterisk, it must only contain the following characters: A-Z, a-z, 0-9, - (hyphen).   It must be from 1-255 characters in length.   
    */
  var Domains: FirewallDomains
  
  /**
    * The ID of the domain list whose domains you want to update. 
    */
  var FirewallDomainListId: ResourceId
  
  /**
    * What you want DNS Firewall to do with the domains that you are providing:     ADD - Add the domains to the ones that are already in the domain list.     REMOVE - Search the domain list for the domains and remove them from the list.    REPLACE - Update the domain list to exactly match the list that you are providing.   
    */
  var Operation: FirewallDomainUpdateOperation
}
object UpdateFirewallDomainsRequest {
  
  inline def apply(
    Domains: FirewallDomains,
    FirewallDomainListId: ResourceId,
    Operation: FirewallDomainUpdateOperation
  ): UpdateFirewallDomainsRequest = {
    val __obj = js.Dynamic.literal(Domains = Domains.asInstanceOf[js.Any], FirewallDomainListId = FirewallDomainListId.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFirewallDomainsRequest]
  }
  
  extension [Self <: UpdateFirewallDomainsRequest](x: Self) {
    
    inline def setDomains(value: FirewallDomains): Self = StObject.set(x, "Domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsVarargs(value: FirewallDomainName*): Self = StObject.set(x, "Domains", js.Array(value*))
    
    inline def setFirewallDomainListId(value: ResourceId): Self = StObject.set(x, "FirewallDomainListId", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: FirewallDomainUpdateOperation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
  }
}
