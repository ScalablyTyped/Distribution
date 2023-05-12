package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeospatialCoordinateBounds extends StObject {
  
  /**
    * The longitude of the east bound of the geospatial coordinate bounds.
    */
  var East: Longitude
  
  /**
    * The latitude of the north bound of the geospatial coordinate bounds.
    */
  var North: Latitude
  
  /**
    * The latitude of the south bound of the geospatial coordinate bounds.
    */
  var South: Latitude
  
  /**
    * The longitude of the west bound of the geospatial coordinate bounds.
    */
  var West: Longitude
}
object GeospatialCoordinateBounds {
  
  inline def apply(East: Longitude, North: Latitude, South: Latitude, West: Longitude): GeospatialCoordinateBounds = {
    val __obj = js.Dynamic.literal(East = East.asInstanceOf[js.Any], North = North.asInstanceOf[js.Any], South = South.asInstanceOf[js.Any], West = West.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeospatialCoordinateBounds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeospatialCoordinateBounds] (val x: Self) extends AnyVal {
    
    inline def setEast(value: Longitude): Self = StObject.set(x, "East", value.asInstanceOf[js.Any])
    
    inline def setNorth(value: Latitude): Self = StObject.set(x, "North", value.asInstanceOf[js.Any])
    
    inline def setSouth(value: Latitude): Self = StObject.set(x, "South", value.asInstanceOf[js.Any])
    
    inline def setWest(value: Longitude): Self = StObject.set(x, "West", value.asInstanceOf[js.Any])
  }
}
