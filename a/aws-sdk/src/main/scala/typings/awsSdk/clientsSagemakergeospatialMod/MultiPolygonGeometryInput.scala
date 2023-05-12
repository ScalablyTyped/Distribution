package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiPolygonGeometryInput extends StObject {
  
  /**
    * The coordinates of the multipolygon geometry.
    */
  var Coordinates: LinearRingsList
}
object MultiPolygonGeometryInput {
  
  inline def apply(Coordinates: LinearRingsList): MultiPolygonGeometryInput = {
    val __obj = js.Dynamic.literal(Coordinates = Coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPolygonGeometryInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiPolygonGeometryInput] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(value: LinearRingsList): Self = StObject.set(x, "Coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: LinearRings*): Self = StObject.set(x, "Coordinates", js.Array(value*))
  }
}
