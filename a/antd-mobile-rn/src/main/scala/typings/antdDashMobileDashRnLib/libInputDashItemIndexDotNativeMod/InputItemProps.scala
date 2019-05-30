package typings
package antdDashMobileDashRnLib.libInputDashItemIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof any, 'onChange' | 'onFocus' | 'onBlur'> ]: any[P]} */ trait InputItemProps
  extends antdDashMobileDashRnLib.libInputDashItemPropsTypeMod.InputItemPropsType {
  var last: js.UndefOr[scala.Boolean] = js.undefined
  var onErrorClick: js.UndefOr[
    js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ]
  ] = js.undefined
  var onExtraClick: js.UndefOr[
    js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ]
  ] = js.undefined
}

object InputItemProps {
  @scala.inline
  def apply(
    clear: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    extra: reactLib.reactMod.ReactNode = null,
    labelNumber: scala.Int | scala.Double = null,
    labelPosition: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.left | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.top = null,
    last: js.UndefOr[scala.Boolean] = js.undefined,
    locale: js.Object = null,
    maxLength: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    onBlur: antdDashMobileDashRnLib.libInputDashItemPropsTypeMod.InputEventHandler = null,
    onChange: /* value */ java.lang.String => scala.Unit = null,
    onErrorClick: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onExtraClick: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onFocus: antdDashMobileDashRnLib.libInputDashItemPropsTypeMod.InputEventHandler = null,
    onVirtualKeyboardConfirm: antdDashMobileDashRnLib.libInputDashItemPropsTypeMod.InputEventHandler = null,
    placeholder: java.lang.String = null,
    styles: js.Any = null,
    textAlign: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.left | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.center = null,
    `type`: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.text | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.bankCard | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.phone | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.password | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.number | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.digit = null,
    updatePlaceholder: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
  ): InputItemProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clear)) __obj.updateDynamic("clear")(clear)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (labelNumber != null) __obj.updateDynamic("labelNumber")(labelNumber.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onErrorClick != null) __obj.updateDynamic("onErrorClick")(js.Any.fromFunction1(onErrorClick))
    if (onExtraClick != null) __obj.updateDynamic("onExtraClick")(js.Any.fromFunction1(onExtraClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onVirtualKeyboardConfirm != null) __obj.updateDynamic("onVirtualKeyboardConfirm")(onVirtualKeyboardConfirm)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(updatePlaceholder)) __obj.updateDynamic("updatePlaceholder")(updatePlaceholder)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[InputItemProps]
  }
}

