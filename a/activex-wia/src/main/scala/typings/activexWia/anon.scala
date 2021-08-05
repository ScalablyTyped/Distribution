package typings.activexWia

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DeviceID extends StObject {
    
    val DeviceID: String
    
    val EventID: String
    
    val ItemID: String
  }
  object DeviceID {
    
    inline def apply(DeviceID: String, EventID: String, ItemID: String): DeviceID = {
      val __obj = js.Dynamic.literal(DeviceID = DeviceID.asInstanceOf[js.Any], EventID = EventID.asInstanceOf[js.Any], ItemID = ItemID.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceID]
    }
    
    extension [Self <: DeviceID](x: Self) {
      
      inline def setDeviceID(value: String): Self = StObject.set(x, "DeviceID", value.asInstanceOf[js.Any])
      
      inline def setEventID(value: String): Self = StObject.set(x, "EventID", value.asInstanceOf[js.Any])
      
      inline def setItemID(value: String): Self = StObject.set(x, "ItemID", value.asInstanceOf[js.Any])
    }
  }
}
