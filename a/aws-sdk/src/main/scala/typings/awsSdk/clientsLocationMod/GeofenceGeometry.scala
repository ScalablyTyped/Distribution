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
    * A polygon is a list of linear rings which are each made up of a list of vertices. Each vertex is a 2-dimensional point of the form: [longitude, latitude]. This is represented as an array of doubles of length 2 (so [double, double]). An array of 4 or more vertices, where the first and last vertex are the same (to form a closed boundary), is called a linear ring. The linear ring vertices must be listed in counter-clockwise order around the ring’s interior. The linear ring is represented as an array of vertices, or an array of arrays of doubles ([[double, double], ...]). A geofence consists of a single linear ring. To allow for future expansion, the Polygon parameter takes an array of linear rings, which is represented as an array of arrays of arrays of doubles ([[[double, double], ...], ...]). A linear ring for use in geofences can consist of between 4 and 1,000 vertices.
    */
  var Polygon: js.UndefOr[LinearRings] = js.undefined
}
object GeofenceGeometry {
  
  inline def apply(): GeofenceGeometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeofenceGeometry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeofenceGeometry] (val x: Self) extends AnyVal {
    
    inline def setCircle(value: Circle): Self = StObject.set(x, "Circle", value.asInstanceOf[js.Any])
    
    inline def setCircleUndefined: Self = StObject.set(x, "Circle", js.undefined)
    
    inline def setPolygon(value: LinearRings): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
    
    inline def setPolygonUndefined: Self = StObject.set(x, "Polygon", js.undefined)
    
    inline def setPolygonVarargs(value: LinearRing*): Self = StObject.set(x, "Polygon", js.Array(value*))
  }
}
