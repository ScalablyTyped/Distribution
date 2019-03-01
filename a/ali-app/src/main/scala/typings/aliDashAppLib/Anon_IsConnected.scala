package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsConnected extends js.Object {
  /** 网络是否可用 */
  var isConnected: scala.Boolean
  /** 网络类型值 UNKNOWN / NOTREACHABLE / WIFI / 3G / 2G / 4G / WWAN */
  var networkType: aliDashAppLib.myNs.NetworkType
}

object Anon_IsConnected {
  @scala.inline
  def apply(isConnected: scala.Boolean, networkType: aliDashAppLib.myNs.NetworkType): Anon_IsConnected = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isConnected")(isConnected)
    __obj.updateDynamic("networkType")(networkType)
    __obj.asInstanceOf[Anon_IsConnected]
  }
}

