package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallRule extends StObject {
  
  /**
    * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain list:    ALLOW - Permit the request to go through.    ALERT - Permit the request to go through but send an alert to the logs.    BLOCK - Disallow the request. If this is specified, additional handling details are provided in the rule's BlockResponse setting.   
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
  var BlockOverrideTtl: js.UndefOr[Unsigned] = js.undefined
  
  /**
    * The way that you want DNS Firewall to block the request. Used for the rule action setting BLOCK.    NODATA - Respond indicating that the query was successful, but no response is available for it.    NXDOMAIN - Respond indicating that the domain name that's in the query doesn't exist.    OVERRIDE - Provide a custom override in the response. This option requires custom handling details in the rule's BlockOverride* settings.   
    */
  var BlockResponse: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.BlockResponse] = js.undefined
  
  /**
    * The date and time that the rule was created, in Unix time format and Coordinated Universal Time (UTC). 
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  
  /**
    * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk of executing the operation twice. This can be any unique string, for example, a timestamp. 
    */
  var CreatorRequestId: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.CreatorRequestId] = js.undefined
  
  /**
    * The ID of the domain list that's used in the rule. 
    */
  var FirewallDomainListId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The unique identifier of the firewall rule group of the rule. 
    */
  var FirewallRuleGroupId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The date and time that the rule was last modified, in Unix time format and Coordinated Universal Time (UTC).
    */
  var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  
  /**
    * The name of the rule. 
    */
  var Name: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Name] = js.undefined
  
  /**
    * The priority of the rule in the rule group. This value must be unique within the rule group. DNS Firewall processes the rules in a rule group by order of priority, starting from the lowest setting.
    */
  var Priority: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Priority] = js.undefined
}
object FirewallRule {
  
  inline def apply(): FirewallRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallRule]
  }
  
  extension [Self <: FirewallRule](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setBlockOverrideDnsType(value: BlockOverrideDnsType): Self = StObject.set(x, "BlockOverrideDnsType", value.asInstanceOf[js.Any])
    
    inline def setBlockOverrideDnsTypeUndefined: Self = StObject.set(x, "BlockOverrideDnsType", js.undefined)
    
    inline def setBlockOverrideDomain(value: BlockOverrideDomain): Self = StObject.set(x, "BlockOverrideDomain", value.asInstanceOf[js.Any])
    
    inline def setBlockOverrideDomainUndefined: Self = StObject.set(x, "BlockOverrideDomain", js.undefined)
    
    inline def setBlockOverrideTtl(value: Unsigned): Self = StObject.set(x, "BlockOverrideTtl", value.asInstanceOf[js.Any])
    
    inline def setBlockOverrideTtlUndefined: Self = StObject.set(x, "BlockOverrideTtl", js.undefined)
    
    inline def setBlockResponse(value: BlockResponse): Self = StObject.set(x, "BlockResponse", value.asInstanceOf[js.Any])
    
    inline def setBlockResponseUndefined: Self = StObject.set(x, "BlockResponse", js.undefined)
    
    inline def setCreationTime(value: Rfc3339TimeString): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setFirewallDomainListId(value: ResourceId): Self = StObject.set(x, "FirewallDomainListId", value.asInstanceOf[js.Any])
    
    inline def setFirewallDomainListIdUndefined: Self = StObject.set(x, "FirewallDomainListId", js.undefined)
    
    inline def setFirewallRuleGroupId(value: ResourceId): Self = StObject.set(x, "FirewallRuleGroupId", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupIdUndefined: Self = StObject.set(x, "FirewallRuleGroupId", js.undefined)
    
    inline def setModificationTime(value: Rfc3339TimeString): Self = StObject.set(x, "ModificationTime", value.asInstanceOf[js.Any])
    
    inline def setModificationTimeUndefined: Self = StObject.set(x, "ModificationTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
  }
}
