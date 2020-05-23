package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.HOTEL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hotel extends js.Object {
  var deep_type: HOTEL
  /**
    * @deprecated 酒店类深度信息
    */
  var hotel: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Hotel
}

object Hotel {
  @scala.inline
  def apply(deep_type: HOTEL, hotel: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Hotel): Hotel = {
    val __obj = js.Dynamic.literal(deep_type = deep_type.asInstanceOf[js.Any], hotel = hotel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hotel]
  }
}

