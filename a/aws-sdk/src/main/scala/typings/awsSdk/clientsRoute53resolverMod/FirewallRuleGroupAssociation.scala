package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallRuleGroupAssociation extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the firewall rule group association.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Arn] = js.undefined
  
  /**
    * The date and time that the association was created, in Unix time format and Coordinated Universal Time (UTC). 
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  
  /**
    * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk of running the operation twice. This can be any unique string, for example, a timestamp. 
    */
  var CreatorRequestId: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.CreatorRequestId] = js.undefined
  
  /**
    * The unique identifier of the firewall rule group. 
    */
  var FirewallRuleGroupId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The identifier for the association.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The owner of the association, used only for associations that are not managed by you. If you use Firewall Manager to manage your DNS Firewalls, then this reports Firewall Manager as the managed owner.
    */
  var ManagedOwnerName: js.UndefOr[ServicePrinciple] = js.undefined
  
  /**
    * The date and time that the association was last modified, in Unix time format and Coordinated Universal Time (UTC).
    */
  var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  
  /**
    * If enabled, this setting disallows modification or removal of the association, to help prevent against accidentally altering DNS firewall protections. 
    */
  var MutationProtection: js.UndefOr[MutationProtectionStatus] = js.undefined
  
  /**
    * The name of the association.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Name] = js.undefined
  
  /**
    * The setting that determines the processing order of the rule group among the rule groups that are associated with a single VPC. DNS Firewall filters VPC traffic starting from rule group with the lowest numeric priority setting. 
    */
  var Priority: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Priority] = js.undefined
  
  /**
    * The current status of the association.
    */
  var Status: js.UndefOr[FirewallRuleGroupAssociationStatus] = js.undefined
  
  /**
    * Additional information about the status of the response, if available.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.StatusMessage] = js.undefined
  
  /**
    * The unique identifier of the VPC that is associated with the rule group. 
    */
  var VpcId: js.UndefOr[ResourceId] = js.undefined
}
object FirewallRuleGroupAssociation {
  
  inline def apply(): FirewallRuleGroupAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallRuleGroupAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirewallRuleGroupAssociation] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: Rfc3339TimeString): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setFirewallRuleGroupId(value: ResourceId): Self = StObject.set(x, "FirewallRuleGroupId", value.asInstanceOf[js.Any])
    
    inline def setFirewallRuleGroupIdUndefined: Self = StObject.set(x, "FirewallRuleGroupId", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setManagedOwnerName(value: ServicePrinciple): Self = StObject.set(x, "ManagedOwnerName", value.asInstanceOf[js.Any])
    
    inline def setManagedOwnerNameUndefined: Self = StObject.set(x, "ManagedOwnerName", js.undefined)
    
    inline def setModificationTime(value: Rfc3339TimeString): Self = StObject.set(x, "ModificationTime", value.asInstanceOf[js.Any])
    
    inline def setModificationTimeUndefined: Self = StObject.set(x, "ModificationTime", js.undefined)
    
    inline def setMutationProtection(value: MutationProtectionStatus): Self = StObject.set(x, "MutationProtection", value.asInstanceOf[js.Any])
    
    inline def setMutationProtectionUndefined: Self = StObject.set(x, "MutationProtection", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPriority(value: Priority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setStatus(value: FirewallRuleGroupAssociationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVpcId(value: ResourceId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
