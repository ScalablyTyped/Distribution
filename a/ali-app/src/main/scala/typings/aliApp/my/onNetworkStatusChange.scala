package typings.aliApp.my

import typings.aliApp.AnonIsConnected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.onNetworkStatusChange")
@js.native
object onNetworkStatusChange extends js.Object {
  /**
  	 * 开始网络状态变化的监听
  	 */
  def apply(callback: js.Function1[/* res */ AnonIsConnected, Unit]): Unit = js.native
}

