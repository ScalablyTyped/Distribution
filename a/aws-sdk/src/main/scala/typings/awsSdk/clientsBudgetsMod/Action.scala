package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * A system-generated universally unique identifier (UUID) for the action. 
    */
  var ActionId: typings.awsSdk.clientsBudgetsMod.ActionId
  
  /**
    * The trigger threshold of the action. 
    */
  var ActionThreshold: typings.awsSdk.clientsBudgetsMod.ActionThreshold
  
  /**
    * The type of action. This defines the type of tasks that can be carried out by this action. This field also determines the format for definition. 
    */
  var ActionType: typings.awsSdk.clientsBudgetsMod.ActionType
  
  /**
    * This specifies if the action needs manual or automatic approval. 
    */
  var ApprovalModel: typings.awsSdk.clientsBudgetsMod.ApprovalModel
  
  var BudgetName: typings.awsSdk.clientsBudgetsMod.BudgetName
  
  /**
    * Where you specify all of the type-specific parameters. 
    */
  var Definition: typings.awsSdk.clientsBudgetsMod.Definition
  
  /**
    * The role passed for action execution and reversion. Roles and actions must be in the same account. 
    */
  var ExecutionRoleArn: RoleArn
  
  var NotificationType: typings.awsSdk.clientsBudgetsMod.NotificationType
  
  /**
    * The status of the action. 
    */
  var Status: ActionStatus
  
  var Subscribers: typings.awsSdk.clientsBudgetsMod.Subscribers
}
object Action {
  
  inline def apply(
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
  
  extension [Self <: Action](x: Self) {
    
    inline def setActionId(value: ActionId): Self = StObject.set(x, "ActionId", value.asInstanceOf[js.Any])
    
    inline def setActionThreshold(value: ActionThreshold): Self = StObject.set(x, "ActionThreshold", value.asInstanceOf[js.Any])
    
    inline def setActionType(value: ActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setApprovalModel(value: ApprovalModel): Self = StObject.set(x, "ApprovalModel", value.asInstanceOf[js.Any])
    
    inline def setBudgetName(value: BudgetName): Self = StObject.set(x, "BudgetName", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: Definition): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setNotificationType(value: NotificationType): Self = StObject.set(x, "NotificationType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ActionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setSubscribers(value: Subscribers): Self = StObject.set(x, "Subscribers", value.asInstanceOf[js.Any])
    
    inline def setSubscribersVarargs(value: Subscriber*): Self = StObject.set(x, "Subscribers", js.Array(value*))
  }
}
