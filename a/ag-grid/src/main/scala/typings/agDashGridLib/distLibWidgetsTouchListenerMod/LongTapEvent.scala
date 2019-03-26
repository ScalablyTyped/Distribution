package typings
package agDashGridLib.distLibWidgetsTouchListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongTapEvent
  extends agDashGridLib.distLibEventsMod.AgEvent {
  var touchEvent: stdLib.TouchEvent
  var touchStart: stdLib.Touch
}

object LongTapEvent {
  @scala.inline
  def apply(touchEvent: stdLib.TouchEvent, touchStart: stdLib.Touch, `type`: java.lang.String): LongTapEvent = {
    val __obj = js.Dynamic.literal(touchEvent = touchEvent, touchStart = touchStart)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LongTapEvent]
  }
}

