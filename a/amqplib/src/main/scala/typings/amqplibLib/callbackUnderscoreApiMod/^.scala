package typings
package amqplibLib.callbackUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amqplib/callback_api", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val credentials: amqplibLib.Anon_External = js.native
  def connect(callback: js.Function2[/* err */ js.Any, /* connection */ Connection, scala.Unit]): scala.Unit = js.native
  def connect(
    url: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* connection */ Connection, scala.Unit]
  ): scala.Unit = js.native
  def connect(
    url: java.lang.String,
    socketOptions: js.Any,
    callback: js.Function2[/* err */ js.Any, /* connection */ Connection, scala.Unit]
  ): scala.Unit = js.native
}

