package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.startBluetoothDevicesDiscovery")
@js.native
object startBluetoothDevicesDiscovery extends js.Object {
  /**
  	 * 开始搜寻附近的蓝牙外围设备。搜索结果将在 my.onBluetoothDeviceFound 事件中返回。
  	 */
  def apply(options: StartBluetoothDevicesDiscoveryOptions): Unit = js.native
}

