package typings.angularDashStrap.mgcrea.ngStrap.datepicker

import typings.angularDashStrap.Anon_Hide
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatepickerOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var autoclose: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var dateFormat: js.UndefOr[String] = js.undefined
  var dateType: js.UndefOr[String] = js.undefined
  var daysOfWeekDisabled: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double | Anon_Hide] = js.undefined
  var disabledDates: js.UndefOr[js.Array[IDatepickerDateRange]] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var iconLeft: js.UndefOr[String] = js.undefined
  var iconRight: js.UndefOr[String] = js.undefined
  var maxDate: js.UndefOr[Date] = js.undefined
  var minDate: js.UndefOr[Date] = js.undefined
  var minView: js.UndefOr[Double] = js.undefined
  var modelDateFormat: js.UndefOr[String] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var startDate: js.UndefOr[Date] = js.undefined
  var startView: js.UndefOr[Double] = js.undefined
  var startWeek: js.UndefOr[Double] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
  var useNative: js.UndefOr[Boolean] = js.undefined
}

object IDatepickerOptions {
  @scala.inline
  def apply(
    animation: String = null,
    autoclose: js.UndefOr[Boolean] = js.undefined,
    container: String | Boolean = null,
    dateFormat: String = null,
    dateType: String = null,
    daysOfWeekDisabled: String = null,
    delay: Double | Anon_Hide = null,
    disabledDates: js.Array[IDatepickerDateRange] = null,
    html: js.UndefOr[Boolean] = js.undefined,
    iconLeft: String = null,
    iconRight: String = null,
    maxDate: Date = null,
    minDate: Date = null,
    minView: Int | Double = null,
    modelDateFormat: String = null,
    onBeforeHide: /* datepicker */ IDatepicker => Unit = null,
    onBeforeShow: /* datepicker */ IDatepicker => Unit = null,
    onHide: /* datepicker */ IDatepicker => Unit = null,
    onShow: /* datepicker */ IDatepicker => Unit = null,
    placement: String = null,
    startDate: Date = null,
    startView: Int | Double = null,
    startWeek: Int | Double = null,
    template: String = null,
    timezone: String = null,
    trigger: String = null,
    useNative: js.UndefOr[Boolean] = js.undefined
  ): IDatepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (dateType != null) __obj.updateDynamic("dateType")(dateType)
    if (daysOfWeekDisabled != null) __obj.updateDynamic("daysOfWeekDisabled")(daysOfWeekDisabled)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (iconLeft != null) __obj.updateDynamic("iconLeft")(iconLeft)
    if (iconRight != null) __obj.updateDynamic("iconRight")(iconRight)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (minView != null) __obj.updateDynamic("minView")(minView.asInstanceOf[js.Any])
    if (modelDateFormat != null) __obj.updateDynamic("modelDateFormat")(modelDateFormat)
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1(onBeforeHide))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1(onBeforeShow))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (startView != null) __obj.updateDynamic("startView")(startView.asInstanceOf[js.Any])
    if (startWeek != null) __obj.updateDynamic("startWeek")(startWeek.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative)
    __obj.asInstanceOf[IDatepickerOptions]
  }
}

