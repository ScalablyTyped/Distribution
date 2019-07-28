package typings.antdDashMobile.esInputDashItemMod

import typings.antdDashMobile.antdDashMobileStrings.bankCard
import typings.antdDashMobile.antdDashMobileStrings.center
import typings.antdDashMobile.antdDashMobileStrings.digit
import typings.antdDashMobile.antdDashMobileStrings.left
import typings.antdDashMobile.antdDashMobileStrings.money
import typings.antdDashMobile.antdDashMobileStrings.number
import typings.antdDashMobile.antdDashMobileStrings.password
import typings.antdDashMobile.antdDashMobileStrings.phone
import typings.antdDashMobile.antdDashMobileStrings.text
import typings.antdDashMobile.antdDashMobileStrings.top
import typings.antdDashMobile.esInputDashItemPropsTypeMod.InputEventHandler
import typings.antdDashMobile.esInputDashItemPropsTypeMod.InputItemPropsType
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLProps<std.HTMLInputElement>, 'onChange' | 'onFocus' | 'onBlur' | 'value' | 'defaultValue' | 'type'> ]: react.react.HTMLProps<std.HTMLInputElement>[P]} */ trait InputItemProps extends InputItemPropsType {
  var autoAdjustHeight: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var onErrorClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var onExtraClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var prefixListCls: js.UndefOr[String] = js.undefined
}

object InputItemProps {
  @scala.inline
  def apply(
    autoAdjustHeight: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clear: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: ReactNode = null,
    labelNumber: Int | Double = null,
    labelPosition: left | top = null,
    locale: js.Object = null,
    maxLength: Int | Double = null,
    moneyKeyboardAlign: String = null,
    moneyKeyboardHeader: ReactNode = null,
    moneyKeyboardWrapProps: js.Object = null,
    name: String = null,
    onBlur: InputEventHandler = null,
    onChange: /* value */ String => Unit = null,
    onErrorClick: MouseEventHandler[HTMLDivElement] = null,
    onExtraClick: MouseEventHandler[HTMLDivElement] = null,
    onFocus: InputEventHandler = null,
    onVirtualKeyboardConfirm: InputEventHandler = null,
    placeholder: String = null,
    prefixCls: String = null,
    prefixListCls: String = null,
    textAlign: left | center = null,
    `type`: text | bankCard | phone | password | number | digit | money = null,
    updatePlaceholder: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): InputItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoAdjustHeight)) __obj.updateDynamic("autoAdjustHeight")(autoAdjustHeight)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (labelNumber != null) __obj.updateDynamic("labelNumber")(labelNumber.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (moneyKeyboardAlign != null) __obj.updateDynamic("moneyKeyboardAlign")(moneyKeyboardAlign)
    if (moneyKeyboardHeader != null) __obj.updateDynamic("moneyKeyboardHeader")(moneyKeyboardHeader.asInstanceOf[js.Any])
    if (moneyKeyboardWrapProps != null) __obj.updateDynamic("moneyKeyboardWrapProps")(moneyKeyboardWrapProps)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onErrorClick != null) __obj.updateDynamic("onErrorClick")(onErrorClick)
    if (onExtraClick != null) __obj.updateDynamic("onExtraClick")(onExtraClick)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onVirtualKeyboardConfirm != null) __obj.updateDynamic("onVirtualKeyboardConfirm")(onVirtualKeyboardConfirm)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (prefixListCls != null) __obj.updateDynamic("prefixListCls")(prefixListCls)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(updatePlaceholder)) __obj.updateDynamic("updatePlaceholder")(updatePlaceholder)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[InputItemProps]
  }
}

