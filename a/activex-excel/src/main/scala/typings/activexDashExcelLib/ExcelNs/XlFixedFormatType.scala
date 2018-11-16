package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlFixedFormatType extends js.Object

@JSGlobal("Excel.XlFixedFormatType")
@js.native
object XlFixedFormatType extends js.Object {
  @js.native
  sealed trait xlTypePDF
    extends activexDashExcelLib.ExcelNs.XlFixedFormatType
  
  @js.native
  sealed trait xlTypeXPS
    extends activexDashExcelLib.ExcelNs.XlFixedFormatType
  
  /* 0 */ val xlTypePDF: xlTypePDF with scala.Double = js.native
  /* 1 */ val xlTypeXPS: xlTypeXPS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlFixedFormatType with scala.Double] = js.native
}

