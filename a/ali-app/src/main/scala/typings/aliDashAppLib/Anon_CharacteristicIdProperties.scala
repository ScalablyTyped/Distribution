package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CharacteristicIdProperties extends js.Object {
  /**
  				 * 蓝牙设备特征值的 uuid
  				 */
  var characteristicId: java.lang.String
  /**
  				 * 该特征值支持的操作类型
  				 */
  var properties: js.Array[Anon_Indicate]
  /**
  				 * 蓝牙设备特征值对应服务的 uuid
  				 */
  var serviceId: java.lang.String
  /**
  				 * 蓝牙设备特征值对应的16进制值
  				 */
  var value: stdLib.ArrayBuffer
}

object Anon_CharacteristicIdProperties {
  @scala.inline
  def apply(
    characteristicId: java.lang.String,
    properties: js.Array[Anon_Indicate],
    serviceId: java.lang.String,
    value: stdLib.ArrayBuffer
  ): Anon_CharacteristicIdProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("characteristicId")(characteristicId)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("serviceId")(serviceId)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_CharacteristicIdProperties]
  }
}

