package typings
package agDashGridLib.distLibGridApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCellsParams extends js.Object {
  var columns: js.UndefOr[js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column]] = js.undefined
  var rowNodes: js.UndefOr[js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode]] = js.undefined
}

object GetCellsParams {
  @scala.inline
  def apply(
    columns: js.Array[java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column] = null,
    rowNodes: js.Array[agDashGridLib.distLibEntitiesRowNodeMod.RowNode] = null
  ): GetCellsParams = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (rowNodes != null) __obj.updateDynamic("rowNodes")(rowNodes)
    __obj.asInstanceOf[GetCellsParams]
  }
}

