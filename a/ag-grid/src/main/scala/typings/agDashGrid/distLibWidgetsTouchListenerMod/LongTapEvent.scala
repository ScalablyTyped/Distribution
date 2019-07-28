package typings.agDashGrid.distLibWidgetsTouchListenerMod

import typings.agDashGrid.distLibEventsMod.AgEvent
import typings.std.Touch
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongTapEvent extends AgEvent {
  var touchEvent: TouchEvent
  var touchStart: Touch
}

object LongTapEvent {
  @scala.inline
  def apply(touchEvent: TouchEvent, touchStart: Touch, `type`: String): LongTapEvent = {
    val __obj = js.Dynamic.literal(touchEvent = touchEvent, touchStart = touchStart)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LongTapEvent]
  }
}

