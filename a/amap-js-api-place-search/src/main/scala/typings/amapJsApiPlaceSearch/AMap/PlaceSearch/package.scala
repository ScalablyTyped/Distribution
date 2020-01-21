package typings.amapJsApiPlaceSearch.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PlaceSearch {
  type Poi = typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiBase | typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
  type PoiExt = typings.amapJsApiPlaceSearch.AnonAdcode with typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiBase with (typings.amapJsApiPlaceSearch.AnonIndoordata | typings.amapJsApiPlaceSearch.AnonFalse) with (typings.amapJsApiPlaceSearch.AnonCINEMA | typings.amapJsApiPlaceSearch.AnonDINING | typings.amapJsApiPlaceSearch.AnonDeeptype | typings.amapJsApiPlaceSearch.AnonDeeptypeHOTEL)
  type SelectChangeEvent[N /* <: java.lang.String */, E] = typings.amapJsApi.AMap.Event_[
    N, 
    typings.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData with typings.amapJsApiPlaceSearch.AnonEventE[E]
  ]
}
