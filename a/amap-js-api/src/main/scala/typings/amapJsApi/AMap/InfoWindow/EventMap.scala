package typings.amapJsApi.AMap.InfoWindow

import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.amapJsApiStrings.change
import typings.amapJsApi.amapJsApiStrings.close
import typings.amapJsApi.amapJsApiStrings.open
import typings.amapJsApi.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var change: Event_[typings.amapJsApi.amapJsApiStrings.change, Target[I]]
  var close: Event_[typings.amapJsApi.amapJsApiStrings.close, Target[I]]
  var open: Event_[typings.amapJsApi.amapJsApiStrings.open, Target[I]]
}

object EventMap {
  @scala.inline
  def apply[I](change: Event_[change, Target[I]], close: Event_[close, Target[I]], open: Event_[open, Target[I]]): EventMap[I] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap[I]]
  }
}

