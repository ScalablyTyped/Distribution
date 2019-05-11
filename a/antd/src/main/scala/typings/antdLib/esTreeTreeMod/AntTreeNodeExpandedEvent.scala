package typings
package antdLib.esTreeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTreeNodeExpandedEvent extends AntTreeNodeBaseEvent {
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
}

object AntTreeNodeExpandedEvent {
  @scala.inline
  def apply(
    nativeEvent: stdLib.MouseEvent,
    node: AntTreeNode,
    expanded: js.UndefOr[scala.Boolean] = js.undefined
  ): AntTreeNodeExpandedEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent, node = node)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    __obj.asInstanceOf[AntTreeNodeExpandedEvent]
  }
}

