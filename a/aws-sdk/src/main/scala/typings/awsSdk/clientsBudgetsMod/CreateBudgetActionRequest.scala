package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBudgetActionRequest extends StObject {
  
  var AccountId: typings.awsSdk.clientsBudgetsMod.AccountId
  
  var ActionThreshold: typings.awsSdk.clientsBudgetsMod.ActionThreshold
  
  /**
    *  The type of action. This defines the type of tasks that can be carried out by this action. This field also determines the format for definition. 
    */
  var ActionType: typings.awsSdk.clientsBudgetsMod.ActionType
  
  /**
    *  This specifies if the action needs manual or automatic approval. 
    */
  var ApprovalModel: typings.awsSdk.clientsBudgetsMod.ApprovalModel
  
  var BudgetName: typings.awsSdk.clientsBudgetsMod.BudgetName
  
  var Definition: typings.awsSdk.clientsBudgetsMod.Definition
  
  /**
    *  The role passed for action execution and reversion. Roles and actions must be in the same account. 
    */
  var ExecutionRoleArn: RoleArn
  
  var NotificationType: typings.awsSdk.clientsBudgetsMod.NotificationType
  
  var Subscribers: typings.awsSdk.clientsBudgetsMod.Subscribers
}
object CreateBudgetActionRequest {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: CreateBudgetActionRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setActionThreshold(value: ActionThreshold): Self = StObject.set(x, "ActionThreshold", value.asInstanceOf[js.Any])
    
    inline def setActionType(value: ActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setApprovalModel(value: ApprovalModel): Self = StObject.set(x, "ApprovalModel", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: Definition): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setNotificationType(value: NotificationType): Self = StObject.set(x, "NotificationType", value.asInstanceOf[js.Any])
    
    inline def setSubscribers(value: Subscribers): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    inline def setSubscribersVarargs(value: Subscriber*): Self = StObject.set(x, "Subscribers", js.Array(value*))
  }
}
