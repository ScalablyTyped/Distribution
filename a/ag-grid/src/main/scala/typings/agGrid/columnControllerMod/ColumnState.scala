package typings.agGrid.columnControllerMod

import typings.agGrid.agGridStrings.left
import typings.agGrid.agGridStrings.right
import typings.agGrid.colDefMod.IAggFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnState extends js.Object {
  var aggFunc: js.UndefOr[String | IAggFunc] = js.undefined
  var colId: String
  var hide: js.UndefOr[Boolean] = js.undefined
  var pinned: js.UndefOr[Boolean | String | left | right] = js.undefined
  var pivotIndex: js.UndefOr[Double] = js.undefined
  var rowGroupIndex: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ColumnState {
  @scala.inline
  def apply(
    colId: String,
    aggFunc: String | IAggFunc = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    pinned: Boolean | String | left | right = null,
    pivotIndex: js.UndefOr[Double] = js.undefined,
    rowGroupIndex: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ColumnState = {
    val __obj = js.Dynamic.literal(colId = colId.asInstanceOf[js.Any])
    if (aggFunc != null) __obj.updateDynamic("aggFunc")(aggFunc.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.get.asInstanceOf[js.Any])
    if (pinned != null) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (!js.isUndefined(pivotIndex)) __obj.updateDynamic("pivotIndex")(pivotIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowGroupIndex)) __obj.updateDynamic("rowGroupIndex")(rowGroupIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnState]
  }
}

