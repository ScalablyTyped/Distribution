package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlArrowHeadWidth extends js.Object

@JSGlobal("Excel.XlArrowHeadWidth")
@js.native
object XlArrowHeadWidth extends js.Object {
  @js.native
  sealed trait xlArrowHeadWidthMedium
    extends activexDashExcelLib.ExcelNs.XlArrowHeadWidth
  
  @js.native
  sealed trait xlArrowHeadWidthNarrow
    extends activexDashExcelLib.ExcelNs.XlArrowHeadWidth
  
  @js.native
  sealed trait xlArrowHeadWidthWide
    extends activexDashExcelLib.ExcelNs.XlArrowHeadWidth
  
  /* -4138 */ val xlArrowHeadWidthMedium: xlArrowHeadWidthMedium with scala.Double = js.native
  /* 1 */ val xlArrowHeadWidthNarrow: xlArrowHeadWidthNarrow with scala.Double = js.native
  /* 3 */ val xlArrowHeadWidthWide: xlArrowHeadWidthWide with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlArrowHeadWidth with scala.Double] = js.native
}

