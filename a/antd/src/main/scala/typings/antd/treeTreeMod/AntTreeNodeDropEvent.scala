package typings.antd.treeTreeMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeDropEvent extends js.Object {
  var dragNode: AntTreeNode
  var dragNodesKeys: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
  ]
  var dropPosition: Double
  var dropToGap: js.UndefOr[Boolean] = js.undefined
  var event: MouseEvent[HTMLElement, NativeMouseEvent]
  var node: AntTreeNode
}

object AntTreeNodeDropEvent {
  @scala.inline
  def apply(
    dragNode: AntTreeNode,
    dragNodesKeys: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Key */ _
    ],
    dropPosition: Double,
    event: MouseEvent[HTMLElement, NativeMouseEvent],
    node: AntTreeNode,
    dropToGap: js.UndefOr[Boolean] = js.undefined
  ): AntTreeNodeDropEvent = {
    val __obj = js.Dynamic.literal(dragNode = dragNode.asInstanceOf[js.Any], dragNodesKeys = dragNodesKeys.asInstanceOf[js.Any], dropPosition = dropPosition.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(dropToGap)) __obj.updateDynamic("dropToGap")(dropToGap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeDropEvent]
  }
}

