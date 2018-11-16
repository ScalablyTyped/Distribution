package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAnimAccumulate extends js.Object

@JSGlobal("PowerPoint.MsoAnimAccumulate")
@js.native
object MsoAnimAccumulate extends js.Object {
  @js.native
  sealed trait msoAnimAccumulateAlways
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimAccumulate
  
  @js.native
  sealed trait msoAnimAccumulateNone
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimAccumulate
  
  /* 2 */ val msoAnimAccumulateAlways: msoAnimAccumulateAlways with scala.Double = js.native
  /* 1 */ val msoAnimAccumulateNone: msoAnimAccumulateNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.MsoAnimAccumulate with scala.Double] = js.native
}

