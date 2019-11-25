package typings.antd.esTreeTreeMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeDragEnterEvent extends AntTreeNodeMouseEvent {
  var expandedKeys: js.Array[String]
}

object AntTreeNodeDragEnterEvent {
  @scala.inline
  def apply(
    event: MouseEvent[HTMLElement, NativeMouseEvent],
    expandedKeys: js.Array[String],
    node: AntTreeNode
  ): AntTreeNodeDragEnterEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AntTreeNodeDragEnterEvent]
  }
}

