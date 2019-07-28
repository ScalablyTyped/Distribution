package typings.antd.esCheckboxGroupMod

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxGroupProps extends AbstractCheckboxGroupProps {
  var defaultValue: js.UndefOr[js.Array[CheckboxValueType]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* checkedValue */ js.Array[CheckboxValueType], Unit]] = js.undefined
  var value: js.UndefOr[js.Array[CheckboxValueType]] = js.undefined
}

object CheckboxGroupProps {
  @scala.inline
  def apply(
    className: String = null,
    defaultValue: js.Array[CheckboxValueType] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* checkedValue */ js.Array[CheckboxValueType] => Unit = null,
    options: js.Array[CheckboxOptionType | String] = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    value: js.Array[CheckboxValueType] = null
  ): CheckboxGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (options != null) __obj.updateDynamic("options")(options)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CheckboxGroupProps]
  }
}

