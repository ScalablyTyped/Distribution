package typings.amqplib.callbackUnderscoreApiMod

import typings.amqplib.propertiesMod.ServerProperties
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends EventEmitter {
  var serverProperties: ServerProperties = js.native
  def close(): Unit = js.native
  def close(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def createChannel(callback: js.Function2[/* err */ js.Any, /* channel */ Channel, Unit]): Unit = js.native
  def createConfirmChannel(callback: js.Function2[/* err */ js.Any, /* confirmChannel */ ConfirmChannel, Unit]): Unit = js.native
}

