package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpSlideShowAdvanceMode extends js.Object

@JSGlobal("PowerPoint.PpSlideShowAdvanceMode")
@js.native
object PpSlideShowAdvanceMode extends js.Object {
  @js.native
  sealed trait ppSlideShowManualAdvance
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowAdvanceMode
  
  @js.native
  sealed trait ppSlideShowRehearseNewTimings
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowAdvanceMode
  
  @js.native
  sealed trait ppSlideShowUseSlideTimings
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowAdvanceMode
  
  /* 1 */ val ppSlideShowManualAdvance: ppSlideShowManualAdvance with scala.Double = js.native
  /* 3 */ val ppSlideShowRehearseNewTimings: ppSlideShowRehearseNewTimings with scala.Double = js.native
  /* 2 */ val ppSlideShowUseSlideTimings: ppSlideShowUseSlideTimings with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpSlideShowAdvanceMode with scala.Double] = js.native
}

