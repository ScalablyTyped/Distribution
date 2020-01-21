package typings.amapJsApiPlaceSearch

import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.Cinema
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.CINEMA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCINEMA extends js.Object {
  /**
    * @deprecated 影院类深度信息
    */
  var cinema: Cinema
  var deep_type: CINEMA
}

object AnonCINEMA {
  @scala.inline
  def apply(cinema: Cinema, deep_type: CINEMA): AnonCINEMA = {
    val __obj = js.Dynamic.literal(cinema = cinema.asInstanceOf[js.Any], deep_type = deep_type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCINEMA]
  }
}

