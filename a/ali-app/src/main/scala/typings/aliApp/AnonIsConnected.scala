package typings.aliApp

import typings.aliApp.my.NetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsConnected extends js.Object {
  /** 网络是否可用 */
  var isConnected: Boolean
  /** 网络类型值 UNKNOWN / NOTREACHABLE / WIFI / 3G / 2G / 4G / WWAN */
  var networkType: NetworkType
}

object AnonIsConnected {
  @scala.inline
  def apply(isConnected: Boolean, networkType: NetworkType): AnonIsConnected = {
    val __obj = js.Dynamic.literal(isConnected = isConnected.asInstanceOf[js.Any], networkType = networkType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsConnected]
  }
}

