package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlAllocationMethod extends js.Object

@JSGlobal("Excel.XlAllocationMethod")
@js.native
object XlAllocationMethod extends js.Object {
  @js.native
  sealed trait xlEqualAllocation
    extends activexDashExcelLib.ExcelNs.XlAllocationMethod
  
  @js.native
  sealed trait xlWeightedAllocation
    extends activexDashExcelLib.ExcelNs.XlAllocationMethod
  
  /* 1 */ val xlEqualAllocation: xlEqualAllocation with scala.Double = js.native
  /* 2 */ val xlWeightedAllocation: xlWeightedAllocation with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlAllocationMethod with scala.Double] = js.native
}

