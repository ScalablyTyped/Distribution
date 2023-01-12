package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoursOfOperationTimeSlice extends StObject {
  
  /**
    * The hours.
    */
  var Hours: Hours24Format
  
  /**
    * The minutes.
    */
  var Minutes: MinutesLimit60
}
object HoursOfOperationTimeSlice {
  
  inline def apply(Hours: Hours24Format, Minutes: MinutesLimit60): HoursOfOperationTimeSlice = {
    val __obj = js.Dynamic.literal(Hours = Hours.asInstanceOf[js.Any], Minutes = Minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoursOfOperationTimeSlice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HoursOfOperationTimeSlice] (val x: Self) extends AnyVal {
    
    inline def setHours(value: Hours24Format): Self = StObject.set(x, "Hours", value.asInstanceOf[js.Any])
    
    inline def setMinutes(value: MinutesLimit60): Self = StObject.set(x, "Minutes", value.asInstanceOf[js.Any])
  }
}
