package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the coordinates for a poly polygon Bezier. */
trait PolyPolygonBezierCoords extends StObject {
  
  var Coordinates: PointSequenceSequence
  
  var Flags: FlagSequenceSequence
}
object PolyPolygonBezierCoords {
  
  @scala.inline
  def apply(Coordinates: PointSequenceSequence, Flags: FlagSequenceSequence): PolyPolygonBezierCoords = {
    val __obj = js.Dynamic.literal(Coordinates = Coordinates.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyPolygonBezierCoords]
  }
  
  @scala.inline
  implicit class PolyPolygonBezierCoordsMutableBuilder[Self <: PolyPolygonBezierCoords] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinates(value: PointSequenceSequence): Self = StObject.set(x, "Coordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinatesVarargs(value: PointSequence*): Self = StObject.set(x, "Coordinates", js.Array(value :_*))
    
    @scala.inline
    def setFlags(value: FlagSequenceSequence): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsVarargs(value: FlagSequence*): Self = StObject.set(x, "Flags", js.Array(value :_*))
  }
}
