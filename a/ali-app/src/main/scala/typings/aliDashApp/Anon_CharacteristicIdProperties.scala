package typings.aliDashApp

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CharacteristicIdProperties extends js.Object {
  /**
  				 * 蓝牙设备特征值的 uuid
  				 */
  var characteristicId: String
  /**
  				 * 该特征值支持的操作类型
  				 */
  var properties: js.Array[Anon_Indicate]
  /**
  				 * 蓝牙设备特征值对应服务的 uuid
  				 */
  var serviceId: String
  /**
  				 * 蓝牙设备特征值对应的16进制值
  				 */
  var value: ArrayBuffer
}

object Anon_CharacteristicIdProperties {
  @scala.inline
  def apply(
    characteristicId: String,
    properties: js.Array[Anon_Indicate],
    serviceId: String,
    value: ArrayBuffer
  ): Anon_CharacteristicIdProperties = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId, properties = properties, serviceId = serviceId, value = value)
  
    __obj.asInstanceOf[Anon_CharacteristicIdProperties]
  }
}

