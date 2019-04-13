package typings
package antdDashMobileLib.libDateDashPickerPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerPropsType extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var dismissText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var extra: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String | (js.Function1[/* value */ stdLib.Date, java.lang.String])] = js.undefined
  var locale: js.UndefOr[antdDashMobileLib.Anon_DatePickerLocale] = js.undefined
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  var minuteStep: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.datetime | antdDashMobileLib.antdDashMobileLibStrings.date | antdDashMobileLib.antdDashMobileLibStrings.year | antdDashMobileLib.antdDashMobileLibStrings.month | antdDashMobileLib.antdDashMobileLibStrings.time
  ] = js.undefined
  var okText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ stdLib.Date, scala.Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function2[/* vals */ js.Any, /* index */ scala.Double, scala.Unit]] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var value: js.UndefOr[stdLib.Date] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object DatePickerPropsType {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
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
    onValueChange: (/* vals */ js.Any, /* index */ scala.Double) => scala.Unit = null,
    title: reactLib.reactMod.ReactNode = null,
    value: stdLib.Date = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): DatePickerPropsType = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
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
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[DatePickerPropsType]
  }
}

