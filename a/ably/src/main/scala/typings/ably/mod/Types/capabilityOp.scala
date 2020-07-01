package typings.ably.mod.Types

import typings.ably.ablyStrings.presence_
import typings.ably.ablyStrings.publish_
import typings.ably.ablyStrings.subscribe_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ably.ablyStrings.publish_
  - typings.ably.ablyStrings.subscribe_
  - typings.ably.ablyStrings.presence_
  - typings.ably.ablyStrings.history
  - typings.ably.ablyStrings.stats
  - typings.ably.ablyStrings.`channel-metadata`
  - typings.ably.ablyStrings.`push-subscribe`
  - typings.ably.ablyStrings.`push-admin`
*/
trait capabilityOp extends js.Object

object capabilityOp {
  @scala.inline
  def `channel-metadata`: typings.ably.ablyStrings.`channel-metadata` = "channel-metadata".asInstanceOf[typings.ably.ablyStrings.`channel-metadata`]
  @scala.inline
  def history: typings.ably.ablyStrings.history = "history".asInstanceOf[typings.ably.ablyStrings.history]
  @scala.inline
  def presence: presence_ = "presence".asInstanceOf[presence_]
  @scala.inline
  def publish: publish_ = "publish".asInstanceOf[publish_]
  @scala.inline
  def `push-admin`: typings.ably.ablyStrings.`push-admin` = "push-admin".asInstanceOf[typings.ably.ablyStrings.`push-admin`]
  @scala.inline
  def `push-subscribe`: typings.ably.ablyStrings.`push-subscribe` = "push-subscribe".asInstanceOf[typings.ably.ablyStrings.`push-subscribe`]
  @scala.inline
  def stats: typings.ably.ablyStrings.stats = "stats".asInstanceOf[typings.ably.ablyStrings.stats]
  @scala.inline
  def subscribe: subscribe_ = "subscribe".asInstanceOf[subscribe_]
}

