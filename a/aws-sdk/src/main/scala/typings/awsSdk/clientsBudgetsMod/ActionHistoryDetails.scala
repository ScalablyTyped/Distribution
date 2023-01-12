package typings.awsSdk.clientsBudgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionHistoryDetails extends StObject {
  
  /**
    * The budget action resource. 
    */
  var Action: typings.awsSdk.clientsBudgetsMod.Action
  
  var Message: GenericString
}
object ActionHistoryDetails {
  
  inline def apply(Action: Action, Message: GenericString): ActionHistoryDetails = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionHistoryDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionHistoryDetails] (val x: Self) extends AnyVal {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: GenericString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
  }
}
