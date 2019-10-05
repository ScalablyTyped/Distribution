package typings.aliDashApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.connectSocket")
@js.native
object connectSocket extends js.Object {
  /**
  	 * 创建一个 WebSocket 的连接；
  	 * 一个支付宝小程序同时只能保留一个 WebSocket 连接，如果当前已存在 WebSocket 连接，会自动关闭该连接，并重新创建一个新的 WebSocket 连接。
  	 */
  def apply(options: ConnectSocketOptions): Unit = js.native
}

