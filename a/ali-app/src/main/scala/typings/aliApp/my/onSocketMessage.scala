package typings.aliApp.my

import typings.aliApp.AnonDataIsBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.onSocketMessage")
@js.native
object onSocketMessage extends js.Object {
  /**
  	 * 监听WebSocket接受到服务器的消息事件。
  	 */
  def apply(callback: js.Function1[/* res */ AnonDataIsBuffer, Unit]): Unit = js.native
}

