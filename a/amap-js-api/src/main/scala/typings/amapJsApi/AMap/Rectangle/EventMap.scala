package typings.amapJsApi.AMap.Rectangle

import typings.amapJsApi.AMap.Event_
import typings.amapJsApi.AMap.MapsEvent
import typings.amapJsApi.AnonTargetI
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
import typings.amapJsApi.amapJsApiStrings.setBounds
import typings.amapJsApi.amapJsApiStrings.show
import typings.amapJsApi.amapJsApiStrings.touchend
import typings.amapJsApi.amapJsApiStrings.touchmove
import typings.amapJsApi.amapJsApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I]
  extends typings.amapJsApi.AMap.ShapeOverlay.EventMap[I] {
  var setBounds: Event_[typings.amapJsApi.amapJsApiStrings.setBounds, js.UndefOr[scala.Nothing]]
}

object EventMap {
  @scala.inline
  def apply[I](
    change: Event_[change, AnonTargetI[I]],
    click: MapsEvent[click, I],
    dblclick: MapsEvent[dblclick, I],
    hide: Event_[hide, AnonTargetI[I]],
    mousedown: MapsEvent[mousedown, I],
    mousemove: MapsEvent[mousemove, I],
    mouseover: MapsEvent[mouseover, I],
    mouseup: MapsEvent[mouseup, I],
    options: Event_[options, js.UndefOr[scala.Nothing]],
    rightclick: MapsEvent[rightclick, I],
    setBounds: Event_[setBounds, js.UndefOr[scala.Nothing]],
    show: Event_[show, AnonTargetI[I]],
    touchend: MapsEvent[touchend, I],
    touchmove: MapsEvent[touchmove, I],
    touchstart: MapsEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], setBounds = setBounds.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap[I]]
  }
}

