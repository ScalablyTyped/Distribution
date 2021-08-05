package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceEvent extends StObject {
  
  /**
    * The time (in epoch) when the event occurred. 
    */
  var Timestamp: js.UndefOr[DeviceEventTime] = js.undefined
  
  /**
    * The type of device event.
    */
  var Type: js.UndefOr[DeviceEventType] = js.undefined
  
  /**
    * The value of the event.
    */
  var Value: js.UndefOr[DeviceEventValue] = js.undefined
}
object DeviceEvent {
  
  inline def apply(): DeviceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEvent]
  }
  
  extension [Self <: DeviceEvent](x: Self) {
    
    inline def setTimestamp(value: DeviceEventTime): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    inline def setType(value: DeviceEventType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: DeviceEventValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
