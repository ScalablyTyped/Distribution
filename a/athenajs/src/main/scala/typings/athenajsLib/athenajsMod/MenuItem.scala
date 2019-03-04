package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var selectable: scala.Boolean
  var text: java.lang.String
  var visible: scala.Boolean
}

object MenuItem {
  @scala.inline
  def apply(
    selectable: scala.Boolean,
    text: java.lang.String,
    visible: scala.Boolean,
    active: js.UndefOr[scala.Boolean] = js.undefined
  ): MenuItem = {
    val __obj = js.Dynamic.literal(selectable = selectable, text = text, visible = visible)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    __obj.asInstanceOf[MenuItem]
  }
}

