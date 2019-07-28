package typings.amqplib.callbackUnderscoreApiMod

import typings.amqplib.propertiesMod.OptionsNs.Connect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amqplib/callback_api", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(callback: js.Function2[/* err */ js.Any, /* connection */ Connection, Unit]): Unit = js.native
  def connect(url: String, callback: js.Function2[/* err */ js.Any, /* connection */ Connection, Unit]): Unit = js.native
  def connect(
    url: String,
    socketOptions: js.Any,
    callback: js.Function2[/* err */ js.Any, /* connection */ Connection, Unit]
  ): Unit = js.native
  def connect(url: Connect, callback: js.Function2[/* err */ js.Any, /* connection */ Connection, Unit]): Unit = js.native
  def connect(
    url: Connect,
    socketOptions: js.Any,
    callback: js.Function2[/* err */ js.Any, /* connection */ Connection, Unit]
  ): Unit = js.native
}

