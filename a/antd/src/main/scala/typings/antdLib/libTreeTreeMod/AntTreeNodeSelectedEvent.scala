package typings
package antdLib.libTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeSelectedEvent extends AntTreeNodeBaseEvent {
  var event: antdLib.antdLibStrings.select
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var selectedNodes: js.UndefOr[js.Array[AntTreeNode]] = js.undefined
}

object AntTreeNodeSelectedEvent {
  @scala.inline
  def apply(
    event: antdLib.antdLibStrings.select,
    nativeEvent: reactLib.MouseEvent,
    node: AntTreeNode,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    selectedNodes: js.Array[AntTreeNode] = null
  ): AntTreeNodeSelectedEvent = {
    val __obj = js.Dynamic.literal(event = event, nativeEvent = nativeEvent, node = node)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (selectedNodes != null) __obj.updateDynamic("selectedNodes")(selectedNodes)
    __obj.asInstanceOf[AntTreeNodeSelectedEvent]
  }
}

