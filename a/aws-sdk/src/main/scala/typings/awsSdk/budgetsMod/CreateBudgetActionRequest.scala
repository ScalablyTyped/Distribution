package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBudgetActionRequest extends StObject {
  
  var AccountId: typings.awsSdk.budgetsMod.AccountId = js.native
  
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
  
  var Definition: typings.awsSdk.budgetsMod.Definition = js.native
  
  /**
    *  The role passed for action execution and reversion. Roles and actions must be in the same account. 
    */
  var ExecutionRoleArn: RoleArn = js.native
  
  var NotificationType: typings.awsSdk.budgetsMod.NotificationType = js.native
  
  var Subscribers: typings.awsSdk.budgetsMod.Subscribers = js.native
}
object CreateBudgetActionRequest {
  
  @scala.inline
  def apply(
    AccountId: AccountId,
    ActionThreshold: ActionThreshold,
    ActionType: ActionType,
    ApprovalModel: ApprovalModel,
    BudgetName: BudgetName,
    Definition: Definition,
    ExecutionRoleArn: RoleArn,
    NotificationType: NotificationType,
    Subscribers: Subscribers
  ): CreateBudgetActionRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ActionThreshold = ActionThreshold.asInstanceOf[js.Any], ActionType = ActionType.asInstanceOf[js.Any], ApprovalModel = ApprovalModel.asInstanceOf[js.Any], BudgetName = BudgetName.asInstanceOf[js.Any], Definition = Definition.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], NotificationType = NotificationType.asInstanceOf[js.Any], Subscribers = Subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBudgetActionRequest]
  }
  
  @scala.inline
  implicit class CreateBudgetActionRequestMutableBuilder[Self <: CreateBudgetActionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionThreshold(value: ActionThreshold): Self = StObject.set(x, "ActionThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionType(value: ActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalModel(value: ApprovalModel): Self = StObject.set(x, "ApprovalModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: Definition): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationType(value: NotificationType): Self = StObject.set(x, "NotificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribers(value: Subscribers): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribersVarargs(value: Subscriber*): Self = StObject.set(x, "Subscribers", js.Array(value :_*))
  }
}
