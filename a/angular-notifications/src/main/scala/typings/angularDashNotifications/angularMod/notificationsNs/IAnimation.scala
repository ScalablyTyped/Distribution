package typings.angularDashNotifications.angularMod.notificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimation extends js.Object {
  var duration: Double
  var enabled: Boolean
}

object IAnimation {
  @scala.inline
  def apply(duration: Double, enabled: Boolean): IAnimation = {
    val __obj = js.Dynamic.literal(duration = duration, enabled = enabled)
  
    __obj.asInstanceOf[IAnimation]
  }
}

