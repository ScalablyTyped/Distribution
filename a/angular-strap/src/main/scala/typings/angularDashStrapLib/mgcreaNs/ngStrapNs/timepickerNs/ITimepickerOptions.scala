package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.timepickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimepickerOptions extends js.Object {
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var arrowBehaviour: js.UndefOr[java.lang.String] = js.undefined
  var autoclose: js.UndefOr[scala.Boolean] = js.undefined
  var container: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var delay: js.UndefOr[scala.Double | angularDashStrapLib.Anon_Hide] = js.undefined
  var hourStep: js.UndefOr[scala.Double] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
  var iconDown: js.UndefOr[java.lang.String] = js.undefined
  var iconUp: js.UndefOr[java.lang.String] = js.undefined
   // TODO
  var length: js.UndefOr[scala.Double] = js.undefined
   // TODO
  var maxTime: js.UndefOr[stdLib.Date] = js.undefined
  var minTime: js.UndefOr[stdLib.Date] = js.undefined
  var minuteStep: js.UndefOr[scala.Double] = js.undefined
  var modelTimeFormat: js.UndefOr[java.lang.String] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, scala.Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, scala.Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, scala.Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, scala.Unit]] = js.undefined
  var placement: js.UndefOr[java.lang.String] = js.undefined
  var roundDisplay: js.UndefOr[scala.Boolean] = js.undefined
  var secondStep: js.UndefOr[scala.Double] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
  var timeFormat: js.UndefOr[java.lang.String] = js.undefined
  var timeType: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[java.lang.String] = js.undefined
  var useNative: js.UndefOr[scala.Boolean] = js.undefined
}

object ITimepickerOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    arrowBehaviour: java.lang.String = null,
    autoclose: js.UndefOr[scala.Boolean] = js.undefined,
    container: java.lang.String | scala.Boolean = null,
    delay: scala.Double | angularDashStrapLib.Anon_Hide = null,
    hourStep: scala.Int | scala.Double = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    iconDown: java.lang.String = null,
    iconUp: java.lang.String = null,
    length: scala.Int | scala.Double = null,
    maxTime: stdLib.Date = null,
    minTime: stdLib.Date = null,
    minuteStep: scala.Int | scala.Double = null,
    modelTimeFormat: java.lang.String = null,
    onBeforeHide: /* timepicker */ ITimepicker => scala.Unit = null,
    onBeforeShow: /* timepicker */ ITimepicker => scala.Unit = null,
    onHide: /* timepicker */ ITimepicker => scala.Unit = null,
    onShow: /* timepicker */ ITimepicker => scala.Unit = null,
    placement: java.lang.String = null,
    roundDisplay: js.UndefOr[scala.Boolean] = js.undefined,
    secondStep: scala.Int | scala.Double = null,
    template: java.lang.String = null,
    timeFormat: java.lang.String = null,
    timeType: java.lang.String = null,
    trigger: java.lang.String = null,
    useNative: js.UndefOr[scala.Boolean] = js.undefined
  ): ITimepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (arrowBehaviour != null) __obj.updateDynamic("arrowBehaviour")(arrowBehaviour)
    if (!js.isUndefined(autoclose)) __obj.updateDynamic("autoclose")(autoclose)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (iconDown != null) __obj.updateDynamic("iconDown")(iconDown)
    if (iconUp != null) __obj.updateDynamic("iconUp")(iconUp)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime)
    if (minTime != null) __obj.updateDynamic("minTime")(minTime)
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (modelTimeFormat != null) __obj.updateDynamic("modelTimeFormat")(modelTimeFormat)
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1(onBeforeHide))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1(onBeforeShow))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1(onHide))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(roundDisplay)) __obj.updateDynamic("roundDisplay")(roundDisplay)
    if (secondStep != null) __obj.updateDynamic("secondStep")(secondStep.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat)
    if (timeType != null) __obj.updateDynamic("timeType")(timeType)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative)
    __obj.asInstanceOf[ITimepickerOptions]
  }
}

