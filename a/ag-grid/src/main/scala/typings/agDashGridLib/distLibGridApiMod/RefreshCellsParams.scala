package typings
package agDashGridLib.distLibGridApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshCellsParams extends GetCellsParams {
  var force: js.UndefOr[scala.Boolean] = js.undefined
}

object RefreshCellsParams {
  @scala.inline
  def apply(
    columns: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column] = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    rowNodes: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = null
  ): RefreshCellsParams = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (rowNodes != null) __obj.updateDynamic("rowNodes")(rowNodes)
    __obj.asInstanceOf[RefreshCellsParams]
  }
}

