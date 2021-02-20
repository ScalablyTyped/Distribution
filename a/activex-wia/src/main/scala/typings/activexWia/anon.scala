package typings.activexWia

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DeviceID extends StObject {
    
    val DeviceID: String = js.native
    
    val EventID: String = js.native
    
    val ItemID: String = js.native
  }
  object DeviceID {
    
    @scala.inline
    def apply(DeviceID: String, EventID: String, ItemID: String): DeviceID = {
      val __obj = js.Dynamic.literal(DeviceID = DeviceID.asInstanceOf[js.Any], EventID = EventID.asInstanceOf[js.Any], ItemID = ItemID.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceID]
    }
    
    @scala.inline
    implicit class DeviceIDMutableBuilder[Self <: DeviceID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceID(value: String): Self = StObject.set(x, "DeviceID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventID(value: String): Self = StObject.set(x, "EventID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "ItemID", value.asInstanceOf[js.Any])
    }
  }
}
