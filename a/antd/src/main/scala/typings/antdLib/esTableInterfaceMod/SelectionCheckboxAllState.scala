package typings
package antdLib.esTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionCheckboxAllState extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var indeterminate: js.UndefOr[scala.Boolean] = js.undefined
}

object SelectionCheckboxAllState {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    indeterminate: js.UndefOr[scala.Boolean] = js.undefined
  ): SelectionCheckboxAllState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    __obj.asInstanceOf[SelectionCheckboxAllState]
  }
}

