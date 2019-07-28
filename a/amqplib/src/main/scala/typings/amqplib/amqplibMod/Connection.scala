package typings.amqplib.amqplibMod

import typings.amqplib.propertiesMod.ServerProperties
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends EventEmitter {
  var serverProperties: ServerProperties = js.native
  def close(): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def createChannel(): typings.bluebird.bluebirdMod.^[Channel] = js.native
  def createConfirmChannel(): typings.bluebird.bluebirdMod.^[ConfirmChannel] = js.native
}

