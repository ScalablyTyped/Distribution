package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpArrangeStyle extends js.Object

@JSGlobal("PowerPoint.PpArrangeStyle")
@js.native
object PpArrangeStyle extends js.Object {
  @js.native
  sealed trait ppArrangeCascade
    extends activexDashPowerpointLib.PowerPointNs.PpArrangeStyle
  
  @js.native
  sealed trait ppArrangeTiled
    extends activexDashPowerpointLib.PowerPointNs.PpArrangeStyle
  
  /* 2 */ val ppArrangeCascade: ppArrangeCascade with scala.Double = js.native
  /* 1 */ val ppArrangeTiled: ppArrangeTiled with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpArrangeStyle with scala.Double] = js.native
}

