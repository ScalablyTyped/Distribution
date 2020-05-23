package typings.amapJsApiDistrictSearch.AMap.DistrictSearch

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete
import typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error
import typings.amapJsApiDistrictSearch.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[
    typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.complete, 
    SearchResult
  ]
  var error: Event_[typings.amapJsApiDistrictSearch.amapJsApiDistrictSearchStrings.error, Info]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

