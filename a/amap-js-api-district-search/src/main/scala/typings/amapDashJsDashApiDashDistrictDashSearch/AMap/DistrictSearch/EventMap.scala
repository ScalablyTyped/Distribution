package typings.amapDashJsDashApiDashDistrictDashSearch.AMap.DistrictSearch

import typings.amapDashJsDashApi.AMap.Event
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
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

