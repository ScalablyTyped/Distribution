package typings.angularDashBootstrapDashCalendar.angularMod.bootstrap.calendar

import typings.angularDashBootstrapDashCalendar.Anon_Angular
import typings.angularDashBootstrapDashCalendar.Anon_CalendarDayView
import typings.angularDashBootstrapDashCalendar.Anon_WeekNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarConfig extends js.Object {
  var allDateFormats: Anon_Angular
  var dateFormats: IDateFormats
  var dateFormatter: String
  var displayAllMonthEvents: Boolean
  var displayEventEndTimes: Boolean
  var i18nStrings: Anon_WeekNumber
  var showTimesOnWeekView: Boolean
  var templates: Anon_CalendarDayView
  var titleFormats: ITitleFormats
}

object ICalendarConfig {
  @scala.inline
  def apply(
    allDateFormats: Anon_Angular,
    dateFormats: IDateFormats,
    dateFormatter: String,
    displayAllMonthEvents: Boolean,
    displayEventEndTimes: Boolean,
    i18nStrings: Anon_WeekNumber,
    showTimesOnWeekView: Boolean,
    templates: Anon_CalendarDayView,
    titleFormats: ITitleFormats
  ): ICalendarConfig = {
    val __obj = js.Dynamic.literal(allDateFormats = allDateFormats, dateFormats = dateFormats, dateFormatter = dateFormatter, displayAllMonthEvents = displayAllMonthEvents, displayEventEndTimes = displayEventEndTimes, i18nStrings = i18nStrings, showTimesOnWeekView = showTimesOnWeekView, templates = templates, titleFormats = titleFormats)
  
    __obj.asInstanceOf[ICalendarConfig]
  }
}

