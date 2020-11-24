package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionHistoryDetails extends js.Object {
  
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
  implicit class ActionHistoryDetailsOps[Self <: ActionHistoryDetails] (val x: Self) extends AnyVal {
    
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
    def setAction(value: Action): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: GenericString): Self = this.set("Message", value.asInstanceOf[js.Any])
  }
}
