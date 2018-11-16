package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlFilterAllDatesInPeriod extends js.Object

@JSGlobal("Excel.XlFilterAllDatesInPeriod")
@js.native
object XlFilterAllDatesInPeriod extends js.Object {
  @js.native
  sealed trait xlFilterAllDatesInPeriodDay
    extends activexDashExcelLib.ExcelNs.XlFilterAllDatesInPeriod
  
  @js.native
  sealed trait xlFilterAllDatesInPeriodHour
    extends activexDashExcelLib.ExcelNs.XlFilterAllDatesInPeriod
  
  @js.native
  sealed trait xlFilterAllDatesInPeriodMinute
    extends activexDashExcelLib.ExcelNs.XlFilterAllDatesInPeriod
  
  @js.native
  sealed trait xlFilterAllDatesInPeriodMonth
    extends activexDashExcelLib.ExcelNs.XlFilterAllDatesInPeriod
  
  @js.native
  sealed trait xlFilterAllDatesInPeriodSecond
    extends activexDashExcelLib.ExcelNs.XlFilterAllDatesInPeriod
  
  @js.native
  sealed trait xlFilterAllDatesInPeriodYear
    extends activexDashExcelLib.ExcelNs.XlFilterAllDatesInPeriod
  
  /* 2 */ val xlFilterAllDatesInPeriodDay: xlFilterAllDatesInPeriodDay with scala.Double = js.native
  /* 3 */ val xlFilterAllDatesInPeriodHour: xlFilterAllDatesInPeriodHour with scala.Double = js.native
  /* 4 */ val xlFilterAllDatesInPeriodMinute: xlFilterAllDatesInPeriodMinute with scala.Double = js.native
  /* 1 */ val xlFilterAllDatesInPeriodMonth: xlFilterAllDatesInPeriodMonth with scala.Double = js.native
  /* 5 */ val xlFilterAllDatesInPeriodSecond: xlFilterAllDatesInPeriodSecond with scala.Double = js.native
  /* 0 */ val xlFilterAllDatesInPeriodYear: xlFilterAllDatesInPeriodYear with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlFilterAllDatesInPeriod with scala.Double] = js.native
}

