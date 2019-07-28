package typings.ably.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeChannelBase extends EventEmitter[channelEventCallback, ChannelStateChange, ChannelEvent, ChannelState] {
  var errorReason: ErrorInfo = js.native
  var name: String = js.native
  var state: ChannelState = js.native
  def setOptions(options: js.Any): Unit = js.native
  def unsubscribe(): Unit = js.native
  def unsubscribe(eventOrCallback: String): Unit = js.native
  def unsubscribe(eventOrCallback: String, listener: messageCallback[Message]): Unit = js.native
  def unsubscribe(eventOrCallback: messageCallback[Message]): Unit = js.native
  def unsubscribe(eventOrCallback: messageCallback[Message], listener: messageCallback[Message]): Unit = js.native
}

