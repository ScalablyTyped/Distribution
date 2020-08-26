package typings.amapJsApi.AMap.MassMarks

import typings.amapJsApi.amapJsApiStrings.click
import typings.amapJsApi.amapJsApiStrings.dblclick
import typings.amapJsApi.amapJsApiStrings.mousedown
import typings.amapJsApi.amapJsApiStrings.mouseout
import typings.amapJsApi.amapJsApiStrings.mouseover
import typings.amapJsApi.amapJsApiStrings.mouseup
import typings.amapJsApi.amapJsApiStrings.touchend
import typings.amapJsApi.amapJsApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap[I] extends js.Object {
  var click: UIEvent[typings.amapJsApi.amapJsApiStrings.click, I] = js.native
  var dblclick: UIEvent[typings.amapJsApi.amapJsApiStrings.dblclick, I] = js.native
  var mousedown: UIEvent[typings.amapJsApi.amapJsApiStrings.mousedown, I] = js.native
  var mouseout: UIEvent[typings.amapJsApi.amapJsApiStrings.mouseout, I] = js.native
  var mouseover: UIEvent[typings.amapJsApi.amapJsApiStrings.mouseover, I] = js.native
  var mouseup: UIEvent[typings.amapJsApi.amapJsApiStrings.mouseup, I] = js.native
  var touchend: UIEvent[typings.amapJsApi.amapJsApiStrings.touchend, I] = js.native
  var touchstart: UIEvent[typings.amapJsApi.amapJsApiStrings.touchstart, I] = js.native
}

object EventMap {
  @scala.inline
  def apply[I](
    click: UIEvent[click, I],
    dblclick: UIEvent[dblclick, I],
    mousedown: UIEvent[mousedown, I],
    mouseout: UIEvent[mouseout, I],
    mouseover: UIEvent[mouseover, I],
    mouseup: UIEvent[mouseup, I],
    touchend: UIEvent[touchend, I],
    touchstart: UIEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
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
    def setClick(value: UIEvent[click, I]): Self = this.set("click", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: UIEvent[dblclick, I]): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousedown(value: UIEvent[mousedown, I]): Self = this.set("mousedown", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseout(value: UIEvent[mouseout, I]): Self = this.set("mouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseover(value: UIEvent[mouseover, I]): Self = this.set("mouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseup(value: UIEvent[mouseup, I]): Self = this.set("mouseup", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchend(value: UIEvent[touchend, I]): Self = this.set("touchend", value.asInstanceOf[js.Any])
    @scala.inline
    def setTouchstart(value: UIEvent[touchstart, I]): Self = this.set("touchstart", value.asInstanceOf[js.Any])
  }
  
}

