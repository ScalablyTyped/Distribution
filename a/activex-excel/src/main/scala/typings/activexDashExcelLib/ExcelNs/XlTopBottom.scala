package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlTopBottom extends js.Object

@JSGlobal("Excel.XlTopBottom")
@js.native
object XlTopBottom extends js.Object {
  @js.native
  sealed trait xlTop10Bottom
    extends activexDashExcelLib.ExcelNs.XlTopBottom
  
  @js.native
  sealed trait xlTop10Top
    extends activexDashExcelLib.ExcelNs.XlTopBottom
  
  /* 0 */ val xlTop10Bottom: xlTop10Bottom with scala.Double = js.native
  /* 1 */ val xlTop10Top: xlTop10Top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlTopBottom with scala.Double] = js.native
}

