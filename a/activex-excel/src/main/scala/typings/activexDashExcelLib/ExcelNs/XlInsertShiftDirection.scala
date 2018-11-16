package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlInsertShiftDirection extends js.Object

@JSGlobal("Excel.XlInsertShiftDirection")
@js.native
object XlInsertShiftDirection extends js.Object {
  @js.native
  sealed trait xlShiftDown
    extends activexDashExcelLib.ExcelNs.XlInsertShiftDirection
  
  @js.native
  sealed trait xlShiftToRight
    extends activexDashExcelLib.ExcelNs.XlInsertShiftDirection
  
  /* -4121 */ val xlShiftDown: xlShiftDown with scala.Double = js.native
  /* -4161 */ val xlShiftToRight: xlShiftToRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlInsertShiftDirection with scala.Double] = js.native
}

