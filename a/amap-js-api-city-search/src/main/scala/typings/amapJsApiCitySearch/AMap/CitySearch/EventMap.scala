package typings.amapJsApiCitySearch.AMap.CitySearch

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete
import typings.amapJsApiCitySearch.amapJsApiCitySearchStrings.error
import typings.amapJsApiCitySearch.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[typings.amapJsApiCitySearch.amapJsApiCitySearchStrings.complete, SearchResult]
  var error: Event_[typings.amapJsApiCitySearch.amapJsApiCitySearchStrings.error, Info]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

