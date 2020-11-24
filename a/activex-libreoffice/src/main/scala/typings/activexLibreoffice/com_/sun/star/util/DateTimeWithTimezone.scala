package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a combined date+time value with time zone.
  * @since LibreOffice 4.1
  */
@js.native
trait DateTimeWithTimezone extends js.Object {
  
  /** the date and time (in TimeZone) */
  var DateTimeInTZ: DateTime = js.native
  
  /**
    * contains the time zone, as signed offset in minutes **from** UTC, that is **east** of UTC, that is the amount of minutes that should be added to UTC
    * time to obtain the time in that timezone.
    *
    * To obtain UTC datetime from DateTimeInTZ, you need to **subtract** TimeZone minutes.
    */
  var Timezone: Double = js.native
}
object DateTimeWithTimezone {
  
  @scala.inline
  def apply(DateTimeInTZ: DateTime, Timezone: Double): DateTimeWithTimezone = {
    val __obj = js.Dynamic.literal(DateTimeInTZ = DateTimeInTZ.asInstanceOf[js.Any], Timezone = Timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeWithTimezone]
  }
  
  @scala.inline
  implicit class DateTimeWithTimezoneOps[Self <: DateTimeWithTimezone] (val x: Self) extends AnyVal {
    
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
    def setDateTimeInTZ(value: DateTime): Self = this.set("DateTimeInTZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: Double): Self = this.set("Timezone", value.asInstanceOf[js.Any])
  }
}
