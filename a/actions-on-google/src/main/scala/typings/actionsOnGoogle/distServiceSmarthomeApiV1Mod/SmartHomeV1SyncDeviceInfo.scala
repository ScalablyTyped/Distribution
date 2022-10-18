package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1SyncDeviceInfo extends StObject {
  
  var hwVersion: String
  
  var manufacturer: String
  
  var model: String
  
  var swVersion: String
}
object SmartHomeV1SyncDeviceInfo {
  
  inline def apply(hwVersion: String, manufacturer: String, model: String, swVersion: String): SmartHomeV1SyncDeviceInfo = {
    val __obj = js.Dynamic.literal(hwVersion = hwVersion.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], swVersion = swVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncDeviceInfo]
  }
  
  extension [Self <: SmartHomeV1SyncDeviceInfo](x: Self) {
    
    inline def setHwVersion(value: String): Self = StObject.set(x, "hwVersion", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setSwVersion(value: String): Self = StObject.set(x, "swVersion", value.asInstanceOf[js.Any])
  }
}
