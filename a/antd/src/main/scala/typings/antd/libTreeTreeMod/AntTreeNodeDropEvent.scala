package typings.antd.libTreeTreeMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeDropEvent extends js.Object {
  var dragNode: AntTreeNode
  var dragNodesKeys: js.Array[String]
  var dropPosition: Double
  var dropToGap: js.UndefOr[Boolean] = js.undefined
  var event: MouseEvent[HTMLElement, NativeMouseEvent]
  var node: AntTreeNode
}

object AntTreeNodeDropEvent {
  @scala.inline
  def apply(
    dragNode: AntTreeNode,
    dragNodesKeys: js.Array[String],
    dropPosition: Double,
    event: MouseEvent[HTMLElement, NativeMouseEvent],
    node: AntTreeNode,
    dropToGap: js.UndefOr[Boolean] = js.undefined
  ): AntTreeNodeDropEvent = {
    val __obj = js.Dynamic.literal(dragNode = dragNode, dragNodesKeys = dragNodesKeys, dropPosition = dropPosition, event = event, node = node)
    if (!js.isUndefined(dropToGap)) __obj.updateDynamic("dropToGap")(dropToGap)
    __obj.asInstanceOf[AntTreeNodeDropEvent]
  }
}

