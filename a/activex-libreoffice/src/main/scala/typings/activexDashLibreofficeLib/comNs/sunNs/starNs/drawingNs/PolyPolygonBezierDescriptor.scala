package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

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
  var PolygonKind: PolygonKind
}

object PolyPolygonBezierDescriptor {
  @scala.inline
  def apply(
    Geometry: PolyPolygonBezierCoords,
    PolyPolygonBezier: PolyPolygonBezierCoords,
    PolygonKind: PolygonKind
  ): PolyPolygonBezierDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Geometry")(Geometry)
    __obj.updateDynamic("PolyPolygonBezier")(PolyPolygonBezier)
    __obj.updateDynamic("PolygonKind")(PolygonKind)
    __obj.asInstanceOf[PolyPolygonBezierDescriptor]
  }
}

