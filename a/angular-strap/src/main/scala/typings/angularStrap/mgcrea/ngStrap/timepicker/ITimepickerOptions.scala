package typings.angularStrap.mgcrea.ngStrap.timepicker

import typings.angularStrap.anon.Hide
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimepickerOptions extends js.Object {
  var animation: js.UndefOr[String] = js.native
  var arrowBehaviour: js.UndefOr[String] = js.native
  var autoclose: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String | Boolean] = js.native
  var delay: js.UndefOr[Double | Hide] = js.native
  var hourStep: js.UndefOr[Double] = js.native
  var html: js.UndefOr[Boolean] = js.native
  var iconDown: js.UndefOr[String] = js.native
  var iconUp: js.UndefOr[String] = js.native
   // TODO
  var length: js.UndefOr[Double] = js.native
   // TODO
  var maxTime: js.UndefOr[Date] = js.native
  var minTime: js.UndefOr[Date] = js.native
  var minuteStep: js.UndefOr[Double] = js.native
  var modelTimeFormat: js.UndefOr[String] = js.native
  var onBeforeHide: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.native
  var onBeforeShow: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.native
  var onHide: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.native
  var onShow: js.UndefOr[js.Function1[/* timepicker */ ITimepicker, Unit]] = js.native
  var placement: js.UndefOr[String] = js.native
  var roundDisplay: js.UndefOr[Boolean] = js.native
  var secondStep: js.UndefOr[Double] = js.native
  var template: js.UndefOr[String] = js.native
  var timeFormat: js.UndefOr[String] = js.native
  var timeType: js.UndefOr[String] = js.native
  var trigger: js.UndefOr[String] = js.native
  var useNative: js.UndefOr[Boolean] = js.native
}

object ITimepickerOptions {
  @scala.inline
  def apply(): ITimepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITimepickerOptions]
  }
  @scala.inline
  implicit class ITimepickerOptionsOps[Self <: ITimepickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setArrowBehaviour(value: String): Self = this.set("arrowBehaviour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowBehaviour: Self = this.set("arrowBehaviour", js.undefined)
    @scala.inline
    def setAutoclose(value: Boolean): Self = this.set("autoclose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoclose: Self = this.set("autoclose", js.undefined)
    @scala.inline
    def setContainer(value: String | Boolean): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDelay(value: Double | Hide): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setHourStep(value: Double): Self = this.set("hourStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHourStep: Self = this.set("hourStep", js.undefined)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setIconDown(value: String): Self = this.set("iconDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconDown: Self = this.set("iconDown", js.undefined)
    @scala.inline
    def setIconUp(value: String): Self = this.set("iconUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconUp: Self = this.set("iconUp", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setMaxTime(value: Date): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTime: Self = this.set("maxTime", js.undefined)
    @scala.inline
    def setMinTime(value: Date): Self = this.set("minTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTime: Self = this.set("minTime", js.undefined)
    @scala.inline
    def setMinuteStep(value: Double): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinuteStep: Self = this.set("minuteStep", js.undefined)
    @scala.inline
    def setModelTimeFormat(value: String): Self = this.set("modelTimeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelTimeFormat: Self = this.set("modelTimeFormat", js.undefined)
    @scala.inline
    def setOnBeforeHide(value: /* timepicker */ ITimepicker => Unit): Self = this.set("onBeforeHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeHide: Self = this.set("onBeforeHide", js.undefined)
    @scala.inline
    def setOnBeforeShow(value: /* timepicker */ ITimepicker => Unit): Self = this.set("onBeforeShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeShow: Self = this.set("onBeforeShow", js.undefined)
    @scala.inline
    def setOnHide(value: /* timepicker */ ITimepicker => Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnShow(value: /* timepicker */ ITimepicker => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setRoundDisplay(value: Boolean): Self = this.set("roundDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoundDisplay: Self = this.set("roundDisplay", js.undefined)
    @scala.inline
    def setSecondStep(value: Double): Self = this.set("secondStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondStep: Self = this.set("secondStep", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTimeFormat(value: String): Self = this.set("timeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeFormat: Self = this.set("timeFormat", js.undefined)
    @scala.inline
    def setTimeType(value: String): Self = this.set("timeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeType: Self = this.set("timeType", js.undefined)
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    @scala.inline
    def setUseNative(value: Boolean): Self = this.set("useNative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNative: Self = this.set("useNative", js.undefined)
  }
  
}

