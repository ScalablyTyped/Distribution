package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlErrorBarDirection extends js.Object

@JSGlobal("Office.XlErrorBarDirection")
@js.native
object XlErrorBarDirection extends js.Object {
  @js.native
  sealed trait xlChartX
    extends activexDashOfficeLib.OfficeNs.XlErrorBarDirection
  
  @js.native
  sealed trait xlChartY
    extends activexDashOfficeLib.OfficeNs.XlErrorBarDirection
  
  /* -4168 */ val xlChartX: xlChartX with scala.Double = js.native
  /* 1 */ val xlChartY: xlChartY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.XlErrorBarDirection with scala.Double] = js.native
}

