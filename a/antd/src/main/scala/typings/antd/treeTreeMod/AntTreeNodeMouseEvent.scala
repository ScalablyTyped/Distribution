package typings.antd.treeTreeMod

import typings.react.mod.DragEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeMouseEvent extends js.Object {
  var event: DragEvent[HTMLElement]
  var node: AntTreeNode
}

object AntTreeNodeMouseEvent {
  @scala.inline
  def apply(event: DragEvent[HTMLElement], node: AntTreeNode): AntTreeNodeMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AntTreeNodeMouseEvent]
  }
}

