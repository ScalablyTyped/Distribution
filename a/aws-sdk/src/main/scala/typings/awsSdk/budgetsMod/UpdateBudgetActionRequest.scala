package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBudgetActionRequest extends StObject {
  
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  
  /**
    *  A system-generated universally unique identifier (UUID) for the action. 
    */
  var ActionId: typings.awsSdk.budgetsMod.ActionId = js.native
  
  var ActionThreshold: js.UndefOr[typings.awsSdk.budgetsMod.ActionThreshold] = js.native
  
  /**
    *  This specifies if the action needs manual or automatic approval. 
    */
  var ApprovalModel: js.UndefOr[typings.awsSdk.budgetsMod.ApprovalModel] = js.native
  
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName = js.native
  
  var Definition: js.UndefOr[typings.awsSdk.budgetsMod.Definition] = js.native
  
  /**
    *  The role passed for action execution and reversion. Roles and actions must be in the same account. 
    */
  var ExecutionRoleArn: js.UndefOr[RoleArn] = js.native
  
  var NotificationType: js.UndefOr[typings.awsSdk.budgetsMod.NotificationType] = js.native
  
  var Subscribers: js.UndefOr[typings.awsSdk.budgetsMod.Subscribers] = js.native
}
object UpdateBudgetActionRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, ActionId: ActionId, BudgetName: BudgetName): UpdateBudgetActionRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ActionId = ActionId.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBudgetActionRequest]
  }
  
  @scala.inline
  implicit class UpdateBudgetActionRequestMutableBuilder[Self <: UpdateBudgetActionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionId(value: ActionId): Self = StObject.set(x, "ActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionThreshold(value: ActionThreshold): Self = StObject.set(x, "ActionThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionThresholdUndefined: Self = StObject.set(x, "ActionThreshold", js.undefined)
    
    @scala.inline
    def setApprovalModel(value: ApprovalModel): Self = StObject.set(x, "ApprovalModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalModelUndefined: Self = StObject.set(x, "ApprovalModel", js.undefined)
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: Definition): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    @scala.inline
    def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    @scala.inline
    def setNotificationType(value: NotificationType): Self = StObject.set(x, "NotificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationTypeUndefined: Self = StObject.set(x, "NotificationType", js.undefined)
    
    @scala.inline
    def setSubscribers(value: Subscribers): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribersUndefined: Self = StObject.set(x, "Subscribers", js.undefined)
    
    @scala.inline
    def setSubscribersVarargs(value: Subscriber*): Self = StObject.set(x, "Subscribers", js.Array(value :_*))
  }
}
