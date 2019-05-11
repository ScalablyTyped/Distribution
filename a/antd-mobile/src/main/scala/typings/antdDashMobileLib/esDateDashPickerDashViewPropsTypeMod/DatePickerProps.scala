package typings
package antdDashMobileLib.esDateDashPickerDashViewPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps
  extends antdDashMobileLib.esDateDashPickerPropsTypeMod.DatePickerPropsType {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onScrollChange: js.UndefOr[
    js.Function3[/* newValue */ js.Any, /* vals */ js.Any, /* index */ scala.Double, scala.Unit]
  ] = js.undefined
  var pickerPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dismissText: reactLib.reactMod.ReactNode = null,
    extra: java.lang.String = null,
    format: java.lang.String | (js.Function1[/* value */ stdLib.Date, java.lang.String]) = null,
    locale: antdDashMobileLib.Anon_DatePickerLocale = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    minuteStep: scala.Int | scala.Double = null,
    mode: antdDashMobileLib.antdDashMobileLibStrings.datetime | antdDashMobileLib.antdDashMobileLibStrings.date | antdDashMobileLib.antdDashMobileLibStrings.year | antdDashMobileLib.antdDashMobileLibStrings.month | antdDashMobileLib.antdDashMobileLibStrings.time = null,
    okText: reactLib.reactMod.ReactNode = null,
    onChange: /* value */ stdLib.Date => scala.Unit = null,
    onDismiss: () => scala.Unit = null,
    onScrollChange: (/* newValue */ js.Any, /* vals */ js.Any, /* index */ scala.Double) => scala.Unit = null,
    onValueChange: (/* vals */ js.Any, /* index */ scala.Double) => scala.Unit = null,
    pickerPrefixCls: java.lang.String = null,
    prefixCls: java.lang.String = null,
    title: reactLib.reactMod.ReactNode = null,
    value: stdLib.Date = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): DatePickerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction3(onScrollChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[DatePickerProps]
  }
}

