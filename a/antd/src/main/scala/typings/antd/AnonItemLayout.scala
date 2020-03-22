package typings.antd

import typings.antd.antdStrings.horizontal
import typings.antd.antdStrings.vertical
import typings.antd.listMod.ListGridType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemLayout extends js.Object {
  var grid: js.UndefOr[ListGridType] = js.undefined
  var itemLayout: js.UndefOr[horizontal | vertical] = js.undefined
}

object AnonItemLayout {
  @scala.inline
  def apply(grid: ListGridType = null, itemLayout: horizontal | vertical = null): AnonItemLayout = {
    val __obj = js.Dynamic.literal()
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (itemLayout != null) __obj.updateDynamic("itemLayout")(itemLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemLayout]
  }
}

