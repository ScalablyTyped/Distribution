package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPieSliceLocation extends js.Object

@JSGlobal("Excel.XlPieSliceLocation")
@js.native
object XlPieSliceLocation extends js.Object {
  @js.native
  sealed trait xlHorizontalCoordinate
    extends activexDashExcelLib.ExcelNs.XlPieSliceLocation
  
  @js.native
  sealed trait xlVerticalCoordinate
    extends activexDashExcelLib.ExcelNs.XlPieSliceLocation
  
  /* 1 */ val xlHorizontalCoordinate: xlHorizontalCoordinate with scala.Double = js.native
  /* 2 */ val xlVerticalCoordinate: xlVerticalCoordinate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPieSliceLocation with scala.Double] = js.native
}

