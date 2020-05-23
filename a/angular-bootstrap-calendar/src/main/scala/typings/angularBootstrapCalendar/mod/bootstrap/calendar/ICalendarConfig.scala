package typings.angularBootstrapCalendar.mod.bootstrap.calendar

import typings.angularBootstrapCalendar.anon.Angular
import typings.angularBootstrapCalendar.anon.CalendarDayView
import typings.angularBootstrapCalendar.anon.WeekNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarConfig extends js.Object {
  var allDateFormats: Angular
  var dateFormats: IDateFormats
  var dateFormatter: String
  var displayAllMonthEvents: Boolean
  var displayEventEndTimes: Boolean
  var i18nStrings: WeekNumber
  var showTimesOnWeekView: Boolean
  var templates: CalendarDayView
  var titleFormats: ITitleFormats
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
}

