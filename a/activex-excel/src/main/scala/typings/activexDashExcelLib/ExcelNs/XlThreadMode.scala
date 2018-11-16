package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlThreadMode extends js.Object

@JSGlobal("Excel.XlThreadMode")
@js.native
object XlThreadMode extends js.Object {
  @js.native
  sealed trait xlThreadModeAutomatic
    extends activexDashExcelLib.ExcelNs.XlThreadMode
  
  @js.native
  sealed trait xlThreadModeManual
    extends activexDashExcelLib.ExcelNs.XlThreadMode
  
  /* 0 */ val xlThreadModeAutomatic: xlThreadModeAutomatic with scala.Double = js.native
  /* 1 */ val xlThreadModeManual: xlThreadModeManual with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlThreadMode with scala.Double] = js.native
}

