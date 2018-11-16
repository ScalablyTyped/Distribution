package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPageBreakExtent extends js.Object

@JSGlobal("Excel.XlPageBreakExtent")
@js.native
object XlPageBreakExtent extends js.Object {
  @js.native
  sealed trait xlPageBreakFull
    extends activexDashExcelLib.ExcelNs.XlPageBreakExtent
  
  @js.native
  sealed trait xlPageBreakPartial
    extends activexDashExcelLib.ExcelNs.XlPageBreakExtent
  
  /* 1 */ val xlPageBreakFull: xlPageBreakFull with scala.Double = js.native
  /* 2 */ val xlPageBreakPartial: xlPageBreakPartial with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPageBreakExtent with scala.Double] = js.native
}

