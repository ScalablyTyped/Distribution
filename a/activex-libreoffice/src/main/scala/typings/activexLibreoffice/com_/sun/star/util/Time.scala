package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a time value. */
@js.native
trait Time extends StObject {
  
  /** contains the hour (0-23). */
  var Hours: Double = js.native
  
  /**
    * true: time zone is UTC false: unknown time zone.
    * @since LibreOffice 4.1
    */
  var IsUTC: Boolean = js.native
  
  /** contains the minutes (0-59). */
  var Minutes: Double = js.native
  
  /** contains the nanoseconds (0 - 999 999 999). */
  var NanoSeconds: Double = js.native
  
  /** contains the seconds (0-59). */
  var Seconds: Double = js.native
}
object Time {
  
  @scala.inline
  def apply(Hours: Double, IsUTC: Boolean, Minutes: Double, NanoSeconds: Double, Seconds: Double): Time = {
    val __obj = js.Dynamic.literal(Hours = Hours.asInstanceOf[js.Any], IsUTC = IsUTC.asInstanceOf[js.Any], Minutes = Minutes.asInstanceOf[js.Any], NanoSeconds = NanoSeconds.asInstanceOf[js.Any], Seconds = Seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  
  @scala.inline
  implicit class TimeMutableBuilder[Self <: Time] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHours(value: Double): Self = StObject.set(x, "Hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUTC(value: Boolean): Self = StObject.set(x, "IsUTC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutes(value: Double): Self = StObject.set(x, "Minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanoSeconds(value: Double): Self = StObject.set(x, "NanoSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeconds(value: Double): Self = StObject.set(x, "Seconds", value.asInstanceOf[js.Any])
  }
}
