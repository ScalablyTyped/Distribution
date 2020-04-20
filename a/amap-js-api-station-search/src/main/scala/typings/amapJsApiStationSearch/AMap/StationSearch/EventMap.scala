package typings.amapJsApiStationSearch.AMap.StationSearch

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiStationSearch.AnonInfo
import typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete
import typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.complete, 
    SearchResult
  ]
  var error: Event_[typings.amapJsApiStationSearch.amapJsApiStationSearchStrings.error, AnonInfo]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, AnonInfo]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

