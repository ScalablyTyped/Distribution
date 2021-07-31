package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a range of date+time values. */
trait DateTimeRange extends StObject {
  
  /** contains the end day of month (1-31 or 0 for a void date) for the range. */
  var EndDay: Double
  
  /** contains the end hour (0-23) for the range. */
  var EndHours: Double
  
  /** contains the end minutes (0-59) for the range. */
  var EndMinutes: Double
  
  /** contains the end month of year (1-12 or 0 for a void date) for the range. */
  var EndMonth: Double
  
  /** contains the end nanoseconds (0 - 999 999 999) for the range. */
  var EndNanoSeconds: Double
  
  /** contains the end seconds (0-59) for the range. */
  var EndSeconds: Double
  
  /** contains the end year for the range. */
  var EndYear: Double
  
  /**
    * true: time zone is UTC false: unknown time zone.
    * @since LibreOffice 4.1
    */
  var IsUTC: Boolean
  
  /** contains the start day of month (1-31 or 0 for a void date) for the range. */
  var StartDay: Double
  
  /** contains the start hour (0-23) for the range. */
  var StartHours: Double
  
  /** contains the start minutes (0-59) for the range. */
  var StartMinutes: Double
  
  /** contains the start month of year (1-12 or 0 for a void date) for the range. */
  var StartMonth: Double
  
  /** contains the start nanoseconds (0 - 999 999 999) for the range. */
  var StartNanoSeconds: Double
  
  /** contains the start seconds (0-59) for the range. */
  var StartSeconds: Double
  
  /** contains the start year for the range. */
  var StartYear: Double
}
object DateTimeRange {
  
  @scala.inline
  def apply(
    EndDay: Double,
    EndHours: Double,
    EndMinutes: Double,
    EndMonth: Double,
    EndNanoSeconds: Double,
    EndSeconds: Double,
    EndYear: Double,
    IsUTC: Boolean,
    StartDay: Double,
    StartHours: Double,
    StartMinutes: Double,
    StartMonth: Double,
    StartNanoSeconds: Double,
    StartSeconds: Double,
    StartYear: Double
  ): DateTimeRange = {
    val __obj = js.Dynamic.literal(EndDay = EndDay.asInstanceOf[js.Any], EndHours = EndHours.asInstanceOf[js.Any], EndMinutes = EndMinutes.asInstanceOf[js.Any], EndMonth = EndMonth.asInstanceOf[js.Any], EndNanoSeconds = EndNanoSeconds.asInstanceOf[js.Any], EndSeconds = EndSeconds.asInstanceOf[js.Any], EndYear = EndYear.asInstanceOf[js.Any], IsUTC = IsUTC.asInstanceOf[js.Any], StartDay = StartDay.asInstanceOf[js.Any], StartHours = StartHours.asInstanceOf[js.Any], StartMinutes = StartMinutes.asInstanceOf[js.Any], StartMonth = StartMonth.asInstanceOf[js.Any], StartNanoSeconds = StartNanoSeconds.asInstanceOf[js.Any], StartSeconds = StartSeconds.asInstanceOf[js.Any], StartYear = StartYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeRange]
  }
  
  @scala.inline
  implicit class DateTimeRangeMutableBuilder[Self <: DateTimeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDay(value: Double): Self = StObject.set(x, "EndDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndHours(value: Double): Self = StObject.set(x, "EndHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndMinutes(value: Double): Self = StObject.set(x, "EndMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndMonth(value: Double): Self = StObject.set(x, "EndMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndNanoSeconds(value: Double): Self = StObject.set(x, "EndNanoSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndSeconds(value: Double): Self = StObject.set(x, "EndSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndYear(value: Double): Self = StObject.set(x, "EndYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUTC(value: Boolean): Self = StObject.set(x, "IsUTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDay(value: Double): Self = StObject.set(x, "StartDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartHours(value: Double): Self = StObject.set(x, "StartHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMinutes(value: Double): Self = StObject.set(x, "StartMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartMonth(value: Double): Self = StObject.set(x, "StartMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartNanoSeconds(value: Double): Self = StObject.set(x, "StartNanoSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartSeconds(value: Double): Self = StObject.set(x, "StartSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartYear(value: Double): Self = StObject.set(x, "StartYear", value.asInstanceOf[js.Any])
  }
}
