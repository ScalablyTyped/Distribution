package typings
package antdLib.libDateDashPickerInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps
  extends PickerProps
     with SinglePickerProps {
  var disabledTime: js.UndefOr[
    js.Function1[
      /* current */ js.UndefOr[momentLib.momentMod.momentNs.Moment], 
      antdLib.Anon_DisabledHours
    ]
  ] = js.undefined
  var mode: js.UndefOr[
    antdLib.antdLibStrings.time | antdLib.antdLibStrings.date | antdLib.antdLibStrings.month | antdLib.antdLibStrings.year
  ] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* selectedTime */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var showTime: js.UndefOr[antdLib.libTimeDashPickerMod.TimePickerProps | scala.Boolean] = js.undefined
  var showToday: js.UndefOr[scala.Boolean] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    dateRender: js.Function2[
      /* current */ momentLib.momentMod.momentNs.Moment, 
      /* today */ momentLib.momentMod.momentNs.Moment, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    defaultPickerValue: momentLib.momentMod.momentNs.Moment = null,
    defaultValue: momentLib.momentMod.momentNs.Moment = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledDate: js.Function1[/* current */ js.UndefOr[momentLib.momentMod.momentNs.Moment], scala.Boolean] = null,
    disabledTime: js.Function1[
      /* current */ js.UndefOr[momentLib.momentMod.momentNs.Moment], 
      antdLib.Anon_DisabledHours
    ] = null,
    dropdownClassName: java.lang.String = null,
    format: java.lang.String | js.Array[java.lang.String] = null,
    getCalendarContainer: js.Function1[/* triggerNode */ reactLib.Element, reactLib.HTMLElement] = null,
    id: scala.Double | java.lang.String = null,
    inputPrefixCls: java.lang.String = null,
    locale: js.Any = null,
    mode: antdLib.antdLibStrings.time | antdLib.antdLibStrings.date | antdLib.antdLibStrings.month | antdLib.antdLibStrings.year = null,
    onChange: js.Function2[
      /* date */ momentLib.momentMod.momentNs.Moment, 
      /* dateString */ java.lang.String, 
      scala.Unit
    ] = null,
    onOk: js.Function1[/* selectedTime */ momentLib.momentMod.momentNs.Moment, scala.Unit] = null,
    onOpenChange: js.Function1[/* status */ scala.Boolean, scala.Unit] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: java.lang.String = null,
    popupStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    prefixCls: java.lang.String = null,
    renderExtraFooter: js.Function0[reactLib.reactMod.ReactNs.ReactNode] = null,
    showTime: antdLib.libTimeDashPickerMod.TimePickerProps | scala.Boolean = null,
    showToday: js.UndefOr[scala.Boolean] = js.undefined,
    size: antdLib.antdLibStrings.large | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    suffixIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    value: momentLib.momentMod.momentNs.Moment = null
  ): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (className != null) __obj.updateDynamic("className")(className)
    if (dateRender != null) __obj.updateDynamic("dateRender")(dateRender)
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(disabledDate)
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(disabledTime)
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (getCalendarContainer != null) __obj.updateDynamic("getCalendarContainer")(getCalendarContainer)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onOk != null) __obj.updateDynamic("onOk")(onOk)
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(onOpenChange)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(renderExtraFooter)
    if (showTime != null) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showToday)) __obj.updateDynamic("showToday")(showToday)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DatePickerProps]
  }
}

