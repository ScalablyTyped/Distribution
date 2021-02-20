package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1SyncDeviceInfo extends StObject {
  
  var hwVersion: String = js.native
  
  var manufacturer: String = js.native
  
  var model: String = js.native
  
  var swVersion: String = js.native
}
object SmartHomeV1SyncDeviceInfo {
  
  @scala.inline
  def apply(hwVersion: String, manufacturer: String, model: String, swVersion: String): SmartHomeV1SyncDeviceInfo = {
    val __obj = js.Dynamic.literal(hwVersion = hwVersion.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], swVersion = swVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1SyncDeviceInfo]
  }
  
  @scala.inline
  implicit class SmartHomeV1SyncDeviceInfoMutableBuilder[Self <: SmartHomeV1SyncDeviceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHwVersion(value: String): Self = StObject.set(x, "hwVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwVersion(value: String): Self = StObject.set(x, "swVersion", value.asInstanceOf[js.Any])
  }
}
