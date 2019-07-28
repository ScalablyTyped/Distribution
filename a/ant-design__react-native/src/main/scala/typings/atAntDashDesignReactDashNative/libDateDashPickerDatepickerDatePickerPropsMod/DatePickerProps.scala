package typings.atAntDashDesignReactDashNative.libDateDashPickerDatepickerDatePickerPropsMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends js.Object {
  var date: js.UndefOr[js.Any] = js.undefined
  var defaultDate: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var formatDay: js.UndefOr[js.Function2[/* day */ Double, /* date */ js.UndefOr[js.Any], _]] = js.undefined
  var formatMonth: js.UndefOr[js.Function2[/* month */ Double, /* date */ js.UndefOr[js.Any], _]] = js.undefined
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var locale: js.UndefOr[js.Any] = js.undefined
  var maxDate: js.UndefOr[js.Any] = js.undefined
  var minDate: js.UndefOr[js.Any] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var onDateChange: js.UndefOr[js.Function1[/* date */ js.Any, Unit]] = js.undefined
  var onScrollChange: js.UndefOr[js.Function3[/* date */ js.Any, /* vals */ js.Any, /* index */ Double, Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function2[/* vals */ js.Any, /* index */ Double, Unit]] = js.undefined
  var rootNativeProps: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var use12Hours: js.UndefOr[Boolean] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    date: js.Any = null,
    defaultDate: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    formatDay: (/* day */ Double, /* date */ js.UndefOr[js.Any]) => _ = null,
    formatMonth: (/* month */ Double, /* date */ js.UndefOr[js.Any]) => _ = null,
    itemStyle: StyleProp[ViewStyle] = null,
    locale: js.Any = null,
    maxDate: js.Any = null,
    minDate: js.Any = null,
    minuteStep: Int | Double = null,
    mode: String = null,
    onDateChange: /* date */ js.Any => Unit = null,
    onScrollChange: (/* date */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit = null,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Unit = null,
    rootNativeProps: js.Object = null,
    style: StyleProp[ViewStyle] = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined
  ): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (formatDay != null) __obj.updateDynamic("formatDay")(js.Any.fromFunction2(formatDay))
    if (formatMonth != null) __obj.updateDynamic("formatMonth")(js.Any.fromFunction2(formatMonth))
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction1(onDateChange))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction3(onScrollChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours)
    __obj.asInstanceOf[DatePickerProps]
  }
}

