package typings
package antdDashMobileLib.esInputDashItemCustomInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberInputProps extends js.Object {
  var autoAdjustHeight: js.UndefOr[scala.Boolean] = js.undefined
  var backspaceLabel: js.Any
  var cancelKeyboardLabel: js.Any
  var confirmLabel: js.Any
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  var keyboardPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  var moneyKeyboardAlign: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.left | antdDashMobileLib.antdDashMobileLibStrings.right | java.lang.String
  ] = js.undefined
  var moneyKeyboardHeader: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var moneyKeyboardWrapProps: js.UndefOr[js.Object] = js.undefined
  var onBlur: js.UndefOr[antdDashMobileLib.esInputDashItemPropsTypeMod.InputEventHandler] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement], scala.Unit]
  ] = js.undefined
  var onFocus: js.UndefOr[antdDashMobileLib.esInputDashItemPropsTypeMod.InputEventHandler] = js.undefined
  var onVirtualKeyboardConfirm: js.UndefOr[antdDashMobileLib.esInputDashItemPropsTypeMod.InputEventHandler] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object NumberInputProps {
  @scala.inline
  def apply(
    backspaceLabel: js.Any,
    cancelKeyboardLabel: js.Any,
    confirmLabel: js.Any,
    autoAdjustHeight: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardPrefixCls: java.lang.String = null,
    maxLength: scala.Int | scala.Double = null,
    moneyKeyboardAlign: antdDashMobileLib.antdDashMobileLibStrings.left | antdDashMobileLib.antdDashMobileLibStrings.right | java.lang.String = null,
    moneyKeyboardHeader: reactLib.reactMod.ReactNode = null,
    moneyKeyboardWrapProps: js.Object = null,
    onBlur: antdDashMobileLib.esInputDashItemPropsTypeMod.InputEventHandler = null,
    onChange: /* e */ reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement] => scala.Unit = null,
    onFocus: antdDashMobileLib.esInputDashItemPropsTypeMod.InputEventHandler = null,
    onVirtualKeyboardConfirm: antdDashMobileLib.esInputDashItemPropsTypeMod.InputEventHandler = null,
    placeholder: java.lang.String = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    `type`: java.lang.String = null,
    value: java.lang.String = null
  ): NumberInputProps = {
    val __obj = js.Dynamic.literal(backspaceLabel = backspaceLabel, cancelKeyboardLabel = cancelKeyboardLabel, confirmLabel = confirmLabel)
    if (!js.isUndefined(autoAdjustHeight)) __obj.updateDynamic("autoAdjustHeight")(autoAdjustHeight)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (keyboardPrefixCls != null) __obj.updateDynamic("keyboardPrefixCls")(keyboardPrefixCls)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (moneyKeyboardAlign != null) __obj.updateDynamic("moneyKeyboardAlign")(moneyKeyboardAlign.asInstanceOf[js.Any])
    if (moneyKeyboardHeader != null) __obj.updateDynamic("moneyKeyboardHeader")(moneyKeyboardHeader.asInstanceOf[js.Any])
    if (moneyKeyboardWrapProps != null) __obj.updateDynamic("moneyKeyboardWrapProps")(moneyKeyboardWrapProps)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onVirtualKeyboardConfirm != null) __obj.updateDynamic("onVirtualKeyboardConfirm")(onVirtualKeyboardConfirm)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[NumberInputProps]
  }
}

