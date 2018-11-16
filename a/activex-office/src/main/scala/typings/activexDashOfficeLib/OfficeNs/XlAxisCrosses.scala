package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlAxisCrosses extends js.Object

@JSGlobal("Office.XlAxisCrosses")
@js.native
object XlAxisCrosses extends js.Object {
  @js.native
  sealed trait xlAxisCrossesAutomatic
    extends activexDashOfficeLib.OfficeNs.XlAxisCrosses
  
  @js.native
  sealed trait xlAxisCrossesCustom
    extends activexDashOfficeLib.OfficeNs.XlAxisCrosses
  
  @js.native
  sealed trait xlAxisCrossesMaximum
    extends activexDashOfficeLib.OfficeNs.XlAxisCrosses
  
  @js.native
  sealed trait xlAxisCrossesMinimum
    extends activexDashOfficeLib.OfficeNs.XlAxisCrosses
  
  /* -4105 */ val xlAxisCrossesAutomatic: xlAxisCrossesAutomatic with scala.Double = js.native
  /* -4114 */ val xlAxisCrossesCustom: xlAxisCrossesCustom with scala.Double = js.native
  /* 2 */ val xlAxisCrossesMaximum: xlAxisCrossesMaximum with scala.Double = js.native
  /* 4 */ val xlAxisCrossesMinimum: xlAxisCrossesMinimum with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlAxisCrosses with scala.Double] = js.native
}

