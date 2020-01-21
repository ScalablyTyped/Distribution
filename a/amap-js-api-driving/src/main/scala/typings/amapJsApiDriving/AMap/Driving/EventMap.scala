package typings.amapJsApiDriving.AMap.Driving

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiDriving.AnonInfo
import typings.amapJsApiDriving.amapJsApiDrivingStrings.complete
import typings.amapJsApiDriving.amapJsApiDrivingStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[typings.amapJsApiDriving.amapJsApiDrivingStrings.complete, SearchResult | AnonInfo]
  var error: Event_[typings.amapJsApiDriving.amapJsApiDrivingStrings.error, AnonInfo]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult | AnonInfo], error: Event_[error, AnonInfo]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventMap]
  }
}

