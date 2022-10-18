package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFirewallRuleRequest extends StObject {
  
  /**
    * The ID of the domain list that's used in the rule. 
    */
  var FirewallDomainListId: ResourceId
  
  /**
    * The unique identifier of the firewall rule group that you want to delete the rule from. 
    */
  var FirewallRuleGroupId: ResourceId
}
object DeleteFirewallRuleRequest {
  
  inline def apply(FirewallDomainListId: ResourceId, FirewallRuleGroupId: ResourceId): DeleteFirewallRuleRequest = {
    val __obj = js.Dynamic.literal(FirewallDomainListId = FirewallDomainListId.asInstanceOf[js.Any], FirewallRuleGroupId = FirewallRuleGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFirewallRuleRequest]
  }
  
  extension [Self <: DeleteFirewallRuleRequest](x: Self) {
    
    inline def setFirewallDomainListId(value: ResourceId): Self = StObject.set(x, "FirewallDomainListId", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupId(value: ResourceId): Self = StObject.set(x, "FirewallRuleGroupId", value.asInstanceOf[js.Any])
  }
}
