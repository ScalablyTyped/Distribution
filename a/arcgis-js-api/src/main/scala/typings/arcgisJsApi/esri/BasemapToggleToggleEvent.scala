package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasemapToggleToggleEvent extends js.Object {
  var current: Basemap = js.native
  var previous: Basemap = js.native
}

object BasemapToggleToggleEvent {
  @scala.inline
  def apply(current: Basemap, previous: Basemap): BasemapToggleToggleEvent = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasemapToggleToggleEvent]
  }
  @scala.inline
  implicit class BasemapToggleToggleEventOps[Self <: BasemapToggleToggleEvent] (val x: Self) extends AnyVal {
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
    def setCurrent(value: Basemap): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevious(value: Basemap): Self = this.set("previous", value.asInstanceOf[js.Any])
  }
  
}

