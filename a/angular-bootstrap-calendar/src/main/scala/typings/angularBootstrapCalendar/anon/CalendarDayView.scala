package typings.angularBootstrapCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarDayView extends js.Object {
  
  var calendarDayView: String = js.native
  
  var calendarHourList: String = js.native
  
  var calendarMonthCell: String = js.native
  
  var calendarMonthCellEvents: String = js.native
  
  var calendarMonthView: String = js.native
  
  var calendarSlideBox: String = js.native
  
  var calendarWeekView: String = js.native
  
  var calendarYearView: String = js.native
}
object CalendarDayView {
  
  @scala.inline
  def apply(
    calendarDayView: String,
    calendarHourList: String,
    calendarMonthCell: String,
    calendarMonthCellEvents: String,
    calendarMonthView: String,
    calendarSlideBox: String,
    calendarWeekView: String,
    calendarYearView: String
  ): CalendarDayView = {
    val __obj = js.Dynamic.literal(calendarDayView = calendarDayView.asInstanceOf[js.Any], calendarHourList = calendarHourList.asInstanceOf[js.Any], calendarMonthCell = calendarMonthCell.asInstanceOf[js.Any], calendarMonthCellEvents = calendarMonthCellEvents.asInstanceOf[js.Any], calendarMonthView = calendarMonthView.asInstanceOf[js.Any], calendarSlideBox = calendarSlideBox.asInstanceOf[js.Any], calendarWeekView = calendarWeekView.asInstanceOf[js.Any], calendarYearView = calendarYearView.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDayView]
  }
  
  @scala.inline
  implicit class CalendarDayViewOps[Self <: CalendarDayView] (val x: Self) extends AnyVal {
    
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
    def setCalendarDayView(value: String): Self = this.set("calendarDayView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarHourList(value: String): Self = this.set("calendarHourList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarMonthCell(value: String): Self = this.set("calendarMonthCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarMonthCellEvents(value: String): Self = this.set("calendarMonthCellEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarMonthView(value: String): Self = this.set("calendarMonthView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarSlideBox(value: String): Self = this.set("calendarSlideBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarWeekView(value: String): Self = this.set("calendarWeekView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarYearView(value: String): Self = this.set("calendarYearView", value.asInstanceOf[js.Any])
  }
}
