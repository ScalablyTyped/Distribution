package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometry extends StObject {
  
  /**
    * The coordinates of the GeoJson Geometry.
    */
  var Coordinates: LinearRings
  
  /**
    * GeoJson Geometry types like Polygon and MultiPolygon.
    */
  var Type: String
}
object Geometry {
  
  inline def apply(Coordinates: LinearRings, Type: String): Geometry = {
    val __obj = js.Dynamic.literal(Coordinates = Coordinates.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Geometry] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(value: LinearRings): Self = StObject.set(x, "Coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: LinearRing*): Self = StObject.set(x, "Coordinates", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
