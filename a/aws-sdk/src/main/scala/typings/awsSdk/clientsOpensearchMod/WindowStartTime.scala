package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowStartTime extends StObject {
  
  /**
    * The start hour of the window in Coordinated Universal Time (UTC), using 24-hour time. For example, 17 refers to 5:00 P.M. UTC.
    */
  var Hours: StartTimeHours
  
  /**
    * The start minute of the window, in UTC.
    */
  var Minutes: StartTimeMinutes
}
object WindowStartTime {
  
  inline def apply(Hours: StartTimeHours, Minutes: StartTimeMinutes): WindowStartTime = {
    val __obj = js.Dynamic.literal(Hours = Hours.asInstanceOf[js.Any], Minutes = Minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowStartTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowStartTime] (val x: Self) extends AnyVal {
    
    inline def setHours(value: StartTimeHours): Self = StObject.set(x, "Hours", value.asInstanceOf[js.Any])
    
    inline def setMinutes(value: StartTimeMinutes): Self = StObject.set(x, "Minutes", value.asInstanceOf[js.Any])
  }
}
