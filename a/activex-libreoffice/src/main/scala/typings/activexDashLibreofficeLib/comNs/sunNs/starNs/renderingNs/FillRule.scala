package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines which algorithm to use when determining inside and outside of filled poly-polygons.
  * @since OOo 2.0
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait FillRule extends js.Object

object FillRule {
  /** Fill every area, where, when traveling along a line, an uneven number of intersections with polygon edges have happened. */
  @scala.inline
  def EVEN_ODD: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /**
    * Fill every area, where, when traveling along a line, the summed winding number (that is, -1 for a counter-clockwise-oriented polygon, and +1 for a
    * clockwise-oriented) is non-zero.
    *
    * For example, a poly-polygon consisting of two concentric circles with similar orientation is filled the same way as if only the outer circle would
    * exist. If both have opposite orientation, then the filled representation looks the same as if filled with the EVEN_ODD fill rule.
    */
  @scala.inline
  def NON_ZERO: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

