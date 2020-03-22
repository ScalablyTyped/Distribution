package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTotal extends js.Object {
  var current: Double
  var total: Double
}

object AnonTotal {
  @scala.inline
  def apply(current: Double, total: Double): AnonTotal = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTotal]
  }
}

