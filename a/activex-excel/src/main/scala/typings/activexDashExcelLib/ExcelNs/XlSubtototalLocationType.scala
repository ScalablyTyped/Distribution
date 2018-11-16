package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSubtototalLocationType extends js.Object

@JSGlobal("Excel.XlSubtototalLocationType")
@js.native
object XlSubtototalLocationType extends js.Object {
  @js.native
  sealed trait xlAtBottom
    extends activexDashExcelLib.ExcelNs.XlSubtototalLocationType
  
  @js.native
  sealed trait xlAtTop
    extends activexDashExcelLib.ExcelNs.XlSubtototalLocationType
  
  /* 2 */ val xlAtBottom: xlAtBottom with scala.Double = js.native
  /* 1 */ val xlAtTop: xlAtTop with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSubtototalLocationType with scala.Double] = js.native
}

