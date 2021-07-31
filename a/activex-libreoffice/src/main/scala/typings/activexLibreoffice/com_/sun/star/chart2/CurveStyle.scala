package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.activexLibreofficeNumbers.`6`
import typings.activexLibreoffice.activexLibreofficeNumbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Sets the type of curves that are drawn for line charts. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`6`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`7`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
*/
trait CurveStyle extends StObject
object CurveStyle {
  
  /** Data points are connected via a parametric, interpolating B-spline curve. */
  @scala.inline
  def B_SPLINES: `2` = 2.asInstanceOf[`2`]
  
  /** Data points are connected via a smoothed cubic spline curve. The data points themselves are part of to the curve. */
  @scala.inline
  def CUBIC_SPLINES: `1` = 1.asInstanceOf[`1`]
  
  /** Lines between data points are not smoothed */
  @scala.inline
  def LINES: `0` = 0.asInstanceOf[`0`]
  
  @scala.inline
  def NURBS: `3` = 3.asInstanceOf[`3`]
  
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
  def STEP_CENTER_X: `6` = 6.asInstanceOf[`6`]
  
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
  def STEP_CENTER_Y: `7` = 7.asInstanceOf[`7`]
  
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
  def STEP_END: `5` = 5.asInstanceOf[`5`]
  
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
  def STEP_START: `4` = 4.asInstanceOf[`4`]
}
