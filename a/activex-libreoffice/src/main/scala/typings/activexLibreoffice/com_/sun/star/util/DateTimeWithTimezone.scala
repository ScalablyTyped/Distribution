package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a combined date+time value with time zone.
  * @since LibreOffice 4.1
  */
trait DateTimeWithTimezone extends StObject {
  
  /** the date and time (in TimeZone) */
  var DateTimeInTZ: DateTime
  
  /**
    * contains the time zone, as signed offset in minutes **from** UTC, that is **east** of UTC, that is the amount of minutes that should be added to UTC
    * time to obtain the time in that timezone.
    *
    * To obtain UTC datetime from DateTimeInTZ, you need to **subtract** TimeZone minutes.
    */
  var Timezone: Double
}
object DateTimeWithTimezone {
  
  inline def apply(DateTimeInTZ: DateTime, Timezone: Double): DateTimeWithTimezone = {
    val __obj = js.Dynamic.literal(DateTimeInTZ = DateTimeInTZ.asInstanceOf[js.Any], Timezone = Timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeWithTimezone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeWithTimezone] (val x: Self) extends AnyVal {
    
    inline def setDateTimeInTZ(value: DateTime): Self = StObject.set(x, "DateTimeInTZ", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: Double): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
  }
}
