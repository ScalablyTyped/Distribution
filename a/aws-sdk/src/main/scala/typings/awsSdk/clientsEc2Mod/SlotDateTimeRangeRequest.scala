package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotDateTimeRangeRequest extends StObject {
  
  /**
    * The earliest date and time, in UTC, for the Scheduled Instance to start.
    */
  var EarliestTime: js.Date
  
  /**
    * The latest date and time, in UTC, for the Scheduled Instance to start. This value must be later than or equal to the earliest date and at most three months in the future.
    */
  var LatestTime: js.Date
}
object SlotDateTimeRangeRequest {
  
  inline def apply(EarliestTime: js.Date, LatestTime: js.Date): SlotDateTimeRangeRequest = {
    val __obj = js.Dynamic.literal(EarliestTime = EarliestTime.asInstanceOf[js.Any], LatestTime = LatestTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotDateTimeRangeRequest]
  }
  
  extension [Self <: SlotDateTimeRangeRequest](x: Self) {
    
    inline def setEarliestTime(value: js.Date): Self = StObject.set(x, "EarliestTime", value.asInstanceOf[js.Any])
    
    inline def setLatestTime(value: js.Date): Self = StObject.set(x, "LatestTime", value.asInstanceOf[js.Any])
  }
}
