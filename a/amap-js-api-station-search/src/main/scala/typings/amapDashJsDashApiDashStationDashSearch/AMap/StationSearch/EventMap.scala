package typings.amapDashJsDashApiDashStationDashSearch.AMap.StationSearch

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApiDashStationDashSearch.Anon_Info
import typings.amapDashJsDashApiDashStationDashSearch.amapDashJsDashApiDashStationDashSearchStrings.complete
import typings.amapDashJsDashApiDashStationDashSearch.amapDashJsDashApiDashStationDashSearchStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typings.amapDashJsDashApiDashStationDashSearch.amapDashJsDashApiDashStationDashSearchStrings.complete, 
    SearchResult
  ]
  var error: Event[
    typings.amapDashJsDashApiDashStationDashSearch.amapDashJsDashApiDashStationDashSearchStrings.error, 
    Anon_Info
  ]
}

object EventMap {
  @scala.inline
  def apply(complete: Event[complete, SearchResult], error: Event[error, Anon_Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

