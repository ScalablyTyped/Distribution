package typings.amapJsApi.AMap.TileLayer

import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.amapJsApiStrings.complete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap extends js.Object {
  var complete: Event_[typings.amapJsApi.amapJsApiStrings.complete, js.UndefOr[scala.Nothing]] = js.native
}

object EventMap {
  @scala.inline
  def apply(complete: Event_[complete, js.UndefOr[scala.Nothing]]): EventMap = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap]
  }
  @scala.inline
  implicit class EventMapOps[Self <: EventMap] (val x: Self) extends AnyVal {
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
    def setComplete(value: Event_[complete, js.UndefOr[scala.Nothing]]): Self = this.set("complete", value.asInstanceOf[js.Any])
  }
  
}

