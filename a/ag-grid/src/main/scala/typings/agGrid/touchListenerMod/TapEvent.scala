package typings.agGrid.touchListenerMod

import typings.agGrid.eventsMod.AgEvent
import typings.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TapEvent extends AgEvent {
  
  var touchStart: Touch = js.native
}
object TapEvent {
  
  @scala.inline
  def apply(touchStart: Touch, `type`: String): TapEvent = {
    val __obj = js.Dynamic.literal(touchStart = touchStart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapEvent]
  }
  
  @scala.inline
  implicit class TapEventOps[Self <: TapEvent] (val x: Self) extends AnyVal {
    
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
    def setTouchStart(value: Touch): Self = this.set("touchStart", value.asInstanceOf[js.Any])
  }
}
