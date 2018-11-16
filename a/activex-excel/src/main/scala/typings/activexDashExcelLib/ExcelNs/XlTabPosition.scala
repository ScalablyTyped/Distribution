package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTabPosition extends js.Object

@JSGlobal("Excel.XlTabPosition")
@js.native
object XlTabPosition extends js.Object {
  @js.native
  sealed trait xlTabPositionFirst
    extends activexDashExcelLib.ExcelNs.XlTabPosition
  
  @js.native
  sealed trait xlTabPositionLast
    extends activexDashExcelLib.ExcelNs.XlTabPosition
  
  /* 0 */ val xlTabPositionFirst: xlTabPositionFirst with scala.Double = js.native
  /* 1 */ val xlTabPositionLast: xlTabPositionLast with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlTabPosition with scala.Double] = js.native
}

