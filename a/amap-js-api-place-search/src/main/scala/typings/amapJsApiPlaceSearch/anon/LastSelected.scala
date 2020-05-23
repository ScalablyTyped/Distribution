package typings.amapJsApiPlaceSearch.anon

import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEvent
import typings.amapJsApiPlaceSearch.AMap.PlaceSearch.SelectChangeEventData
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastSelected extends js.Object {
  var lastSelected: SelectChangeEventData | (SelectChangeEvent[
    markerClick | listElementClick, 
    (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
  ]) | Null
  var selected: SelectChangeEventData | (SelectChangeEvent[
    markerClick | listElementClick, 
    (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
  ])
}

object LastSelected {
  @scala.inline
  def apply(
    selected: SelectChangeEventData | (SelectChangeEvent[
      markerClick | listElementClick, 
      (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
    ]),
    lastSelected: SelectChangeEventData | (SelectChangeEvent[
      markerClick | listElementClick, 
      (/* import warning: importer.ImportType#apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
    ]) = null
  ): LastSelected = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any], lastSelected = lastSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastSelected]
  }
}

