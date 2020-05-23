package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirstDayOfWeek extends js.Object {
  var firstDayOfWeek: Double
  var minimalDaysInFirstWeek: Double
  var timezoneOffset: Double
}

object FirstDayOfWeek {
  @scala.inline
  def apply(firstDayOfWeek: Double, minimalDaysInFirstWeek: Double, timezoneOffset: Double): FirstDayOfWeek = {
    val __obj = js.Dynamic.literal(firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], minimalDaysInFirstWeek = minimalDaysInFirstWeek.asInstanceOf[js.Any], timezoneOffset = timezoneOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstDayOfWeek]
  }
}

