package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersOrderUpdateAction extends StObject {
  
  /**
    * Button label and link.
    */
  var button: js.UndefOr[GoogleActionsV2UiElementsButton] = js.undefined
  
  /**
    * Type of action.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersOrderUpdateActionType] = js.undefined
}
object GoogleActionsV2OrdersOrderUpdateAction {
  
  inline def apply(): GoogleActionsV2OrdersOrderUpdateAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderUpdateAction]
  }
  
  extension [Self <: GoogleActionsV2OrdersOrderUpdateAction](x: Self) {
    
    inline def setButton(value: GoogleActionsV2UiElementsButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setType(value: GoogleActionsV2OrdersOrderUpdateActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
