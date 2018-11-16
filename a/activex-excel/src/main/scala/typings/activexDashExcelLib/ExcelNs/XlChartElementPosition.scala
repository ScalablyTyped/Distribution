package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlChartElementPosition extends js.Object

@JSGlobal("Excel.XlChartElementPosition")
@js.native
object XlChartElementPosition extends js.Object {
  @js.native
  sealed trait xlChartElementPositionAutomatic
    extends activexDashExcelLib.ExcelNs.XlChartElementPosition
  
  @js.native
  sealed trait xlChartElementPositionCustom
    extends activexDashExcelLib.ExcelNs.XlChartElementPosition
  
  /* -4105 */ val xlChartElementPositionAutomatic: xlChartElementPositionAutomatic with scala.Double = js.native
  /* -4114 */ val xlChartElementPositionCustom: xlChartElementPositionCustom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashExcelLib.ExcelNs.XlChartElementPosition with scala.Double] = js.native
}

