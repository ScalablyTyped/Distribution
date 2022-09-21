package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.BluetoothDeviceInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevicesBluetoothDeviceInfo extends StObject {
  
  /** 新搜索到的设备列表 */
  var devices: BluetoothDeviceInfo
}
object DevicesBluetoothDeviceInfo {
  
  inline def apply(devices: BluetoothDeviceInfo): DevicesBluetoothDeviceInfo = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicesBluetoothDeviceInfo]
  }
  
  extension [Self <: DevicesBluetoothDeviceInfo](x: Self) {
    
    inline def setDevices(value: BluetoothDeviceInfo): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
  }
}
