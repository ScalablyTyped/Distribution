package typings.activexLibreoffice.com_.sun.star.geometry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure contains the relevant data for a cubic Bezier curve.
  *
  * The data is stored real-valued. The last point of the segment is taken from the first point of the following segment, and thus not included herein.
  * That is, when forming a polygon out of cubic Bezier segments, each two consecutive {@link RealBezierSegment2D} define the actual curve, with the very
  * last segment providing only the end point of the last curve, and the remaining members ignored.
  * @see com.sun.star.rendering.XBezierPolyPolygon2D
  * @since OOo 2.0
  */
trait RealBezierSegment2D extends js.Object {
  var C1x: Double
  var C1y: Double
  var C2x: Double
  var C2y: Double
  var Px: Double
  var Py: Double
}

object RealBezierSegment2D {
  @scala.inline
  def apply(C1x: Double, C1y: Double, C2x: Double, C2y: Double, Px: Double, Py: Double): RealBezierSegment2D = {
    val __obj = js.Dynamic.literal(C1x = C1x.asInstanceOf[js.Any], C1y = C1y.asInstanceOf[js.Any], C2x = C2x.asInstanceOf[js.Any], C2y = C2y.asInstanceOf[js.Any], Px = Px.asInstanceOf[js.Any], Py = Py.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealBezierSegment2D]
  }
}

