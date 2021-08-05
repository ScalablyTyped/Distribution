package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a combined time value with time zone.
  * @since LibreOffice 4.1
  */
trait TimeWithTimezone extends StObject {
  
  /** the time (in TimeZone) */
  var TimeInTZ: Time
  
  /**
    * contains the time zone, as signed offset in minutes **from** UTC, that is **east** of UTC, that is the amount of minutes that should be added to UTC
    * time to obtain the time in that timezone.
    *
    * To obtain UTC time from TimeInTZ, you need to **subtract** TimeZone minutes.
    */
  var Timezone: Double
}
object TimeWithTimezone {
  
  inline def apply(TimeInTZ: Time, Timezone: Double): TimeWithTimezone = {
    val __obj = js.Dynamic.literal(TimeInTZ = TimeInTZ.asInstanceOf[js.Any], Timezone = Timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeWithTimezone]
  }
  
  extension [Self <: TimeWithTimezone](x: Self) {
    
    inline def setTimeInTZ(value: Time): Self = StObject.set(x, "TimeInTZ", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: Double): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
  }
}
