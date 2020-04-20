package typings.amapJsApi.AMap.Overlay

import typings.amapJsApi.AMap.MapsEvent
import typings.amapJsApi.amapJsApiStrings.click
import typings.amapJsApi.amapJsApiStrings.dblclick
import typings.amapJsApi.amapJsApiStrings.mousedown
import typings.amapJsApi.amapJsApiStrings.mousemove
import typings.amapJsApi.amapJsApiStrings.mouseover
import typings.amapJsApi.amapJsApiStrings.mouseup
import typings.amapJsApi.amapJsApiStrings.rightclick
import typings.amapJsApi.amapJsApiStrings.touchend
import typings.amapJsApi.amapJsApiStrings.touchmove
import typings.amapJsApi.amapJsApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var click: MapsEvent[typings.amapJsApi.amapJsApiStrings.click, I]
  var dblclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.dblclick, I]
  var mousedown: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousedown, I]
  var mousemove: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousemove, I]
  var mouseover: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseover, I]
  var mouseup: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseup, I]
  var rightclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.rightclick, I]
  var touchend: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchend, I]
  var touchmove: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchmove, I]
  var touchstart: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchstart, I]
}

object EventMap {
  @scala.inline
  def apply[I](
    click: MapsEvent[click, I],
    dblclick: MapsEvent[dblclick, I],
    mousedown: MapsEvent[mousedown, I],
    mousemove: MapsEvent[mousemove, I],
    mouseover: MapsEvent[mouseover, I],
    mouseup: MapsEvent[mouseup, I],
    rightclick: MapsEvent[rightclick, I],
    touchend: MapsEvent[touchend, I],
    touchmove: MapsEvent[touchmove, I],
    touchstart: MapsEvent[touchstart, I]
  ): EventMap[I] = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], rightclick = rightclick.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMap[I]]
  }
}

