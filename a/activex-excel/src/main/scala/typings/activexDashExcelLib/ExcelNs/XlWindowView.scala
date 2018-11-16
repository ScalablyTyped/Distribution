package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlWindowView extends js.Object

@JSGlobal("Excel.XlWindowView")
@js.native
object XlWindowView extends js.Object {
  @js.native
  sealed trait xlNormalView
    extends activexDashExcelLib.ExcelNs.XlWindowView
  
  @js.native
  sealed trait xlPageBreakPreview
    extends activexDashExcelLib.ExcelNs.XlWindowView
  
  @js.native
  sealed trait xlPageLayoutView
    extends activexDashExcelLib.ExcelNs.XlWindowView
  
  /* 1 */ val xlNormalView: xlNormalView with scala.Double = js.native
  /* 2 */ val xlPageBreakPreview: xlPageBreakPreview with scala.Double = js.native
  /* 3 */ val xlPageLayoutView: xlPageLayoutView with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlWindowView with scala.Double] = js.native
}

