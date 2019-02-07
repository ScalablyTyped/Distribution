package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimePromise
  extends ablyLib.ablyMod.Realtime {
  @JSName("auth")
  var auth_RealtimePromise: AuthPromise = js.native
  @JSName("channels")
  var channels_RealtimePromise: Channels[RealtimeChannelPromise] = js.native
  @JSName("connection")
  var connection_RealtimePromise: ConnectionPromise = js.native
  @JSName("push")
  var push_RealtimePromise: PushPromise = js.native
}

