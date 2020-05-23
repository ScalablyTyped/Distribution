package typings.activexLibreoffice.com_.sun.star.script

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
    val __obj = js.Dynamic.literal(AddListenerParam = AddListenerParam.asInstanceOf[js.Any], AllListener = AllListener.asInstanceOf[js.Any], EventMethod = EventMethod.asInstanceOf[js.Any], Helper = Helper.asInstanceOf[js.Any], ListenerType = ListenerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListener]
  }
}

