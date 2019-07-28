package typings.aliDashApp.myNs

import typings.aliDashApp.aliDashAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothAdapterStateData extends ErrMsgResponse {
  /**
  		 * 蓝牙模块是否可用(需支持 BLE 并且蓝牙是打开状态)
  		 */
  var available: Boolean
  /**
  		 * 是否正在搜索设备
  		 */
  var discovering: Boolean
}

object BluetoothAdapterStateData {
  @scala.inline
  def apply(available: Boolean, discovering: Boolean, errMsg: ok | String): BluetoothAdapterStateData = {
    val __obj = js.Dynamic.literal(available = available, discovering = discovering, errMsg = errMsg.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BluetoothAdapterStateData]
  }
}

