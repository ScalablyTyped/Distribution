package typings.antdDashMobile.esToastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastConfig extends js.Object {
  var duration: Double
  var mask: Boolean
}

object IToastConfig {
  @scala.inline
  def apply(duration: Double, mask: Boolean): IToastConfig = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IToastConfig]
  }
}

