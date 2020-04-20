package typings.aliApp

import typings.aliApp.my.NetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNetworkAvailable extends js.Object {
  /** 网络是否可用 */
  var networkAvailable: Boolean
  /** 网络类型值 UNKNOWN / NOTREACHABLE / WIFI / 3G / 2G / 4G / WWAN */
  var networkType: NetworkType
}

object AnonNetworkAvailable {
  @scala.inline
  def apply(networkAvailable: Boolean, networkType: NetworkType): AnonNetworkAvailable = {
    val __obj = js.Dynamic.literal(networkAvailable = networkAvailable.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNetworkAvailable]
  }
}

