package typings.antd.libTimeDashPickerMod

import typings.antd.antdStrings.AM
import typings.antd.antdStrings.PM
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.moment.momentMod.Moment
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerProps extends js.Object {
  var addon: js.UndefOr[js.Function] = js.undefined
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clearIcon: js.UndefOr[ReactNode] = js.undefined
  var clearText: js.UndefOr[String] = js.undefined
  var defaultOpenValue: js.UndefOr[Moment] = js.undefined
  var defaultValue: js.UndefOr[Moment | js.Array[Moment]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
  var disabledMinutes: js.UndefOr[js.Function1[/* selectedHour */ Double, js.Array[Double]]] = js.undefined
  var disabledSeconds: js.UndefOr[
    js.Function2[/* selectedHour */ Double, /* selectedMinute */ Double, js.Array[Double]]
  ] = js.undefined
  var focusOnOpen: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var hideDisabledOptions: js.UndefOr[Boolean] = js.undefined
  var hourStep: js.UndefOr[Double] = js.undefined
  var inputReadOnly: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[TimePickerLocale] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var onAmPmChange: js.UndefOr[js.Function1[/* ampm */ AM | PM, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* time */ Moment, /* timeString */ String, Unit]] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popupClassName: js.UndefOr[String] = js.undefined
  var popupStyle: js.UndefOr[CSSProperties] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var secondStep: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[large | typings.antd.antdStrings.default | small] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var suffixIcon: js.UndefOr[ReactNode] = js.undefined
  var use12Hours: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[Moment] = js.undefined
}

object TimePickerProps {
  @scala.inline
  def apply(
    addon: js.Function = null,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    clearIcon: ReactNode = null,
    clearText: String = null,
    defaultOpenValue: Moment = null,
    defaultValue: Moment | js.Array[Moment] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledHours: () => js.Array[Double] = null,
    disabledMinutes: /* selectedHour */ Double => js.Array[Double] = null,
    disabledSeconds: (/* selectedHour */ Double, /* selectedMinute */ Double) => js.Array[Double] = null,
    focusOnOpen: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    getPopupContainer: /* triggerNode */ HTMLElement => HTMLElement = null,
    hideDisabledOptions: js.UndefOr[Boolean] = js.undefined,
    hourStep: Int | Double = null,
    inputReadOnly: js.UndefOr[Boolean] = js.undefined,
    locale: TimePickerLocale = null,
    minuteStep: Int | Double = null,
    onAmPmChange: /* ampm */ AM | PM => Unit = null,
    onChange: (/* time */ Moment, /* timeString */ String) => Unit = null,
    onOpenChange: /* open */ Boolean => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    popupClassName: String = null,
    popupStyle: CSSProperties = null,
    prefixCls: String = null,
    secondStep: Int | Double = null,
    size: large | typings.antd.antdStrings.default | small = null,
    style: CSSProperties = null,
    suffixIcon: ReactNode = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: Moment = null
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
    if (locale != null) __obj.updateDynamic("locale")(locale)
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

