package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.MapsEvent
import typings.amapJsApi.AMap.Marker
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.click
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.infoWindowClick
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementDetroyed
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerDestoryed
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.renderComplete
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.selectChanged
import typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.willClear
import typings.amapJsApiPlaceSearch.anon.Data
import typings.amapJsApiPlaceSearch.anon.Info
import typings.amapJsApiPlaceSearch.anon.LastSelected
import typings.amapJsApiPlaceSearch.anon.ListElements
import typings.amapJsApiPlaceSearch.anon.SelectChangeEventDataeven
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete, SearchResult]
  var error: Event_[typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error, Info]
  var infoWindowClick: Event_[
    typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.infoWindowClick, 
    SelectChangeEventDataeven
  ]
  var listElementClick: SelectChangeEvent[
    typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick, 
    MouseEvent
  ]
   // typo in source code
  var listElementDetroyed: Event_[
    typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementDetroyed, 
    SelectChangeEventData
  ]
  var markerClick: SelectChangeEvent[
    typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick, 
    MapsEvent[click, Marker[_]]
  ]
  var markerDestoryed: Event_[
    typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerDestoryed, 
    SelectChangeEventData
  ]
  // internal
  var renderComplete: Event_[
    typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.renderComplete, 
    ListElements
  ]
  var selectChanged: Event_[
    typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.selectChanged, 
    LastSelected
  ]
  var willClear: Event_[typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.willClear, Data]
}

object EventMap {
  @scala.inline
  def apply(
    complete: Event_[complete, SearchResult],
    error: Event_[error, Info],
    infoWindowClick: Event_[infoWindowClick, SelectChangeEventDataeven],
    listElementClick: SelectChangeEvent[listElementClick, MouseEvent],
    listElementDetroyed: Event_[listElementDetroyed, SelectChangeEventData],
    markerClick: SelectChangeEvent[markerClick, MapsEvent[click, Marker[_]]],
    markerDestoryed: Event_[markerDestoryed, SelectChangeEventData],
    renderComplete: Event_[renderComplete, ListElements],
    selectChanged: Event_[selectChanged, LastSelected],
    willClear: Event_[willClear, Data]
  ): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], infoWindowClick = infoWindowClick.asInstanceOf[js.Any], listElementClick = listElementClick.asInstanceOf[js.Any], listElementDetroyed = listElementDetroyed.asInstanceOf[js.Any], markerClick = markerClick.asInstanceOf[js.Any], markerDestoryed = markerDestoryed.asInstanceOf[js.Any], renderComplete = renderComplete.asInstanceOf[js.Any], selectChanged = selectChanged.asInstanceOf[js.Any], willClear = willClear.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

