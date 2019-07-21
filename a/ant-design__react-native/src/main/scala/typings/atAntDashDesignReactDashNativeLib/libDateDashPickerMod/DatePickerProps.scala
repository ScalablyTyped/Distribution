package typings
package atAntDashDesignReactDashNativeLib.libDateDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps
  extends atAntDashDesignReactDashNativeLib.libDateDashPickerPropsTypeMod.DatePickerPropsType
     with atAntDashDesignReactDashNativeLib.libStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.libPickerStyleMod.PickerStyle] {
  var triggerTypes: js.UndefOr[java.lang.String] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    date: js.Any = null,
    defaultDate: js.Any = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    dismissText: reactLib.reactMod.ReactNode = null,
    extra: java.lang.String = null,
    format: java.lang.String | (js.Function1[/* value */ stdLib.Date, java.lang.String]) = null,
    formatDay: (/* day */ scala.Double, /* date */ js.UndefOr[js.Any]) => _ = null,
    formatMonth: (/* month */ scala.Double, /* date */ js.UndefOr[js.Any]) => _ = null,
    itemStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    locale: atAntDashDesignReactDashNativeLib.Anon_DatePickerLocale = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    minuteStep: scala.Int | scala.Double = null,
    mode: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.datetime | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.date | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.year | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.month | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.time = null,
    okText: reactLib.reactMod.ReactNode = null,
    onChange: /* value */ stdLib.Date => scala.Unit = null,
    onDateChange: /* date */ js.Any => scala.Unit = null,
    onDismiss: () => scala.Unit = null,
    onScrollChange: (/* date */ js.Any, /* vals */ js.Any, /* index */ scala.Double) => scala.Unit = null,
    onValueChange: (/* vals */ js.Any, /* index */ scala.Double) => scala.Unit = null,
    rootNativeProps: js.Object = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.libPickerStyleMod.PickerStyle] = null,
    title: reactLib.reactMod.ReactNode = null,
    triggerTypes: java.lang.String = null,
    use12Hours: js.UndefOr[scala.Boolean] = js.undefined,
    value: stdLib.Date = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): DatePickerProps = {
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
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (triggerTypes != null) __obj.updateDynamic("triggerTypes")(triggerTypes)
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[DatePickerProps]
  }
}

