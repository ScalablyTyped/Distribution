package typings.amapDashJsDashApiDashDistrictDashSearch.AMapNs.DistrictSearchNs

import typings.amapDashJsDashApi.AMapNs.Event
import typings.amapDashJsDashApiDashDistrictDashSearch.Anon_Info
import typings.amapDashJsDashApiDashDistrictDashSearch.amapDashJsDashApiDashDistrictDashSearchStrings.complete
import typings.amapDashJsDashApiDashDistrictDashSearch.amapDashJsDashApiDashDistrictDashSearchStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typings.amapDashJsDashApiDashDistrictDashSearch.amapDashJsDashApiDashDistrictDashSearchStrings.complete, 
    SearchResult
  ]
  var error: Event[
    typings.amapDashJsDashApiDashDistrictDashSearch.amapDashJsDashApiDashDistrictDashSearchStrings.error, 
    Anon_Info
  ]
}

object EventMap {
  @scala.inline
  def apply(complete: Event[complete, SearchResult], error: Event[error, Anon_Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete, error = error)
  
    __obj.asInstanceOf[EventMap]
  }
}

