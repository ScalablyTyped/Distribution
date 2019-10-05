package typings.angularDashStrap.mgcrea.ngStrap.timepicker

import typings.angularDashStrap.Anon_Hide
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimepickerOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var arrowBehaviour: js.UndefOr[String] = js.undefined
  var autoclose: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var delay: js.UndefOr[Double | Anon_Hide] = js.undefined
  var hourStep: js.UndefOr[Double] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var iconDown: js.UndefOr[String] = js.undefined
  var iconUp: js.UndefOr[String] = js.undefined
   // TODO
  var length: js.UndefOr[Double] = js.undefined
   // TODO
  var maxTime: js.UndefOr[Date] = js.undefined
  var minTime: js.UndefOr[Date] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var modelTimeFormat: js.UndefOr[String] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var roundDisplay: js.UndefOr[Boolean] = js.undefined
  var secondStep: js.UndefOr[Double] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var timeFormat: js.UndefOr[String] = js.undefined
  var timeType: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[String] = js.undefined
  var useNative: js.UndefOr[Boolean] = js.undefined
}

object ITimepickerOptions {
  @scala.inline
  def apply(
    animation: String = null,
    arrowBehaviour: String = null,
    autoclose: js.UndefOr[Boolean] = js.undefined,
    container: String | Boolean = null,
    delay: Double | Anon_Hide = null,
    hourStep: Int | Double = null,
    html: js.UndefOr[Boolean] = js.undefined,
    iconDown: String = null,
    iconUp: String = null,
    length: Int | Double = null,
    maxTime: Date = null,
    minTime: Date = null,
    minuteStep: Int | Double = null,
    modelTimeFormat: String = null,
    onBeforeHide: /* timepicker */ ITimepicker => Unit = null,
    onBeforeShow: /* timepicker */ ITimepicker => Unit = null,
    onHide: /* timepicker */ ITimepicker => Unit = null,
    onShow: /* timepicker */ ITimepicker => Unit = null,
    placement: String = null,
    roundDisplay: js.UndefOr[Boolean] = js.undefined,
    secondStep: Int | Double = null,
    template: String = null,
    timeFormat: String = null,
    timeType: String = null,
    trigger: String = null,
    useNative: js.UndefOr[Boolean] = js.undefined
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

