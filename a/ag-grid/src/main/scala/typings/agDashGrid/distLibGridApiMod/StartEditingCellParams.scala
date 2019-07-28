package typings.agDashGrid.distLibGridApiMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartEditingCellParams extends js.Object {
  var charPress: js.UndefOr[String] = js.undefined
  var colKey: String | Column
  var keyPress: js.UndefOr[Double] = js.undefined
  var rowIndex: Double
  var rowPinned: js.UndefOr[String] = js.undefined
}

object StartEditingCellParams {
  @scala.inline
  def apply(
    colKey: String | Column,
    rowIndex: Double,
    charPress: String = null,
    keyPress: Int | Double = null,
    rowPinned: String = null
  ): StartEditingCellParams = {
    val __obj = js.Dynamic.literal(colKey = colKey.asInstanceOf[js.Any], rowIndex = rowIndex)
    if (charPress != null) __obj.updateDynamic("charPress")(charPress)
    if (keyPress != null) __obj.updateDynamic("keyPress")(keyPress.asInstanceOf[js.Any])
    if (rowPinned != null) __obj.updateDynamic("rowPinned")(rowPinned)
    __obj.asInstanceOf[StartEditingCellParams]
  }
}

