package typings
package antdLib.libTimeDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerProps extends js.Object {
  var addon: js.UndefOr[js.Function] = js.undefined
  var allowClear: js.UndefOr[scala.Boolean] = js.undefined
  var allowEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var clearIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var clearText: js.UndefOr[java.lang.String] = js.undefined
  var defaultOpenValue: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var defaultValue: js.UndefOr[
    momentLib.momentMod.momentNs.Moment | js.Array[momentLib.momentMod.momentNs.Moment]
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var disabledHours: js.UndefOr[js.Function0[js.Array[scala.Double]]] = js.undefined
  var disabledMinutes: js.UndefOr[js.Function1[/* selectedHour */ scala.Double, js.Array[scala.Double]]] = js.undefined
  var disabledSeconds: js.UndefOr[
    js.Function2[
      /* selectedHour */ scala.Double, 
      /* selectedMinute */ scala.Double, 
      js.Array[scala.Double]
    ]
  ] = js.undefined
  var focusOnOpen: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ stdLib.Element, stdLib.HTMLElement]] = js.undefined
  var hideDisabledOptions: js.UndefOr[scala.Boolean] = js.undefined
  var hourStep: js.UndefOr[scala.Double] = js.undefined
  var inputReadOnly: js.UndefOr[scala.Boolean] = js.undefined
  var minuteStep: js.UndefOr[scala.Double] = js.undefined
  var onAmPmChange: js.UndefOr[
    js.Function1[/* ampm */ antdLib.antdLibStrings.AM | antdLib.antdLibStrings.PM, scala.Unit]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* time */ momentLib.momentMod.momentNs.Moment, 
      /* timeString */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* open */ scala.Boolean, scala.Unit]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var popupClassName: js.UndefOr[java.lang.String] = js.undefined
  var popupStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var secondStep: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[
    antdLib.antdLibStrings.large | antdLib.antdLibStrings.default | antdLib.antdLibStrings.small
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var suffixIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var use12Hours: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
}

object TimePickerProps {
  @scala.inline
  def apply(
    addon: js.Function = null,
    allowClear: js.UndefOr[scala.Boolean] = js.undefined,
    allowEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    clearIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    clearText: java.lang.String = null,
    defaultOpenValue: momentLib.momentMod.momentNs.Moment = null,
    defaultValue: momentLib.momentMod.momentNs.Moment | js.Array[momentLib.momentMod.momentNs.Moment] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledHours: () => js.Array[scala.Double] = null,
    disabledMinutes: /* selectedHour */ scala.Double => js.Array[scala.Double] = null,
    disabledSeconds: (/* selectedHour */ scala.Double, /* selectedMinute */ scala.Double) => js.Array[scala.Double] = null,
    focusOnOpen: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    getPopupContainer: /* triggerNode */ stdLib.Element => stdLib.HTMLElement = null,
    hideDisabledOptions: js.UndefOr[scala.Boolean] = js.undefined,
    hourStep: scala.Int | scala.Double = null,
    inputReadOnly: js.UndefOr[scala.Boolean] = js.undefined,
    minuteStep: scala.Int | scala.Double = null,
    onAmPmChange: /* ampm */ antdLib.antdLibStrings.AM | antdLib.antdLibStrings.PM => scala.Unit = null,
    onChange: (/* time */ momentLib.momentMod.momentNs.Moment, /* timeString */ java.lang.String) => scala.Unit = null,
    onOpenChange: /* open */ scala.Boolean => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: java.lang.String = null,
    popupClassName: java.lang.String = null,
    popupStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    prefixCls: java.lang.String = null,
    secondStep: scala.Int | scala.Double = null,
    size: antdLib.antdLibStrings.large | antdLib.antdLibStrings.default | antdLib.antdLibStrings.small = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    suffixIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    use12Hours: js.UndefOr[scala.Boolean] = js.undefined,
    value: momentLib.momentMod.momentNs.Moment = null
  ): TimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (addon != null) __obj.updateDynamic("addon")(addon)
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty)
    if (className != null) __obj.updateDynamic("className")(className)
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (clearText != null) __obj.updateDynamic("clearText")(clearText)
    if (defaultOpenValue != null) __obj.updateDynamic("defaultOpenValue")(defaultOpenValue)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledHours != null) __obj.updateDynamic("disabledHours")(js.Any.fromFunction0(disabledHours))
    if (disabledMinutes != null) __obj.updateDynamic("disabledMinutes")(js.Any.fromFunction1(disabledMinutes))
    if (disabledSeconds != null) __obj.updateDynamic("disabledSeconds")(js.Any.fromFunction2(disabledSeconds))
    if (!js.isUndefined(focusOnOpen)) __obj.updateDynamic("focusOnOpen")(focusOnOpen)
    if (format != null) __obj.updateDynamic("format")(format)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (!js.isUndefined(hideDisabledOptions)) __obj.updateDynamic("hideDisabledOptions")(hideDisabledOptions)
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (!js.isUndefined(inputReadOnly)) __obj.updateDynamic("inputReadOnly")(inputReadOnly)
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (onAmPmChange != null) __obj.updateDynamic("onAmPmChange")(js.Any.fromFunction1(onAmPmChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popupClassName != null) __obj.updateDynamic("popupClassName")(popupClassName)
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (secondStep != null) __obj.updateDynamic("secondStep")(secondStep.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TimePickerProps]
  }
}

