package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpSlideShowPointerType extends js.Object

@JSGlobal("PowerPoint.PpSlideShowPointerType")
@js.native
object PpSlideShowPointerType extends js.Object {
  @js.native
  sealed trait ppSlideShowPointerAlwaysHidden
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowPointerType
  
  @js.native
  sealed trait ppSlideShowPointerArrow
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowPointerType
  
  @js.native
  sealed trait ppSlideShowPointerAutoArrow
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowPointerType
  
  @js.native
  sealed trait ppSlideShowPointerEraser
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowPointerType
  
  @js.native
  sealed trait ppSlideShowPointerNone
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowPointerType
  
  @js.native
  sealed trait ppSlideShowPointerPen
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowPointerType
  
  /* 3 */ val ppSlideShowPointerAlwaysHidden: ppSlideShowPointerAlwaysHidden with scala.Double = js.native
  /* 1 */ val ppSlideShowPointerArrow: ppSlideShowPointerArrow with scala.Double = js.native
  /* 4 */ val ppSlideShowPointerAutoArrow: ppSlideShowPointerAutoArrow with scala.Double = js.native
  /* 5 */ val ppSlideShowPointerEraser: ppSlideShowPointerEraser with scala.Double = js.native
  /* 0 */ val ppSlideShowPointerNone: ppSlideShowPointerNone with scala.Double = js.native
  /* 2 */ val ppSlideShowPointerPen: ppSlideShowPointerPen with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpSlideShowPointerType with scala.Double] = js.native
}

