package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CharacteristicIdDeviceId extends js.Object {
  /**
  			 * 蓝牙特征值的 uuid
  			 */
  var characteristicId: java.lang.String
  /**
  			 * 蓝牙设备 id，参考 device 对象
  			 */
  var deviceId: java.lang.String
  /**
  			 * 蓝牙特征值对应 service 的 uuid
  			 */
  var serviceId: java.lang.String
  /**
  			 * 特征值最新的16进制值
  			 */
  var value: stdLib.ArrayBuffer
}

object Anon_CharacteristicIdDeviceId {
  @scala.inline
  def apply(
    characteristicId: java.lang.String,
    deviceId: java.lang.String,
    serviceId: java.lang.String,
    value: stdLib.ArrayBuffer
  ): Anon_CharacteristicIdDeviceId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId, deviceId = deviceId, serviceId = serviceId, value = value)
  
    __obj.asInstanceOf[Anon_CharacteristicIdDeviceId]
  }
}

