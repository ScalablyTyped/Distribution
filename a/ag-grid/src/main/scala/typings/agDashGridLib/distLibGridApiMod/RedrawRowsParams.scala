package typings
package agDashGridLib.distLibGridApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedrawRowsParams extends js.Object {
  var rowNodes: js.UndefOr[js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode]] = js.undefined
}

object RedrawRowsParams {
  @scala.inline
  def apply(rowNodes: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = null): RedrawRowsParams = {
    val __obj = js.Dynamic.literal()
    if (rowNodes != null) __obj.updateDynamic("rowNodes")(rowNodes)
    __obj.asInstanceOf[RedrawRowsParams]
  }
}

