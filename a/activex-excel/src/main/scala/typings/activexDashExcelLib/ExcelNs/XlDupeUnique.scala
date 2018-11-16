package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlDupeUnique extends js.Object

@JSGlobal("Excel.XlDupeUnique")
@js.native
object XlDupeUnique extends js.Object {
  @js.native
  sealed trait xlDuplicate
    extends activexDashExcelLib.ExcelNs.XlDupeUnique
  
  @js.native
  sealed trait xlUnique
    extends activexDashExcelLib.ExcelNs.XlDupeUnique
  
  /* 1 */ val xlDuplicate: xlDuplicate with scala.Double = js.native
  /* 0 */ val xlUnique: xlUnique with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlDupeUnique with scala.Double] = js.native
}

