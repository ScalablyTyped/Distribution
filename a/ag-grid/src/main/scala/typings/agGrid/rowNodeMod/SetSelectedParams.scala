package typings.agGrid.rowNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetSelectedParams extends js.Object {
  var clearSelection: js.UndefOr[Boolean] = js.native
  var groupSelectsFiltered: js.UndefOr[Boolean] = js.native
  var newValue: Boolean = js.native
  var rangeSelect: js.UndefOr[Boolean] = js.native
  var suppressFinishActions: js.UndefOr[Boolean] = js.native
}

object SetSelectedParams {
  @scala.inline
  def apply(newValue: Boolean): SetSelectedParams = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSelectedParams]
  }
  @scala.inline
  implicit class SetSelectedParamsOps[Self <: SetSelectedParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNewValue(value: Boolean): Self = this.set("newValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearSelection(value: Boolean): Self = this.set("clearSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearSelection: Self = this.set("clearSelection", js.undefined)
    @scala.inline
    def setGroupSelectsFiltered(value: Boolean): Self = this.set("groupSelectsFiltered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSelectsFiltered: Self = this.set("groupSelectsFiltered", js.undefined)
    @scala.inline
    def setRangeSelect(value: Boolean): Self = this.set("rangeSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeSelect: Self = this.set("rangeSelect", js.undefined)
    @scala.inline
    def setSuppressFinishActions(value: Boolean): Self = this.set("suppressFinishActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressFinishActions: Self = this.set("suppressFinishActions", js.undefined)
  }
  
}

