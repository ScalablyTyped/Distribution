package typings.amapDashJsDashApi.AMapNs.MassMarksNs

import typings.amapDashJsDashApi.amapDashJsDashApiStrings.click
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchend
import typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventMap[I] extends js.Object {
  var click: UIEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.click, I]
  var dblclick: UIEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.dblclick, I]
  var mousedown: UIEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mousedown, I]
  var mouseout: UIEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseout, I]
  var mouseover: UIEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseover, I]
  var mouseup: UIEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.mouseup, I]
  var touchend: UIEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchend, I]
  var touchstart: UIEvent[typings.amapDashJsDashApi.amapDashJsDashApiStrings.touchstart, I]
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
    val __obj = js.Dynamic.literal(click = click, dblclick = dblclick, mousedown = mousedown, mouseout = mouseout, mouseover = mouseover, mouseup = mouseup, touchend = touchend, touchstart = touchstart)
  
    __obj.asInstanceOf[EventMap[I]]
  }
}

