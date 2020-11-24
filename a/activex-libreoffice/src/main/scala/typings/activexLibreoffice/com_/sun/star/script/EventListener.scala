package typings.activexLibreoffice.com_.sun.star.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventListener extends js.Object {
  
  var AddListenerParam: String = js.native
  
  var AllListener: XAllListener = js.native
  
  var EventMethod: String = js.native
  
  var Helper: js.Any = js.native
  
  var ListenerType: String = js.native
}
object EventListener {
  
  @scala.inline
  def apply(
    AddListenerParam: String,
    AllListener: XAllListener,
    EventMethod: String,
    Helper: js.Any,
    ListenerType: String
  ): EventListener = {
    val __obj = js.Dynamic.literal(AddListenerParam = AddListenerParam.asInstanceOf[js.Any], AllListener = AllListener.asInstanceOf[js.Any], EventMethod = EventMethod.asInstanceOf[js.Any], Helper = Helper.asInstanceOf[js.Any], ListenerType = ListenerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListener]
  }
  
  @scala.inline
  implicit class EventListenerOps[Self <: EventListener] (val x: Self) extends AnyVal {
    
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
    def setAddListenerParam(value: String): Self = this.set("AddListenerParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllListener(value: XAllListener): Self = this.set("AllListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventMethod(value: String): Self = this.set("EventMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelper(value: js.Any): Self = this.set("Helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerType(value: String): Self = this.set("ListenerType", value.asInstanceOf[js.Any])
  }
}
