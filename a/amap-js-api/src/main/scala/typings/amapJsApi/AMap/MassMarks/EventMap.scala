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

trait EventMap[I] extends js.Object {
  var click: UIEvent[typings.amapJsApi.amapJsApiStrings.click, I]
  var dblclick: UIEvent[typings.amapJsApi.amapJsApiStrings.dblclick, I]
  var mousedown: UIEvent[typings.amapJsApi.amapJsApiStrings.mousedown, I]
  var mouseout: UIEvent[typings.amapJsApi.amapJsApiStrings.mouseout, I]
  var mouseover: UIEvent[typings.amapJsApi.amapJsApiStrings.mouseover, I]
  var mouseup: UIEvent[typings.amapJsApi.amapJsApiStrings.mouseup, I]
  var touchend: UIEvent[typings.amapJsApi.amapJsApiStrings.touchend, I]
  var touchstart: UIEvent[typings.amapJsApi.amapJsApiStrings.touchstart, I]
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
}

