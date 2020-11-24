package typings.aliApp.anon

import typings.aliApp.my.BluetoothDevice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Devices extends js.Object {
  
  var devices: js.Array[BluetoothDevice] = js.native
}
object Devices {
  
  @scala.inline
  def apply(devices: js.Array[BluetoothDevice]): Devices = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Devices]
  }
  
  @scala.inline
  implicit class DevicesOps[Self <: Devices] (val x: Self) extends AnyVal {
    
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
    def setDevicesVarargs(value: BluetoothDevice*): Self = this.set("devices", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: js.Array[BluetoothDevice]): Self = this.set("devices", value.asInstanceOf[js.Any])
  }
}
