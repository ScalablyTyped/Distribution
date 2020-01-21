package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("my.sendSocketMessage")
@js.native
object sendSocketMessage extends js.Object {
  /**
  	 * 通过 WebSocket 连接发送数据，需要先使用 my.connectSocket 发起建连，并在 my.onSocketOpen 回调之后再发送数据。
  	 */
  def apply(options: SendSocketMessageOptions): Unit = js.native
}

