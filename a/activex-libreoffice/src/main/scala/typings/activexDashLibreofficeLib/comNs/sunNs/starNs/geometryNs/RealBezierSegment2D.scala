package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs

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
  var C1x: scala.Double
  var C1y: scala.Double
  var C2x: scala.Double
  var C2y: scala.Double
  var Px: scala.Double
  var Py: scala.Double
}

