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

object StartBluetoothDevicesDiscoveryOptions {
  @scala.inline
  def apply(
    allowDuplicatesKey: js.UndefOr[scala.Boolean] = js.undefined,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    interval: scala.Int | scala.Double = null,
    services: js.Array[java.lang.String] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): StartBluetoothDevicesDiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDuplicatesKey)) __obj.updateDynamic("allowDuplicatesKey")(allowDuplicatesKey)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[StartBluetoothDevicesDiscoveryOptions]
  }
}

