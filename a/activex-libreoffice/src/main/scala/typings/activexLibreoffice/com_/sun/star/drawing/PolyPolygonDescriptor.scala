package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service describes a poly-polygon.
  *
  * A poly-polygon consists of multiple polygons combined in one.
  */
trait PolyPolygonDescriptor extends js.Object {
  /** These are the untransformed points of this polygon. */
  var Geometry: PointSequenceSequence
  /** These are the reference points for this polygon. */
  var PolyPolygon: PointSequenceSequence
  /** This is the type of polygon. */
  var PolygonKind: typings.activexLibreoffice.com_.sun.star.drawing.PolygonKind
}

object PolyPolygonDescriptor {
  @scala.inline
  def apply(Geometry: PointSequenceSequence, PolyPolygon: PointSequenceSequence, PolygonKind: PolygonKind): PolyPolygonDescriptor = {
    val __obj = js.Dynamic.literal(Geometry = Geometry.asInstanceOf[js.Any], PolyPolygon = PolyPolygon.asInstanceOf[js.Any], PolygonKind = PolygonKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyPolygonDescriptor]
  }
}

