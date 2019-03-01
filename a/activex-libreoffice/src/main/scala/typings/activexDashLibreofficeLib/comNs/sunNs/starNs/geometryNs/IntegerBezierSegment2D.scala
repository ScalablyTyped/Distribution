package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains the relevant data for a cubic Bezier curve.
  *
  * The data is stored integer-valued. The last point of the segment is taken from the first point of the following segment, and thus not included herein.
  * That is, when forming a polygon out of cubic Bezier segments, each two consecutive IntegerBezierSegment2Ds define the actual curve, with the very last
  * segment providing only the end point of the last curve, and the remaining members ignored.
  * @see com.sun.star.rendering.XBezierPolyPolygon2D
  * @since OOo 2.0
  */
trait IntegerBezierSegment2D extends js.Object {
  var C1x: scala.Double
  var C1y: scala.Double
  var C2x: scala.Double
  var C2y: scala.Double
  var Px: scala.Double
  var Py: scala.Double
}

object IntegerBezierSegment2D {
  @scala.inline
  def apply(
    C1x: scala.Double,
    C1y: scala.Double,
    C2x: scala.Double,
    C2y: scala.Double,
    Px: scala.Double,
    Py: scala.Double
  ): IntegerBezierSegment2D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("C1x")(C1x)
    __obj.updateDynamic("C1y")(C1y)
    __obj.updateDynamic("C2x")(C2x)
    __obj.updateDynamic("C2y")(C2y)
    __obj.updateDynamic("Px")(Px)
    __obj.updateDynamic("Py")(Py)
    __obj.asInstanceOf[IntegerBezierSegment2D]
  }
}

