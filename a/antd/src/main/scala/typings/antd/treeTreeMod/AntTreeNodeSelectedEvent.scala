package typings.antd.treeTreeMod

import typings.antd.antdStrings.select
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeSelectedEvent extends AntTreeNodeBaseEvent {
  var event: select
  var selected: js.UndefOr[Boolean] = js.undefined
  var selectedNodes: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode */ _
    ]
  ] = js.undefined
}

object AntTreeNodeSelectedEvent {
  @scala.inline
  def apply(
    event: select,
    nativeEvent: MouseEvent,
    node: AntTreeNode,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedNodes: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataNode */ _
    ] = null
  ): AntTreeNodeSelectedEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (selectedNodes != null) __obj.updateDynamic("selectedNodes")(selectedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeSelectedEvent]
  }
}

