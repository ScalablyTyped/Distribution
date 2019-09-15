package typings.antd.libRadioInterfaceMod

import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.libCheckboxGroupMod.AbstractCheckboxGroupProps
import typings.antd.libCheckboxGroupMod.CheckboxOptionType
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioGroupProps extends AbstractCheckboxGroupProps {
  var buttonStyle: js.UndefOr[RadioGroupButtonStyle] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ RadioChangeEvent, Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var size: js.UndefOr[large | default | small] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object RadioGroupProps {
  @scala.inline
  def apply(
    buttonStyle: RadioGroupButtonStyle = null,
    children: ReactNode = null,
    className: String = null,
    defaultValue: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    name: String = null,
    onChange: /* e */ RadioChangeEvent => Unit = null,
    onMouseEnter: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    options: js.Array[CheckboxOptionType | String] = null,
    prefixCls: String = null,
    size: large | default | small = null,
    style: CSSProperties = null,
    value: js.Any = null
  ): RadioGroupProps = {
    val __obj = js.Dynamic.literal()
    if (buttonStyle != null) __obj.updateDynamic("buttonStyle")(buttonStyle)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (options != null) __obj.updateDynamic("options")(options)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RadioGroupProps]
  }
}

