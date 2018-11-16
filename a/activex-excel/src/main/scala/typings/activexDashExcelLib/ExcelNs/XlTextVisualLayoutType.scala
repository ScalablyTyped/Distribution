package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTextVisualLayoutType extends js.Object

@JSGlobal("Excel.XlTextVisualLayoutType")
@js.native
object XlTextVisualLayoutType extends js.Object {
  @js.native
  sealed trait xlTextVisualLTR
    extends activexDashExcelLib.ExcelNs.XlTextVisualLayoutType
  
  @js.native
  sealed trait xlTextVisualRTL
    extends activexDashExcelLib.ExcelNs.XlTextVisualLayoutType
  
  /* 1 */ val xlTextVisualLTR: xlTextVisualLTR with scala.Double = js.native
  /* 2 */ val xlTextVisualRTL: xlTextVisualRTL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlTextVisualLayoutType with scala.Double] = js.native
}

