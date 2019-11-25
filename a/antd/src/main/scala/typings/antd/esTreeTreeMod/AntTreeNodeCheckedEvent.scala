package typings.antd.esTreeTreeMod

import typings.antd.antdStrings.check
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeCheckedEvent extends AntTreeNodeBaseEvent {
  var checked: js.UndefOr[Boolean] = js.undefined
  var checkedNodes: js.UndefOr[js.Array[AntTreeNode]] = js.undefined
  var event: check
}

object AntTreeNodeCheckedEvent {
  @scala.inline
  def apply(
    event: check,
    nativeEvent: MouseEvent,
    node: AntTreeNode,
    checked: js.UndefOr[Boolean] = js.undefined,
    checkedNodes: js.Array[AntTreeNode] = null
  ): AntTreeNodeCheckedEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (checkedNodes != null) __obj.updateDynamic("checkedNodes")(checkedNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AntTreeNodeCheckedEvent]
  }
}

