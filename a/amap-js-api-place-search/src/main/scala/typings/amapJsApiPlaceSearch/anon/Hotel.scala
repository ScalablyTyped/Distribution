package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.HOTEL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hotel extends StObject {
  
  var deep_type: HOTEL
  
  /**
    * @deprecated 酒店类深度信息
    */
  var hotel: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Hotel
}
object Hotel {
  
  inline def apply(hotel: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Hotel): Hotel = {
    val __obj = js.Dynamic.literal(deep_type = "HOTEL", hotel = hotel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hotel]
  }
  
  extension [Self <: Hotel](x: Self) {
    
    inline def setDeep_type(value: HOTEL): Self = StObject.set(x, "deep_type", value.asInstanceOf[js.Any])
    
    inline def setHotel(value: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Hotel): Self = StObject.set(x, "hotel", value.asInstanceOf[js.Any])
  }
}
