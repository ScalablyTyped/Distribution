package typings.amapJsApiPlaceSearch.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object PlaceSearch {
  
  type Poi = typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiBase | typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
  
  type PoiExt = typings.amapJsApiPlaceSearch.anon.Adcode with typings.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiBase with (typings.amapJsApiPlaceSearch.anon.Indoordata | typings.amapJsApiPlaceSearch.anon.Indoormap) with (typings.amapJsApiPlaceSearch.anon.Cinema | typings.amapJsApiPlaceSearch.anon.Deeptype | typings.amapJsApiPlaceSearch.anon.Scenic | typings.amapJsApiPlaceSearch.anon.Hotel)
  
  type SelectChangeEvent[N /* <: java.lang.String */, E] = typings.amapJsApi.AMap.Event_[
    N, 
    typings.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData with typings.amapJsApiPlaceSearch.anon.Event[E]
  ]
}
