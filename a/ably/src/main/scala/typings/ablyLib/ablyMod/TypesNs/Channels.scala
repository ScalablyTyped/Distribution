package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channels[T] extends js.Object {
  def get(name: java.lang.String): T = js.native
  def get(name: java.lang.String, channelOptions: ChannelOptions): T = js.native
  def release(name: java.lang.String): scala.Unit = js.native
}

