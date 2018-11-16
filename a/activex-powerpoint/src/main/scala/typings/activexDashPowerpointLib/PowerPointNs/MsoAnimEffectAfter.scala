package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoAnimEffectAfter extends js.Object

@JSGlobal("PowerPoint.MsoAnimEffectAfter")
@js.native
object MsoAnimEffectAfter extends js.Object {
  @js.native
  sealed trait msoAnimEffectAfterFreeze
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimEffectAfter
  
  @js.native
  sealed trait msoAnimEffectAfterHold
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimEffectAfter
  
  @js.native
  sealed trait msoAnimEffectAfterRemove
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimEffectAfter
  
  @js.native
  sealed trait msoAnimEffectAfterTransition
    extends activexDashPowerpointLib.PowerPointNs.MsoAnimEffectAfter
  
  /* 1 */ val msoAnimEffectAfterFreeze: msoAnimEffectAfterFreeze with scala.Double = js.native
  /* 3 */ val msoAnimEffectAfterHold: msoAnimEffectAfterHold with scala.Double = js.native
  /* 2 */ val msoAnimEffectAfterRemove: msoAnimEffectAfterRemove with scala.Double = js.native
  /* 4 */ val msoAnimEffectAfterTransition: msoAnimEffectAfterTransition with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.MsoAnimEffectAfter with scala.Double] = js.native
}

