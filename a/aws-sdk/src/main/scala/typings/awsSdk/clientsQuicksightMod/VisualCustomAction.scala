package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualCustomAction extends StObject {
  
  /**
    * A list of VisualCustomActionOperations. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  var ActionOperations: VisualCustomActionOperationList
  
  /**
    * The ID of the VisualCustomAction.
    */
  var CustomActionId: ShortRestrictiveResourceId
  
  /**
    * The name of the VisualCustomAction.
    */
  var Name: VisualCustomActionName
  
  /**
    * The status of the VisualCustomAction.
    */
  var Status: js.UndefOr[WidgetStatus] = js.undefined
  
  /**
    * The trigger of the VisualCustomAction. Valid values are defined as follows:    DATA_POINT_CLICK: Initiates a custom action by a left pointer click on a data point.    DATA_POINT_MENU: Initiates a custom action by right pointer click from the menu.  
    */
  var Trigger: VisualCustomActionTrigger
}
object VisualCustomAction {
  
  inline def apply(
    ActionOperations: VisualCustomActionOperationList,
    CustomActionId: ShortRestrictiveResourceId,
    Name: VisualCustomActionName,
    Trigger: VisualCustomActionTrigger
  ): VisualCustomAction = {
    val __obj = js.Dynamic.literal(ActionOperations = ActionOperations.asInstanceOf[js.Any], CustomActionId = CustomActionId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Trigger = Trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualCustomAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualCustomAction] (val x: Self) extends AnyVal {
    
    inline def setActionOperations(value: VisualCustomActionOperationList): Self = StObject.set(x, "ActionOperations", value.asInstanceOf[js.Any])
    
    inline def setActionOperationsVarargs(value: VisualCustomActionOperation*): Self = StObject.set(x, "ActionOperations", js.Array(value*))
    
    inline def setCustomActionId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "CustomActionId", value.asInstanceOf[js.Any])
    
    inline def setName(value: VisualCustomActionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: WidgetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTrigger(value: VisualCustomActionTrigger): Self = StObject.set(x, "Trigger", value.asInstanceOf[js.Any])
  }
}
