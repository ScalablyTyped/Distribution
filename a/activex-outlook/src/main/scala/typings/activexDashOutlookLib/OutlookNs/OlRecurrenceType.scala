package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlRecurrenceType extends js.Object

@JSGlobal("Outlook.OlRecurrenceType")
@js.native
object OlRecurrenceType extends js.Object {
  @js.native
  sealed trait olRecursDaily
    extends activexDashOutlookLib.OutlookNs.OlRecurrenceType
  
  @js.native
  sealed trait olRecursMonthNth
    extends activexDashOutlookLib.OutlookNs.OlRecurrenceType
  
  @js.native
  sealed trait olRecursMonthly
    extends activexDashOutlookLib.OutlookNs.OlRecurrenceType
  
  @js.native
  sealed trait olRecursWeekly
    extends activexDashOutlookLib.OutlookNs.OlRecurrenceType
  
  @js.native
  sealed trait olRecursYearNth
    extends activexDashOutlookLib.OutlookNs.OlRecurrenceType
  
  @js.native
  sealed trait olRecursYearly
    extends activexDashOutlookLib.OutlookNs.OlRecurrenceType
  
  /* 0 */ val olRecursDaily: olRecursDaily with scala.Double = js.native
  /* 3 */ val olRecursMonthNth: olRecursMonthNth with scala.Double = js.native
  /* 2 */ val olRecursMonthly: olRecursMonthly with scala.Double = js.native
  /* 1 */ val olRecursWeekly: olRecursWeekly with scala.Double = js.native
  /* 6 */ val olRecursYearNth: olRecursYearNth with scala.Double = js.native
  /* 5 */ val olRecursYearly: olRecursYearly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlRecurrenceType with scala.Double] = js.native
}

