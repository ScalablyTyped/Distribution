package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channels[T] extends js.Object {
  
  def get(name: String): T = js.native
  def get(name: String, channelOptions: ChannelOptions): T = js.native
  
  def release(name: String): Unit = js.native
}
