package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service describes a polypolygonbezier.
  *
  * A polypolygonbezier consists of multiple Bezier polygons combined in one.
  */
trait PolyPolygonBezierDescriptor extends js.Object {
  /** These are the untransformed Bezier coordinates of this polygon. */
  var Geometry: PolyPolygonBezierCoords
  /** These are the Bezier points of this polygon. */
  var PolyPolygonBezier: PolyPolygonBezierCoords
  /** This is the type of this polygon. */
  var PolygonKind: typings.activexLibreoffice.com_.sun.star.drawing.PolygonKind
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
}

