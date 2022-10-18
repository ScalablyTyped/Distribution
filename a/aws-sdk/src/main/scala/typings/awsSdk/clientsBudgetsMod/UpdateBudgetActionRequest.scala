package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBudgetActionRequest extends StObject {
  
  var AccountId: typings.awsSdk.clientsBudgetsMod.AccountId
  
  /**
    *  A system-generated universally unique identifier (UUID) for the action. 
    */
  var ActionId: typings.awsSdk.clientsBudgetsMod.ActionId
  
  var ActionThreshold: js.UndefOr[typings.awsSdk.clientsBudgetsMod.ActionThreshold] = js.undefined
  
  /**
    *  This specifies if the action needs manual or automatic approval. 
    */
  var ApprovalModel: js.UndefOr[typings.awsSdk.clientsBudgetsMod.ApprovalModel] = js.undefined
  
  var BudgetName: typings.awsSdk.clientsBudgetsMod.BudgetName
  
  var Definition: js.UndefOr[typings.awsSdk.clientsBudgetsMod.Definition] = js.undefined
  
  /**
    *  The role passed for action execution and reversion. Roles and actions must be in the same account. 
    */
  var ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  var NotificationType: js.UndefOr[typings.awsSdk.clientsBudgetsMod.NotificationType] = js.undefined
  
  var Subscribers: js.UndefOr[typings.awsSdk.clientsBudgetsMod.Subscribers] = js.undefined
}
object UpdateBudgetActionRequest {
  
  inline def apply(AccountId: AccountId, ActionId: ActionId, BudgetName: BudgetName): UpdateBudgetActionRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ActionId = ActionId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBudgetActionRequest]
  }
  
  extension [Self <: UpdateBudgetActionRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setActionId(value: ActionId): Self = StObject.set(x, "ActionId", value.asInstanceOf[js.Any])
    
    inline def setActionThreshold(value: ActionThreshold): Self = StObject.set(x, "ActionThreshold", value.asInstanceOf[js.Any])
    
    inline def setActionThresholdUndefined: Self = StObject.set(x, "ActionThreshold", js.undefined)
    
    inline def setApprovalModel(value: ApprovalModel): Self = StObject.set(x, "ApprovalModel", value.asInstanceOf[js.Any])
    
    inline def setApprovalModelUndefined: Self = StObject.set(x, "ApprovalModel", js.undefined)
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: Definition): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    inline def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setNotificationType(value: NotificationType): Self = StObject.set(x, "NotificationType", value.asInstanceOf[js.Any])
    
    inline def setNotificationTypeUndefined: Self = StObject.set(x, "NotificationType", js.undefined)
    
    inline def setSubscribers(value: Subscribers): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    inline def setSubscribersUndefined: Self = StObject.set(x, "Subscribers", js.undefined)
    
    inline def setSubscribersVarargs(value: Subscriber*): Self = StObject.set(x, "Subscribers", js.Array(value*))
  }
}
