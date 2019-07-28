package typings.antd.esCheckboxGroupMod

import typings.antd.esCheckboxCheckboxMod.CheckboxChangeEvent
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxOptionType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: ReactNode
  var onChange: js.UndefOr[js.Function1[/* e */ CheckboxChangeEvent, Unit]] = js.undefined
  var value: CheckboxValueType
}

object CheckboxOptionType {
  @scala.inline
  def apply(
    label: ReactNode,
    value: CheckboxValueType,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* e */ CheckboxChangeEvent => Unit = null
  ): CheckboxOptionType = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[CheckboxOptionType]
  }
}

