package typings
package antdLib.libTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeCheckedEvent extends AntTreeNodeBaseEvent {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var checkedNodes: js.UndefOr[js.Array[AntTreeNode]] = js.undefined
  var event: antdLib.antdLibStrings.check
}

object AntTreeNodeCheckedEvent {
  @scala.inline
  def apply(
    event: antdLib.antdLibStrings.check,
    nativeEvent: reactLib.MouseEvent,
    node: AntTreeNode,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    checkedNodes: js.Array[AntTreeNode] = null
  ): AntTreeNodeCheckedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("nativeEvent")(nativeEvent)
    __obj.updateDynamic("node")(node)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (checkedNodes != null) __obj.updateDynamic("checkedNodes")(checkedNodes)
    __obj.asInstanceOf[AntTreeNodeCheckedEvent]
  }
}

