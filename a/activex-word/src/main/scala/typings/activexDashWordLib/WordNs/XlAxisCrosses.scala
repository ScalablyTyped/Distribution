package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlAxisCrosses extends js.Object

@JSGlobal("Word.XlAxisCrosses")
@js.native
object XlAxisCrosses extends js.Object {
  @js.native
  sealed trait xlAxisCrossesAutomatic
    extends activexDashWordLib.WordNs.XlAxisCrosses
  
  @js.native
  sealed trait xlAxisCrossesCustom
    extends activexDashWordLib.WordNs.XlAxisCrosses
  
  @js.native
  sealed trait xlAxisCrossesMaximum
    extends activexDashWordLib.WordNs.XlAxisCrosses
  
  @js.native
  sealed trait xlAxisCrossesMinimum
    extends activexDashWordLib.WordNs.XlAxisCrosses
  
  /* -4105 */ val xlAxisCrossesAutomatic: xlAxisCrossesAutomatic with scala.Double = js.native
  /* -4114 */ val xlAxisCrossesCustom: xlAxisCrossesCustom with scala.Double = js.native
  /* 2 */ val xlAxisCrossesMaximum: xlAxisCrossesMaximum with scala.Double = js.native
  /* 4 */ val xlAxisCrossesMinimum: xlAxisCrossesMinimum with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.XlAxisCrosses with scala.Double] = js.native
}

