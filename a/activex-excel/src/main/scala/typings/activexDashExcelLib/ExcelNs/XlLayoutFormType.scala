package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlLayoutFormType extends js.Object

@JSGlobal("Excel.XlLayoutFormType")
@js.native
object XlLayoutFormType extends js.Object {
  @js.native
  sealed trait xlOutline
    extends activexDashExcelLib.ExcelNs.XlLayoutFormType
  
  @js.native
  sealed trait xlTabular
    extends activexDashExcelLib.ExcelNs.XlLayoutFormType
  
  /* 1 */ val xlOutline: xlOutline with scala.Double = js.native
  /* 0 */ val xlTabular: xlTabular with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlLayoutFormType with scala.Double] = js.native
}

