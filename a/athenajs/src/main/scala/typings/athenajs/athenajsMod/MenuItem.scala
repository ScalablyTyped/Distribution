package typings.athenajs.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var selectable: Boolean
  var text: String
  var visible: Boolean
}

object MenuItem {
  @scala.inline
  def apply(selectable: Boolean, text: String, visible: Boolean, active: js.UndefOr[Boolean] = js.undefined): MenuItem = {
    val __obj = js.Dynamic.literal(selectable = selectable.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
}

