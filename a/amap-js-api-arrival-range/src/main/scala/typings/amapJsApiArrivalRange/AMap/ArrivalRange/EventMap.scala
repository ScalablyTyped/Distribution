package typings.amapJsApiArrivalRange.AMap.ArrivalRange

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiArrivalRange.AnonInfo
import typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var error: Event_[typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error, AnonInfo]
}

object EventMap {
  @scala.inline
  def apply(error: Event_[error, AnonInfo]): EventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

