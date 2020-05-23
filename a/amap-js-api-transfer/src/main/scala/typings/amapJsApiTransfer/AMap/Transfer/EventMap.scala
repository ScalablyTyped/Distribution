package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.Event_
import typings.amapJsApiTransfer.amapJsApiTransferStrings.complete
import typings.amapJsApiTransfer.amapJsApiTransferStrings.error
import typings.amapJsApiTransfer.anon.Info
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap extends js.Object {
  var complete: Event_[typings.amapJsApiTransfer.amapJsApiTransferStrings.complete, SearchResult]
  var error: Event_[typings.amapJsApiTransfer.amapJsApiTransferStrings.error, Info]
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, SearchResult], error: Event_[error, Info]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
}

