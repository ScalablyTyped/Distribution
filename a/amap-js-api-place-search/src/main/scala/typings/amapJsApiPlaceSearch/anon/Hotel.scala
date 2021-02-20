package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.HOTEL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hotel extends StObject {
  
  var deep_type: HOTEL = js.native
  
  /**
    * @deprecated 酒店类深度信息
    */
  var hotel: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Hotel = js.native
}
object Hotel {
  
  @scala.inline
  def apply(deep_type: HOTEL, hotel: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Hotel): Hotel = {
    val __obj = js.Dynamic.literal(deep_type = deep_type.asInstanceOf[js.Any], hotel = hotel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hotel]
  }
  
  @scala.inline
  implicit class HotelMutableBuilder[Self <: Hotel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeep_type(value: HOTEL): Self = StObject.set(x, "deep_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotel(value: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Hotel): Self = StObject.set(x, "hotel", value.asInstanceOf[js.Any])
  }
}
