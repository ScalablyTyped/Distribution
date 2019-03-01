package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.datepickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatepickerOptions extends js.Object {
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var autoclose: js.UndefOr[scala.Boolean] = js.undefined
  var container: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var dateFormat: js.UndefOr[java.lang.String] = js.undefined
  var dateType: js.UndefOr[java.lang.String] = js.undefined
  var daysOfWeekDisabled: js.UndefOr[java.lang.String] = js.undefined
  var delay: js.UndefOr[scala.Double | angularDashStrapLib.Anon_Hide] = js.undefined
  var disabledDates: js.UndefOr[js.Array[IDatepickerDateRange]] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var iconLeft: js.UndefOr[java.lang.String] = js.undefined
  var iconRight: js.UndefOr[java.lang.String] = js.undefined
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  var minView: js.UndefOr[scala.Double] = js.undefined
  var modelDateFormat: js.UndefOr[java.lang.String] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, scala.Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, scala.Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, scala.Unit]] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var startDate: js.UndefOr[stdLib.Date] = js.undefined
  var startView: js.UndefOr[scala.Double] = js.undefined
  var startWeek: js.UndefOr[scala.Double] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[java.lang.String] = js.undefined
  var useNative: js.UndefOr[scala.Boolean] = js.undefined
}

object IDatepickerOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    autoclose: js.UndefOr[scala.Boolean] = js.undefined,
    container: java.lang.String | scala.Boolean = null,
    dateFormat: java.lang.String = null,
    dateType: java.lang.String = null,
    daysOfWeekDisabled: java.lang.String = null,
    delay: scala.Double | angularDashStrapLib.Anon_Hide = null,
    disabledDates: js.Array[IDatepickerDateRange] = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    iconLeft: java.lang.String = null,
    iconRight: java.lang.String = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    minView: scala.Int | scala.Double = null,
    modelDateFormat: java.lang.String = null,
    onBeforeHide: js.Function1[/* datepicker */ IDatepicker, scala.Unit] = null,
    onBeforeShow: js.Function1[/* datepicker */ IDatepicker, scala.Unit] = null,
    onHide: js.Function1[/* datepicker */ IDatepicker, scala.Unit] = null,
    onShow: js.Function1[/* datepicker */ IDatepicker, scala.Unit] = null,
    placement: java.lang.String = null,
    startDate: stdLib.Date = null,
    startView: scala.Int | scala.Double = null,
    startWeek: scala.Int | scala.Double = null,
    template: java.lang.String = null,
    timezone: java.lang.String = null,
    trigger: java.lang.String = null,
    useNative: js.UndefOr[scala.Boolean] = js.undefined
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
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(onBeforeHide)
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(onBeforeShow)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
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

