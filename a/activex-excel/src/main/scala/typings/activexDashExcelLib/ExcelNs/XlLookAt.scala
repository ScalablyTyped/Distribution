package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlLookAt extends js.Object

@JSGlobal("Excel.XlLookAt")
@js.native
object XlLookAt extends js.Object {
  @js.native
  sealed trait xlPart
    extends activexDashExcelLib.ExcelNs.XlLookAt
  
  @js.native
  sealed trait xlWhole
    extends activexDashExcelLib.ExcelNs.XlLookAt
  
  /* 2 */ val xlPart: xlPart with scala.Double = js.native
  /* 1 */ val xlWhole: xlWhole with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlLookAt with scala.Double] = js.native
}

