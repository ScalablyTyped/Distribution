package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoClickState extends js.Object

@JSGlobal("PowerPoint.MsoClickState")
@js.native
object MsoClickState extends js.Object {
  @js.native
  sealed trait msoClickStateAfterAllAnimations
    extends activexDashPowerpointLib.PowerPointNs.MsoClickState
  
  @js.native
  sealed trait msoClickStateBeforeAutomaticAnimations
    extends activexDashPowerpointLib.PowerPointNs.MsoClickState
  
  /* -2 */ val msoClickStateAfterAllAnimations: msoClickStateAfterAllAnimations with scala.Double = js.native
  /* -1 */ val msoClickStateBeforeAutomaticAnimations: msoClickStateBeforeAutomaticAnimations with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.MsoClickState with scala.Double] = js.native
}

