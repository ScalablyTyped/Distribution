package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GridHorizontal extends js.Object {
  var grid: js.UndefOr[antdLib.esListMod.ListGridType]
  var itemLayout: js.UndefOr[antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical]
}

object Anon_GridHorizontal {
  @scala.inline
  def apply(
    grid: antdLib.esListMod.ListGridType = null,
    itemLayout: antdLib.antdLibStrings.horizontal | antdLib.antdLibStrings.vertical = null
  ): Anon_GridHorizontal = {
    val __obj = js.Dynamic.literal()
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (itemLayout != null) __obj.updateDynamic("itemLayout")(itemLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GridHorizontal]
  }
}

