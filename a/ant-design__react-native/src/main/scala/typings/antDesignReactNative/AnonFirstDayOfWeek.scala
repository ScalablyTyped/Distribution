package typings.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstDayOfWeek extends js.Object {
  var firstDayOfWeek: Double
  var minimalDaysInFirstWeek: Double
  var timezoneOffset: Double
}

object AnonFirstDayOfWeek {
  @scala.inline
  def apply(firstDayOfWeek: Double, minimalDaysInFirstWeek: Double, timezoneOffset: Double): AnonFirstDayOfWeek = {
    val __obj = js.Dynamic.literal(firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], minimalDaysInFirstWeek = minimalDaysInFirstWeek.asInstanceOf[js.Any], timezoneOffset = timezoneOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFirstDayOfWeek]
  }
}

