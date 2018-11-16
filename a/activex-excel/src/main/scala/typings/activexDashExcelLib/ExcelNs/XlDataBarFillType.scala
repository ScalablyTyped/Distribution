package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDataBarFillType extends js.Object

@JSGlobal("Excel.XlDataBarFillType")
@js.native
object XlDataBarFillType extends js.Object {
  @js.native
  sealed trait xlDataBarFillGradient
    extends activexDashExcelLib.ExcelNs.XlDataBarFillType
  
  @js.native
  sealed trait xlDataBarFillSolid
    extends activexDashExcelLib.ExcelNs.XlDataBarFillType
  
  /* 1 */ val xlDataBarFillGradient: xlDataBarFillGradient with scala.Double = js.native
  /* 0 */ val xlDataBarFillSolid: xlDataBarFillSolid with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDataBarFillType with scala.Double] = js.native
}

