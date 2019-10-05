package typings.amapDashJsDashApiDashLineDashSearch.AMap.LineSearch

import typings.amapDashJsDashApi.AMap.Event
import typings.amapDashJsDashApiDashLineDashSearch.Anon_Info
import typings.amapDashJsDashApiDashLineDashSearch.amapDashJsDashApiDashLineDashSearchStrings.complete
import typings.amapDashJsDashApiDashLineDashSearch.amapDashJsDashApiDashLineDashSearchStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typings.amapDashJsDashApiDashLineDashSearch.amapDashJsDashApiDashLineDashSearchStrings.complete, 
    SearchResult
  ]
  var error: Event[
    typings.amapDashJsDashApiDashLineDashSearch.amapDashJsDashApiDashLineDashSearchStrings.error, 
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

