package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDisplayBlanksAs extends js.Object

@JSGlobal("Excel.XlDisplayBlanksAs")
@js.native
object XlDisplayBlanksAs extends js.Object {
  @js.native
  sealed trait xlInterpolated
    extends activexDashExcelLib.ExcelNs.XlDisplayBlanksAs
  
  @js.native
  sealed trait xlNotPlotted
    extends activexDashExcelLib.ExcelNs.XlDisplayBlanksAs
  
  @js.native
  sealed trait xlZero
    extends activexDashExcelLib.ExcelNs.XlDisplayBlanksAs
  
  /* 3 */ val xlInterpolated: xlInterpolated with scala.Double = js.native
  /* 1 */ val xlNotPlotted: xlNotPlotted with scala.Double = js.native
  /* 2 */ val xlZero: xlZero with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDisplayBlanksAs with scala.Double] = js.native
}

