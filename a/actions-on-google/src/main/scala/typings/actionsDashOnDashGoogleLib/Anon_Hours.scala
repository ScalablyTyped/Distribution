package typings
package actionsDashOnDashGoogleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hours extends js.Object {
  var hours: scala.Double
  var minutes: scala.Double
  var nanos: scala.Double
  var seconds: scala.Double
}

object Anon_Hours {
  @scala.inline
  def apply(hours: scala.Double, minutes: scala.Double, nanos: scala.Double, seconds: scala.Double): Anon_Hours = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hours")(hours)
    __obj.updateDynamic("minutes")(minutes)
    __obj.updateDynamic("nanos")(nanos)
    __obj.updateDynamic("seconds")(seconds)
    __obj.asInstanceOf[Anon_Hours]
  }
}

