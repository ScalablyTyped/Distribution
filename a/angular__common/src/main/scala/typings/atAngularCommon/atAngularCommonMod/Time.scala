package typings.atAngularCommon.atAngularCommonMod

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
    val __obj = js.Dynamic.literal(hours = hours, minutes = minutes)
  
    __obj.asInstanceOf[Time]
  }
}

