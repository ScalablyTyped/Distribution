package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a duration.
  *
  * A duration is the difference of 2 DateTimes.
  *
  * Note that there are no constraints on the ranges of the members, except that every member must be non-negative: for example, a {@link Duration} of 400
  * Days is valid.
  * @since OOo 3.3
  */
trait Duration extends StObject {
  
  /** contains the days. */
  var Days: Double
  
  /** contains the hours. */
  var Hours: Double
  
  /** contains the minutes. */
  var Minutes: Double
  
  /** contains the months. */
  var Months: Double
  
  /** contains the nanoseconds. */
  var NanoSeconds: Double
  
  /** explicit sign bit. */
  var Negative: Boolean
  
  /** contains the seconds. */
  var Seconds: Double
  
  /** contains the years. */
  var Years: Double
}
object Duration {
  
  @scala.inline
  def apply(
    Days: Double,
    Hours: Double,
    Minutes: Double,
    Months: Double,
    NanoSeconds: Double,
    Negative: Boolean,
    Seconds: Double,
    Years: Double
  ): Duration = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Hours = Hours.asInstanceOf[js.Any], Minutes = Minutes.asInstanceOf[js.Any], Months = Months.asInstanceOf[js.Any], NanoSeconds = NanoSeconds.asInstanceOf[js.Any], Negative = Negative.asInstanceOf[js.Any], Seconds = Seconds.asInstanceOf[js.Any], Years = Years.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  @scala.inline
  implicit class DurationMutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDays(value: Double): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHours(value: Double): Self = StObject.set(x, "Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutes(value: Double): Self = StObject.set(x, "Minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonths(value: Double): Self = StObject.set(x, "Months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanoSeconds(value: Double): Self = StObject.set(x, "NanoSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegative(value: Boolean): Self = StObject.set(x, "Negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeconds(value: Double): Self = StObject.set(x, "Seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYears(value: Double): Self = StObject.set(x, "Years", value.asInstanceOf[js.Any])
  }
}
