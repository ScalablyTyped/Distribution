package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlAboveBelow extends js.Object

@JSGlobal("Excel.XlAboveBelow")
@js.native
object XlAboveBelow extends js.Object {
  @js.native
  sealed trait xlAboveAverage
    extends activexDashExcelLib.ExcelNs.XlAboveBelow
  
  @js.native
  sealed trait xlAboveStdDev
    extends activexDashExcelLib.ExcelNs.XlAboveBelow
  
  @js.native
  sealed trait xlBelowAverage
    extends activexDashExcelLib.ExcelNs.XlAboveBelow
  
  @js.native
  sealed trait xlBelowStdDev
    extends activexDashExcelLib.ExcelNs.XlAboveBelow
  
  @js.native
  sealed trait xlEqualAboveAverage
    extends activexDashExcelLib.ExcelNs.XlAboveBelow
  
  @js.native
  sealed trait xlEqualBelowAverage
    extends activexDashExcelLib.ExcelNs.XlAboveBelow
  
  /* 0 */ val xlAboveAverage: xlAboveAverage with scala.Double = js.native
  /* 4 */ val xlAboveStdDev: xlAboveStdDev with scala.Double = js.native
  /* 1 */ val xlBelowAverage: xlBelowAverage with scala.Double = js.native
  /* 5 */ val xlBelowStdDev: xlBelowStdDev with scala.Double = js.native
  /* 2 */ val xlEqualAboveAverage: xlEqualAboveAverage with scala.Double = js.native
  /* 3 */ val xlEqualBelowAverage: xlEqualBelowAverage with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlAboveBelow with scala.Double] = js.native
}

