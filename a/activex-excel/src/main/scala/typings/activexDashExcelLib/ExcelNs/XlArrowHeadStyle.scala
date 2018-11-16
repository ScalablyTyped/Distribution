package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlArrowHeadStyle extends js.Object

@JSGlobal("Excel.XlArrowHeadStyle")
@js.native
object XlArrowHeadStyle extends js.Object {
  @js.native
  sealed trait xlArrowHeadStyleClosed
    extends activexDashExcelLib.ExcelNs.XlArrowHeadStyle
  
  @js.native
  sealed trait xlArrowHeadStyleDoubleClosed
    extends activexDashExcelLib.ExcelNs.XlArrowHeadStyle
  
  @js.native
  sealed trait xlArrowHeadStyleDoubleOpen
    extends activexDashExcelLib.ExcelNs.XlArrowHeadStyle
  
  @js.native
  sealed trait xlArrowHeadStyleNone
    extends activexDashExcelLib.ExcelNs.XlArrowHeadStyle
  
  @js.native
  sealed trait xlArrowHeadStyleOpen
    extends activexDashExcelLib.ExcelNs.XlArrowHeadStyle
  
  /* 3 */ val xlArrowHeadStyleClosed: xlArrowHeadStyleClosed with scala.Double = js.native
  /* 5 */ val xlArrowHeadStyleDoubleClosed: xlArrowHeadStyleDoubleClosed with scala.Double = js.native
  /* 4 */ val xlArrowHeadStyleDoubleOpen: xlArrowHeadStyleDoubleOpen with scala.Double = js.native
  /* -4142 */ val xlArrowHeadStyleNone: xlArrowHeadStyleNone with scala.Double = js.native
  /* 2 */ val xlArrowHeadStyleOpen: xlArrowHeadStyleOpen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlArrowHeadStyle with scala.Double] = js.native
}

