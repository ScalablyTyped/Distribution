package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GridHorizontalItemLayout extends js.Object {
  var grid: js.UndefOr[antdLib.libListMod.ListGridType]
  var itemLayout: js.UndefOr[antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical]
}

object Anon_GridHorizontalItemLayout {
  @scala.inline
  def apply(
    grid: antdLib.libListMod.ListGridType = null,
    itemLayout: antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical = null
  ): Anon_GridHorizontalItemLayout = {
    val __obj = js.Dynamic.literal()
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (itemLayout != null) __obj.updateDynamic("itemLayout")(itemLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GridHorizontalItemLayout]
  }
}

