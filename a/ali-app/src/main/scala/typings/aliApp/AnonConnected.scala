package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnected extends js.Object {
  /**
  			 * 连接目前的状态
  			 */
  var connected: Boolean
  /**
  			 * 蓝牙设备 id，参考 device 对象
  			 */
  var deviceId: String
}

object AnonConnected {
  @scala.inline
  def apply(connected: Boolean, deviceId: String): AnonConnected = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConnected]
  }
}

