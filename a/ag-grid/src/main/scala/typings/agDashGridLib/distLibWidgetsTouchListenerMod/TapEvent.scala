package typings
package agDashGridLib.distLibWidgetsTouchListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TapEvent
  extends agDashGridLib.distLibEventsMod.AgEvent {
  var touchStart: stdLib.Touch
}

object TapEvent {
  @scala.inline
  def apply(touchStart: stdLib.Touch, `type`: java.lang.String): TapEvent = {
    val __obj = js.Dynamic.literal(touchStart = touchStart)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TapEvent]
  }
}

