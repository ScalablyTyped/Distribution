package typings
package antdDashMobileLib.libDateDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType
  extends antdDashMobileLib.libDateDashPickerPropsTypeMod.DatePickerPropsType {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* x */ js.Any, scala.Unit]] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ scala.Boolean, scala.Unit]] = js.undefined
  var pickerPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var popupPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var use12Hours: js.UndefOr[scala.Boolean] = js.undefined
}

object PropsType {
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
    onOk: /* x */ js.Any => scala.Unit = null,
    onValueChange: (/* vals */ js.Any, /* index */ scala.Double) => scala.Unit = null,
    onVisibleChange: /* visible */ scala.Boolean => scala.Unit = null,
    pickerPrefixCls: java.lang.String = null,
    popupPrefixCls: java.lang.String = null,
    prefixCls: java.lang.String = null,
    title: reactLib.reactMod.ReactNode = null,
    use12Hours: js.UndefOr[scala.Boolean] = js.undefined,
    value: stdLib.Date = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): PropsType = {
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
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls)
    if (popupPrefixCls != null) __obj.updateDynamic("popupPrefixCls")(popupPrefixCls)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PropsType]
  }
}

