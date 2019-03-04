package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 蓝牙设备信息
	 */
trait BluetoothDevice extends js.Object {
  /**
  		 * 设备信号强度
  		 */
  var RSSI: scala.Double
  /**
  		 * 设备的广播内容
  		 */
  var advertisData: stdLib.ArrayBuffer
  /**
  		 * 设备的 id
  		 */
  var deviceId: java.lang.String
  /**
  		 * (兼容旧版本) 值与 name 一致
  		 */
  var deviceName: java.lang.String
  /**
  		 * 广播设备名称
  		 */
  var localName: java.lang.String
  /**
  		 * 设备的manufacturerData
  		 */
  var manufacturerData: stdLib.ArrayBuffer
  /**
  		 * 蓝牙设备名称，某些设备可能没有
  		 */
  var name: java.lang.String
}

object BluetoothDevice {
  @scala.inline
  def apply(
    RSSI: scala.Double,
    advertisData: stdLib.ArrayBuffer,
    deviceId: java.lang.String,
    deviceName: java.lang.String,
    localName: java.lang.String,
    manufacturerData: stdLib.ArrayBuffer,
    name: java.lang.String
  ): BluetoothDevice = {
    val __obj = js.Dynamic.literal(RSSI = RSSI, advertisData = advertisData, deviceId = deviceId, deviceName = deviceName, localName = localName, manufacturerData = manufacturerData, name = name)
  
    __obj.asInstanceOf[BluetoothDevice]
  }
}

