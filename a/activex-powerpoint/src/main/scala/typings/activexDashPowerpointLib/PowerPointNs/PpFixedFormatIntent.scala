package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpFixedFormatIntent extends js.Object

@JSGlobal("PowerPoint.PpFixedFormatIntent")
@js.native
object PpFixedFormatIntent extends js.Object {
  @js.native
  sealed trait ppFixedFormatIntentPrint
    extends activexDashPowerpointLib.PowerPointNs.PpFixedFormatIntent
  
  @js.native
  sealed trait ppFixedFormatIntentScreen
    extends activexDashPowerpointLib.PowerPointNs.PpFixedFormatIntent
  
  /* 2 */ val ppFixedFormatIntentPrint: ppFixedFormatIntentPrint with scala.Double = js.native
  /* 1 */ val ppFixedFormatIntentScreen: ppFixedFormatIntentScreen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpFixedFormatIntent with scala.Double] = js.native
}

