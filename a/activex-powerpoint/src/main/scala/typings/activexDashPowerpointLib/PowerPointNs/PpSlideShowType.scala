package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpSlideShowType extends js.Object

@JSGlobal("PowerPoint.PpSlideShowType")
@js.native
object PpSlideShowType extends js.Object {
  @js.native
  sealed trait ppShowTypeKiosk
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowType
  
  @js.native
  sealed trait ppShowTypeSpeaker
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowType
  
  @js.native
  sealed trait ppShowTypeWindow
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowType
  
  @js.native
  sealed trait ppShowTypeWindow2
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowType
  
  /* 3 */ val ppShowTypeKiosk: ppShowTypeKiosk with scala.Double = js.native
  /* 1 */ val ppShowTypeSpeaker: ppShowTypeSpeaker with scala.Double = js.native
  /* 2 */ val ppShowTypeWindow: ppShowTypeWindow with scala.Double = js.native
  /* 4 */ val ppShowTypeWindow2: ppShowTypeWindow2 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpSlideShowType with scala.Double] = js.native
}

