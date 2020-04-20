package typings.aliOss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndTime extends js.Object {
  var endTime: Double
  var startTime: Double
}

object AnonEndTime {
  @scala.inline
  def apply(endTime: Double, startTime: Double): AnonEndTime = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndTime]
  }
}

