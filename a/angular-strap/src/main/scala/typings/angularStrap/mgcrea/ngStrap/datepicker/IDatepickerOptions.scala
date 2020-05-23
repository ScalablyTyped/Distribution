package typings.angularStrap.mgcrea.ngStrap.datepicker

import typings.angularStrap.anon.Hide
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
  var delay: js.UndefOr[Double | Hide] = js.undefined
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
    delay: Double | Hide = null,
    disabledDates: js.Array[IDatepickerDateRange] = null,
    html: js.UndefOr[Boolean] = js.undefined,
    iconLeft: String = null,
    iconRight: String = null,
    maxDate: Date = null,
    minDate: Date = null,
    minView: js.UndefOr[Double] = js.undefined,
    modelDateFormat: String = null,
    onBeforeHide: /* datepicker */ IDatepicker => Unit = null,
    onBeforeShow: /* datepicker */ IDatepicker => Unit = null,
    onHide: /* datepicker */ IDatepicker => Unit = null,
    onShow: /* datepicker */ IDatepicker => Unit = null,
    placement: String = null,
    startDate: Date = null,
    startView: js.UndefOr[Double] = js.undefined,
    startWeek: js.UndefOr[Double] = js.undefined,
    template: String = null,
    timezone: String = null,
    trigger: String = null,
    useNative: js.UndefOr[Boolean] = js.undefined
  ): IDatepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dateType != null) __obj.updateDynamic("dateType")(dateType.asInstanceOf[js.Any])
    if (daysOfWeekDisabled != null) __obj.updateDynamic("daysOfWeekDisabled")(daysOfWeekDisabled.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.get.asInstanceOf[js.Any])
    if (iconLeft != null) __obj.updateDynamic("iconLeft")(iconLeft.asInstanceOf[js.Any])
    if (iconRight != null) __obj.updateDynamic("iconRight")(iconRight.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (!js.isUndefined(minView)) __obj.updateDynamic("minView")(minView.get.asInstanceOf[js.Any])
    if (modelDateFormat != null) __obj.updateDynamic("modelDateFormat")(modelDateFormat.asInstanceOf[js.Any])
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1(onBeforeHide))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1(onBeforeShow))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (!js.isUndefined(startView)) __obj.updateDynamic("startView")(startView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startWeek)) __obj.updateDynamic("startWeek")(startWeek.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatepickerOptions]
  }
}

