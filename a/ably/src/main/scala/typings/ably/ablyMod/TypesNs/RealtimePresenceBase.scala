package typings.ably.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimePresenceBase extends js.Object {
  var syncComplete: Boolean
}

object RealtimePresenceBase {
  @scala.inline
  def apply(syncComplete: Boolean): RealtimePresenceBase = {
    val __obj = js.Dynamic.literal(syncComplete = syncComplete)
  
    __obj.asInstanceOf[RealtimePresenceBase]
  }
}

