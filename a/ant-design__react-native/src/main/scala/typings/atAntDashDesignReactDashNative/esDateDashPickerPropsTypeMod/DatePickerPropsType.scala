package typings.atAntDashDesignReactDashNative.esDateDashPickerPropsTypeMod

import typings.atAntDashDesignReactDashNative.Anon_DatePickerLocale
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.date
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.datetime
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.month
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.time
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.year
import typings.atAntDashDesignReactDashNative.esDateDashPickerDatepickerDatePickerPropsMod.DatePickerProps
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerPropsType extends DatePickerProps {
  var children: js.UndefOr[ReactNode] = js.undefined
  var dismissText: js.UndefOr[ReactNode] = js.undefined
  var extra: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String | (js.Function1[/* value */ Date, String])] = js.undefined
  @JSName("locale")
  var locale_DatePickerPropsType: js.UndefOr[Anon_DatePickerLocale] = js.undefined
  @JSName("maxDate")
  var maxDate_DatePickerPropsType: js.UndefOr[Date] = js.undefined
  @JSName("minDate")
  var minDate_DatePickerPropsType: js.UndefOr[Date] = js.undefined
  @JSName("mode")
  var mode_DatePickerPropsType: js.UndefOr[datetime | date | year | month | time] = js.undefined
  var okText: js.UndefOr[ReactNode] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ Date, Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var value: js.UndefOr[Date] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object DatePickerPropsType {
  @scala.inline
  def apply(
    children: ReactNode = null,
    date: js.Any = null,
    defaultDate: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dismissText: ReactNode = null,
    extra: String = null,
    format: String | (js.Function1[/* value */ Date, String]) = null,
    formatDay: (/* day */ Double, /* date */ js.UndefOr[js.Any]) => _ = null,
    formatMonth: (/* month */ Double, /* date */ js.UndefOr[js.Any]) => _ = null,
    itemStyle: StyleProp[ViewStyle] = null,
    locale: Anon_DatePickerLocale = null,
    maxDate: Date = null,
    minDate: Date = null,
    minuteStep: Int | Double = null,
    mode: datetime | date | year | month | time = null,
    okText: ReactNode = null,
    onChange: /* value */ Date => Unit = null,
    onDateChange: /* date */ js.Any => Unit = null,
    onDismiss: () => Unit = null,
    onScrollChange: (/* date */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit = null,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Unit = null,
    rootNativeProps: js.Object = null,
    style: StyleProp[ViewStyle] = null,
    title: ReactNode = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: Date = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DatePickerPropsType = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date)
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatDay != null) __obj.updateDynamic("formatDay")(js.Any.fromFunction2(formatDay))
    if (formatMonth != null) __obj.updateDynamic("formatMonth")(js.Any.fromFunction2(formatMonth))
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction1(onDateChange))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction3(onScrollChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[DatePickerPropsType]
  }
}

