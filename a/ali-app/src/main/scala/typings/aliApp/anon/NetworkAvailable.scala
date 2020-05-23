package typings.aliApp.anon

import typings.aliApp.my.NetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkAvailable extends js.Object {
  /** 网络是否可用 */
  var networkAvailable: Boolean
  /** 网络类型值 UNKNOWN / NOTREACHABLE / WIFI / 3G / 2G / 4G / WWAN */
  var networkType: NetworkType
}

object NetworkAvailable {
  @scala.inline
  def apply(networkAvailable: Boolean, networkType: NetworkType): NetworkAvailable = {
    val __obj = js.Dynamic.literal(networkAvailable = networkAvailable.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAvailable]
  }
}

