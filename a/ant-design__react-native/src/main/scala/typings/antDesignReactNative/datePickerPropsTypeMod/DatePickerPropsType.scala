package typings.antDesignReactNative.datePickerPropsTypeMod

import typings.antDesignReactNative.anon.DatePickerLocale
import typings.antDesignReactNative.antDesignReactNativeStrings.date
import typings.antDesignReactNative.antDesignReactNativeStrings.datetime
import typings.antDesignReactNative.antDesignReactNativeStrings.month
import typings.antDesignReactNative.antDesignReactNativeStrings.time
import typings.antDesignReactNative.antDesignReactNativeStrings.year
import typings.antDesignReactNative.datePickerPropsMod.DatePickerProps
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerPropsType extends DatePickerProps {
  var children: js.UndefOr[ReactNode] = js.undefined
  @JSName("defaultDate")
  var defaultDate_DatePickerPropsType: js.UndefOr[Date] = js.undefined
  var dismissText: js.UndefOr[ReactNode] = js.undefined
  var extra: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String | (js.Function1[/* value */ Date, String])] = js.undefined
  @JSName("locale")
  var locale_DatePickerPropsType: js.UndefOr[DatePickerLocale] = js.undefined
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
    defaultDate: Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dismissText: ReactNode = null,
    extra: String = null,
    format: String | (js.Function1[/* value */ Date, String]) = null,
    formatDay: (/* day */ Double, /* date */ js.UndefOr[js.Any]) => _ = null,
    formatMonth: (/* month */ Double, /* date */ js.UndefOr[js.Any]) => _ = null,
    itemStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    locale: DatePickerLocale = null,
    maxDate: Date = null,
    minDate: Date = null,
    minuteStep: js.UndefOr[Double] = js.undefined,
    mode: datetime | date | year | month | time = null,
    okText: ReactNode = null,
    onChange: /* value */ Date => Unit = null,
    onDateChange: /* date */ js.Any => Unit = null,
    onDismiss: () => Unit = null,
    onScrollChange: (/* date */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit = null,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Unit = null,
    rootNativeProps: js.Object = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    title: ReactNode = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: Date = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DatePickerPropsType = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatDay != null) __obj.updateDynamic("formatDay")(js.Any.fromFunction2(formatDay))
    if (formatMonth != null) __obj.updateDynamic("formatMonth")(js.Any.fromFunction2(formatMonth))
    if (!js.isUndefined(itemStyle)) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (!js.isUndefined(minuteStep)) __obj.updateDynamic("minuteStep")(minuteStep.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction1(onDateChange))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction3(onScrollChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerPropsType]
  }
}

