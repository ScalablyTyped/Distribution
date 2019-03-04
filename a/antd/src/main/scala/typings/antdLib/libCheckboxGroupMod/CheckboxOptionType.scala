package typings
package antdLib.libCheckboxGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxOptionType extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var label: reactLib.reactMod.ReactNs.ReactNode
  var onChange: js.UndefOr[
    js.Function1[/* e */ antdLib.libCheckboxCheckboxMod.CheckboxChangeEvent, scala.Unit]
  ] = js.undefined
  var value: CheckboxValueType
}

object CheckboxOptionType {
  @scala.inline
  def apply(
    label: reactLib.reactMod.ReactNs.ReactNode,
    value: CheckboxValueType,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: js.Function1[/* e */ antdLib.libCheckboxCheckboxMod.CheckboxChangeEvent, scala.Unit] = null
  ): CheckboxOptionType = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    __obj.asInstanceOf[CheckboxOptionType]
  }
}

