package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service describes a poly-polygon.
  *
  * A poly-polygon consists of multiple polygons combined in one.
  */
@js.native
trait PolyPolygonDescriptor extends js.Object {
  /** These are the untransformed points of this polygon. */
  var Geometry: PointSequenceSequence = js.native
  /** These are the reference points for this polygon. */
  var PolyPolygon: PointSequenceSequence = js.native
  /** This is the type of polygon. */
  var PolygonKind: typings.activexLibreoffice.com_.sun.star.drawing.PolygonKind = js.native
}

object PolyPolygonDescriptor {
  @scala.inline
  def apply(Geometry: PointSequenceSequence, PolyPolygon: PointSequenceSequence, PolygonKind: PolygonKind): PolyPolygonDescriptor = {
    val __obj = js.Dynamic.literal(Geometry = Geometry.asInstanceOf[js.Any], PolyPolygon = PolyPolygon.asInstanceOf[js.Any], PolygonKind = PolygonKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyPolygonDescriptor]
  }
  @scala.inline
  implicit class PolyPolygonDescriptorOps[Self <: PolyPolygonDescriptor] (val x: Self) extends AnyVal {
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
    def setGeometryVarargs(value: PointSequence*): Self = this.set("Geometry", js.Array(value :_*))
    @scala.inline
    def setGeometry(value: PointSequenceSequence): Self = this.set("Geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolyPolygonVarargs(value: PointSequence*): Self = this.set("PolyPolygon", js.Array(value :_*))
    @scala.inline
    def setPolyPolygon(value: PointSequenceSequence): Self = this.set("PolyPolygon", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolygonKind(value: PolygonKind): Self = this.set("PolygonKind", value.asInstanceOf[js.Any])
  }
  
}

