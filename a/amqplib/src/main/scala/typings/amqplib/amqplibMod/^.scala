package typings.amqplib.amqplibMod

import typings.amqplib.propertiesMod.OptionsNs.Connect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amqplib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(url: String): typings.bluebird.bluebirdMod.^[Connection] = js.native
  def connect(url: String, socketOptions: js.Any): typings.bluebird.bluebirdMod.^[Connection] = js.native
  def connect(url: Connect): typings.bluebird.bluebirdMod.^[Connection] = js.native
  def connect(url: Connect, socketOptions: js.Any): typings.bluebird.bluebirdMod.^[Connection] = js.native
}

