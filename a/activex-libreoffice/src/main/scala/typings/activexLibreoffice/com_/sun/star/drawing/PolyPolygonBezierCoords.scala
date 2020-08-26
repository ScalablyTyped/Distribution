package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the coordinates for a poly polygon Bezier. */
@js.native
trait PolyPolygonBezierCoords extends js.Object {
  var Coordinates: PointSequenceSequence = js.native
  var Flags: FlagSequenceSequence = js.native
}

object PolyPolygonBezierCoords {
  @scala.inline
  def apply(Coordinates: PointSequenceSequence, Flags: FlagSequenceSequence): PolyPolygonBezierCoords = {
    val __obj = js.Dynamic.literal(Coordinates = Coordinates.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyPolygonBezierCoords]
  }
  @scala.inline
  implicit class PolyPolygonBezierCoordsOps[Self <: PolyPolygonBezierCoords] (val x: Self) extends AnyVal {
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
    def setCoordinatesVarargs(value: PointSequence*): Self = this.set("Coordinates", js.Array(value :_*))
    @scala.inline
    def setCoordinates(value: PointSequenceSequence): Self = this.set("Coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlagsVarargs(value: FlagSequence*): Self = this.set("Flags", js.Array(value :_*))
    @scala.inline
    def setFlags(value: FlagSequenceSequence): Self = this.set("Flags", value.asInstanceOf[js.Any])
  }
  
}

