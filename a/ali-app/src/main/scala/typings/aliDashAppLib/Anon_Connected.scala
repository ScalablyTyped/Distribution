package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connected extends js.Object {
  /**
  			 * 连接目前的状态
  			 */
  var connected: scala.Boolean
  /**
  			 * 蓝牙设备 id，参考 device 对象
  			 */
  var deviceId: java.lang.String
}

object Anon_Connected {
  @scala.inline
  def apply(connected: scala.Boolean, deviceId: java.lang.String): Anon_Connected = {
    val __obj = js.Dynamic.literal(connected = connected, deviceId = deviceId)
  
    __obj.asInstanceOf[Anon_Connected]
  }
}

