package typings.ably.mod

import typings.ably.mod.Types.RealtimeCallbacks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ably", "Realtime")
@js.native
class Realtime () extends RealtimeCallbacks {
  /* CompleteClass */
  override var clientId: String = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def connect(): Unit = js.native
}

