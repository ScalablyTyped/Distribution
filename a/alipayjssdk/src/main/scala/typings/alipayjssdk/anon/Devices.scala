package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.BluetoothDeviceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Devices extends StObject {
  
  /** service 的 uuid 对应的(如果有传入 services)设备列表 */
  var devices: js.Array[BluetoothDeviceInfo]
}
object Devices {
  
  inline def apply(devices: js.Array[BluetoothDeviceInfo]): Devices = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Devices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Devices] (val x: Self) extends AnyVal {
    
    inline def setDevices(value: js.Array[BluetoothDeviceInfo]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: BluetoothDeviceInfo*): Self = StObject.set(x, "devices", js.Array(value*))
  }
}
