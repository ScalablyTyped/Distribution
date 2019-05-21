package typings
package antdLib.esTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeDragEnterEvent extends AntTreeNodeMouseEvent {
  var expandedKeys: js.Array[java.lang.String]
}

object AntTreeNodeDragEnterEvent {
  @scala.inline
  def apply(
    event: reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent],
    expandedKeys: js.Array[java.lang.String],
    node: AntTreeNode
  ): AntTreeNodeDragEnterEvent = {
    val __obj = js.Dynamic.literal(event = event, expandedKeys = expandedKeys, node = node)
  
    __obj.asInstanceOf[AntTreeNodeDragEnterEvent]
  }
}

