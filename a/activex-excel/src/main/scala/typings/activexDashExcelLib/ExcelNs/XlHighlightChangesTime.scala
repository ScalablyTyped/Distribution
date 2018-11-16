package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlHighlightChangesTime extends js.Object

@JSGlobal("Excel.XlHighlightChangesTime")
@js.native
object XlHighlightChangesTime extends js.Object {
  @js.native
  sealed trait xlAllChanges
    extends activexDashExcelLib.ExcelNs.XlHighlightChangesTime
  
  @js.native
  sealed trait xlNotYetReviewed
    extends activexDashExcelLib.ExcelNs.XlHighlightChangesTime
  
  @js.native
  sealed trait xlSinceMyLastSave
    extends activexDashExcelLib.ExcelNs.XlHighlightChangesTime
  
  /* 2 */ val xlAllChanges: xlAllChanges with scala.Double = js.native
  /* 3 */ val xlNotYetReviewed: xlNotYetReviewed with scala.Double = js.native
  /* 1 */ val xlSinceMyLastSave: xlSinceMyLastSave with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlHighlightChangesTime with scala.Double] = js.native
}

