package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSpeakDirection extends js.Object

@JSGlobal("Excel.XlSpeakDirection")
@js.native
object XlSpeakDirection extends js.Object {
  @js.native
  sealed trait xlSpeakByColumns
    extends activexDashExcelLib.ExcelNs.XlSpeakDirection
  
  @js.native
  sealed trait xlSpeakByRows
    extends activexDashExcelLib.ExcelNs.XlSpeakDirection
  
  /* 1 */ val xlSpeakByColumns: xlSpeakByColumns with scala.Double = js.native
  /* 0 */ val xlSpeakByRows: xlSpeakByRows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSpeakDirection with scala.Double] = js.native
}

