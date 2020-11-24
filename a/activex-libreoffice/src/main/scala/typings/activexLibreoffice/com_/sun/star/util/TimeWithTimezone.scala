package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a combined time value with time zone.
  * @since LibreOffice 4.1
  */
@js.native
trait TimeWithTimezone extends js.Object {
  
  /** the time (in TimeZone) */
  var TimeInTZ: Time = js.native
  
  /**
    * contains the time zone, as signed offset in minutes **from** UTC, that is **east** of UTC, that is the amount of minutes that should be added to UTC
    * time to obtain the time in that timezone.
    *
    * To obtain UTC time from TimeInTZ, you need to **subtract** TimeZone minutes.
    */
  var Timezone: Double = js.native
}
object TimeWithTimezone {
  
  @scala.inline
  def apply(TimeInTZ: Time, Timezone: Double): TimeWithTimezone = {
    val __obj = js.Dynamic.literal(TimeInTZ = TimeInTZ.asInstanceOf[js.Any], Timezone = Timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeWithTimezone]
  }
  
  @scala.inline
  implicit class TimeWithTimezoneOps[Self <: TimeWithTimezone] (val x: Self) extends AnyVal {
    
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
    def setTimeInTZ(value: Time): Self = this.set("TimeInTZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: Double): Self = this.set("Timezone", value.asInstanceOf[js.Any])
  }
}
