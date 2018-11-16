package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlSortMethodOld extends js.Object

@JSGlobal("Excel.XlSortMethodOld")
@js.native
object XlSortMethodOld extends js.Object {
  @js.native
  sealed trait xlCodePage
    extends activexDashExcelLib.ExcelNs.XlSortMethodOld
  
  @js.native
  sealed trait xlSyllabary
    extends activexDashExcelLib.ExcelNs.XlSortMethodOld
  
  /* 2 */ val xlCodePage: xlCodePage with scala.Double = js.native
  /* 1 */ val xlSyllabary: xlSyllabary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlSortMethodOld with scala.Double] = js.native
}

