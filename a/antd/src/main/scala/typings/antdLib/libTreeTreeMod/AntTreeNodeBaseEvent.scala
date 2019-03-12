package typings
package antdLib.libTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeBaseEvent extends js.Object {
  var nativeEvent: stdLib.MouseEvent
  var node: AntTreeNode
}

object AntTreeNodeBaseEvent {
  @scala.inline
  def apply(nativeEvent: stdLib.MouseEvent, node: AntTreeNode): AntTreeNodeBaseEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent, node = node)
  
    __obj.asInstanceOf[AntTreeNodeBaseEvent]
  }
}

