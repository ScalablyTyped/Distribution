package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlDaysOfWeek extends js.Object

@JSGlobal("Outlook.OlDaysOfWeek")
@js.native
object OlDaysOfWeek extends js.Object {
  @js.native
  sealed trait olFriday
    extends activexDashOutlookLib.OutlookNs.OlDaysOfWeek
  
  @js.native
  sealed trait olMonday
    extends activexDashOutlookLib.OutlookNs.OlDaysOfWeek
  
  @js.native
  sealed trait olSaturday
    extends activexDashOutlookLib.OutlookNs.OlDaysOfWeek
  
  @js.native
  sealed trait olSunday
    extends activexDashOutlookLib.OutlookNs.OlDaysOfWeek
  
  @js.native
  sealed trait olThursday
    extends activexDashOutlookLib.OutlookNs.OlDaysOfWeek
  
  @js.native
  sealed trait olTuesday
    extends activexDashOutlookLib.OutlookNs.OlDaysOfWeek
  
  @js.native
  sealed trait olWednesday
    extends activexDashOutlookLib.OutlookNs.OlDaysOfWeek
  
  /* 32 */ val olFriday: olFriday with scala.Double = js.native
  /* 2 */ val olMonday: olMonday with scala.Double = js.native
  /* 64 */ val olSaturday: olSaturday with scala.Double = js.native
  /* 1 */ val olSunday: olSunday with scala.Double = js.native
  /* 16 */ val olThursday: olThursday with scala.Double = js.native
  /* 4 */ val olTuesday: olTuesday with scala.Double = js.native
  /* 8 */ val olWednesday: olWednesday with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlDaysOfWeek with scala.Double] = js.native
}

