package typings.agChannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.agChannel.agChannelStrings.pending
  - typings.agChannel.agChannelStrings.subscribed
  - typings.agChannel.agChannelStrings.unsubscribed
*/
trait ChannelState extends js.Object

object ChannelState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typings.agChannel.agChannelStrings.pending = this.cast("pending")
  @scala.inline
  def subscribed: typings.agChannel.agChannelStrings.subscribed = this.cast("subscribed")
  @scala.inline
  def unsubscribed: typings.agChannel.agChannelStrings.unsubscribed = this.cast("unsubscribed")
}

