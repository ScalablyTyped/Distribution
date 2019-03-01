package typings
package antdLib.libRadioInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioGroupProps
  extends antdLib.libCheckboxGroupMod.AbstractCheckboxGroupProps {
  var buttonStyle: js.UndefOr[RadioGroupButtonStyle] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ RadioChangeEvent, scala.Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLDivElement]] = js.undefined
  var onMouseLeave: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLDivElement]] = js.undefined
  var size: js.UndefOr[
    antdLib.antdLibStrings.large | antdLib.antdLibStrings.default | antdLib.antdLibStrings.small
  ] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object RadioGroupProps {
  @scala.inline
  def apply(
    buttonStyle: RadioGroupButtonStyle = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    defaultValue: js.Any = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    name: java.lang.String = null,
    onChange: js.Function1[/* e */ RadioChangeEvent, scala.Unit] = null,
    onMouseEnter: reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLDivElement] = null,
    onMouseLeave: reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLDivElement] = null,
    options: js.Array[antdLib.libCheckboxGroupMod.CheckboxOptionType | java.lang.String] = null,
    prefixCls: java.lang.String = null,
    size: antdLib.antdLibStrings.large | antdLib.antdLibStrings.default | antdLib.antdLibStrings.small = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
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
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (options != null) __obj.updateDynamic("options")(options)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RadioGroupProps]
  }
}

