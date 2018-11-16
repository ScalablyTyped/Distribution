package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpFollowColors extends js.Object

@JSGlobal("PowerPoint.PpFollowColors")
@js.native
object PpFollowColors extends js.Object {
  @js.native
  sealed trait ppFollowColorsMixed
    extends activexDashPowerpointLib.PowerPointNs.PpFollowColors
  
  @js.native
  sealed trait ppFollowColorsNone
    extends activexDashPowerpointLib.PowerPointNs.PpFollowColors
  
  @js.native
  sealed trait ppFollowColorsScheme
    extends activexDashPowerpointLib.PowerPointNs.PpFollowColors
  
  @js.native
  sealed trait ppFollowColorsTextAndBackground
    extends activexDashPowerpointLib.PowerPointNs.PpFollowColors
  
  /* -2 */ val ppFollowColorsMixed: ppFollowColorsMixed with scala.Double = js.native
  /* 0 */ val ppFollowColorsNone: ppFollowColorsNone with scala.Double = js.native
  /* 1 */ val ppFollowColorsScheme: ppFollowColorsScheme with scala.Double = js.native
  /* 2 */ val ppFollowColorsTextAndBackground: ppFollowColorsTextAndBackground with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpFollowColors with scala.Double] = js.native
}

