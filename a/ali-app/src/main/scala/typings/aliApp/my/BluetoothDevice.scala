package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 蓝牙设备信息
  */
trait BluetoothDevice extends StObject {
  
  /**
    * 设备信号强度
    */
  var RSSI: Double
  
  /**
    * 设备的广播内容
    */
  var advertisData: js.typedarray.ArrayBuffer
  
  /**
    * 设备的 id
    */
  var deviceId: String
  
  /**
    * (兼容旧版本) 值与 name 一致
    */
  var deviceName: String
  
  /**
    * 广播设备名称
    */
  var localName: String
  
  /**
    * 设备的manufacturerData
    */
  var manufacturerData: js.typedarray.ArrayBuffer
  
  /**
    * 蓝牙设备名称，某些设备可能没有
    */
  var name: String
}
object BluetoothDevice {
  
  inline def apply(
    RSSI: Double,
    advertisData: js.typedarray.ArrayBuffer,
    deviceId: String,
    deviceName: String,
    localName: String,
    manufacturerData: js.typedarray.ArrayBuffer,
    name: String
  ): BluetoothDevice = {
    val __obj = js.Dynamic.literal(RSSI = RSSI.asInstanceOf[js.Any], advertisData = advertisData.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], manufacturerData = manufacturerData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDevice]
  }
  
  extension [Self <: BluetoothDevice](x: Self) {
    
    inline def setAdvertisData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "advertisData", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    inline def setManufacturerData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "manufacturerData", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRSSI(value: Double): Self = StObject.set(x, "RSSI", value.asInstanceOf[js.Any])
  }
}
