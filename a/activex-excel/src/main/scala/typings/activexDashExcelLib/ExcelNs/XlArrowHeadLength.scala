package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlArrowHeadLength extends js.Object

@JSGlobal("Excel.XlArrowHeadLength")
@js.native
object XlArrowHeadLength extends js.Object {
  @js.native
  sealed trait xlArrowHeadLengthLong
    extends activexDashExcelLib.ExcelNs.XlArrowHeadLength
  
  @js.native
  sealed trait xlArrowHeadLengthMedium
    extends activexDashExcelLib.ExcelNs.XlArrowHeadLength
  
  @js.native
  sealed trait xlArrowHeadLengthShort
    extends activexDashExcelLib.ExcelNs.XlArrowHeadLength
  
  /* 3 */ val xlArrowHeadLengthLong: xlArrowHeadLengthLong with scala.Double = js.native
  /* -4138 */ val xlArrowHeadLengthMedium: xlArrowHeadLengthMedium with scala.Double = js.native
  /* 1 */ val xlArrowHeadLengthShort: xlArrowHeadLengthShort with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlArrowHeadLength with scala.Double] = js.native
}

