package typings.aliOss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndTime extends js.Object {
  var endTime: Double
  var startTime: Double
}

object EndTime {
  @scala.inline
  def apply(endTime: Double, startTime: Double): EndTime = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndTime]
  }
}

