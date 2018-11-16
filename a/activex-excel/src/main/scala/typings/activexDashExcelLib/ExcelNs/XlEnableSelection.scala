package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlEnableSelection extends js.Object

@JSGlobal("Excel.XlEnableSelection")
@js.native
object XlEnableSelection extends js.Object {
  @js.native
  sealed trait xlNoRestrictions
    extends activexDashExcelLib.ExcelNs.XlEnableSelection
  
  @js.native
  sealed trait xlNoSelection
    extends activexDashExcelLib.ExcelNs.XlEnableSelection
  
  @js.native
  sealed trait xlUnlockedCells
    extends activexDashExcelLib.ExcelNs.XlEnableSelection
  
  /* 0 */ val xlNoRestrictions: xlNoRestrictions with scala.Double = js.native
  /* -4142 */ val xlNoSelection: xlNoSelection with scala.Double = js.native
  /* 1 */ val xlUnlockedCells: xlUnlockedCells with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlEnableSelection with scala.Double] = js.native
}

