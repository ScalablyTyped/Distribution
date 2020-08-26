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
@js.native
trait RealBezierSegment2D extends js.Object {
  var C1x: Double = js.native
  var C1y: Double = js.native
  var C2x: Double = js.native
  var C2y: Double = js.native
  var Px: Double = js.native
  var Py: Double = js.native
}

object RealBezierSegment2D {
  @scala.inline
  def apply(C1x: Double, C1y: Double, C2x: Double, C2y: Double, Px: Double, Py: Double): RealBezierSegment2D = {
    val __obj = js.Dynamic.literal(C1x = C1x.asInstanceOf[js.Any], C1y = C1y.asInstanceOf[js.Any], C2x = C2x.asInstanceOf[js.Any], C2y = C2y.asInstanceOf[js.Any], Px = Px.asInstanceOf[js.Any], Py = Py.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealBezierSegment2D]
  }
  @scala.inline
  implicit class RealBezierSegment2DOps[Self <: RealBezierSegment2D] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setC1x(value: Double): Self = this.set("C1x", value.asInstanceOf[js.Any])
    @scala.inline
    def setC1y(value: Double): Self = this.set("C1y", value.asInstanceOf[js.Any])
    @scala.inline
    def setC2x(value: Double): Self = this.set("C2x", value.asInstanceOf[js.Any])
    @scala.inline
    def setC2y(value: Double): Self = this.set("C2y", value.asInstanceOf[js.Any])
    @scala.inline
    def setPx(value: Double): Self = this.set("Px", value.asInstanceOf[js.Any])
    @scala.inline
    def setPy(value: Double): Self = this.set("Py", value.asInstanceOf[js.Any])
  }
  
}

