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

object BluetoothAdapterStateData {
  @scala.inline
  def apply(
    available: scala.Boolean,
    discovering: scala.Boolean,
    errMsg: aliDashAppLib.aliDashAppLibStrings.ok | java.lang.String
  ): BluetoothAdapterStateData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("available")(available)
    __obj.updateDynamic("discovering")(discovering)
    __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothAdapterStateData]
  }
}

