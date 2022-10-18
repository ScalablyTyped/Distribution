package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallRuleGroup extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the rule group.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Arn] = js.undefined
  
  /**
    * The date and time that the rule group was created, in Unix time format and Coordinated Universal Time (UTC). 
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  
  /**
    * A unique string defined by you to identify the request. This allows you to retry failed requests without the risk of running the operation twice. This can be any unique string, for example, a timestamp. 
    */
  var CreatorRequestId: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.CreatorRequestId] = js.undefined
  
  /**
    * The ID of the rule group. 
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The date and time that the rule group was last modified, in Unix time format and Coordinated Universal Time (UTC).
    */
  var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.undefined
  
  /**
    * The name of the rule group.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Name] = js.undefined
  
  /**
    * The Amazon Web Services account ID for the account that created the rule group. When a rule group is shared with your account, this is the account that has shared the rule group with you. 
    */
  var OwnerId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The number of rules in the rule group.
    */
  var RuleCount: js.UndefOr[Unsigned] = js.undefined
  
  /**
    * Whether the rule group is shared with other Amazon Web Services accounts, or was shared with the current account by another Amazon Web Services account. Sharing is configured through Resource Access Manager (RAM).
    */
  var ShareStatus: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ShareStatus] = js.undefined
  
  /**
    * The status of the domain list. 
    */
  var Status: js.UndefOr[FirewallRuleGroupStatus] = js.undefined
  
  /**
    * Additional information about the status of the rule group, if available.
    */
  var StatusMessage: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.StatusMessage] = js.undefined
}
object FirewallRuleGroup {
  
  inline def apply(): FirewallRuleGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirewallRuleGroup]
  }
  
  extension [Self <: FirewallRuleGroup](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: Rfc3339TimeString): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCreatorRequestId(value: CreatorRequestId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setModificationTime(value: Rfc3339TimeString): Self = StObject.set(x, "ModificationTime", value.asInstanceOf[js.Any])
    
    inline def setModificationTimeUndefined: Self = StObject.set(x, "ModificationTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwnerId(value: AccountId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setRuleCount(value: Unsigned): Self = StObject.set(x, "RuleCount", value.asInstanceOf[js.Any])
    
    inline def setRuleCountUndefined: Self = StObject.set(x, "RuleCount", js.undefined)
    
    inline def setShareStatus(value: ShareStatus): Self = StObject.set(x, "ShareStatus", value.asInstanceOf[js.Any])
    
    inline def setShareStatusUndefined: Self = StObject.set(x, "ShareStatus", js.undefined)
    
    inline def setStatus(value: FirewallRuleGroupStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
