package typings.angularDashBootstrapDashCalendar.angularMod.bootstrapNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventsNs {
  import typings.angularDashBootstrapDashCalendar.angularMod.bootstrapNs.calendarNs.ICalendarCell
  import typings.angularDashBootstrapDashCalendar.angularMod.bootstrapNs.calendarNs.IEvent
  import typings.std.Date

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
