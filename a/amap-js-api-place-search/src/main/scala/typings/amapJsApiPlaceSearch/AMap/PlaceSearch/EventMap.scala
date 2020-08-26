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

@js.native
trait EventMap extends js.Object {
  var complete: Event_[typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.complete, SearchResult] = js.native
  var error: Event_[typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.error, Info] = js.native
  var infoWindowClick: Event_[
    typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.infoWindowClick, 
    SelectChangeEventDataeven
  ] = js.native
  var listElementClick: SelectChangeEvent[
    typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementClick, 
    MouseEvent
  ] = js.native
   // typo in source code
  var listElementDetroyed: Event_[
    typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.listElementDetroyed, 
    SelectChangeEventData
  ] = js.native
  var markerClick: SelectChangeEvent[
    typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerClick, 
    MapsEvent[click, Marker[_]]
  ] = js.native
  var markerDestoryed: Event_[
    typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.markerDestoryed, 
    SelectChangeEventData
  ] = js.native
  // internal
  var renderComplete: Event_[
    typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.renderComplete, 
    ListElements
  ] = js.native
  var selectChanged: Event_[
    typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.selectChanged, 
    LastSelected
  ] = js.native
  var willClear: Event_[typings.amapJsApiPlaceSearch.amapJsApiPlaceSearchStrings.willClear, Data] = js.native
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
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComplete(value: Event_[complete, SearchResult]): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Event_[error, Info]): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfoWindowClick(value: Event_[infoWindowClick, SelectChangeEventDataeven]): Self = this.set("infoWindowClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setListElementClick(value: SelectChangeEvent[listElementClick, MouseEvent]): Self = this.set("listElementClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setListElementDetroyed(value: Event_[listElementDetroyed, SelectChangeEventData]): Self = this.set("listElementDetroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerClick(value: SelectChangeEvent[markerClick, MapsEvent[click, Marker[_]]]): Self = this.set("markerClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkerDestoryed(value: Event_[markerDestoryed, SelectChangeEventData]): Self = this.set("markerDestoryed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderComplete(value: Event_[renderComplete, ListElements]): Self = this.set("renderComplete", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectChanged(value: Event_[selectChanged, LastSelected]): Self = this.set("selectChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setWillClear(value: Event_[willClear, Data]): Self = this.set("willClear", value.asInstanceOf[js.Any])
  }
  
}

