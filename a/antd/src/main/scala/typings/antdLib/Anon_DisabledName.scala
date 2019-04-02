package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledName extends js.Object {
  var disabled: js.UndefOr[scala.Boolean]
  var name: js.UndefOr[java.lang.String]
  var value: js.Any
  def toggleOption(option: antdLib.libCheckboxGroupMod.CheckboxOptionType): scala.Unit
}

object Anon_DisabledName {
  @scala.inline
  def apply(
    toggleOption: antdLib.libCheckboxGroupMod.CheckboxOptionType => scala.Unit,
    value: js.Any,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null
  ): Anon_DisabledName = {
    val __obj = js.Dynamic.literal(toggleOption = js.Any.fromFunction1(toggleOption), value = value)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_DisabledName]
  }
}

