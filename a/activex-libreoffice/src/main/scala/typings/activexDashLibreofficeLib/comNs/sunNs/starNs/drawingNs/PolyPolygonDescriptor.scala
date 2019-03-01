package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

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
  var PolygonKind: PolygonKind
}

object PolyPolygonDescriptor {
  @scala.inline
  def apply(Geometry: PointSequenceSequence, PolyPolygon: PointSequenceSequence, PolygonKind: PolygonKind): PolyPolygonDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Geometry")(Geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("PolyPolygon")(PolyPolygon.asInstanceOf[js.Any])
    __obj.updateDynamic("PolygonKind")(PolygonKind)
    __obj.asInstanceOf[PolyPolygonDescriptor]
  }
}

