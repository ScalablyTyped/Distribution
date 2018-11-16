package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDataSeriesDate extends js.Object

@JSGlobal("Excel.XlDataSeriesDate")
@js.native
object XlDataSeriesDate extends js.Object {
  @js.native
  sealed trait xlDay
    extends activexDashExcelLib.ExcelNs.XlDataSeriesDate
  
  @js.native
  sealed trait xlMonth
    extends activexDashExcelLib.ExcelNs.XlDataSeriesDate
  
  @js.native
  sealed trait xlWeekday
    extends activexDashExcelLib.ExcelNs.XlDataSeriesDate
  
  @js.native
  sealed trait xlYear
    extends activexDashExcelLib.ExcelNs.XlDataSeriesDate
  
  /* 1 */ val xlDay: xlDay with scala.Double = js.native
  /* 3 */ val xlMonth: xlMonth with scala.Double = js.native
  /* 2 */ val xlWeekday: xlWeekday with scala.Double = js.native
  /* 4 */ val xlYear: xlYear with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDataSeriesDate with scala.Double] = js.native
}

