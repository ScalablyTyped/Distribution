package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlFilterAction extends js.Object

@JSGlobal("Excel.XlFilterAction")
@js.native
object XlFilterAction extends js.Object {
  @js.native
  sealed trait xlFilterCopy
    extends activexDashExcelLib.ExcelNs.XlFilterAction
  
  @js.native
  sealed trait xlFilterInPlace
    extends activexDashExcelLib.ExcelNs.XlFilterAction
  
  /* 2 */ val xlFilterCopy: xlFilterCopy with scala.Double = js.native
  /* 1 */ val xlFilterInPlace: xlFilterInPlace with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlFilterAction with scala.Double] = js.native
}

