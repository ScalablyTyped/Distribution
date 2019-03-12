package typings
package amqplibLib.amqplibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amqplib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val credentials: amqplibLib.Anon_External = js.native
  def connect(url: amqplibLib.propertiesMod.OptionsNs.Connect): bluebirdLib.bluebirdMod.namespaced[Connection] = js.native
  def connect(url: amqplibLib.propertiesMod.OptionsNs.Connect, socketOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[Connection] = js.native
  def connect(url: java.lang.String): bluebirdLib.bluebirdMod.namespaced[Connection] = js.native
  def connect(url: java.lang.String, socketOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[Connection] = js.native
}

