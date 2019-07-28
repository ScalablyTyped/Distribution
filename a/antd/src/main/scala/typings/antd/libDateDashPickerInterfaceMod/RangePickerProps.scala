package typings.antd.libDateDashPickerInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.antd.Anon_DisabledHours
import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.libTimeDashPickerMod.TimePickerProps
import typings.moment.momentMod.Moment
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangePickerProps extends PickerProps {
  var defaultPickerValue: js.UndefOr[RangePickerValue] = js.undefined
  var defaultValue: js.UndefOr[RangePickerValue] = js.undefined
  var disabledTime: js.UndefOr[
    js.Function2[/* current */ js.UndefOr[Moment], /* type */ String, Anon_DisabledHours]
  ] = js.undefined
  var mode: js.UndefOr[String | js.Array[String]] = js.undefined
  var onCalendarChange: js.UndefOr[
    js.Function2[/* dates */ RangePickerValue, /* dateStrings */ js.Tuple2[String, String], Unit]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* dates */ RangePickerValue, /* dateStrings */ js.Tuple2[String, String], Unit]
  ] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* selectedTime */ RangePickerPresetRange, Unit]] = js.undefined
  var onPanelChange: js.UndefOr[
    js.Function2[
      /* value */ js.UndefOr[RangePickerValue], 
      /* mode */ js.UndefOr[String | js.Array[String]], 
      Unit
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  var ranges: js.UndefOr[StringDictionary[RangePickerPresetRange]] = js.undefined
  var renderExtraFooter: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  var separator: js.UndefOr[ReactNode] = js.undefined
  var showTime: js.UndefOr[TimePickerProps | Boolean] = js.undefined
  var showToday: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[RangePickerValue] = js.undefined
}

object RangePickerProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    dateRender: (/* current */ Moment, /* today */ Moment) => ReactNode = null,
    defaultPickerValue: RangePickerValue = null,
    defaultValue: RangePickerValue = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledDate: /* current */ js.UndefOr[Moment] => Boolean = null,
    disabledTime: (/* current */ js.UndefOr[Moment], /* type */ String) => Anon_DisabledHours = null,
    dropdownClassName: String = null,
    format: String | js.Array[String] = null,
    getCalendarContainer: /* triggerNode */ Element => HTMLElement = null,
    id: Double | String = null,
    inputPrefixCls: String = null,
    locale: js.Any = null,
    mode: String | js.Array[String] = null,
    name: String = null,
    onCalendarChange: (/* dates */ RangePickerValue, /* dateStrings */ js.Tuple2[String, String]) => Unit = null,
    onChange: (/* dates */ RangePickerValue, /* dateStrings */ js.Tuple2[String, String]) => Unit = null,
    onOk: /* selectedTime */ RangePickerPresetRange => Unit = null,
    onOpenChange: /* status */ Boolean => Unit = null,
    onPanelChange: (/* value */ js.UndefOr[RangePickerValue], /* mode */ js.UndefOr[String | js.Array[String]]) => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: js.Tuple2[String, String] = null,
    popupStyle: CSSProperties = null,
    prefixCls: String = null,
    ranges: StringDictionary[RangePickerPresetRange] = null,
    renderExtraFooter: () => ReactNode = null,
    separator: ReactNode = null,
    showTime: TimePickerProps | Boolean = null,
    showToday: js.UndefOr[Boolean] = js.undefined,
    size: large | small | default = null,
    style: CSSProperties = null,
    suffixIcon: ReactNode = null,
    value: RangePickerValue = null
  ): RangePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (className != null) __obj.updateDynamic("className")(className)
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (disabledTime != null) __obj.updateDynamic("disabledTime")(js.Any.fromFunction2(disabledTime))
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (getCalendarContainer != null) __obj.updateDynamic("getCalendarContainer")(js.Any.fromFunction1(getCalendarContainer))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onCalendarChange != null) __obj.updateDynamic("onCalendarChange")(js.Any.fromFunction2(onCalendarChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1(onOpenChange))
    if (onPanelChange != null) __obj.updateDynamic("onPanelChange")(js.Any.fromFunction2(onPanelChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (ranges != null) __obj.updateDynamic("ranges")(ranges)
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(js.Any.fromFunction0(renderExtraFooter))
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (showTime != null) __obj.updateDynamic("showTime")(showTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showToday)) __obj.updateDynamic("showToday")(showToday)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangePickerProps]
  }
}

