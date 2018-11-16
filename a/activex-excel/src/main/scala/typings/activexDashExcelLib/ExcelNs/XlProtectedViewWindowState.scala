package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlProtectedViewWindowState extends js.Object

@JSGlobal("Excel.XlProtectedViewWindowState")
@js.native
object XlProtectedViewWindowState extends js.Object {
  @js.native
  sealed trait xlProtectedViewWindowMaximized
    extends activexDashExcelLib.ExcelNs.XlProtectedViewWindowState
  
  @js.native
  sealed trait xlProtectedViewWindowMinimized
    extends activexDashExcelLib.ExcelNs.XlProtectedViewWindowState
  
  @js.native
  sealed trait xlProtectedViewWindowNormal
    extends activexDashExcelLib.ExcelNs.XlProtectedViewWindowState
  
  /* 2 */ val xlProtectedViewWindowMaximized: xlProtectedViewWindowMaximized with scala.Double = js.native
  /* 1 */ val xlProtectedViewWindowMinimized: xlProtectedViewWindowMinimized with scala.Double = js.native
  /* 0 */ val xlProtectedViewWindowNormal: xlProtectedViewWindowNormal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlProtectedViewWindowState with scala.Double] = js.native
}

