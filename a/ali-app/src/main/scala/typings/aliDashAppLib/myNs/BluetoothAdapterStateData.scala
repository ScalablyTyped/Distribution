package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothAdapterStateData extends ErrMsgResponse {
  /**
  		 * 蓝牙模块是否可用(需支持 BLE 并且蓝牙是打开状态)
  		 */
  var available: scala.Boolean
  /**
  		 * 是否正在搜索设备
  		 */
  var discovering: scala.Boolean
}

