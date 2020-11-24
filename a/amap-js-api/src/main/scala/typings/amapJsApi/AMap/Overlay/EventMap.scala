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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMap[I] extends js.Object {
  
  var click: MapsEvent[typings.amapJsApi.amapJsApiStrings.click, I] = js.native
  
  var dblclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.dblclick, I] = js.native
  
  var mousedown: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousedown, I] = js.native
  
  var mousemove: MapsEvent[typings.amapJsApi.amapJsApiStrings.mousemove, I] = js.native
  
  var mouseover: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseover, I] = js.native
  
  var mouseup: MapsEvent[typings.amapJsApi.amapJsApiStrings.mouseup, I] = js.native
  
  var rightclick: MapsEvent[typings.amapJsApi.amapJsApiStrings.rightclick, I] = js.native
  
  var touchend: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchend, I] = js.native
  
  var touchmove: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchmove, I] = js.native
  
  var touchstart: MapsEvent[typings.amapJsApi.amapJsApiStrings.touchstart, I] = js.native
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
    def setClick(value: MapsEvent[click, I]): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblclick(value: MapsEvent[dblclick, I]): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousedown(value: MapsEvent[mousedown, I]): Self = this.set("mousedown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousemove(value: MapsEvent[mousemove, I]): Self = this.set("mousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseover(value: MapsEvent[mouseover, I]): Self = this.set("mouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseup(value: MapsEvent[mouseup, I]): Self = this.set("mouseup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightclick(value: MapsEvent[rightclick, I]): Self = this.set("rightclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchend(value: MapsEvent[touchend, I]): Self = this.set("touchend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchmove(value: MapsEvent[touchmove, I]): Self = this.set("touchmove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchstart(value: MapsEvent[touchstart, I]): Self = this.set("touchstart", value.asInstanceOf[js.Any])
  }
}
