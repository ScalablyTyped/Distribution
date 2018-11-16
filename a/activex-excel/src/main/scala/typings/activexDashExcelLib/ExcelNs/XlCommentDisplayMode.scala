package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlCommentDisplayMode extends js.Object

@JSGlobal("Excel.XlCommentDisplayMode")
@js.native
object XlCommentDisplayMode extends js.Object {
  @js.native
  sealed trait xlCommentAndIndicator
    extends activexDashExcelLib.ExcelNs.XlCommentDisplayMode
  
  @js.native
  sealed trait xlCommentIndicatorOnly
    extends activexDashExcelLib.ExcelNs.XlCommentDisplayMode
  
  @js.native
  sealed trait xlNoIndicator
    extends activexDashExcelLib.ExcelNs.XlCommentDisplayMode
  
  /* 1 */ val xlCommentAndIndicator: xlCommentAndIndicator with scala.Double = js.native
  /* -1 */ val xlCommentIndicatorOnly: xlCommentIndicatorOnly with scala.Double = js.native
  /* 0 */ val xlNoIndicator: xlNoIndicator with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlCommentDisplayMode with scala.Double] = js.native
}

