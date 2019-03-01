package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NetworkAvailable extends js.Object {
  /** 网络是否可用 */
  var networkAvailable: scala.Boolean
  /** 网络类型值 UNKNOWN / NOTREACHABLE / WIFI / 3G / 2G / 4G / WWAN */
  var networkType: aliDashAppLib.myNs.NetworkType
}

object Anon_NetworkAvailable {
  @scala.inline
  def apply(networkAvailable: scala.Boolean, networkType: aliDashAppLib.myNs.NetworkType): Anon_NetworkAvailable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("networkAvailable")(networkAvailable)
    __obj.updateDynamic("networkType")(networkType)
    __obj.asInstanceOf[Anon_NetworkAvailable]
  }
}

