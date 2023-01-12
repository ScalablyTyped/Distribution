package typings.angularBootstrapCalendar

import typings.angularBootstrapCalendar.angularMod.bootstrap.calendar.IFormats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Angular extends StObject {
    
    var angular: IFormats
    
    var moment: IFormats
  }
  object Angular {
    
    inline def apply(angular: IFormats, moment: IFormats): Angular = {
      val __obj = js.Dynamic.literal(angular = angular.asInstanceOf[js.Any], moment = moment.asInstanceOf[js.Any])
      __obj.asInstanceOf[Angular]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Angular] (val x: Self) extends AnyVal {
      
      inline def setAngular(value: IFormats): Self = StObject.set(x, "angular", value.asInstanceOf[js.Any])
      
      inline def setMoment(value: IFormats): Self = StObject.set(x, "moment", value.asInstanceOf[js.Any])
    }
  }
  
  trait CalendarDayView extends StObject {
    
    var calendarDayView: String
    
    var calendarHourList: String
    
    var calendarMonthCell: String
    
    var calendarMonthCellEvents: String
    
    var calendarMonthView: String
    
    var calendarSlideBox: String
    
    var calendarWeekView: String
    
    var calendarYearView: String
  }
  object CalendarDayView {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: CalendarDayView] (val x: Self) extends AnyVal {
      
      inline def setCalendarDayView(value: String): Self = StObject.set(x, "calendarDayView", value.asInstanceOf[js.Any])
      
      inline def setCalendarHourList(value: String): Self = StObject.set(x, "calendarHourList", value.asInstanceOf[js.Any])
      
      inline def setCalendarMonthCell(value: String): Self = StObject.set(x, "calendarMonthCell", value.asInstanceOf[js.Any])
      
      inline def setCalendarMonthCellEvents(value: String): Self = StObject.set(x, "calendarMonthCellEvents", value.asInstanceOf[js.Any])
      
      inline def setCalendarMonthView(value: String): Self = StObject.set(x, "calendarMonthView", value.asInstanceOf[js.Any])
      
      inline def setCalendarSlideBox(value: String): Self = StObject.set(x, "calendarSlideBox", value.asInstanceOf[js.Any])
      
      inline def setCalendarWeekView(value: String): Self = StObject.set(x, "calendarWeekView", value.asInstanceOf[js.Any])
      
      inline def setCalendarYearView(value: String): Self = StObject.set(x, "calendarYearView", value.asInstanceOf[js.Any])
    }
  }
  
  trait WeekNumber extends StObject {
    
    var weekNumber: String
  }
  object WeekNumber {
    
    inline def apply(weekNumber: String): WeekNumber = {
      val __obj = js.Dynamic.literal(weekNumber = weekNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[WeekNumber]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WeekNumber] (val x: Self) extends AnyVal {
      
      inline def setWeekNumber(value: String): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
    }
  }
}
