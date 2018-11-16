package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlChartElementPosition extends js.Object

@JSGlobal("Word.XlChartElementPosition")
@js.native
object XlChartElementPosition extends js.Object {
  @js.native
  sealed trait xlChartElementPositionAutomatic
    extends activexDashWordLib.WordNs.XlChartElementPosition
  
  @js.native
  sealed trait xlChartElementPositionCustom
    extends activexDashWordLib.WordNs.XlChartElementPosition
  
  /* -4105 */ val xlChartElementPositionAutomatic: xlChartElementPositionAutomatic with scala.Double = js.native
  /* -4114 */ val xlChartElementPositionCustom: xlChartElementPositionCustom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlChartElementPosition with scala.Double] = js.native
}

