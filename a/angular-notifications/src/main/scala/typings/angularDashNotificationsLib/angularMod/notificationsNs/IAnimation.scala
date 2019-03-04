package typings
package angularDashNotificationsLib.angularMod.notificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimation extends js.Object {
  var duration: scala.Double
  var enabled: scala.Boolean
}

object IAnimation {
  @scala.inline
  def apply(duration: scala.Double, enabled: scala.Boolean): IAnimation = {
    val __obj = js.Dynamic.literal(duration = duration, enabled = enabled)
  
    __obj.asInstanceOf[IAnimation]
  }
}

