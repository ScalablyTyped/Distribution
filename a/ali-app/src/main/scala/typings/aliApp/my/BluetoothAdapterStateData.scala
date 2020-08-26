package typings.aliApp.my

import typings.aliApp.aliAppStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothAdapterStateData extends ErrMsgResponse {
  /**
    * 蓝牙模块是否可用(需支持 BLE 并且蓝牙是打开状态)
    */
  var available: Boolean = js.native
  /**
    * 是否正在搜索设备
    */
  var discovering: Boolean = js.native
}

object BluetoothAdapterStateData {
  @scala.inline
  def apply(available: Boolean, discovering: Boolean, errMsg: ok | String): BluetoothAdapterStateData = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothAdapterStateData]
  }
  @scala.inline
  implicit class BluetoothAdapterStateDataOps[Self <: BluetoothAdapterStateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailable(value: Boolean): Self = this.set("available", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiscovering(value: Boolean): Self = this.set("discovering", value.asInstanceOf[js.Any])
  }
  
}

