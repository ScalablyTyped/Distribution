package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupResponse extends StObject {
  
  /**
    * The maximum operating resources that this rule group can use. Rule group capacity is fixed at creation. When you update a rule group, you are limited to this capacity. When you reference a rule group from a firewall policy, Network Firewall reserves this capacity for the rule group.  You can retrieve the capacity that would be required for a rule group before you create the rule group by calling CreateRuleGroup with DryRun set to TRUE. 
    */
  var Capacity: js.UndefOr[RuleCapacity] = js.undefined
  
  /**
    * The number of capacity units currently consumed by the rule group rules. 
    */
  var ConsumedCapacity: js.UndefOr[RuleCapacity] = js.undefined
  
  /**
    * A description of the rule group. 
    */
  var Description: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.Description] = js.undefined
  
  /**
    * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your rule group.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.EncryptionConfiguration] = js.undefined
  
  /**
    * The last time that the rule group was changed.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of firewall policies that use this rule group.
    */
  var NumberOfAssociations: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.NumberOfAssociations] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the rule group.  If this response is for a create request that had DryRun set to TRUE, then this ARN is a placeholder that isn't attached to a valid resource. 
    */
  var RuleGroupArn: ResourceArn
  
  /**
    * The unique identifier for the rule group. 
    */
  var RuleGroupId: ResourceId
  
  /**
    * The descriptive name of the rule group. You can't change the name of a rule group after you create it.
    */
  var RuleGroupName: ResourceName
  
  /**
    * Detailed information about the current status of a rule group. 
    */
  var RuleGroupStatus: js.UndefOr[ResourceStatus] = js.undefined
  
  /**
    * The Amazon resource name (ARN) of the Amazon Simple Notification Service SNS topic that's used to record changes to the managed rule group. You can subscribe to the SNS topic to receive notifications when the managed rule group is modified, such as for new versions and for version expiration. For more information, see the Amazon Simple Notification Service Developer Guide..
    */
  var SnsTopic: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * A complex type that contains metadata about the rule group that your own rule group is copied from. You can use the metadata to track the version updates made to the originating rule group.
    */
  var SourceMetadata: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.SourceMetadata] = js.undefined
  
  /**
    * The key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Indicates whether the rule group is stateless or stateful. If the rule group is stateless, it contains stateless rules. If it is stateful, it contains stateful rules. 
    */
  var Type: js.UndefOr[RuleGroupType] = js.undefined
}
object RuleGroupResponse {
  
  inline def apply(RuleGroupArn: ResourceArn, RuleGroupId: ResourceId, RuleGroupName: ResourceName): RuleGroupResponse = {
    val __obj = js.Dynamic.literal(RuleGroupArn = RuleGroupArn.asInstanceOf[js.Any], RuleGroupId = RuleGroupId.asInstanceOf[js.Any], RuleGroupName = RuleGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setCapacity(value: RuleCapacity): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    inline def setConsumedCapacity(value: RuleCapacity): Self = StObject.set(x, "ConsumedCapacity", value.asInstanceOf[js.Any])
    
    inline def setConsumedCapacityUndefined: Self = StObject.set(x, "ConsumedCapacity", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setNumberOfAssociations(value: NumberOfAssociations): Self = StObject.set(x, "NumberOfAssociations", value.asInstanceOf[js.Any])
    
    inline def setNumberOfAssociationsUndefined: Self = StObject.set(x, "NumberOfAssociations", js.undefined)
    
    inline def setRuleGroupArn(value: ResourceArn): Self = StObject.set(x, "RuleGroupArn", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupId(value: ResourceId): Self = StObject.set(x, "RuleGroupId", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupName(value: ResourceName): Self = StObject.set(x, "RuleGroupName", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupStatus(value: ResourceStatus): Self = StObject.set(x, "RuleGroupStatus", value.asInstanceOf[js.Any])
    
    inline def setRuleGroupStatusUndefined: Self = StObject.set(x, "RuleGroupStatus", js.undefined)
    
    inline def setSnsTopic(value: ResourceArn): Self = StObject.set(x, "SnsTopic", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicUndefined: Self = StObject.set(x, "SnsTopic", js.undefined)
    
    inline def setSourceMetadata(value: SourceMetadata): Self = StObject.set(x, "SourceMetadata", value.asInstanceOf[js.Any])
    
    inline def setSourceMetadataUndefined: Self = StObject.set(x, "SourceMetadata", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: RuleGroupType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
