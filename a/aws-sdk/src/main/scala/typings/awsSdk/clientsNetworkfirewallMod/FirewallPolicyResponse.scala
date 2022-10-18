package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallPolicyResponse extends StObject {
  
  /**
    * The number of capacity units currently consumed by the policy's stateful rules.
    */
  var ConsumedStatefulRuleCapacity: js.UndefOr[RuleCapacity] = js.undefined
  
  /**
    * The number of capacity units currently consumed by the policy's stateless rules.
    */
  var ConsumedStatelessRuleCapacity: js.UndefOr[RuleCapacity] = js.undefined
  
  /**
    * A description of the firewall policy.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.Description] = js.undefined
  
  /**
    * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your firewall policy.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.EncryptionConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the firewall policy.  If this response is for a create request that had DryRun set to TRUE, then this ARN is a placeholder that isn't attached to a valid resource. 
    */
  var FirewallPolicyArn: ResourceArn
  
  /**
    * The unique identifier for the firewall policy. 
    */
  var FirewallPolicyId: ResourceId
  
  /**
    * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
    */
  var FirewallPolicyName: ResourceName
  
  /**
    * The current status of the firewall policy. You can retrieve this for a firewall policy by calling DescribeFirewallPolicy and providing the firewall policy's name or ARN.
    */
  var FirewallPolicyStatus: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * The last time that the firewall policy was changed.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of firewalls that are associated with this firewall policy.
    */
  var NumberOfAssociations: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.NumberOfAssociations] = js.undefined
  
  /**
    * The key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object FirewallPolicyResponse {
  
  inline def apply(FirewallPolicyArn: ResourceArn, FirewallPolicyId: ResourceId, FirewallPolicyName: ResourceName): FirewallPolicyResponse = {
    val __obj = js.Dynamic.literal(FirewallPolicyArn = FirewallPolicyArn.asInstanceOf[js.Any], FirewallPolicyId = FirewallPolicyId.asInstanceOf[js.Any], FirewallPolicyName = FirewallPolicyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyResponse]
  }
  
  extension [Self <: FirewallPolicyResponse](x: Self) {
    
    inline def setConsumedStatefulRuleCapacity(value: RuleCapacity): Self = StObject.set(x, "ConsumedStatefulRuleCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedStatefulRuleCapacityUndefined: Self = StObject.set(x, "ConsumedStatefulRuleCapacity", js.undefined)
    
    inline def setConsumedStatelessRuleCapacity(value: RuleCapacity): Self = StObject.set(x, "ConsumedStatelessRuleCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedStatelessRuleCapacityUndefined: Self = StObject.set(x, "ConsumedStatelessRuleCapacity", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setFirewallPolicyArn(value: ResourceArn): Self = StObject.set(x, "FirewallPolicyArn", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyId(value: ResourceId): Self = StObject.set(x, "FirewallPolicyId", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyName(value: ResourceName): Self = StObject.set(x, "FirewallPolicyName", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyStatus(value: ResourceStatus): Self = StObject.set(x, "FirewallPolicyStatus", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyStatusUndefined: Self = StObject.set(x, "FirewallPolicyStatus", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setNumberOfAssociations(value: NumberOfAssociations): Self = StObject.set(x, "NumberOfAssociations", value.asInstanceOf[js.Any])
    
    inline def setNumberOfAssociationsUndefined: Self = StObject.set(x, "NumberOfAssociations", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
