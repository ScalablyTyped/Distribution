package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlErrorBarDirection extends js.Object

@JSGlobal("Excel.XlErrorBarDirection")
@js.native
object XlErrorBarDirection extends js.Object {
  @js.native
  sealed trait xlX
    extends activexDashExcelLib.ExcelNs.XlErrorBarDirection
  
  @js.native
  sealed trait xlY
    extends activexDashExcelLib.ExcelNs.XlErrorBarDirection
  
  /* -4168 */ val xlX: xlX with scala.Double = js.native
  /* 1 */ val xlY: xlY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlErrorBarDirection with scala.Double] = js.native
}

