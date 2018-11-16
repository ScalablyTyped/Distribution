package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlReferenceStyle extends js.Object

@JSGlobal("Excel.XlReferenceStyle")
@js.native
object XlReferenceStyle extends js.Object {
  @js.native
  sealed trait xlA1
    extends activexDashExcelLib.ExcelNs.XlReferenceStyle
  
  @js.native
  sealed trait xlR1C1
    extends activexDashExcelLib.ExcelNs.XlReferenceStyle
  
  /* 1 */ val xlA1: xlA1 with scala.Double = js.native
  /* -4150 */ val xlR1C1: xlR1C1 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlReferenceStyle with scala.Double] = js.native
}

