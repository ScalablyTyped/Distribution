package typings
package agDashGridLib.distLibEntitiesRowNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetSelectedParams extends js.Object {
  var clearSelection: js.UndefOr[scala.Boolean] = js.undefined
  var groupSelectsFiltered: js.UndefOr[scala.Boolean] = js.undefined
  var newValue: scala.Boolean
  var rangeSelect: js.UndefOr[scala.Boolean] = js.undefined
  var suppressFinishActions: js.UndefOr[scala.Boolean] = js.undefined
}

object SetSelectedParams {
  @scala.inline
  def apply(
    newValue: scala.Boolean,
    clearSelection: js.UndefOr[scala.Boolean] = js.undefined,
    groupSelectsFiltered: js.UndefOr[scala.Boolean] = js.undefined,
    rangeSelect: js.UndefOr[scala.Boolean] = js.undefined,
    suppressFinishActions: js.UndefOr[scala.Boolean] = js.undefined
  ): SetSelectedParams = {
    val __obj = js.Dynamic.literal(newValue = newValue)
    if (!js.isUndefined(clearSelection)) __obj.updateDynamic("clearSelection")(clearSelection)
    if (!js.isUndefined(groupSelectsFiltered)) __obj.updateDynamic("groupSelectsFiltered")(groupSelectsFiltered)
    if (!js.isUndefined(rangeSelect)) __obj.updateDynamic("rangeSelect")(rangeSelect)
    if (!js.isUndefined(suppressFinishActions)) __obj.updateDynamic("suppressFinishActions")(suppressFinishActions)
    __obj.asInstanceOf[SetSelectedParams]
  }
}

