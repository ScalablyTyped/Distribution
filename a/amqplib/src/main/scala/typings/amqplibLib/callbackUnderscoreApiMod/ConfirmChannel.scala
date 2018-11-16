package typings
package amqplibLib.callbackUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmChannel extends Channel {
  def publish(
    exchange: java.lang.String,
    routingKey: java.lang.String,
    content: nodeLib.Buffer,
    options: amqplibLib.propertiesMod.OptionsNs.Publish,
    callback: js.Function2[/* err */ js.Any, /* ok */ amqplibLib.propertiesMod.RepliesNs.Empty, scala.Unit]
  ): scala.Boolean = js.native
  def sendToQueue(
    queue: java.lang.String,
    content: nodeLib.Buffer,
    options: amqplibLib.propertiesMod.OptionsNs.Publish,
    callback: js.Function2[/* err */ js.Any, /* ok */ amqplibLib.propertiesMod.RepliesNs.Empty, scala.Unit]
  ): scala.Boolean = js.native
  def waitForConfirms(): scala.Unit = js.native
  def waitForConfirms(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
}

