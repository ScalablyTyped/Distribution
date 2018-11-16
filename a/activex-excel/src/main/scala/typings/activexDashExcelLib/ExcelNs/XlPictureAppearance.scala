package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlPictureAppearance extends js.Object

@JSGlobal("Excel.XlPictureAppearance")
@js.native
object XlPictureAppearance extends js.Object {
  @js.native
  sealed trait xlPrinter
    extends activexDashExcelLib.ExcelNs.XlPictureAppearance
  
  @js.native
  sealed trait xlScreen
    extends activexDashExcelLib.ExcelNs.XlPictureAppearance
  
  /* 2 */ val xlPrinter: xlPrinter with scala.Double = js.native
  /* 1 */ val xlScreen: xlScreen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlPictureAppearance with scala.Double] = js.native
}

