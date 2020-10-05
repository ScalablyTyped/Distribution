package typings.antd.treeTreeMod

import typings.react.mod.DragEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AntTreeNodeMouseEvent extends js.Object {
  var event: DragEvent[HTMLElement] = js.native
  var node: AntTreeNode = js.native
}

object AntTreeNodeMouseEvent {
  @scala.inline
  def apply(event: DragEvent[HTMLElement], node: AntTreeNode): AntTreeNodeMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeMouseEvent]
  }
  @scala.inline
  implicit class AntTreeNodeMouseEventOps[Self <: AntTreeNodeMouseEvent] (val x: Self) extends AnyVal {
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
    def setEvent(value: DragEvent[HTMLElement]): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: AntTreeNode): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

