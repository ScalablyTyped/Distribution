package typings.antd.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionCheckboxAllState extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var indeterminate: js.UndefOr[Boolean] = js.undefined
}

object SelectionCheckboxAllState {
  @scala.inline
  def apply(checked: js.UndefOr[Boolean] = js.undefined, indeterminate: js.UndefOr[Boolean] = js.undefined): SelectionCheckboxAllState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    __obj.asInstanceOf[SelectionCheckboxAllState]
  }
}

