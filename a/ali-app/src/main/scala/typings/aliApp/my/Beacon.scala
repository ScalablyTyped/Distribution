package typings.aliApp.my

import typings.aliApp.aliAppNumbers.`0`
import typings.aliApp.aliAppNumbers.`1`
import typings.aliApp.aliAppNumbers.`2`
import typings.aliApp.aliAppNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Beacon extends js.Object {
  /** iBeacon 设备的距离 */
  var accuracy: Double
  /** iBeacon 设备的主 id */
  var major: String
  /** iBeacon 设备的次 id */
  var minor: String
  /** 表示设备距离的枚举值(0-3分别代表：未知、极近、近、远) */
  var proximity: `0` | `1` | `2` | `3`
  /** iBeacon 信号强度 */
  var rssi: Double
  /** iBeacon 设备广播的 uuid */
  var uuid: String
}

object Beacon {
  @scala.inline
  def apply(
    accuracy: Double,
    major: String,
    minor: String,
    proximity: `0` | `1` | `2` | `3`,
    rssi: Double,
    uuid: String
  ): Beacon = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Beacon]
  }
}

