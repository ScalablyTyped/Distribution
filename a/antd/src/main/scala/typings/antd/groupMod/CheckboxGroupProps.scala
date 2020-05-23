package typings.antd.groupMod

import typings.react.mod.CSSProperties
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
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxGroupProps]
  }
}

