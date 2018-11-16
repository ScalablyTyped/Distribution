package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTimePeriods extends js.Object

@JSGlobal("Excel.XlTimePeriods")
@js.native
object XlTimePeriods extends js.Object {
  @js.native
  sealed trait xlLast7Days
    extends activexDashExcelLib.ExcelNs.XlTimePeriods
  
  @js.native
  sealed trait xlLastMonth
    extends activexDashExcelLib.ExcelNs.XlTimePeriods
  
  @js.native
  sealed trait xlLastWeek
    extends activexDashExcelLib.ExcelNs.XlTimePeriods
  
  @js.native
  sealed trait xlNextMonth
    extends activexDashExcelLib.ExcelNs.XlTimePeriods
  
  @js.native
  sealed trait xlNextWeek
    extends activexDashExcelLib.ExcelNs.XlTimePeriods
  
  @js.native
  sealed trait xlThisMonth
    extends activexDashExcelLib.ExcelNs.XlTimePeriods
  
  @js.native
  sealed trait xlThisWeek
    extends activexDashExcelLib.ExcelNs.XlTimePeriods
  
  @js.native
  sealed trait xlToday
    extends activexDashExcelLib.ExcelNs.XlTimePeriods
  
  @js.native
  sealed trait xlTomorrow
    extends activexDashExcelLib.ExcelNs.XlTimePeriods
  
  @js.native
  sealed trait xlYesterday
    extends activexDashExcelLib.ExcelNs.XlTimePeriods
  
  /* 2 */ val xlLast7Days: xlLast7Days with scala.Double = js.native
  /* 5 */ val xlLastMonth: xlLastMonth with scala.Double = js.native
  /* 4 */ val xlLastWeek: xlLastWeek with scala.Double = js.native
  /* 8 */ val xlNextMonth: xlNextMonth with scala.Double = js.native
  /* 7 */ val xlNextWeek: xlNextWeek with scala.Double = js.native
  /* 9 */ val xlThisMonth: xlThisMonth with scala.Double = js.native
  /* 3 */ val xlThisWeek: xlThisWeek with scala.Double = js.native
  /* 0 */ val xlToday: xlToday with scala.Double = js.native
  /* 6 */ val xlTomorrow: xlTomorrow with scala.Double = js.native
  /* 1 */ val xlYesterday: xlYesterday with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlTimePeriods with scala.Double] = js.native
}

