package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFirewallRuleRequest extends StObject {
  
  /**
    * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain list:    ALLOW - Permit the request to go through.    ALERT - Permit the request to go through but send an alert to the logs.    BLOCK - Disallow the request. This option requires additional details in the rule's BlockResponse.   
    */
  var Action: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Action] = js.undefined
  
  /**
    * The DNS record's type. This determines the format of the record value that you provided in BlockOverrideDomain. Used for the rule action BLOCK with a BlockResponse setting of OVERRIDE.
    */
  var BlockOverrideDnsType: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.BlockOverrideDnsType] = js.undefined
  
  /**
    * The custom DNS record to send back in response to the query. Used for the rule action BLOCK with a BlockResponse setting of OVERRIDE.
    */
  var BlockOverrideDomain: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.BlockOverrideDomain] = js.undefined
  
  /**
    * The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided override record. Used for the rule action BLOCK with a BlockResponse setting of OVERRIDE.
    */
  var BlockOverrideTtl: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.BlockOverrideTtl] = js.undefined
  
  /**
    * The way that you want DNS Firewall to block the request. Used for the rule action setting BLOCK.    NODATA - Respond indicating that the query was successful, but no response is available for it.    NXDOMAIN - Respond indicating that the domain name that's in the query doesn't exist.    OVERRIDE - Provide a custom override in the response. This option requires custom handling details in the rule's BlockOverride* settings.   
    */
  var BlockResponse: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.BlockResponse] = js.undefined
  
  /**
    * The ID of the domain list to use in the rule. 
    */
  var FirewallDomainListId: ResourceId
  
  /**
    * The unique identifier of the firewall rule group for the rule. 
    */
  var FirewallRuleGroupId: ResourceId
  
  /**
    * The name of the rule.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Name] = js.undefined
  
  /**
    * The setting that determines the processing order of the rule in the rule group. DNS Firewall processes the rules in a rule group by order of priority, starting from the lowest setting. You must specify a unique priority for each rule in a rule group. To make it easier to insert rules later, leave space between the numbers, for example, use 100, 200, and so on. You can change the priority setting for the rules in a rule group at any time.
    */
  var Priority: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Priority] = js.undefined
}
object UpdateFirewallRuleRequest {
  
  inline def apply(FirewallDomainListId: ResourceId, FirewallRuleGroupId: ResourceId): UpdateFirewallRuleRequest = {
    val __obj = js.Dynamic.literal(FirewallDomainListId = FirewallDomainListId.asInstanceOf[js.Any], FirewallRuleGroupId = FirewallRuleGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFirewallRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFirewallRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setBlockOverrideDnsType(value: BlockOverrideDnsType): Self = StObject.set(x, "BlockOverrideDnsType", value.asInstanceOf[js.Any])
    
    inline def setBlockOverrideDnsTypeUndefined: Self = StObject.set(x, "BlockOverrideDnsType", js.undefined)
    
    inline def setBlockOverrideDomain(value: BlockOverrideDomain): Self = StObject.set(x, "BlockOverrideDomain", value.asInstanceOf[js.Any])
    
    inline def setBlockOverrideDomainUndefined: Self = StObject.set(x, "BlockOverrideDomain", js.undefined)
    
    inline def setBlockOverrideTtl(value: BlockOverrideTtl): Self = StObject.set(x, "BlockOverrideTtl", value.asInstanceOf[js.Any])
    
    inline def setBlockOverrideTtlUndefined: Self = StObject.set(x, "BlockOverrideTtl", js.undefined)
    
    inline def setBlockResponse(value: BlockResponse): Self = StObject.set(x, "BlockResponse", value.asInstanceOf[js.Any])
    
    inline def setBlockResponseUndefined: Self = StObject.set(x, "BlockResponse", js.undefined)
    
    inline def setFirewallDomainListId(value: ResourceId): Self = StObject.set(x, "FirewallDomainListId", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupId(value: ResourceId): Self = StObject.set(x, "FirewallRuleGroupId", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
  }
}
