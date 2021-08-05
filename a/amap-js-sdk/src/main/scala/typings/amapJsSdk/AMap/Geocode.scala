package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geocode extends StObject {
  
  var adcode: String
  
  var addressComponent: AddressComponent
  
  var formattedAddress: String
  
  var level: String
  
  var location: LngLat
}
object Geocode {
  
  inline def apply(
    adcode: String,
    addressComponent: AddressComponent,
    formattedAddress: String,
    level: String,
    location: LngLat
  ): Geocode = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], addressComponent = addressComponent.asInstanceOf[js.Any], formattedAddress = formattedAddress.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geocode]
  }
  
  extension [Self <: Geocode](x: Self) {
    
    inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
    
    inline def setAddressComponent(value: AddressComponent): Self = StObject.set(x, "addressComponent", value.asInstanceOf[js.Any])
    
    inline def setFormattedAddress(value: String): Self = StObject.set(x, "formattedAddress", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LngLat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
  }
}
