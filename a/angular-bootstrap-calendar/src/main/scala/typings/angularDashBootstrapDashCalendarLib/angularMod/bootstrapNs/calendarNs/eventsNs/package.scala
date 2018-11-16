package typings
package angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventsNs {
  type IOnDeleteEventClick = js.Function1[
    /* calendarEvent */ angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs.IEvent, 
    scala.Unit
  ]
  type IOnEditEventClick = js.Function1[
    /* calendarEvent */ angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs.IEvent, 
    scala.Unit
  ]
  type IOnEventClick = js.Function1[
    /* calendarEvent */ angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs.IEvent, 
    scala.Unit
  ]
  type IOnEventTimesChanged = js.Function3[
    /* calendarEvent */ angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs.IEvent, 
    /* calendarNewEventStart */ stdLib.Date, 
    /* calendarNewEventEnd */ stdLib.Date, 
    scala.Unit
  ]
  type IOnTimespanClick = js.Function2[
    /* calendarDate */ stdLib.Date, 
    /* calendarCell */ angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs.ICalendarCell, 
    scala.Unit
  ]
  type IOnViewChangeClick = js.Function2[
    /* calendarDate */ stdLib.Date, 
    /* calendarNextView */ java.lang.String, 
    scala.Boolean
  ]
}
