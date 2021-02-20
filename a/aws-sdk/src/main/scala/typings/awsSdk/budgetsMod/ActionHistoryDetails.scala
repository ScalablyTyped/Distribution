package typings.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionHistoryDetails extends StObject {
  
  /**
    *  The budget action resource. 
    */
  var Action: typings.awsSdk.budgetsMod.Action = js.native
  
  var Message: GenericString = js.native
}
object ActionHistoryDetails {
  
  @scala.inline
  def apply(Action: Action, Message: GenericString): ActionHistoryDetails = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionHistoryDetails]
  }
  
  @scala.inline
  implicit class ActionHistoryDetailsMutableBuilder[Self <: ActionHistoryDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: GenericString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
  }
}
