package typings.agGrid.rowNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSelectedParams extends js.Object {
  var clearSelection: js.UndefOr[Boolean] = js.undefined
  var groupSelectsFiltered: js.UndefOr[Boolean] = js.undefined
  var newValue: Boolean
  var rangeSelect: js.UndefOr[Boolean] = js.undefined
  var suppressFinishActions: js.UndefOr[Boolean] = js.undefined
}

object SetSelectedParams {
  @scala.inline
  def apply(
    newValue: Boolean,
    clearSelection: js.UndefOr[Boolean] = js.undefined,
    groupSelectsFiltered: js.UndefOr[Boolean] = js.undefined,
    rangeSelect: js.UndefOr[Boolean] = js.undefined,
    suppressFinishActions: js.UndefOr[Boolean] = js.undefined
  ): SetSelectedParams = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    if (!js.isUndefined(clearSelection)) __obj.updateDynamic("clearSelection")(clearSelection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupSelectsFiltered)) __obj.updateDynamic("groupSelectsFiltered")(groupSelectsFiltered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rangeSelect)) __obj.updateDynamic("rangeSelect")(rangeSelect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressFinishActions)) __obj.updateDynamic("suppressFinishActions")(suppressFinishActions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSelectedParams]
  }
}

