package typings.atom.toolBarMod

import typings.std.HTMLHRElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarSpacerView extends js.Object {
  var element: HTMLHRElement
  var group: String
  var priority: Double
  def destroy(): Unit
}

object ToolBarSpacerView {
  @scala.inline
  def apply(destroy: () => Unit, element: HTMLHRElement, group: String, priority: Double): ToolBarSpacerView = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolBarSpacerView]
  }
}

