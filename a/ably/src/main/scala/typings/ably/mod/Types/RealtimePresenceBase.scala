package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimePresenceBase extends js.Object {
  var syncComplete: Boolean = js.native
  def unsubscribe(): Unit = js.native
  def unsubscribe(presenceOrListener: js.UndefOr[PresenceAction], listener: messageCallback[PresenceMessage]): Unit = js.native
  def unsubscribe(presenceOrListener: js.Array[PresenceAction]): Unit = js.native
  def unsubscribe(presenceOrListener: js.Array[PresenceAction], listener: messageCallback[PresenceMessage]): Unit = js.native
  def unsubscribe(presenceOrListener: PresenceAction): Unit = js.native
  def unsubscribe(presenceOrListener: messageCallback[PresenceMessage]): Unit = js.native
  def unsubscribe(presenceOrListener: messageCallback[PresenceMessage], listener: messageCallback[PresenceMessage]): Unit = js.native
}

