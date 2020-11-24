package typings.angularBootstrapCalendar.mod.bootstrap.calendar

import typings.angularBootstrapCalendar.anon.Angular
import typings.angularBootstrapCalendar.anon.CalendarDayView
import typings.angularBootstrapCalendar.anon.WeekNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalendarConfig extends js.Object {
  
  var allDateFormats: Angular = js.native
  
  var dateFormats: IDateFormats = js.native
  
  var dateFormatter: String = js.native
  
  var displayAllMonthEvents: Boolean = js.native
  
  var displayEventEndTimes: Boolean = js.native
  
  var i18nStrings: WeekNumber = js.native
  
  var showTimesOnWeekView: Boolean = js.native
  
  var templates: CalendarDayView = js.native
  
  var titleFormats: ITitleFormats = js.native
}
object ICalendarConfig {
  
  @scala.inline
  def apply(
    allDateFormats: Angular,
    dateFormats: IDateFormats,
    dateFormatter: String,
    displayAllMonthEvents: Boolean,
    displayEventEndTimes: Boolean,
    i18nStrings: WeekNumber,
    showTimesOnWeekView: Boolean,
    templates: CalendarDayView,
    titleFormats: ITitleFormats
  ): ICalendarConfig = {
    val __obj = js.Dynamic.literal(allDateFormats = allDateFormats.asInstanceOf[js.Any], dateFormats = dateFormats.asInstanceOf[js.Any], dateFormatter = dateFormatter.asInstanceOf[js.Any], displayAllMonthEvents = displayAllMonthEvents.asInstanceOf[js.Any], displayEventEndTimes = displayEventEndTimes.asInstanceOf[js.Any], i18nStrings = i18nStrings.asInstanceOf[js.Any], showTimesOnWeekView = showTimesOnWeekView.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], titleFormats = titleFormats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarConfig]
  }
  
  @scala.inline
  implicit class ICalendarConfigOps[Self <: ICalendarConfig] (val x: Self) extends AnyVal {
    
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
    def setAllDateFormats(value: Angular): Self = this.set("allDateFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormats(value: IDateFormats): Self = this.set("dateFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFormatter(value: String): Self = this.set("dateFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAllMonthEvents(value: Boolean): Self = this.set("displayAllMonthEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayEventEndTimes(value: Boolean): Self = this.set("displayEventEndTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI18nStrings(value: WeekNumber): Self = this.set("i18nStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTimesOnWeekView(value: Boolean): Self = this.set("showTimesOnWeekView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplates(value: CalendarDayView): Self = this.set("templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleFormats(value: ITitleFormats): Self = this.set("titleFormats", value.asInstanceOf[js.Any])
  }
}
