package typings
package antdDashMobileLib.libInputDashItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.React.HTMLProps<std.HTMLInputElement>, 'onChange' | 'onFocus' | 'onBlur' | 'value' | 'defaultValue' | 'type'> ]: react.react.React.HTMLProps<std.HTMLInputElement>[P]} */ trait InputItemProps
  extends antdDashMobileLib.libInputDashItemPropsTypeMod.InputItemPropsType {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onErrorClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLDivElement]] = js.undefined
  var onExtraClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLDivElement]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var prefixListCls: js.UndefOr[java.lang.String] = js.undefined
}

object InputItemProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    clear: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    extra: reactLib.reactMod.ReactNs.ReactNode = null,
    labelNumber: scala.Int | scala.Double = null,
    labelPosition: antdDashMobileLib.antdDashMobileLibStrings.left | antdDashMobileLib.antdDashMobileLibStrings.top = null,
    locale: js.Object = null,
    maxLength: scala.Int | scala.Double = null,
    moneyKeyboardAlign: java.lang.String = null,
    moneyKeyboardHeader: reactLib.reactMod.ReactNs.ReactNode = null,
    moneyKeyboardWrapProps: js.Object = null,
    name: java.lang.String = null,
    onBlur: antdDashMobileLib.libInputDashItemPropsTypeMod.InputEventHandler = null,
    onChange: /* value */ java.lang.String => scala.Unit = null,
    onErrorClick: reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLDivElement] = null,
    onExtraClick: reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLDivElement] = null,
    onFocus: antdDashMobileLib.libInputDashItemPropsTypeMod.InputEventHandler = null,
    onVirtualKeyboardConfirm: antdDashMobileLib.libInputDashItemPropsTypeMod.InputEventHandler = null,
    placeholder: java.lang.String = null,
    prefixCls: java.lang.String = null,
    prefixListCls: java.lang.String = null,
    textAlign: antdDashMobileLib.antdDashMobileLibStrings.left | antdDashMobileLib.antdDashMobileLibStrings.center = null,
    `type`: antdDashMobileLib.antdDashMobileLibStrings.text | antdDashMobileLib.antdDashMobileLibStrings.bankCard | antdDashMobileLib.antdDashMobileLibStrings.phone | antdDashMobileLib.antdDashMobileLibStrings.password | antdDashMobileLib.antdDashMobileLibStrings.number | antdDashMobileLib.antdDashMobileLibStrings.digit | antdDashMobileLib.antdDashMobileLibStrings.money = null,
    updatePlaceholder: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
  ): InputItemProps = {
    val __obj = js.Dynamic.literal()
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

