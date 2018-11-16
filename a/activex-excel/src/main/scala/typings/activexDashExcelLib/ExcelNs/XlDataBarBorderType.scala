package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDataBarBorderType extends js.Object

@JSGlobal("Excel.XlDataBarBorderType")
@js.native
object XlDataBarBorderType extends js.Object {
  @js.native
  sealed trait xlDataBarBorderNone
    extends activexDashExcelLib.ExcelNs.XlDataBarBorderType
  
  @js.native
  sealed trait xlDataBarBorderSolid
    extends activexDashExcelLib.ExcelNs.XlDataBarBorderType
  
  /* 0 */ val xlDataBarBorderNone: xlDataBarBorderNone with scala.Double = js.native
  /* 1 */ val xlDataBarBorderSolid: xlDataBarBorderSolid with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDataBarBorderType with scala.Double] = js.native
}

