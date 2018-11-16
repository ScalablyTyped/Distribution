package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpMouseActivation extends js.Object

@JSGlobal("PowerPoint.PpMouseActivation")
@js.native
object PpMouseActivation extends js.Object {
  @js.native
  sealed trait ppMouseClick
    extends activexDashPowerpointLib.PowerPointNs.PpMouseActivation
  
  @js.native
  sealed trait ppMouseOver
    extends activexDashPowerpointLib.PowerPointNs.PpMouseActivation
  
  /* 1 */ val ppMouseClick: ppMouseClick with scala.Double = js.native
  /* 2 */ val ppMouseOver: ppMouseOver with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpMouseActivation with scala.Double] = js.native
}

