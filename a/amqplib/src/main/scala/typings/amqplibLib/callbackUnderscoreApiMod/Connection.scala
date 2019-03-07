package typings
package amqplibLib.callbackUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection
  extends nodeLib.eventsMod.EventEmitter {
  var serverProperties: amqplibLib.propertiesMod.ServerProperties = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def createChannel(callback: js.Function2[/* err */ js.Any, /* channel */ Channel, scala.Unit]): scala.Unit = js.native
  def createConfirmChannel(callback: js.Function2[/* err */ js.Any, /* confirmChannel */ ConfirmChannel, scala.Unit]): scala.Unit = js.native
}

