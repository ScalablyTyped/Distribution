package typings
package antdLib.libTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeBaseEvent extends js.Object {
  var nativeEvent: reactLib.MouseEvent
  var node: AntTreeNode
}

object AntTreeNodeBaseEvent {
  @scala.inline
  def apply(nativeEvent: reactLib.MouseEvent, node: AntTreeNode): AntTreeNodeBaseEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nativeEvent")(nativeEvent)
    __obj.updateDynamic("node")(node)
    __obj.asInstanceOf[AntTreeNodeBaseEvent]
  }
}

