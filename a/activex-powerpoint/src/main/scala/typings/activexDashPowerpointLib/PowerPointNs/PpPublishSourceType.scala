package typings
package activexDashPowerpointLib.PowerPointNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PpPublishSourceType extends js.Object

@JSGlobal("PowerPoint.PpPublishSourceType")
@js.native
object PpPublishSourceType extends js.Object {
  @js.native
  sealed trait ppPublishAll
    extends activexDashPowerpointLib.PowerPointNs.PpPublishSourceType
  
  @js.native
  sealed trait ppPublishNamedSlideShow
    extends activexDashPowerpointLib.PowerPointNs.PpPublishSourceType
  
  @js.native
  sealed trait ppPublishSlideRange
    extends activexDashPowerpointLib.PowerPointNs.PpPublishSourceType
  
  /* 1 */ val ppPublishAll: ppPublishAll with scala.Double = js.native
  /* 3 */ val ppPublishNamedSlideShow: ppPublishNamedSlideShow with scala.Double = js.native
  /* 2 */ val ppPublishSlideRange: ppPublishSlideRange with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashPowerpointLib.PowerPointNs.PpPublishSourceType with scala.Double] = js.native
}

