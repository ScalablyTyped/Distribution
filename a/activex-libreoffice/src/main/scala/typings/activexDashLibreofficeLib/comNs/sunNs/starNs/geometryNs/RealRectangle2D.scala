package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains the necessary information for a two-dimensional rectangle.
  * @since OOo 2.0
  */
trait RealRectangle2D extends js.Object {
  var X1: scala.Double
  /**
    * X coordinate of lower right corner.
    *
    * Must be greater than x1 for non-empty rectangles.
    *
    * .
    */
  var X2: scala.Double
  var Y1: scala.Double
  /**
    * Y coordinate of lower right corner.
    *
    * Must be greater than y1 for non-empty rectangles.
    */
  var Y2: scala.Double
}

object RealRectangle2D {
  @scala.inline
  def apply(X1: scala.Double, X2: scala.Double, Y1: scala.Double, Y2: scala.Double): RealRectangle2D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("X1")(X1)
    __obj.updateDynamic("X2")(X2)
    __obj.updateDynamic("Y1")(Y1)
    __obj.updateDynamic("Y2")(Y2)
    __obj.asInstanceOf[RealRectangle2D]
  }
}

