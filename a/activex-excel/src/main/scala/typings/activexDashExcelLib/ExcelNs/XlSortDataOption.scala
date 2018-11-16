package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSortDataOption extends js.Object

@JSGlobal("Excel.XlSortDataOption")
@js.native
object XlSortDataOption extends js.Object {
  @js.native
  sealed trait xlSortNormal
    extends activexDashExcelLib.ExcelNs.XlSortDataOption
  
  @js.native
  sealed trait xlSortTextAsNumbers
    extends activexDashExcelLib.ExcelNs.XlSortDataOption
  
  /* 0 */ val xlSortNormal: xlSortNormal with scala.Double = js.native
  /* 1 */ val xlSortTextAsNumbers: xlSortTextAsNumbers with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSortDataOption with scala.Double] = js.native
}

