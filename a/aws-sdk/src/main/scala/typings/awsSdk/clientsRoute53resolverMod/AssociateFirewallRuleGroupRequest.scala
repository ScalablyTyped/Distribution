package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateFirewallRuleGroupRequest extends StObject {
  
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of running the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp. 
    */
  var CreatorRequestId: typings.awsSdk.clientsRoute53resolverMod.CreatorRequestId
  
  /**
    * The unique identifier of the firewall rule group. 
    */
  var FirewallRuleGroupId: ResourceId
  
  /**
    * If enabled, this setting disallows modification or removal of the association, to help prevent against accidentally altering DNS firewall protections. When you create the association, the default setting is DISABLED. 
    */
  var MutationProtection: js.UndefOr[MutationProtectionStatus] = js.undefined
  
  /**
    * A name that lets you identify the association, to manage and use it.
    */
  var Name: typings.awsSdk.clientsRoute53resolverMod.Name
  
  /**
    * The setting that determines the processing order of the rule group among the rule groups that you associate with the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority setting.  You must specify a unique priority for each rule group that you associate with a single VPC. To make it easier to insert rule groups later, leave space between the numbers, for example, use 101, 200, and so on. You can change the priority setting for a rule group association after you create it. The allowed values for Priority are between 100 and 9900.
    */
  var Priority: typings.awsSdk.clientsRoute53resolverMod.Priority
  
  /**
    * A list of the tag keys and values that you want to associate with the rule group association. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The unique identifier of the VPC that you want to associate with the rule group. 
    */
  var VpcId: ResourceId
}
object AssociateFirewallRuleGroupRequest {
  
  inline def apply(
    CreatorRequestId: CreatorRequestId,
    FirewallRuleGroupId: ResourceId,
    Name: Name,
    Priority: Priority,
    VpcId: ResourceId
  ): AssociateFirewallRuleGroupRequest = {
    val __obj = js.Dynamic.literal(CreatorRequestId = CreatorRequestId.asInstanceOf[js.Any], FirewallRuleGroupId = FirewallRuleGroupId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateFirewallRuleGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateFirewallRuleGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupId(value: ResourceId): Self = StObject.set(x, "FirewallRuleGroupId", value.asInstanceOf[js.Any])
    
    inline def setMutationProtection(value: MutationProtectionStatus): Self = StObject.set(x, "MutationProtection", value.asInstanceOf[js.Any])
    
    inline def setMutationProtectionUndefined: Self = StObject.set(x, "MutationProtection", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcId(value: ResourceId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
