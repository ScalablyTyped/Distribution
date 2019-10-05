package typings.antdDashMobile.libInputDashItemCustomInputMod

import typings.antdDashMobile.antdDashMobileStrings.left
import typings.antdDashMobile.antdDashMobileStrings.right
import typings.antdDashMobile.libInputDashItemPropsTypeMod.InputEventHandler
import typings.antdDashMobile.libInputDashItemPropsTypeMod.InputKey
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberInputProps extends js.Object {
  var autoAdjustHeight: js.UndefOr[Boolean] = js.undefined
  var backspaceLabel: js.Any
  var cancelKeyboardLabel: js.Any
  var confirmLabel: js.Any
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledKeys: js.UndefOr[js.Array[InputKey] | Null] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var keyboardPrefixCls: js.UndefOr[String] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var moneyKeyboardAlign: js.UndefOr[left | right | String] = js.undefined
  var moneyKeyboardHeader: js.UndefOr[ReactNode] = js.undefined
  var moneyKeyboardWrapProps: js.UndefOr[js.Object] = js.undefined
  var onBlur: js.UndefOr[InputEventHandler] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ ChangeEvent[HTMLInputElement], Unit]] = js.undefined
  var onFocus: js.UndefOr[InputEventHandler] = js.undefined
  var onVirtualKeyboardConfirm: js.UndefOr[InputEventHandler] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object NumberInputProps {
  @scala.inline
  def apply(
    backspaceLabel: js.Any,
    cancelKeyboardLabel: js.Any,
    confirmLabel: js.Any,
    autoAdjustHeight: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledKeys: js.Array[InputKey] = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    keyboardPrefixCls: String = null,
    maxLength: Int | Double = null,
    moneyKeyboardAlign: left | right | String = null,
    moneyKeyboardHeader: ReactNode = null,
    moneyKeyboardWrapProps: js.Object = null,
    onBlur: /* value */ js.UndefOr[String] => Unit = null,
    onChange: /* e */ ChangeEvent[HTMLInputElement] => Unit = null,
    onFocus: /* value */ js.UndefOr[String] => Unit = null,
    onVirtualKeyboardConfirm: /* value */ js.UndefOr[String] => Unit = null,
    placeholder: String = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    `type`: String = null,
    value: String = null
  ): NumberInputProps = {
    val __obj = js.Dynamic.literal(backspaceLabel = backspaceLabel, cancelKeyboardLabel = cancelKeyboardLabel, confirmLabel = confirmLabel)
    if (!js.isUndefined(autoAdjustHeight)) __obj.updateDynamic("autoAdjustHeight")(autoAdjustHeight)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledKeys != null) __obj.updateDynamic("disabledKeys")(disabledKeys)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (keyboardPrefixCls != null) __obj.updateDynamic("keyboardPrefixCls")(keyboardPrefixCls)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (moneyKeyboardAlign != null) __obj.updateDynamic("moneyKeyboardAlign")(moneyKeyboardAlign.asInstanceOf[js.Any])
    if (moneyKeyboardHeader != null) __obj.updateDynamic("moneyKeyboardHeader")(moneyKeyboardHeader.asInstanceOf[js.Any])
    if (moneyKeyboardWrapProps != null) __obj.updateDynamic("moneyKeyboardWrapProps")(moneyKeyboardWrapProps)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onVirtualKeyboardConfirm != null) __obj.updateDynamic("onVirtualKeyboardConfirm")(js.Any.fromFunction1(onVirtualKeyboardConfirm))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[NumberInputProps]
  }
}

