package typings.agDashGrid.distLibColumnControllerColumnControllerMod

import typings.agDashGrid.agDashGridStrings.left
import typings.agDashGrid.agDashGridStrings.right
import typings.agDashGrid.distLibEntitiesColDefMod.IAggFunc
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
    pivotIndex: Int | Double = null,
    rowGroupIndex: Int | Double = null,
    width: Int | Double = null
  ): ColumnState = {
    val __obj = js.Dynamic.literal(colId = colId.asInstanceOf[js.Any])
    if (aggFunc != null) __obj.updateDynamic("aggFunc")(aggFunc.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (pinned != null) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (pivotIndex != null) __obj.updateDynamic("pivotIndex")(pivotIndex.asInstanceOf[js.Any])
    if (rowGroupIndex != null) __obj.updateDynamic("rowGroupIndex")(rowGroupIndex.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnState]
  }
}

