package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonGeometryInput extends StObject {
  
  /**
    * Coordinates representing a Polygon based on the GeoJson spec.
    */
  var Coordinates: LinearRings
}
object PolygonGeometryInput {
  
  inline def apply(Coordinates: LinearRings): PolygonGeometryInput = {
    val __obj = js.Dynamic.literal(Coordinates = Coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonGeometryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolygonGeometryInput] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(value: LinearRings): Self = StObject.set(x, "Coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: LinearRing*): Self = StObject.set(x, "Coordinates", js.Array(value*))
  }
}
