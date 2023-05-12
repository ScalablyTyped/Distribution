package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleAction extends StObject {
  
  /**
    * The type of action that creates a rule.
    */
  var ActionType: typings.awsSdk.clientsConnectMod.ActionType
  
  /**
    * Information about the contact category action.
    */
  var AssignContactCategoryAction: js.UndefOr[AssignContactCategoryActionDefinition] = js.undefined
  
  /**
    * Information about the EventBridge action.
    */
  var EventBridgeAction: js.UndefOr[EventBridgeActionDefinition] = js.undefined
  
  /**
    * Information about the send notification action.
    */
  var SendNotificationAction: js.UndefOr[SendNotificationActionDefinition] = js.undefined
  
  /**
    * Information about the task action. This field is required if TriggerEventSource is one of the following values: OnZendeskTicketCreate | OnZendeskTicketStatusUpdate | OnSalesforceCaseCreate 
    */
  var TaskAction: js.UndefOr[TaskActionDefinition] = js.undefined
}
object RuleAction {
  
  inline def apply(ActionType: ActionType): RuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleAction] (val x: Self) extends AnyVal {
    
    inline def setActionType(value: ActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
    
    inline def setAssignContactCategoryAction(value: AssignContactCategoryActionDefinition): Self = StObject.set(x, "AssignContactCategoryAction", value.asInstanceOf[js.Any])
    
    inline def setAssignContactCategoryActionUndefined: Self = StObject.set(x, "AssignContactCategoryAction", js.undefined)
    
    inline def setEventBridgeAction(value: EventBridgeActionDefinition): Self = StObject.set(x, "EventBridgeAction", value.asInstanceOf[js.Any])
    
    inline def setEventBridgeActionUndefined: Self = StObject.set(x, "EventBridgeAction", js.undefined)
    
    inline def setSendNotificationAction(value: SendNotificationActionDefinition): Self = StObject.set(x, "SendNotificationAction", value.asInstanceOf[js.Any])
    
    inline def setSendNotificationActionUndefined: Self = StObject.set(x, "SendNotificationAction", js.undefined)
    
    inline def setTaskAction(value: TaskActionDefinition): Self = StObject.set(x, "TaskAction", value.asInstanceOf[js.Any])
    
    inline def setTaskActionUndefined: Self = StObject.set(x, "TaskAction", js.undefined)
  }
}
