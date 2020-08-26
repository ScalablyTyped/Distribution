package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service describes a polypolygonbezier.
  *
  * A polypolygonbezier consists of multiple Bezier polygons combined in one.
  */
@js.native
trait PolyPolygonBezierDescriptor extends js.Object {
  /** These are the untransformed Bezier coordinates of this polygon. */
  var Geometry: PolyPolygonBezierCoords = js.native
  /** These are the Bezier points of this polygon. */
  var PolyPolygonBezier: PolyPolygonBezierCoords = js.native
  /** This is the type of this polygon. */
  var PolygonKind: typings.activexLibreoffice.com_.sun.star.drawing.PolygonKind = js.native
}

object PolyPolygonBezierDescriptor {
  @scala.inline
  def apply(
    Geometry: PolyPolygonBezierCoords,
    PolyPolygonBezier: PolyPolygonBezierCoords,
    PolygonKind: PolygonKind
  ): PolyPolygonBezierDescriptor = {
    val __obj = js.Dynamic.literal(Geometry = Geometry.asInstanceOf[js.Any], PolyPolygonBezier = PolyPolygonBezier.asInstanceOf[js.Any], PolygonKind = PolygonKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyPolygonBezierDescriptor]
  }
  @scala.inline
  implicit class PolyPolygonBezierDescriptorOps[Self <: PolyPolygonBezierDescriptor] (val x: Self) extends AnyVal {
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
    def setGeometry(value: PolyPolygonBezierCoords): Self = this.set("Geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolyPolygonBezier(value: PolyPolygonBezierCoords): Self = this.set("PolyPolygonBezier", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolygonKind(value: PolygonKind): Self = this.set("PolygonKind", value.asInstanceOf[js.Any])
  }
  
}

