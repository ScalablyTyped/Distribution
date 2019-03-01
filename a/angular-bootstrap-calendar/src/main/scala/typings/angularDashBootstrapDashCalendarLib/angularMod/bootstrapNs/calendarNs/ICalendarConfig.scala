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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allDateFormats")(allDateFormats)
    __obj.updateDynamic("dateFormats")(dateFormats)
    __obj.updateDynamic("dateFormatter")(dateFormatter)
    __obj.updateDynamic("displayAllMonthEvents")(displayAllMonthEvents)
    __obj.updateDynamic("displayEventEndTimes")(displayEventEndTimes)
    __obj.updateDynamic("i18nStrings")(i18nStrings)
    __obj.updateDynamic("showTimesOnWeekView")(showTimesOnWeekView)
    __obj.updateDynamic("templates")(templates)
    __obj.updateDynamic("titleFormats")(titleFormats)
    __obj.asInstanceOf[ICalendarConfig]
  }
}

