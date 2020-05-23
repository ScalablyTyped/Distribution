package typings.amapJsApiArrivalRange.AMap.ArrivalRange

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error
import typings.amapJsApiArrivalRange.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var error: Event_[typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error, Info]
}

object EventMap {
  @scala.inline
  def apply(error: Event_[error, Info]): EventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

