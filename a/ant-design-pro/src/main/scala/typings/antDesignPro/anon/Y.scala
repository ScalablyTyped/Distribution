package typings.antDesignPro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Y extends js.Object {
  var x: Double | String
  var y: Double
}

object Y {
  @scala.inline
  def apply(x: Double | String, y: Double): Y = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
}

