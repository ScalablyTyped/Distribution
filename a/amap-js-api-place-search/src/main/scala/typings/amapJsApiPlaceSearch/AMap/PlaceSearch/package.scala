package typings.amapJsApiPlaceSearch.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PlaceSearch {
  type Poi = typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiBase | typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
  type PoiExt = typings.amapJsApiPlaceSearch.AnonAdcode with typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiBase with (typings.amapJsApiPlaceSearch.AnonIndoordata | typings.amapJsApiPlaceSearch.AnonIndoormap) with (typings.amapJsApiPlaceSearch.AnonCinema | typings.amapJsApiPlaceSearch.AnonDeeptype | typings.amapJsApiPlaceSearch.AnonScenic | typings.amapJsApiPlaceSearch.AnonHotel)
  type SelectChangeEvent[N /* <: java.lang.String */, E] = typings.amapJsApi.AMap.Event_[
    N, 
    typings.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData with typings.amapJsApiPlaceSearch.AnonEvent[E]
  ]
}
