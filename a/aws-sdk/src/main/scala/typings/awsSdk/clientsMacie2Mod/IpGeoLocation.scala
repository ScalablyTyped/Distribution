package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpGeoLocation extends StObject {
  
  /**
    * The latitude coordinate of the location, rounded to four decimal places.
    */
  var lat: js.UndefOr[double] = js.undefined
  
  /**
    * The longitude coordinate of the location, rounded to four decimal places.
    */
  var lon: js.UndefOr[double] = js.undefined
}
object IpGeoLocation {
  
  inline def apply(): IpGeoLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpGeoLocation]
  }
  
  extension [Self <: IpGeoLocation](x: Self) {
    
    inline def setLat(value: double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    inline def setLatUndefined: Self = StObject.set(x, "lat", js.undefined)
    
    inline def setLon(value: double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    
    inline def setLonUndefined: Self = StObject.set(x, "lon", js.undefined)
  }
}
