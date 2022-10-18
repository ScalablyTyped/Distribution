package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceleratorEvent extends StObject {
  
  /**
    * A string that contains an Event message describing changes or errors when you update an accelerator in Global Accelerator from IPv4 to dual-stack, or dual-stack to IPv4.
    */
  var Message: js.UndefOr[GenericString] = js.undefined
  
  /**
    * A timestamp for when you update an accelerator in Global Accelerator from IPv4 to dual-stack, or dual-stack to IPv4.
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
}
object AcceleratorEvent {
  
  inline def apply(): AcceleratorEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceleratorEvent]
  }
  
  extension [Self <: AcceleratorEvent](x: Self) {
    
    inline def setMessage(value: GenericString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
