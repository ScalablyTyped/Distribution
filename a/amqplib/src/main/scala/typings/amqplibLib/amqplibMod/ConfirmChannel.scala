package typings
package amqplibLib.amqplibMod

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
  def waitForConfirms(): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
}

