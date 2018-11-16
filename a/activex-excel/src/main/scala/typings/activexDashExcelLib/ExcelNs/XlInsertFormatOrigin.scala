package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlInsertFormatOrigin extends js.Object

@JSGlobal("Excel.XlInsertFormatOrigin")
@js.native
object XlInsertFormatOrigin extends js.Object {
  @js.native
  sealed trait xlFormatFromLeftOrAbove
    extends activexDashExcelLib.ExcelNs.XlInsertFormatOrigin
  
  @js.native
  sealed trait xlFormatFromRightOrBelow
    extends activexDashExcelLib.ExcelNs.XlInsertFormatOrigin
  
  /* 0 */ val xlFormatFromLeftOrAbove: xlFormatFromLeftOrAbove with scala.Double = js.native
  /* 1 */ val xlFormatFromRightOrBelow: xlFormatFromRightOrBelow with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlInsertFormatOrigin with scala.Double] = js.native
}

