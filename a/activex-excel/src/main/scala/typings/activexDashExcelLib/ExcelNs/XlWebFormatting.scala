package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlWebFormatting extends js.Object

@JSGlobal("Excel.XlWebFormatting")
@js.native
object XlWebFormatting extends js.Object {
  @js.native
  sealed trait xlWebFormattingAll
    extends activexDashExcelLib.ExcelNs.XlWebFormatting
  
  @js.native
  sealed trait xlWebFormattingNone
    extends activexDashExcelLib.ExcelNs.XlWebFormatting
  
  @js.native
  sealed trait xlWebFormattingRTF
    extends activexDashExcelLib.ExcelNs.XlWebFormatting
  
  /* 1 */ val xlWebFormattingAll: xlWebFormattingAll with scala.Double = js.native
  /* 3 */ val xlWebFormattingNone: xlWebFormattingNone with scala.Double = js.native
  /* 2 */ val xlWebFormattingRTF: xlWebFormattingRTF with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlWebFormatting with scala.Double] = js.native
}

