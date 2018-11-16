package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlAllocationValue extends js.Object

@JSGlobal("Excel.XlAllocationValue")
@js.native
object XlAllocationValue extends js.Object {
  @js.native
  sealed trait xlAllocateIncrement
    extends activexDashExcelLib.ExcelNs.XlAllocationValue
  
  @js.native
  sealed trait xlAllocateValue
    extends activexDashExcelLib.ExcelNs.XlAllocationValue
  
  /* 2 */ val xlAllocateIncrement: xlAllocateIncrement with scala.Double = js.native
  /* 1 */ val xlAllocateValue: xlAllocateValue with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlAllocationValue with scala.Double] = js.native
}

