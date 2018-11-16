package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCommandUnderlines extends js.Object

@JSGlobal("Excel.XlCommandUnderlines")
@js.native
object XlCommandUnderlines extends js.Object {
  @js.native
  sealed trait xlCommandUnderlinesAutomatic
    extends activexDashExcelLib.ExcelNs.XlCommandUnderlines
  
  @js.native
  sealed trait xlCommandUnderlinesOff
    extends activexDashExcelLib.ExcelNs.XlCommandUnderlines
  
  @js.native
  sealed trait xlCommandUnderlinesOn
    extends activexDashExcelLib.ExcelNs.XlCommandUnderlines
  
  /* -4105 */ val xlCommandUnderlinesAutomatic: xlCommandUnderlinesAutomatic with scala.Double = js.native
  /* -4146 */ val xlCommandUnderlinesOff: xlCommandUnderlinesOff with scala.Double = js.native
  /* 1 */ val xlCommandUnderlinesOn: xlCommandUnderlinesOn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCommandUnderlines with scala.Double] = js.native
}

