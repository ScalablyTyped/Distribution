package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1SyncDeviceInfo extends js.Object {
  
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
  implicit class SmartHomeV1SyncDeviceInfoOps[Self <: SmartHomeV1SyncDeviceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHwVersion(value: String): Self = this.set("hwVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwVersion(value: String): Self = this.set("swVersion", value.asInstanceOf[js.Any])
  }
}
