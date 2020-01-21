package typings.amapJsApiPlaceSearch

import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Hotel
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.HOTEL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeeptypeHOTEL extends js.Object {
  var deep_type: HOTEL
  /**
    * @deprecated 酒店类深度信息
    */
  var hotel: Hotel
}

object AnonDeeptypeHOTEL {
  @scala.inline
  def apply(deep_type: HOTEL, hotel: Hotel): AnonDeeptypeHOTEL = {
    val __obj = js.Dynamic.literal(deep_type = deep_type.asInstanceOf[js.Any], hotel = hotel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDeeptypeHOTEL]
  }
}

