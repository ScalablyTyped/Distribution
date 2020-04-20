package typings.antd.treeTreeMod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeBaseEvent extends js.Object {
  var nativeEvent: MouseEvent
  var node: AntTreeNode
}

object AntTreeNodeBaseEvent {
  @scala.inline
  def apply(nativeEvent: MouseEvent, node: AntTreeNode): AntTreeNodeBaseEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeBaseEvent]
  }
}

