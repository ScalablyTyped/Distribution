package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.onBluetoothAdapterStateChange")
@js.native
object onBluetoothAdapterStateChange extends js.Object {
  /**
  	 * 监听本机蓝牙状态变化的事件。
  	 */
  def apply(callback: js.Function1[/* res */ BluetoothAdapterState, Unit]): Unit = js.native
}

