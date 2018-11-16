package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlWindowState extends js.Object

@JSGlobal("Excel.XlWindowState")
@js.native
object XlWindowState extends js.Object {
  @js.native
  sealed trait xlMaximized
    extends activexDashExcelLib.ExcelNs.XlWindowState
  
  @js.native
  sealed trait xlMinimized
    extends activexDashExcelLib.ExcelNs.XlWindowState
  
  @js.native
  sealed trait xlNormal
    extends activexDashExcelLib.ExcelNs.XlWindowState
  
  /* -4137 */ val xlMaximized: xlMaximized with scala.Double = js.native
  /* -4140 */ val xlMinimized: xlMinimized with scala.Double = js.native
  /* -4143 */ val xlNormal: xlNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlWindowState with scala.Double] = js.native
}

