package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeofenceGeometry extends StObject {
  
  /**
    * A circle on the earth, as defined by a center point and a radius.
    */
  var Circle: js.UndefOr[typings.awsSdk.clientsLocationMod.Circle] = js.undefined
  
  /**
    * An array of 1 or more linear rings. A linear ring is an array of 4 or more vertices, where the first and last vertex are the same to form a closed boundary. Each vertex is a 2-dimensional point of the form: [longitude, latitude].  The first linear ring is an outer ring, describing the polygon's boundary. Subsequent linear rings may be inner or outer rings to describe holes and islands. Outer rings must list their vertices in counter-clockwise order around the ring's center, where the left side is the polygon's exterior. Inner rings must list their vertices in clockwise order, where the left side is the polygon's interior. A geofence polygon can consist of between 4 and 1,000 vertices.
    */
  var Polygon: js.UndefOr[LinearRings] = js.undefined
}
object GeofenceGeometry {
  
  inline def apply(): GeofenceGeometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeofenceGeometry]
  }
  
  extension [Self <: GeofenceGeometry](x: Self) {
    
    inline def setCircle(value: Circle): Self = StObject.set(x, "Circle", value.asInstanceOf[js.Any])
    
    inline def setCircleUndefined: Self = StObject.set(x, "Circle", js.undefined)
    
    inline def setPolygon(value: LinearRings): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
    
    inline def setPolygonUndefined: Self = StObject.set(x, "Polygon", js.undefined)
    
    inline def setPolygonVarargs(value: LinearRing*): Self = StObject.set(x, "Polygon", js.Array(value*))
  }
}
