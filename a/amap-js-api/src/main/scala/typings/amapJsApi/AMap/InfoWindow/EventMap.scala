package typings.amapJsApi.AMap.InfoWindow

import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.amapJsApiStrings.change
import typings.amapJsApi.amapJsApiStrings.close
import typings.amapJsApi.amapJsApiStrings.open
import typings.amapJsApi.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap[I] extends js.Object {
  var change: Event_[typings.amapJsApi.amapJsApiStrings.change, Target[I]] = js.native
  var close: Event_[typings.amapJsApi.amapJsApiStrings.close, Target[I]] = js.native
  var open: Event_[typings.amapJsApi.amapJsApiStrings.open, Target[I]] = js.native
}

object EventMap {
  @scala.inline
  def apply[I](change: Event_[change, Target[I]], close: Event_[close, Target[I]], open: Event_[open, Target[I]]): EventMap[I] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap[I]]
  }
  @scala.inline
  implicit class EventMapOps[Self <: EventMap[_], I] (val x: Self with EventMap[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChange(value: Event_[change, Target[I]]): Self = this.set("change", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: Event_[close, Target[I]]): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpen(value: Event_[open, Target[I]]): Self = this.set("open", value.asInstanceOf[js.Any])
  }
  
}

