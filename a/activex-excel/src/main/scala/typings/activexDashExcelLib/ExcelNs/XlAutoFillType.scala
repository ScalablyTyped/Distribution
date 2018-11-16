package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlAutoFillType extends js.Object

@JSGlobal("Excel.XlAutoFillType")
@js.native
object XlAutoFillType extends js.Object {
  @js.native
  sealed trait xlFillCopy
    extends activexDashExcelLib.ExcelNs.XlAutoFillType
  
  @js.native
  sealed trait xlFillDays
    extends activexDashExcelLib.ExcelNs.XlAutoFillType
  
  @js.native
  sealed trait xlFillDefault
    extends activexDashExcelLib.ExcelNs.XlAutoFillType
  
  @js.native
  sealed trait xlFillFormats
    extends activexDashExcelLib.ExcelNs.XlAutoFillType
  
  @js.native
  sealed trait xlFillMonths
    extends activexDashExcelLib.ExcelNs.XlAutoFillType
  
  @js.native
  sealed trait xlFillSeries
    extends activexDashExcelLib.ExcelNs.XlAutoFillType
  
  @js.native
  sealed trait xlFillValues
    extends activexDashExcelLib.ExcelNs.XlAutoFillType
  
  @js.native
  sealed trait xlFillWeekdays
    extends activexDashExcelLib.ExcelNs.XlAutoFillType
  
  @js.native
  sealed trait xlFillYears
    extends activexDashExcelLib.ExcelNs.XlAutoFillType
  
  @js.native
  sealed trait xlGrowthTrend
    extends activexDashExcelLib.ExcelNs.XlAutoFillType
  
  @js.native
  sealed trait xlLinearTrend
    extends activexDashExcelLib.ExcelNs.XlAutoFillType
  
  /* 1 */ val xlFillCopy: xlFillCopy with scala.Double = js.native
  /* 5 */ val xlFillDays: xlFillDays with scala.Double = js.native
  /* 0 */ val xlFillDefault: xlFillDefault with scala.Double = js.native
  /* 3 */ val xlFillFormats: xlFillFormats with scala.Double = js.native
  /* 7 */ val xlFillMonths: xlFillMonths with scala.Double = js.native
  /* 2 */ val xlFillSeries: xlFillSeries with scala.Double = js.native
  /* 4 */ val xlFillValues: xlFillValues with scala.Double = js.native
  /* 6 */ val xlFillWeekdays: xlFillWeekdays with scala.Double = js.native
  /* 8 */ val xlFillYears: xlFillYears with scala.Double = js.native
  /* 10 */ val xlGrowthTrend: xlGrowthTrend with scala.Double = js.native
  /* 9 */ val xlLinearTrend: xlLinearTrend with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlAutoFillType with scala.Double] = js.native
}

