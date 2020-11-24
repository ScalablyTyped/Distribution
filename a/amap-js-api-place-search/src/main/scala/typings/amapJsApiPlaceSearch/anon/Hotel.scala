package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.HOTEL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hotel extends js.Object {
  
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
  implicit class HotelOps[Self <: Hotel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeep_type(value: HOTEL): Self = this.set("deep_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotel(value: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Hotel): Self = this.set("hotel", value.asInstanceOf[js.Any])
  }
}
