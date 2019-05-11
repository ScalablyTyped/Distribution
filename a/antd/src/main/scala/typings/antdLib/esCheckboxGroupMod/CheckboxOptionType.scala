package typings
package antdLib.esCheckboxGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxOptionType extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var label: reactLib.reactMod.ReactNode
  var onChange: js.UndefOr[
    js.Function1[/* e */ antdLib.esCheckboxCheckboxMod.CheckboxChangeEvent, scala.Unit]
  ] = js.undefined
  var value: CheckboxValueType
}

object CheckboxOptionType {
  @scala.inline
  def apply(
    label: reactLib.reactMod.ReactNode,
    value: CheckboxValueType,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* e */ antdLib.esCheckboxCheckboxMod.CheckboxChangeEvent => scala.Unit = null
  ): CheckboxOptionType = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[CheckboxOptionType]
  }
}

