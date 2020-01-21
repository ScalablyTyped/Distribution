package typings.amqpConnectionManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amqp-connection-manager", "connect")
@js.native
object connect extends js.Object {
  def apply(urls: js.Array[String]): AmqpConnectionManager = js.native
  def apply(urls: js.Array[String], options: AmqpConnectionManagerOptions): AmqpConnectionManager = js.native
}

