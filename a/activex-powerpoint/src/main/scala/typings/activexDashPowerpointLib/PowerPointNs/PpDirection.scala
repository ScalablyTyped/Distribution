package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpDirection extends js.Object

@JSGlobal("PowerPoint.PpDirection")
@js.native
object PpDirection extends js.Object {
  @js.native
  sealed trait ppDirectionLeftToRight
    extends activexDashPowerpointLib.PowerPointNs.PpDirection
  
  @js.native
  sealed trait ppDirectionMixed
    extends activexDashPowerpointLib.PowerPointNs.PpDirection
  
  @js.native
  sealed trait ppDirectionRightToLeft
    extends activexDashPowerpointLib.PowerPointNs.PpDirection
  
  /* 1 */ val ppDirectionLeftToRight: ppDirectionLeftToRight with scala.Double = js.native
  /* -2 */ val ppDirectionMixed: ppDirectionMixed with scala.Double = js.native
  /* 2 */ val ppDirectionRightToLeft: ppDirectionRightToLeft with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpDirection with scala.Double] = js.native
}

