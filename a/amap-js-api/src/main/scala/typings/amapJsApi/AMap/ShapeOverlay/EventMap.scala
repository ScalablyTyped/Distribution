package typings.amapJsApi.AMap.ShapeOverlay

import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.MapsEvent
import typings.amapJsApi.amapJsApiStrings.change
import typings.amapJsApi.amapJsApiStrings.click
import typings.amapJsApi.amapJsApiStrings.dblclick
import typings.amapJsApi.amapJsApiStrings.hide
import typings.amapJsApi.amapJsApiStrings.mousedown
import typings.amapJsApi.amapJsApiStrings.mousemove
import typings.amapJsApi.amapJsApiStrings.mouseover
import typings.amapJsApi.amapJsApiStrings.mouseup
import typings.amapJsApi.amapJsApiStrings.options
import typings.amapJsApi.amapJsApiStrings.rightclick
import typings.amapJsApi.amapJsApiStrings.show
import typings.amapJsApi.amapJsApiStrings.touchend
import typings.amapJsApi.amapJsApiStrings.touchmove
import typings.amapJsApi.amapJsApiStrings.touchstart
import typings.amapJsApi.anon.TargetI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventMap[I]
  extends typings.amapJsApi.AMap.Overlay.EventMap[I] {
  var change: Event_[typings.amapJsApi.amapJsApiStrings.change, TargetI[I]] = js.native
  var hide: Event_[typings.amapJsApi.amapJsApiStrings.hide, TargetI[I]] = js.native
  var options: Event_[typings.amapJsApi.amapJsApiStrings.options, js.UndefOr[scala.Nothing]] = js.native
  var show: Event_[typings.amapJsApi.amapJsApiStrings.show, TargetI[I]] = js.native
}

object EventMap {
  @scala.inline
  def apply[I](
    change: Event_[change, TargetI[I]],
    click: MapsEvent[click, I],
    dblclick: MapsEvent[dblclick, I],
    hide: Event_[hide, TargetI[I]],
    mousedown: MapsEvent[mousedown, I],
    mousemove: MapsEvent[mousemove, I],
    mouseover: MapsEvent[mouseover, I],
    mouseup: MapsEvent[mouseup, I],
    options: Event_[options, js.UndefOr[scala.Nothing]],
    rightclick: MapsEvent[rightclick, I],
    show: Event_[show, TargetI[I]],
    touchend: MapsEvent[touchend, I],
    touchmove: MapsEvent[touchmove, I],
    touchstart: MapsEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
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
    def setChange(value: Event_[change, TargetI[I]]): Self = this.set("change", value.asInstanceOf[js.Any])
    @scala.inline
    def setHide(value: Event_[hide, TargetI[I]]): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Event_[options, js.UndefOr[scala.Nothing]]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setShow(value: Event_[show, TargetI[I]]): Self = this.set("show", value.asInstanceOf[js.Any])
  }
  
}

