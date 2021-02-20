package typings.aliApp.my

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 蓝牙设备信息
  */
@js.native
trait BluetoothDevice extends StObject {
  
  /**
    * 设备信号强度
    */
  var RSSI: Double = js.native
  
  /**
    * 设备的广播内容
    */
  var advertisData: ArrayBuffer = js.native
  
  /**
    * 设备的 id
    */
  var deviceId: String = js.native
  
  /**
    * (兼容旧版本) 值与 name 一致
    */
  var deviceName: String = js.native
  
  /**
    * 广播设备名称
    */
  var localName: String = js.native
  
  /**
    * 设备的manufacturerData
    */
  var manufacturerData: ArrayBuffer = js.native
  
  /**
    * 蓝牙设备名称，某些设备可能没有
    */
  var name: String = js.native
}
object BluetoothDevice {
  
  @scala.inline
  def apply(
    RSSI: Double,
    advertisData: ArrayBuffer,
    deviceId: String,
    deviceName: String,
    localName: String,
    manufacturerData: ArrayBuffer,
    name: String
  ): BluetoothDevice = {
    val __obj = js.Dynamic.literal(RSSI = RSSI.asInstanceOf[js.Any], advertisData = advertisData.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], manufacturerData = manufacturerData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDevice]
  }
  
  @scala.inline
  implicit class BluetoothDeviceMutableBuilder[Self <: BluetoothDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisData(value: ArrayBuffer): Self = StObject.set(x, "advertisData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerData(value: ArrayBuffer): Self = StObject.set(x, "manufacturerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRSSI(value: Double): Self = StObject.set(x, "RSSI", value.asInstanceOf[js.Any])
  }
}
