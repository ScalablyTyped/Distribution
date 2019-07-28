package typings.antd.libTreeTreeMod

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
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent, node = node)
  
    __obj.asInstanceOf[AntTreeNodeBaseEvent]
  }
}

