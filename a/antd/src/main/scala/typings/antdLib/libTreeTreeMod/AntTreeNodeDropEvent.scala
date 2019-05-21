package typings
package antdLib.libTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeDropEvent extends js.Object {
  var dragNode: AntTreeNode
  var dragNodesKeys: js.Array[java.lang.String]
  var dropPosition: scala.Double
  var dropToGap: js.UndefOr[scala.Boolean] = js.undefined
  var event: reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent]
  var node: AntTreeNode
}

object AntTreeNodeDropEvent {
  @scala.inline
  def apply(
    dragNode: AntTreeNode,
    dragNodesKeys: js.Array[java.lang.String],
    dropPosition: scala.Double,
    event: reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent],
    node: AntTreeNode,
    dropToGap: js.UndefOr[scala.Boolean] = js.undefined
  ): AntTreeNodeDropEvent = {
    val __obj = js.Dynamic.literal(dragNode = dragNode, dragNodesKeys = dragNodesKeys, dropPosition = dropPosition, event = event, node = node)
    if (!js.isUndefined(dropToGap)) __obj.updateDynamic("dropToGap")(dropToGap)
    __obj.asInstanceOf[AntTreeNodeDropEvent]
  }
}

