package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestedEventsTimeWindow extends StObject {
  
  /**
    * Timestamp of the final ingested event.
    */
  var endTime: time
  
  /**
    * Timestamp of the first ingensted event.
    */
  var startTime: time
}
object IngestedEventsTimeWindow {
  
  inline def apply(endTime: time, startTime: time): IngestedEventsTimeWindow = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestedEventsTimeWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestedEventsTimeWindow] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: time): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: time): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
