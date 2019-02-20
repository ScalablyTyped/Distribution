package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FillRule extends js.Object

/**
  * Determines which algorithm to use when determining inside and outside of filled poly-polygons.
  * @since OOo 2.0
  */
@JSGlobal("com.sun.star.rendering.FillRule")
@js.native
object FillRule extends js.Object {
  /** Fill every area, where, when traveling along a line, an uneven number of intersections with polygon edges have happened. */
  @js.native
  sealed trait EVEN_ODD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.FillRule
  
  /**
    * Fill every area, where, when traveling along a line, the summed winding number (that is, -1 for a counter-clockwise-oriented polygon, and +1 for a
    * clockwise-oriented) is non-zero.
    *
    * For example, a poly-polygon consisting of two concentric circles with similar orientation is filled the same way as if only the outer circle would
    * exist. If both have opposite orientation, then the filled representation looks the same as if filled with the EVEN_ODD fill rule.
    */
  @js.native
  sealed trait NON_ZERO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.FillRule
  
  /* 1 */ val EVEN_ODD: EVEN_ODD with scala.Double = js.native
  /* 0 */ val NON_ZERO: NON_ZERO with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs.FillRule with scala.Double
  ] = js.native
}

