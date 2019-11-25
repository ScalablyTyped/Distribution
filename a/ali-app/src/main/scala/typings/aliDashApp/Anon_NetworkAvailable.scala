package typings.aliDashApp

import typings.aliDashApp.my.NetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NetworkAvailable extends js.Object {
  /** 网络是否可用 */
  var networkAvailable: Boolean
  /** 网络类型值 UNKNOWN / NOTREACHABLE / WIFI / 3G / 2G / 4G / WWAN */
  var networkType: NetworkType
}

object Anon_NetworkAvailable {
  @scala.inline
  def apply(networkAvailable: Boolean, networkType: NetworkType): Anon_NetworkAvailable = {
    val __obj = js.Dynamic.literal(networkAvailable = networkAvailable.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NetworkAvailable]
  }
}

