package typings.antdDashMobile.libDateDashPickerMod

import typings.antdDashMobile.Anon_DatePickerLocale
import typings.antdDashMobile.antdDashMobileStrings.date
import typings.antdDashMobile.antdDashMobileStrings.datetime
import typings.antdDashMobile.antdDashMobileStrings.month
import typings.antdDashMobile.antdDashMobileStrings.time
import typings.antdDashMobile.antdDashMobileStrings.year
import typings.antdDashMobile.libDateDashPickerPropsTypeMod.DatePickerPropsType
import typings.react.reactMod.ReactNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends DatePickerPropsType {
  var className: js.UndefOr[String] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* x */ js.Any, Unit]] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var pickerPrefixCls: js.UndefOr[String] = js.undefined
  var popupPrefixCls: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var use12Hours: js.UndefOr[Boolean] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dismissText: ReactNode = null,
    extra: String = null,
    format: String | (js.Function1[/* value */ Date, String]) = null,
    locale: Anon_DatePickerLocale = null,
    maxDate: Date = null,
    minDate: Date = null,
    minuteStep: Int | Double = null,
    mode: datetime | date | year | month | time = null,
    okText: ReactNode = null,
    onChange: /* value */ Date => Unit = null,
    onDismiss: () => Unit = null,
    onOk: /* x */ js.Any => Unit = null,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Unit = null,
    onVisibleChange: /* visible */ Boolean => Unit = null,
    pickerPrefixCls: String = null,
    popupPrefixCls: String = null,
    prefixCls: String = null,
    title: ReactNode = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: Date = null,
    visible: js.UndefOr[Boolean] = js.undefined
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

