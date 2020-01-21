package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeChannelCallbacks extends RealtimeChannelBase {
  var presence: RealtimePresenceCallbacks = js.native
  def attach(): Unit = js.native
  def attach(callback: standardCallback): Unit = js.native
  def detach(): Unit = js.native
  def detach(callback: standardCallback): Unit = js.native
  def history(): Unit = js.native
  def history(paramsOrCallback: RealtimeHistoryParams): Unit = js.native
  def history(paramsOrCallback: RealtimeHistoryParams, callback: paginatedResultCallback[Message]): Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message]): Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message], callback: paginatedResultCallback[Message]): Unit = js.native
  def publish(messagesOrName: js.Any): Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: js.Any): Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: js.Any, callback: errorCallback): Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: errorCallback): Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: errorCallback, callback: errorCallback): Unit = js.native
  def subscribe(eventOrCallback: String): Unit = js.native
  def subscribe(eventOrCallback: String, listener: messageCallback[Message]): Unit = js.native
  def subscribe(
    eventOrCallback: String,
    listener: messageCallback[Message],
    callbackWhenAttached: standardCallback
  ): Unit = js.native
  def subscribe(eventOrCallback: js.Array[String]): Unit = js.native
  def subscribe(eventOrCallback: js.Array[String], listener: messageCallback[Message]): Unit = js.native
  def subscribe(
    eventOrCallback: js.Array[String],
    listener: messageCallback[Message],
    callbackWhenAttached: standardCallback
  ): Unit = js.native
  def subscribe(eventOrCallback: messageCallback[Message]): Unit = js.native
  def subscribe(eventOrCallback: messageCallback[Message], listener: messageCallback[Message]): Unit = js.native
  def subscribe(
    eventOrCallback: messageCallback[Message],
    listener: messageCallback[Message],
    callbackWhenAttached: standardCallback
  ): Unit = js.native
  def whenState(targetState: ChannelState, callback: channelEventCallback): Unit = js.native
}

