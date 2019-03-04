package typings
package angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarConfig extends js.Object {
  var allDateFormats: angularDashBootstrapDashCalendarLib.Anon_Angular
  var dateFormats: IDateFormats
  var dateFormatter: java.lang.String
  var displayAllMonthEvents: scala.Boolean
  var displayEventEndTimes: scala.Boolean
  var i18nStrings: angularDashBootstrapDashCalendarLib.Anon_WeekNumber
  var showTimesOnWeekView: scala.Boolean
  var templates: angularDashBootstrapDashCalendarLib.Anon_CalendarDayView
  var titleFormats: ITitleFormats
}

object ICalendarConfig {
  @scala.inline
  def apply(
    allDateFormats: angularDashBootstrapDashCalendarLib.Anon_Angular,
    dateFormats: IDateFormats,
    dateFormatter: java.lang.String,
    displayAllMonthEvents: scala.Boolean,
    displayEventEndTimes: scala.Boolean,
    i18nStrings: angularDashBootstrapDashCalendarLib.Anon_WeekNumber,
    showTimesOnWeekView: scala.Boolean,
    templates: angularDashBootstrapDashCalendarLib.Anon_CalendarDayView,
    titleFormats: ITitleFormats
  ): ICalendarConfig = {
    val __obj = js.Dynamic.literal(allDateFormats = allDateFormats, dateFormats = dateFormats, dateFormatter = dateFormatter, displayAllMonthEvents = displayAllMonthEvents, displayEventEndTimes = displayEventEndTimes, i18nStrings = i18nStrings, showTimesOnWeekView = showTimesOnWeekView, templates = templates, titleFormats = titleFormats)
  
    __obj.asInstanceOf[ICalendarConfig]
  }
}

