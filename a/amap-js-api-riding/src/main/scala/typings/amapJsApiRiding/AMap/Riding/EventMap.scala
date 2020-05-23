package typings.amapJsApiRiding.AMap.Riding

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiRiding.amapJsApiRidingStrings.complete
import typings.amapJsApiRiding.amapJsApiRidingStrings.error
import typings.amapJsApiRiding.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[typings.amapJsApiRiding.amapJsApiRidingStrings.complete, SearchResult]
  var error: Event_[typings.amapJsApiRiding.amapJsApiRidingStrings.error, Info]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

