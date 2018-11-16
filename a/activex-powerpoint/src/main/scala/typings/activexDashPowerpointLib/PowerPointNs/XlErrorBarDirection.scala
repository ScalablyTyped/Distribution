package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait XlErrorBarDirection extends js.Object

@JSGlobal("PowerPoint.XlErrorBarDirection")
@js.native
object XlErrorBarDirection extends js.Object {
  @js.native
  sealed trait xlChartX
    extends activexDashPowerpointLib.PowerPointNs.XlErrorBarDirection
  
  @js.native
  sealed trait xlChartY
    extends activexDashPowerpointLib.PowerPointNs.XlErrorBarDirection
  
  /* -4168 */ val xlChartX: xlChartX with scala.Double = js.native
  /* 1 */ val xlChartY: xlChartY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.XlErrorBarDirection with scala.Double] = js.native
}

