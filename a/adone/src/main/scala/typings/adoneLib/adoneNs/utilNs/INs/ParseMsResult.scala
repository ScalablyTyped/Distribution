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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("days")(days)
    __obj.updateDynamic("hours")(hours)
    __obj.updateDynamic("milliseconds")(milliseconds)
    __obj.updateDynamic("minutes")(minutes)
    __obj.updateDynamic("seconds")(seconds)
    __obj.asInstanceOf[ParseMsResult]
  }
}

