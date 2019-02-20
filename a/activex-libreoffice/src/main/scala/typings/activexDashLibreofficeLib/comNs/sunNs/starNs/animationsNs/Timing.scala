package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Timing extends js.Object

@JSGlobal("com.sun.star.animations.Timing")
@js.native
object Timing extends js.Object {
  /** specifies that a duration, end or start time is indefinite */
  @js.native
  sealed trait INDEFINITE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.Timing
  
  /** specifies a simple duration as the intrinsic media duration. This is only valid for elements that define media. */
  @js.native
  sealed trait MEDIA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.Timing
  
  /* 0 */ val INDEFINITE: INDEFINITE with scala.Double = js.native
  /* 1 */ val MEDIA: MEDIA with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs.Timing with scala.Double
  ] = js.native
}

