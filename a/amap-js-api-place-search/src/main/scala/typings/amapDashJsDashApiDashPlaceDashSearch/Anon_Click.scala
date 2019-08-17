package typings.amapDashJsDashApiDashPlaceDashSearch

import typings.amapDashJsDashApiDashPlaceDashSearch.AMapNs.PlaceSearchNs.SelectChangeEvent
import typings.amapDashJsDashApiDashPlaceDashSearch.AMapNs.PlaceSearchNs.SelectChangeEventData
import typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.listElementClick
import typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.markerClick
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Click extends js.Object {
  var lastSelected: SelectChangeEventData | (SelectChangeEvent[
    markerClick | listElementClick, 
    (/* import warning: ImportType.apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
  ]) | Null
  var selected: SelectChangeEventData | (SelectChangeEvent[
    markerClick | listElementClick, 
    (/* import warning: ImportType.apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
  ])
}

object Anon_Click {
  @scala.inline
  def apply(
    selected: SelectChangeEventData | (SelectChangeEvent[
      markerClick | listElementClick, 
      (/* import warning: ImportType.apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
    ]),
    lastSelected: SelectChangeEventData | (SelectChangeEvent[
      markerClick | listElementClick, 
      (/* import warning: ImportType.apply Failed type conversion: amap-js-api.AMap.Marker.EventMap<amap-js-api.AMap.Marker<any>>['click'] */ js.Any) | MouseEvent
    ]) = null
  ): Anon_Click = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    if (lastSelected != null) __obj.updateDynamic("lastSelected")(lastSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Click]
  }
}

