package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Sets the type of curves that are drawn for line charts. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
*/
trait CurveStyle extends js.Object

object CurveStyle {
  /** Data points are connected via a parametric, interpolating B-spline curve. */
  @scala.inline
  def B_SPLINES: `2` = this.cast(2)
  /** Data points are connected via a smoothed cubic spline curve. The data points themselves are part of to the curve. */
  @scala.inline
  def CUBIC_SPLINES: `1` = this.cast(1)
  /** Lines between data points are not smoothed */
  @scala.inline
  def LINES: `0` = this.cast(0)
  @scala.inline
  def NURBS: `3` = this.cast(3)
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
  def STEP_CENTER_X: `6` = this.cast(6)
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
  def STEP_CENTER_Y: `7` = this.cast(7)
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
  def STEP_END: `5` = this.cast(5)
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
  def STEP_START: `4` = this.cast(4)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

