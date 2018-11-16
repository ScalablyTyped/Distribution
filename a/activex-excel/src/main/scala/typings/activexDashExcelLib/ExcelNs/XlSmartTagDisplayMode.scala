package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSmartTagDisplayMode extends js.Object

@JSGlobal("Excel.XlSmartTagDisplayMode")
@js.native
object XlSmartTagDisplayMode extends js.Object {
  @js.native
  sealed trait xlButtonOnly
    extends activexDashExcelLib.ExcelNs.XlSmartTagDisplayMode
  
  @js.native
  sealed trait xlDisplayNone
    extends activexDashExcelLib.ExcelNs.XlSmartTagDisplayMode
  
  @js.native
  sealed trait xlIndicatorAndButton
    extends activexDashExcelLib.ExcelNs.XlSmartTagDisplayMode
  
  /* 2 */ val xlButtonOnly: xlButtonOnly with scala.Double = js.native
  /* 1 */ val xlDisplayNone: xlDisplayNone with scala.Double = js.native
  /* 0 */ val xlIndicatorAndButton: xlIndicatorAndButton with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSmartTagDisplayMode with scala.Double] = js.native
}

