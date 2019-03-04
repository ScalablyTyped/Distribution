package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseMsResult extends js.Object {
  var days: scala.Double
  var hours: scala.Double
  var milliseconds: scala.Double
  var minutes: scala.Double
  var seconds: scala.Double
}

object ParseMsResult {
  @scala.inline
  def apply(
    days: scala.Double,
    hours: scala.Double,
    milliseconds: scala.Double,
    minutes: scala.Double,
    seconds: scala.Double
  ): ParseMsResult = {
    val __obj = js.Dynamic.literal(days = days, hours = hours, milliseconds = milliseconds, minutes = minutes, seconds = seconds)
  
    __obj.asInstanceOf[ParseMsResult]
  }
}

