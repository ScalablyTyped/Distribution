package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventListener extends js.Object {
  var AddListenerParam: String
  var AllListener: XAllListener
  var EventMethod: String
  var Helper: js.Any
  var ListenerType: String
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
    val __obj = js.Dynamic.literal(AddListenerParam = AddListenerParam, AllListener = AllListener, EventMethod = EventMethod, Helper = Helper, ListenerType = ListenerType)
  
    __obj.asInstanceOf[EventListener]
  }
}

