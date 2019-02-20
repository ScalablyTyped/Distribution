package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HatchStyle extends js.Object

/** The HatchStyle defines the style of the lines in a hatch. */
@JSGlobal("com.sun.star.drawing.HatchStyle")
@js.native
object HatchStyle extends js.Object {
  /** the hatch has a horizontal and a vertical line */
  @js.native
  sealed trait DOUBLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HatchStyle
  
  /** the hatch consists of a single horizontal line */
  @js.native
  sealed trait SINGLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HatchStyle
  
  /** the hatch has a horizontal, a vertical and a diagonal line */
  @js.native
  sealed trait TRIPLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HatchStyle
  
  /* 1 */ val DOUBLE: DOUBLE with scala.Double = js.native
  /* 0 */ val SINGLE: SINGLE with scala.Double = js.native
  /* 2 */ val TRIPLE: TRIPLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HatchStyle with scala.Double
  ] = js.native
}

