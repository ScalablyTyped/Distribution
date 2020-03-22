package typings.antDesignPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonY extends js.Object {
  var x: Double | String
  var y: Double
}

object AnonY {
  @scala.inline
  def apply(x: Double | String, y: Double): AnonY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonY]
  }
}

