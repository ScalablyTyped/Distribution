package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Beacon extends js.Object {
  /** iBeacon 设备的距离 */
  var accuracy: scala.Double
  /** iBeacon 设备的主 id */
  var major: java.lang.String
  /** iBeacon 设备的次 id */
  var minor: java.lang.String
  /** 表示设备距离的枚举值(0-3分别代表：未知、极近、近、远) */
  var proximity: aliDashAppLib.aliDashAppLibNumbers.`0` | aliDashAppLib.aliDashAppLibNumbers.`1` | aliDashAppLib.aliDashAppLibNumbers.`2` | aliDashAppLib.aliDashAppLibNumbers.`3`
  /** iBeacon 信号强度 */
  var rssi: scala.Double
  /** iBeacon 设备广播的 uuid */
  var uuid: java.lang.String
}

