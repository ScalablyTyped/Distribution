package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDeleteShiftDirection extends js.Object

@JSGlobal("Excel.XlDeleteShiftDirection")
@js.native
object XlDeleteShiftDirection extends js.Object {
  @js.native
  sealed trait xlShiftToLeft
    extends activexDashExcelLib.ExcelNs.XlDeleteShiftDirection
  
  @js.native
  sealed trait xlShiftUp
    extends activexDashExcelLib.ExcelNs.XlDeleteShiftDirection
  
  /* -4159 */ val xlShiftToLeft: xlShiftToLeft with scala.Double = js.native
  /* -4162 */ val xlShiftUp: xlShiftUp with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDeleteShiftDirection with scala.Double] = js.native
}

