package typings
package agDashGridLib.distLibColumnControllerColumnControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnState extends js.Object {
  var aggFunc: js.UndefOr[java.lang.String | agDashGridLib.distLibEntitiesColDefMod.IAggFunc] = js.undefined
  var colId: java.lang.String
  var hide: js.UndefOr[scala.Boolean] = js.undefined
  var pinned: js.UndefOr[
    scala.Boolean | java.lang.String | agDashGridLib.agDashGridLibStrings.left | agDashGridLib.agDashGridLibStrings.right
  ] = js.undefined
  var pivotIndex: js.UndefOr[scala.Double] = js.undefined
  var rowGroupIndex: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ColumnState {
  @scala.inline
  def apply(
    colId: java.lang.String,
    aggFunc: java.lang.String | agDashGridLib.distLibEntitiesColDefMod.IAggFunc = null,
    hide: js.UndefOr[scala.Boolean] = js.undefined,
    pinned: scala.Boolean | java.lang.String | agDashGridLib.agDashGridLibStrings.left | agDashGridLib.agDashGridLibStrings.right = null,
    pivotIndex: scala.Int | scala.Double = null,
    rowGroupIndex: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): ColumnState = {
    val __obj = js.Dynamic.literal(colId = colId)
    if (aggFunc != null) __obj.updateDynamic("aggFunc")(aggFunc.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide)
    if (pinned != null) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (pivotIndex != null) __obj.updateDynamic("pivotIndex")(pivotIndex.asInstanceOf[js.Any])
    if (rowGroupIndex != null) __obj.updateDynamic("rowGroupIndex")(rowGroupIndex.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnState]
  }
}

