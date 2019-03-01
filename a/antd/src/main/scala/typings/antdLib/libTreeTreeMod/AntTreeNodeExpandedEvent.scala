package typings
package antdLib.libTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeExpandedEvent extends AntTreeNodeBaseEvent {
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
}

object AntTreeNodeExpandedEvent {
  @scala.inline
  def apply(
    nativeEvent: reactLib.MouseEvent,
    node: AntTreeNode,
    expanded: js.UndefOr[scala.Boolean] = js.undefined
  ): AntTreeNodeExpandedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nativeEvent")(nativeEvent)
    __obj.updateDynamic("node")(node)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    __obj.asInstanceOf[AntTreeNodeExpandedEvent]
  }
}

