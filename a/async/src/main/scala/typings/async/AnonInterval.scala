package typings.async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInterval extends js.Object {
  var interval: Double
  var times: Double
}

object AnonInterval {
  @scala.inline
  def apply(interval: Double, times: Double): AnonInterval = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInterval]
  }
}

