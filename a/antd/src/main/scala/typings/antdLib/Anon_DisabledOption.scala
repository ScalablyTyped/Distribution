package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledOption extends js.Object {
  var disabled: js.UndefOr[scala.Boolean]
  var value: js.Any
  def toggleOption(option: antdLib.libCheckboxGroupMod.CheckboxOptionType): scala.Unit
}

object Anon_DisabledOption {
  @scala.inline
  def apply(
    toggleOption: js.Function1[antdLib.libCheckboxGroupMod.CheckboxOptionType, scala.Unit],
    value: js.Any,
    disabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DisabledOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toggleOption")(toggleOption)
    __obj.updateDynamic("value")(value)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[Anon_DisabledOption]
  }
}

