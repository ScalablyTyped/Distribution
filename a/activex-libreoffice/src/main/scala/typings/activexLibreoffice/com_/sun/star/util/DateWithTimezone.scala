package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a date value with time zone.
  * @since LibreOffice 4.1
  */
@js.native
trait DateWithTimezone extends js.Object {
  /** the date. */
  var DateInTZ: Date = js.native
  /**
    * contains the time zone, as signed offset in minutes **from** UTC, that is **east** of UTC, that is the amount of minutes that should be added to UTC
    * time to obtain time in that timezone.
    */
  var Timezone: Double = js.native
}

object DateWithTimezone {
  @scala.inline
  def apply(DateInTZ: Date, Timezone: Double): DateWithTimezone = {
    val __obj = js.Dynamic.literal(DateInTZ = DateInTZ.asInstanceOf[js.Any], Timezone = Timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateWithTimezone]
  }
  @scala.inline
  implicit class DateWithTimezoneOps[Self <: DateWithTimezone] (val x: Self) extends AnyVal {
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
    def setDateInTZ(value: Date): Self = this.set("DateInTZ", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimezone(value: Double): Self = this.set("Timezone", value.asInstanceOf[js.Any])
  }
  
}

