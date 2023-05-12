package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenHoursRule extends StObject {
  
  /**
    * The end of the scheduled time, in ISO 8601 format, when the channel can't send messages.
    */
  var EndTime: js.UndefOr[string] = js.undefined
  
  /**
    * The start of the scheduled time, in ISO 8601 format, when the channel can send messages.
    */
  var StartTime: js.UndefOr[string] = js.undefined
}
object OpenHoursRule {
  
  inline def apply(): OpenHoursRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenHoursRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenHoursRule] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: string): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setStartTime(value: string): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
