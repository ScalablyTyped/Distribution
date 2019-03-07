package typings
package amqplibLib.amqplibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection
  extends nodeLib.eventsMod.EventEmitter {
  var serverProperties: amqplibLib.propertiesMod.ServerProperties = js.native
  def close(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def createChannel(): bluebirdLib.bluebirdMod.namespaced[Channel] = js.native
  def createConfirmChannel(): bluebirdLib.bluebirdMod.namespaced[ConfirmChannel] = js.native
}

