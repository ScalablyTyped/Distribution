package typings.amqplib.callbackUnderscoreApiMod

import typings.amqplib.propertiesMod.OptionsNs.Publish
import typings.amqplib.propertiesMod.RepliesNs.Empty
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmChannel extends Channel {
  def publish(
    exchange: String,
    routingKey: String,
    content: Buffer,
    options: Publish,
    callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
  ): Boolean = js.native
  def sendToQueue(
    queue: String,
    content: Buffer,
    options: Publish,
    callback: js.Function2[/* err */ js.Any, /* ok */ Empty, Unit]
  ): Boolean = js.native
  def waitForConfirms(): Unit = js.native
  def waitForConfirms(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
}

