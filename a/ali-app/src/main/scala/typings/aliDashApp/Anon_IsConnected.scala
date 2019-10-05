package typings.aliDashApp

import typings.aliDashApp.my.NetworkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsConnected extends js.Object {
  /** 网络是否可用 */
  var isConnected: Boolean
  /** 网络类型值 UNKNOWN / NOTREACHABLE / WIFI / 3G / 2G / 4G / WWAN */
  var networkType: NetworkType
}

object Anon_IsConnected {
  @scala.inline
  def apply(isConnected: Boolean, networkType: NetworkType): Anon_IsConnected = {
    val __obj = js.Dynamic.literal(isConnected = isConnected, networkType = networkType)
  
    __obj.asInstanceOf[Anon_IsConnected]
  }
}

