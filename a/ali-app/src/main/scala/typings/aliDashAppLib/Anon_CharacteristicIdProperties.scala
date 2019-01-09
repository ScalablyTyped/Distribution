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

