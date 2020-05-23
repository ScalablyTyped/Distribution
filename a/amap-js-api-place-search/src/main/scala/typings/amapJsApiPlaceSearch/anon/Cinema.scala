package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.CINEMA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cinema extends js.Object {
  /**
    * @deprecated 影院类深度信息
    */
  var cinema: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema
  var deep_type: CINEMA
}

object Cinema {
  @scala.inline
  def apply(cinema: typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema, deep_type: CINEMA): Cinema = {
    val __obj = js.Dynamic.literal(cinema = cinema.asInstanceOf[js.Any], deep_type = deep_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cinema]
  }
}

