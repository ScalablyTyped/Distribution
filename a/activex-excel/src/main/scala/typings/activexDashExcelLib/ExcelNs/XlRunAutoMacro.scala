package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlRunAutoMacro extends js.Object

@JSGlobal("Excel.XlRunAutoMacro")
@js.native
object XlRunAutoMacro extends js.Object {
  @js.native
  sealed trait xlAutoActivate
    extends activexDashExcelLib.ExcelNs.XlRunAutoMacro
  
  @js.native
  sealed trait xlAutoClose
    extends activexDashExcelLib.ExcelNs.XlRunAutoMacro
  
  @js.native
  sealed trait xlAutoDeactivate
    extends activexDashExcelLib.ExcelNs.XlRunAutoMacro
  
  @js.native
  sealed trait xlAutoOpen
    extends activexDashExcelLib.ExcelNs.XlRunAutoMacro
  
  /* 3 */ val xlAutoActivate: xlAutoActivate with scala.Double = js.native
  /* 2 */ val xlAutoClose: xlAutoClose with scala.Double = js.native
  /* 4 */ val xlAutoDeactivate: xlAutoDeactivate with scala.Double = js.native
  /* 1 */ val xlAutoOpen: xlAutoOpen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlRunAutoMacro with scala.Double] = js.native
}

