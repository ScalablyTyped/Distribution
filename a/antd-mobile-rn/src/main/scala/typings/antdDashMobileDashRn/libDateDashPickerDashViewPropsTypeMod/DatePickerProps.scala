package typings.antdDashMobileDashRn.libDateDashPickerDashViewPropsTypeMod

import typings.antdDashMobileDashRn.Anon_DatePickerLocale
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.date
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.datetime
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.month
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.time
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.year
import typings.antdDashMobileDashRn.libDateDashPickerPropsTypeMod.DatePickerPropsType
import typings.react.reactMod.ReactNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerProps extends DatePickerPropsType {
  var onScrollChange: js.UndefOr[js.Function3[/* newValue */ js.Any, /* vals */ js.Any, /* index */ Double, Unit]] = js.undefined
  /** rn only */
  var styles: js.UndefOr[js.Any] = js.undefined
  /** rn only */
  var triggerTypes: js.UndefOr[String] = js.undefined
}

object DatePickerProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
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
    onScrollChange: (/* newValue */ js.Any, /* vals */ js.Any, /* index */ Double) => Unit = null,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Unit = null,
    styles: js.Any = null,
    title: ReactNode = null,
    triggerTypes: String = null,
    value: Date = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): DatePickerProps = {
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
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction3(onScrollChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2(onValueChange))
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (triggerTypes != null) __obj.updateDynamic("triggerTypes")(triggerTypes)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[DatePickerProps]
  }
}

