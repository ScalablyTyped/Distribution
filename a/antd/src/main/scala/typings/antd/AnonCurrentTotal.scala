package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrentTotal extends js.Object {
  var current: Double
  var total: Double
}

object AnonCurrentTotal {
  @scala.inline
  def apply(current: Double, total: Double): AnonCurrentTotal = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCurrentTotal]
  }
}

