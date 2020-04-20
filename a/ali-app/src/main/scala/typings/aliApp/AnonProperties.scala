package typings.aliApp

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProperties extends js.Object {
  /**
  				 * 蓝牙设备特征值的 uuid
  				 */
  var characteristicId: String
  /**
  				 * 该特征值支持的操作类型
  				 */
  var properties: js.Array[AnonIndicate]
  /**
  				 * 蓝牙设备特征值对应服务的 uuid
  				 */
  var serviceId: String
  /**
  				 * 蓝牙设备特征值对应的16进制值
  				 */
  var value: ArrayBuffer
}

object AnonProperties {
  @scala.inline
  def apply(
    characteristicId: String,
    properties: js.Array[AnonIndicate],
    serviceId: String,
    value: ArrayBuffer
  ): AnonProperties = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProperties]
  }
}

