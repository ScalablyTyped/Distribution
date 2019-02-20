package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MirrorAxis extends js.Object

/** defines an axis for simple mirroring. */
@JSGlobal("com.sun.star.drawing.MirrorAxis")
@js.native
object MirrorAxis extends js.Object {
  /** mirror to the horizontal axis */
  @js.native
  sealed trait HORIZONTAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MirrorAxis
  
  /** mirror to the vertical axis */
  @js.native
  sealed trait VERTICAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MirrorAxis
  
  /* 1 */ val HORIZONTAL: HORIZONTAL with scala.Double = js.native
  /* 0 */ val VERTICAL: VERTICAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.MirrorAxis with scala.Double
  ] = js.native
}

