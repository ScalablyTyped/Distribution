package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionSummary extends StObject {
  
  /**
    * The action type.
    */
  var ActionType: typings.awsSdk.clientsConnectMod.ActionType
}
object ActionSummary {
  
  inline def apply(ActionType: ActionType): ActionSummary = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionSummary] (val x: Self) extends AnyVal {
    
    inline def setActionType(value: ActionType): Self = StObject.set(x, "ActionType", value.asInstanceOf[js.Any])
  }
}
