package typings.antDesignPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXY extends js.Object {
  var x: Double | String
  var y: Double
}

object AnonXY {
  @scala.inline
  def apply(x: Double | String, y: Double): AnonXY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonXY]
  }
}

