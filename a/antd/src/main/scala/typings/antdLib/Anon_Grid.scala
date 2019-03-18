package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Grid extends js.Object {
  var grid: js.UndefOr[antdLib.libListMod.ListGridType]
  var itemLayout: js.UndefOr[java.lang.String]
}

object Anon_Grid {
  @scala.inline
  def apply(grid: antdLib.libListMod.ListGridType = null, itemLayout: java.lang.String = null): Anon_Grid = {
    val __obj = js.Dynamic.literal()
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (itemLayout != null) __obj.updateDynamic("itemLayout")(itemLayout)
    __obj.asInstanceOf[Anon_Grid]
  }
}

