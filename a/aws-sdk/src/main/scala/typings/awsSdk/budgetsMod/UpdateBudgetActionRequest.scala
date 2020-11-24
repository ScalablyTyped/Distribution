package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateBudgetActionRequest extends js.Object {
  
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
  implicit class UpdateBudgetActionRequestOps[Self <: UpdateBudgetActionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionId(value: ActionId): Self = this.set("ActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = this.set("BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionThreshold(value: ActionThreshold): Self = this.set("ActionThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionThreshold: Self = this.set("ActionThreshold", js.undefined)
    
    @scala.inline
    def setApprovalModel(value: ApprovalModel): Self = this.set("ApprovalModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovalModel: Self = this.set("ApprovalModel", js.undefined)
    
    @scala.inline
    def setDefinition(value: Definition): Self = this.set("Definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinition: Self = this.set("Definition", js.undefined)
    
    @scala.inline
    def setExecutionRoleArn(value: RoleArn): Self = this.set("ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionRoleArn: Self = this.set("ExecutionRoleArn", js.undefined)
    
    @scala.inline
    def setNotificationType(value: NotificationType): Self = this.set("NotificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationType: Self = this.set("NotificationType", js.undefined)
    
    @scala.inline
    def setSubscribersVarargs(value: Subscriber*): Self = this.set("Subscribers", js.Array(value :_*))
    
    @scala.inline
    def setSubscribers(value: Subscribers): Self = this.set("Subscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribers: Self = this.set("Subscribers", js.undefined)
  }
}
