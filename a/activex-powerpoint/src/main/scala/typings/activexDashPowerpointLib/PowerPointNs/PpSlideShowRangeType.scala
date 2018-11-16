package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpSlideShowRangeType extends js.Object

@JSGlobal("PowerPoint.PpSlideShowRangeType")
@js.native
object PpSlideShowRangeType extends js.Object {
  @js.native
  sealed trait ppShowAll
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowRangeType
  
  @js.native
  sealed trait ppShowNamedSlideShow
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowRangeType
  
  @js.native
  sealed trait ppShowSlideRange
    extends activexDashPowerpointLib.PowerPointNs.PpSlideShowRangeType
  
  /* 1 */ val ppShowAll: ppShowAll with scala.Double = js.native
  /* 3 */ val ppShowNamedSlideShow: ppShowNamedSlideShow with scala.Double = js.native
  /* 2 */ val ppShowSlideRange: ppShowSlideRange with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpSlideShowRangeType with scala.Double] = js.native
}

