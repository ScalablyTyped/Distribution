package typings.amapDashJsDashApiDashPlaceDashSearch.AMap.PlaceSearch

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApi.AMap.MapsEvent
import typings.amapDashJsDashApi.AMap.Marker
import typings.amapDashJsDashApiDashPlaceDashSearch.Anon_Click
import typings.amapDashJsDashApiDashPlaceDashSearch.Anon_Data
import typings.amapDashJsDashApiDashPlaceDashSearch.Anon_Event
import typings.amapDashJsDashApiDashPlaceDashSearch.Anon_Info
import typings.amapDashJsDashApiDashPlaceDashSearch.Anon_ListElements
import typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.click
import typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.complete
import typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.error
import typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.infoWindowClick
import typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.listElementClick
import typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.listElementDetroyed
import typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.markerClick
import typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.markerDestoryed
import typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.renderComplete
import typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.selectChanged
import typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.willClear
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.complete, 
    SearchResult
  ]
  var error: Event[
    typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.error, 
    Anon_Info
  ]
  var infoWindowClick: Event[
    typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.infoWindowClick, 
    SelectChangeEventData with Anon_Event
  ]
  var listElementClick: SelectChangeEvent[
    typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.listElementClick, 
    MouseEvent
  ]
   // typo in source code
  var listElementDetroyed: Event[
    typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.listElementDetroyed, 
    SelectChangeEventData
  ]
  var markerClick: SelectChangeEvent[
    typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.markerClick, 
    MapsEvent[click, Marker[_]]
  ]
  var markerDestoryed: Event[
    typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.markerDestoryed, 
    SelectChangeEventData
  ]
  // internal
  var renderComplete: Event[
    typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.renderComplete, 
    Anon_ListElements
  ]
  var selectChanged: Event[
    typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.selectChanged, 
    Anon_Click
  ]
  var willClear: Event[
    typings.amapDashJsDashApiDashPlaceDashSearch.amapDashJsDashApiDashPlaceDashSearchStrings.willClear, 
    Anon_Data
  ]
}

object EventMap {
  @scala.inline
  def apply(
    complete: Event[complete, SearchResult],
    error: Event[error, Anon_Info],
    infoWindowClick: Event[infoWindowClick, SelectChangeEventData with Anon_Event],
    listElementClick: SelectChangeEvent[listElementClick, MouseEvent],
    listElementDetroyed: Event[listElementDetroyed, SelectChangeEventData],
    markerClick: SelectChangeEvent[markerClick, MapsEvent[click, Marker[_]]],
    markerDestoryed: Event[markerDestoryed, SelectChangeEventData],
    renderComplete: Event[renderComplete, Anon_ListElements],
    selectChanged: Event[selectChanged, Anon_Click],
    willClear: Event[willClear, Anon_Data]
  ): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete, error = error, infoWindowClick = infoWindowClick, listElementClick = listElementClick, listElementDetroyed = listElementDetroyed, markerClick = markerClick, markerDestoryed = markerDestoryed, renderComplete = renderComplete, selectChanged = selectChanged, willClear = willClear)
  
    __obj.asInstanceOf[EventMap]
  }
}

