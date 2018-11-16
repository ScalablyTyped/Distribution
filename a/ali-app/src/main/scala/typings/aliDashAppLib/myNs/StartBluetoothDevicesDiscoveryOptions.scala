package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StartBluetoothDevicesDiscoveryOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 否允许重复上报同一设备， 如果允许重复上报，则onDeviceFound 方法会多次上报同一设备，但是 RSSI 值会有不同
  		 */
  var allowDuplicatesKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * 上报设备的间隔，默认为0，意思是找到新设备立即上报，否则根据传入的间隔上报
  		 */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * 蓝牙设备主 service 的 uuid 列表
  		 * 某些蓝牙设备会广播自己的主 service 的 uuid。如果这里传入该数组，那么根据该 uuid 列表，只搜索有这个主服务的设备。
  		 */
  var services: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

