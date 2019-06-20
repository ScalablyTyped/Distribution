package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Sets the type of curves that are drawn for line charts. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
*/
trait CurveStyle extends js.Object

object CurveStyle {
  /** Data points are connected via a parametric, interpolating B-spline curve. */
  @scala.inline
  def B_SPLINES: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** Data points are connected via a smoothed cubic spline curve. The data points themselves are part of to the curve. */
  @scala.inline
  def CUBIC_SPLINES: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** Lines between data points are not smoothed */
  @scala.inline
  def LINES: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  def NURBS: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /**
    * Data points are connected via a 3-segmented stepped line. The lines is horizontal till the center of the X values.
    *
    * +--O
    *
    *             |
    *
    *             |
    *
    *             |
    *
    *          O--+
    */
  @scala.inline
  def STEP_CENTER_X: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  /**
    * Data points are connected via a 3-segmented stepped line. The lines is horizontal at the center of the Y values.
    *
    * O
    *
    *                |
    *
    *          +-----+
    *
    *          |
    *
    *          O
    */
  @scala.inline
  def STEP_CENTER_Y: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  /**
    * Data points are connected via a 2-segmented stepped line. The line ends horizontally.
    *
    * +------O
    *
    *         |
    *
    *         |
    *
    *         |
    *
    *         O
    */
  @scala.inline
  def STEP_END: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /**
    * Data points are connected via a 2-segmented stepped line. The line starts horizontally.
    *
    * O
    *
    *                |
    *
    *                |
    *
    *                |
    *
    *          O-----+
    */
  @scala.inline
  def STEP_START: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

