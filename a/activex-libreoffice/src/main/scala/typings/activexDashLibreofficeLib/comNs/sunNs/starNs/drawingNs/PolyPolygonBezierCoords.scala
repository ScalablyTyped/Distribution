package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the coordinates for a poly polygon Bezier. */
trait PolyPolygonBezierCoords extends js.Object {
  var Coordinates: PointSequenceSequence
  var Flags: FlagSequenceSequence
}

object PolyPolygonBezierCoords {
  @scala.inline
  def apply(Coordinates: PointSequenceSequence, Flags: FlagSequenceSequence): PolyPolygonBezierCoords = {
    val __obj = js.Dynamic.literal(Coordinates = Coordinates.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PolyPolygonBezierCoords]
  }
}

