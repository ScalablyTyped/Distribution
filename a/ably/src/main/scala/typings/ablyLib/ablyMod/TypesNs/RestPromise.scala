package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Classes
@js.native
trait RestPromise
  extends ablyLib.ablyMod.Rest {
  @JSName("auth")
  var auth_RestPromise: AuthPromise = js.native
  @JSName("channels")
  var channels_RestPromise: Channels[ChannelPromise] = js.native
  @JSName("push")
  var push_RestPromise: PushPromise = js.native
}

