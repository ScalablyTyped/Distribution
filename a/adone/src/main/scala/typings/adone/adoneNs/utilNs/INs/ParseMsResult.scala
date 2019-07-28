package typings.adone.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseMsResult extends js.Object {
  var days: Double
  var hours: Double
  var milliseconds: Double
  var minutes: Double
  var seconds: Double
}

object ParseMsResult {
  @scala.inline
  def apply(days: Double, hours: Double, milliseconds: Double, minutes: Double, seconds: Double): ParseMsResult = {
    val __obj = js.Dynamic.literal(days = days, hours = hours, milliseconds = milliseconds, minutes = minutes, seconds = seconds)
  
    __obj.asInstanceOf[ParseMsResult]
  }
}

