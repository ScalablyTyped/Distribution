package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceEvent extends StObject {
  
  /**
    * The time (in epoch) when the event occurred. 
    */
  var Timestamp: js.UndefOr[DeviceEventTime] = js.native
  
  /**
    * The type of device event.
    */
  var Type: js.UndefOr[DeviceEventType] = js.native
  
  /**
    * The value of the event.
    */
  var Value: js.UndefOr[DeviceEventValue] = js.native
}
object DeviceEvent {
  
  @scala.inline
  def apply(): DeviceEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceEvent]
  }
  
  @scala.inline
  implicit class DeviceEventMutableBuilder[Self <: DeviceEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: DeviceEventTime): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    @scala.inline
    def setType(value: DeviceEventType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    @scala.inline
    def setValue(value: DeviceEventValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
