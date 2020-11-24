package typings.angularStrap.mgcrea.ngStrap.datepicker

import typings.angularStrap.anon.Hide
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatepickerOptions extends js.Object {
  
  var animation: js.UndefOr[String] = js.native
  
  var autoclose: js.UndefOr[Boolean] = js.native
  
  var container: js.UndefOr[String | Boolean] = js.native
  
  var dateFormat: js.UndefOr[String] = js.native
  
  var dateType: js.UndefOr[String] = js.native
  
  var daysOfWeekDisabled: js.UndefOr[String] = js.native
  
  var delay: js.UndefOr[Double | Hide] = js.native
  
  var disabledDates: js.UndefOr[js.Array[IDatepickerDateRange]] = js.native
  
  var html: js.UndefOr[Boolean] = js.native
  
  var iconLeft: js.UndefOr[String] = js.native
  
  var iconRight: js.UndefOr[String] = js.native
  
  var maxDate: js.UndefOr[Date] = js.native
  
  var minDate: js.UndefOr[Date] = js.native
  
  var minView: js.UndefOr[Double] = js.native
  
  var modelDateFormat: js.UndefOr[String] = js.native
  
  var onBeforeHide: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.native
  
  var onBeforeShow: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.native
  
  var onHide: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function1[/* datepicker */ IDatepicker, Unit]] = js.native
  
  var placement: js.UndefOr[String] = js.native
  
  var startDate: js.UndefOr[Date] = js.native
  
  var startView: js.UndefOr[Double] = js.native
  
  var startWeek: js.UndefOr[Double] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var timezone: js.UndefOr[String] = js.native
  
  var trigger: js.UndefOr[String] = js.native
  
  var useNative: js.UndefOr[Boolean] = js.native
}
object IDatepickerOptions {
  
  @scala.inline
  def apply(): IDatepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatepickerOptions]
  }
  
  @scala.inline
  implicit class IDatepickerOptionsOps[Self <: IDatepickerOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoclose(value: Boolean): Self = this.set("autoclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoclose: Self = this.set("autoclose", js.undefined)
    
    @scala.inline
    def setContainer(value: String | Boolean): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    
    @scala.inline
    def setDateType(value: String): Self = this.set("dateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateType: Self = this.set("dateType", js.undefined)
    
    @scala.inline
    def setDaysOfWeekDisabled(value: String): Self = this.set("daysOfWeekDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysOfWeekDisabled: Self = this.set("daysOfWeekDisabled", js.undefined)
    
    @scala.inline
    def setDelay(value: Double | Hide): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDisabledDatesVarargs(value: IDatepickerDateRange*): Self = this.set("disabledDates", js.Array(value :_*))
    
    @scala.inline
    def setDisabledDates(value: js.Array[IDatepickerDateRange]): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setIconLeft(value: String): Self = this.set("iconLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconLeft: Self = this.set("iconLeft", js.undefined)
    
    @scala.inline
    def setIconRight(value: String): Self = this.set("iconRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconRight: Self = this.set("iconRight", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMinView(value: Double): Self = this.set("minView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinView: Self = this.set("minView", js.undefined)
    
    @scala.inline
    def setModelDateFormat(value: String): Self = this.set("modelDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelDateFormat: Self = this.set("modelDateFormat", js.undefined)
    
    @scala.inline
    def setOnBeforeHide(value: /* datepicker */ IDatepicker => Unit): Self = this.set("onBeforeHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeHide: Self = this.set("onBeforeHide", js.undefined)
    
    @scala.inline
    def setOnBeforeShow(value: /* datepicker */ IDatepicker => Unit): Self = this.set("onBeforeShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeShow: Self = this.set("onBeforeShow", js.undefined)
    
    @scala.inline
    def setOnHide(value: /* datepicker */ IDatepicker => Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* datepicker */ IDatepicker => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setStartView(value: Double): Self = this.set("startView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartView: Self = this.set("startView", js.undefined)
    
    @scala.inline
    def setStartWeek(value: Double): Self = this.set("startWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartWeek: Self = this.set("startWeek", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    
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
