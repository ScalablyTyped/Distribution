package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSearchWithin extends js.Object

@JSGlobal("Excel.XlSearchWithin")
@js.native
object XlSearchWithin extends js.Object {
  @js.native
  sealed trait xlWithinSheet
    extends activexDashExcelLib.ExcelNs.XlSearchWithin
  
  @js.native
  sealed trait xlWithinWorkbook
    extends activexDashExcelLib.ExcelNs.XlSearchWithin
  
  /* 1 */ val xlWithinSheet: xlWithinSheet with scala.Double = js.native
  /* 2 */ val xlWithinWorkbook: xlWithinWorkbook with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSearchWithin with scala.Double] = js.native
}

