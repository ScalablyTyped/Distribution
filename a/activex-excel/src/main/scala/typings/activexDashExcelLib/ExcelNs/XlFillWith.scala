package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlFillWith extends js.Object

@JSGlobal("Excel.XlFillWith")
@js.native
object XlFillWith extends js.Object {
  @js.native
  sealed trait xlFillWithAll
    extends activexDashExcelLib.ExcelNs.XlFillWith
  
  @js.native
  sealed trait xlFillWithContents
    extends activexDashExcelLib.ExcelNs.XlFillWith
  
  @js.native
  sealed trait xlFillWithFormats
    extends activexDashExcelLib.ExcelNs.XlFillWith
  
  /* -4104 */ val xlFillWithAll: xlFillWithAll with scala.Double = js.native
  /* 2 */ val xlFillWithContents: xlFillWithContents with scala.Double = js.native
  /* -4122 */ val xlFillWithFormats: xlFillWithFormats with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlFillWith with scala.Double] = js.native
}

