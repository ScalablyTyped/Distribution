package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPSCoordinates extends StObject {
  
  /**
    * The latitude coordinate of the location.
    */
  var Latitude: double
  
  /**
    * The longitude coordinate of the location.
    */
  var Longitude: double
}
object GPSCoordinates {
  
  inline def apply(Latitude: double, Longitude: double): GPSCoordinates = {
    val __obj = js.Dynamic.literal(Latitude = Latitude.asInstanceOf[js.Any], Longitude = Longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPSCoordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPSCoordinates] (val x: Self) extends AnyVal {
    
    inline def setLatitude(value: double): Self = StObject.set(x, "Latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: double): Self = StObject.set(x, "Longitude", value.asInstanceOf[js.Any])
  }
}
