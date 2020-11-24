package typings.agGrid.touchListenerMod

import typings.agGrid.eventsMod.AgEvent
import typings.std.Touch
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongTapEvent extends AgEvent {
  
  var touchEvent: TouchEvent = js.native
  
  var touchStart: Touch = js.native
}
object LongTapEvent {
  
  @scala.inline
  def apply(touchEvent: TouchEvent, touchStart: Touch, `type`: String): LongTapEvent = {
    val __obj = js.Dynamic.literal(touchEvent = touchEvent.asInstanceOf[js.Any], touchStart = touchStart.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongTapEvent]
  }
  
  @scala.inline
  implicit class LongTapEventOps[Self <: LongTapEvent] (val x: Self) extends AnyVal {
    
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
    def setTouchEvent(value: TouchEvent): Self = this.set("touchEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchStart(value: Touch): Self = this.set("touchStart", value.asInstanceOf[js.Any])
  }
}
