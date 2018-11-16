package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCutCopyMode extends js.Object

@JSGlobal("Excel.XlCutCopyMode")
@js.native
object XlCutCopyMode extends js.Object {
  @js.native
  sealed trait xlCopy
    extends activexDashExcelLib.ExcelNs.XlCutCopyMode
  
  @js.native
  sealed trait xlCut
    extends activexDashExcelLib.ExcelNs.XlCutCopyMode
  
  /* 1 */ val xlCopy: xlCopy with scala.Double = js.native
  /* 2 */ val xlCut: xlCut with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCutCopyMode with scala.Double] = js.native
}

