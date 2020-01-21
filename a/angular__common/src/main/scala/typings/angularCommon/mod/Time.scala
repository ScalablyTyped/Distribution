package typings.angularCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var hours: Double
  var minutes: Double
}

object Time {
  @scala.inline
  def apply(hours: Double, minutes: Double): Time = {
    val __obj = js.Dynamic.literal(hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Time]
  }
}

