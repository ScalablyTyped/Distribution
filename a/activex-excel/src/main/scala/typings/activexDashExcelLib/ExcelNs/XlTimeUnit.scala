package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTimeUnit extends js.Object

@JSGlobal("Excel.XlTimeUnit")
@js.native
object XlTimeUnit extends js.Object {
  @js.native
  sealed trait xlDays
    extends activexDashExcelLib.ExcelNs.XlTimeUnit
  
  @js.native
  sealed trait xlMonths
    extends activexDashExcelLib.ExcelNs.XlTimeUnit
  
  @js.native
  sealed trait xlYears
    extends activexDashExcelLib.ExcelNs.XlTimeUnit
  
  /* 0 */ val xlDays: xlDays with scala.Double = js.native
  /* 1 */ val xlMonths: xlMonths with scala.Double = js.native
  /* 2 */ val xlYears: xlYears with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlTimeUnit with scala.Double] = js.native
}

