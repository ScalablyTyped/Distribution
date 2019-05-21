package typings
package antdLib.esTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeMouseEvent extends js.Object {
  var event: reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent]
  var node: AntTreeNode
}

object AntTreeNodeMouseEvent {
  @scala.inline
  def apply(event: reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], node: AntTreeNode): AntTreeNodeMouseEvent = {
    val __obj = js.Dynamic.literal(event = event, node = node)
  
    __obj.asInstanceOf[AntTreeNodeMouseEvent]
  }
}

