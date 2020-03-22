package typings.antd.groupMod

import typings.antd.checkboxCheckboxMod.CheckboxChangeEvent
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxOptionType extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var label: ReactNode
  var onChange: js.UndefOr[js.Function1[/* e */ CheckboxChangeEvent, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: CheckboxValueType
}

object CheckboxOptionType {
  @scala.inline
  def apply(
    value: CheckboxValueType,
    disabled: js.UndefOr[Boolean] = js.undefined,
    label: ReactNode = null,
    onChange: /* e */ CheckboxChangeEvent => Unit = null,
    style: CSSProperties = null
  ): CheckboxOptionType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxOptionType]
  }
}

