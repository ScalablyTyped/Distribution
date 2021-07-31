package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a date value with time zone.
  * @since LibreOffice 4.1
  */
trait DateWithTimezone extends StObject {
  
  /** the date. */
  var DateInTZ: Date
  
  /**
    * contains the time zone, as signed offset in minutes **from** UTC, that is **east** of UTC, that is the amount of minutes that should be added to UTC
    * time to obtain time in that timezone.
    */
  var Timezone: Double
}
object DateWithTimezone {
  
  @scala.inline
  def apply(DateInTZ: Date, Timezone: Double): DateWithTimezone = {
    val __obj = js.Dynamic.literal(DateInTZ = DateInTZ.asInstanceOf[js.Any], Timezone = Timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateWithTimezone]
  }
  
  @scala.inline
  implicit class DateWithTimezoneMutableBuilder[Self <: DateWithTimezone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateInTZ(value: Date): Self = StObject.set(x, "DateInTZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: Double): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
  }
}
