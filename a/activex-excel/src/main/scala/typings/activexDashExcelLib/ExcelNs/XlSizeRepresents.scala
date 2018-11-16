package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSizeRepresents extends js.Object

@JSGlobal("Excel.XlSizeRepresents")
@js.native
object XlSizeRepresents extends js.Object {
  @js.native
  sealed trait xlSizeIsArea
    extends activexDashExcelLib.ExcelNs.XlSizeRepresents
  
  @js.native
  sealed trait xlSizeIsWidth
    extends activexDashExcelLib.ExcelNs.XlSizeRepresents
  
  /* 1 */ val xlSizeIsArea: xlSizeIsArea with scala.Double = js.native
  /* 2 */ val xlSizeIsWidth: xlSizeIsWidth with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSizeRepresents with scala.Double] = js.native
}

