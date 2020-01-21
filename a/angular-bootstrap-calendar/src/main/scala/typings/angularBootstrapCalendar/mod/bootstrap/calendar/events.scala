package typings.angularBootstrapCalendar.mod.bootstrap.calendar

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("angular", "bootstrap.calendar.events")
@js.native
object events extends js.Object {
  type IOnDeleteEventClick = js.Function1[/* calendarEvent */ IEvent, Unit]
  type IOnEditEventClick = js.Function1[/* calendarEvent */ IEvent, Unit]
  type IOnEventClick = js.Function1[/* calendarEvent */ IEvent, Unit]
  type IOnEventTimesChanged = js.Function3[
    /* calendarEvent */ IEvent, 
    /* calendarNewEventStart */ Date, 
    /* calendarNewEventEnd */ Date, 
    Unit
  ]
  type IOnTimespanClick = js.Function2[/* calendarDate */ Date, /* calendarCell */ ICalendarCell, Unit]
  type IOnViewChangeClick = js.Function2[/* calendarDate */ Date, /* calendarNextView */ String, Boolean]
}

