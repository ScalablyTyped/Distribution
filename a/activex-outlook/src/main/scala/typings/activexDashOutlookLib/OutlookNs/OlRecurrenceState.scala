package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlRecurrenceState extends js.Object

@JSGlobal("Outlook.OlRecurrenceState")
@js.native
object OlRecurrenceState extends js.Object {
  @js.native
  sealed trait olApptException
    extends activexDashOutlookLib.OutlookNs.OlRecurrenceState
  
  @js.native
  sealed trait olApptMaster
    extends activexDashOutlookLib.OutlookNs.OlRecurrenceState
  
  @js.native
  sealed trait olApptNotRecurring
    extends activexDashOutlookLib.OutlookNs.OlRecurrenceState
  
  @js.native
  sealed trait olApptOccurrence
    extends activexDashOutlookLib.OutlookNs.OlRecurrenceState
  
  /* 3 */ val olApptException: olApptException with scala.Double = js.native
  /* 1 */ val olApptMaster: olApptMaster with scala.Double = js.native
  /* 0 */ val olApptNotRecurring: olApptNotRecurring with scala.Double = js.native
  /* 2 */ val olApptOccurrence: olApptOccurrence with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlRecurrenceState with scala.Double] = js.native
}

