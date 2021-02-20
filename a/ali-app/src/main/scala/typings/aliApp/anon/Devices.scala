package typings.aliApp.anon

import typings.aliApp.my.BluetoothDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Devices extends StObject {
  
  var devices: js.Array[BluetoothDevice] = js.native
}
object Devices {
  
  @scala.inline
  def apply(devices: js.Array[BluetoothDevice]): Devices = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Devices]
  }
  
  @scala.inline
  implicit class DevicesMutableBuilder[Self <: Devices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: js.Array[BluetoothDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesVarargs(value: BluetoothDevice*): Self = StObject.set(x, "devices", js.Array(value :_*))
  }
}
