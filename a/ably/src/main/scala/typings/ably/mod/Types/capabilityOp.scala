package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ably.ablyStrings.publish
  - typings.ably.ablyStrings.subscribe
  - typings.ably.ablyStrings.presence
  - typings.ably.ablyStrings.history
  - typings.ably.ablyStrings.stats
  - typings.ably.ablyStrings.`channel-metadata`
  - typings.ably.ablyStrings.`push-subscribe`
  - typings.ably.ablyStrings.`push-admin`
*/
trait capabilityOp extends js.Object

object capabilityOp {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `channel-metadata`: typings.ably.ablyStrings.`channel-metadata` = this.cast("channel-metadata")
  @scala.inline
  def history: typings.ably.ablyStrings.history = this.cast("history")
  @scala.inline
  def presence: typings.ably.ablyStrings.presence = this.cast("presence")
  @scala.inline
  def publish: typings.ably.ablyStrings.publish = this.cast("publish")
  @scala.inline
  def `push-admin`: typings.ably.ablyStrings.`push-admin` = this.cast("push-admin")
  @scala.inline
  def `push-subscribe`: typings.ably.ablyStrings.`push-subscribe` = this.cast("push-subscribe")
  @scala.inline
  def stats: typings.ably.ablyStrings.stats = this.cast("stats")
  @scala.inline
  def subscribe: typings.ably.ablyStrings.subscribe = this.cast("subscribe")
}

