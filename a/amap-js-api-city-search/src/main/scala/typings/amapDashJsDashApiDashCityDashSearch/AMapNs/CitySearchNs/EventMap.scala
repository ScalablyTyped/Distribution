package typings.amapDashJsDashApiDashCityDashSearch.AMapNs.CitySearchNs

import typings.amapDashJsDashApi.AMapNs.Event
import typings.amapDashJsDashApiDashCityDashSearch.Anon_Info
import typings.amapDashJsDashApiDashCityDashSearch.amapDashJsDashApiDashCityDashSearchStrings.complete
import typings.amapDashJsDashApiDashCityDashSearch.amapDashJsDashApiDashCityDashSearchStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event[
    typings.amapDashJsDashApiDashCityDashSearch.amapDashJsDashApiDashCityDashSearchStrings.complete, 
    SearchResult
  ]
  var error: Event[
    typings.amapDashJsDashApiDashCityDashSearch.amapDashJsDashApiDashCityDashSearchStrings.error, 
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

