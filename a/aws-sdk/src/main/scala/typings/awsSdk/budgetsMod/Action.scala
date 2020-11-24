package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends js.Object {
  
  /**
    *  A system-generated universally unique identifier (UUID) for the action. 
    */
  var ActionId: typings.awsSdk.budgetsMod.ActionId = js.native
  
  /**
    *  The trigger threshold of the action. 
    */
  var ActionThreshold: typings.awsSdk.budgetsMod.ActionThreshold = js.native
  
  /**
    *  The type of action. This defines the type of tasks that can be carried out by this action. This field also determines the format for definition. 
    */
  var ActionType: typings.awsSdk.budgetsMod.ActionType = js.native
  
  /**
    *  This specifies if the action needs manual or automatic approval. 
    */
  var ApprovalModel: typings.awsSdk.budgetsMod.ApprovalModel = js.native
  
  var BudgetName: typings.awsSdk.budgetsMod.BudgetName = js.native
  
  /**
    *  Where you specify all of the type-specific parameters. 
    */
  var Definition: typings.awsSdk.budgetsMod.Definition = js.native
  
  /**
    *  The role passed for action execution and reversion. Roles and actions must be in the same account. 
    */
  var ExecutionRoleArn: RoleArn = js.native
  
  var NotificationType: typings.awsSdk.budgetsMod.NotificationType = js.native
  
  /**
    *  The status of action. 
    */
  var Status: ActionStatus = js.native
  
  var Subscribers: typings.awsSdk.budgetsMod.Subscribers = js.native
}
object Action {
  
  @scala.inline
  def apply(
    ActionId: ActionId,
    ActionThreshold: ActionThreshold,
    ActionType: ActionType,
    ApprovalModel: ApprovalModel,
    BudgetName: BudgetName,
    Definition: Definition,
    ExecutionRoleArn: RoleArn,
    NotificationType: NotificationType,
    Status: ActionStatus,
    Subscribers: Subscribers
  ): Action = {
    val __obj = js.Dynamic.literal(ActionId = ActionId.asInstanceOf[js.Any], ActionThreshold = ActionThreshold.asInstanceOf[js.Any], ActionType = ActionType.asInstanceOf[js.Any], ApprovalModel = ApprovalModel.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Definition = Definition.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], NotificationType = NotificationType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Subscribers = Subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    
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
    def setActionId(value: ActionId): Self = this.set("ActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionThreshold(value: ActionThreshold): Self = this.set("ActionThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionType(value: ActionType): Self = this.set("ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalModel(value: ApprovalModel): Self = this.set("ApprovalModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = this.set("BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: Definition): Self = this.set("Definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionRoleArn(value: RoleArn): Self = this.set("ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationType(value: NotificationType): Self = this.set("NotificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ActionStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribersVarargs(value: Subscriber*): Self = this.set("Subscribers", js.Array(value :_*))
    
    @scala.inline
    def setSubscribers(value: Subscribers): Self = this.set("Subscribers", value.asInstanceOf[js.Any])
  }
}
