package typings
package agDashGridLib.distLibGridApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartEditingCellParams extends js.Object {
  var charPress: js.UndefOr[java.lang.String] = js.undefined
  var colKey: java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column
  var keyPress: js.UndefOr[scala.Double] = js.undefined
  var rowIndex: scala.Double
  var rowPinned: js.UndefOr[java.lang.String] = js.undefined
}

object StartEditingCellParams {
  @scala.inline
  def apply(
    colKey: java.lang.String | agDashGridLib.distLibEntitiesColumnMod.Column,
    rowIndex: scala.Double,
    charPress: java.lang.String = null,
    keyPress: scala.Int | scala.Double = null,
    rowPinned: java.lang.String = null
  ): StartEditingCellParams = {
    val __obj = js.Dynamic.literal(colKey = colKey.asInstanceOf[js.Any], rowIndex = rowIndex)
    if (charPress != null) __obj.updateDynamic("charPress")(charPress)
    if (keyPress != null) __obj.updateDynamic("keyPress")(keyPress.asInstanceOf[js.Any])
    if (rowPinned != null) __obj.updateDynamic("rowPinned")(rowPinned)
    __obj.asInstanceOf[StartEditingCellParams]
  }
}

