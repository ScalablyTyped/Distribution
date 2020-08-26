package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstDayOfWeek extends js.Object {
  var firstDayOfWeek: Double = js.native
  var minimalDaysInFirstWeek: Double = js.native
  var timezoneOffset: Double = js.native
}

object FirstDayOfWeek {
  @scala.inline
  def apply(firstDayOfWeek: Double, minimalDaysInFirstWeek: Double, timezoneOffset: Double): FirstDayOfWeek = {
    val __obj = js.Dynamic.literal(firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], minimalDaysInFirstWeek = minimalDaysInFirstWeek.asInstanceOf[js.Any], timezoneOffset = timezoneOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstDayOfWeek]
  }
  @scala.inline
  implicit class FirstDayOfWeekOps[Self <: FirstDayOfWeek] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimalDaysInFirstWeek(value: Double): Self = this.set("minimalDaysInFirstWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimezoneOffset(value: Double): Self = this.set("timezoneOffset", value.asInstanceOf[js.Any])
  }
  
}

