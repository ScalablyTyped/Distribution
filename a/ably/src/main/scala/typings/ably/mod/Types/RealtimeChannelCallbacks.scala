package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeChannelCallbacks extends RealtimeChannelBase {
  
  def attach(): Unit = js.native
  def attach(callback: errorCallback): Unit = js.native
  
  def detach(): Unit = js.native
  def detach(callback: errorCallback): Unit = js.native
  
  def history(): Unit = js.native
  def history(paramsOrCallback: js.UndefOr[scala.Nothing], callback: paginatedResultCallback[Message]): Unit = js.native
  def history(paramsOrCallback: RealtimeHistoryParams): Unit = js.native
  def history(paramsOrCallback: RealtimeHistoryParams, callback: paginatedResultCallback[Message]): Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message]): Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message], callback: paginatedResultCallback[Message]): Unit = js.native
  
  var presence: RealtimePresenceCallbacks = js.native
  
  def publish(messagesOrName: js.Any): Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: js.UndefOr[scala.Nothing], callback: errorCallback): Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: js.Any): Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: js.Any, callback: errorCallback): Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: errorCallback): Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: errorCallback, callback: errorCallback): Unit = js.native
  
  def setOptions(options: ChannelOptions): Unit = js.native
  def setOptions(options: ChannelOptions, callback: errorCallback): Unit = js.native
  
  def subscribe(eventOrCallback: String): Unit = js.native
  def subscribe(eventOrCallback: String, listener: js.UndefOr[scala.Nothing], callbackWhenAttached: errorCallback): Unit = js.native
  def subscribe(eventOrCallback: String, listener: messageCallback[Message]): Unit = js.native
  def subscribe(eventOrCallback: String, listener: messageCallback[Message], callbackWhenAttached: errorCallback): Unit = js.native
  def subscribe(eventOrCallback: js.Array[String]): Unit = js.native
  def subscribe(
    eventOrCallback: js.Array[String],
    listener: js.UndefOr[scala.Nothing],
    callbackWhenAttached: errorCallback
  ): Unit = js.native
  def subscribe(eventOrCallback: js.Array[String], listener: messageCallback[Message]): Unit = js.native
  def subscribe(
    eventOrCallback: js.Array[String],
    listener: messageCallback[Message],
    callbackWhenAttached: errorCallback
  ): Unit = js.native
  def subscribe(eventOrCallback: messageCallback[Message]): Unit = js.native
  def subscribe(
    eventOrCallback: messageCallback[Message],
    listener: js.UndefOr[scala.Nothing],
    callbackWhenAttached: errorCallback
  ): Unit = js.native
  def subscribe(eventOrCallback: messageCallback[Message], listener: messageCallback[Message]): Unit = js.native
  def subscribe(
    eventOrCallback: messageCallback[Message],
    listener: messageCallback[Message],
    callbackWhenAttached: errorCallback
  ): Unit = js.native
  
  def whenState(targetState: ChannelState, callback: channelEventCallback): Unit = js.native
}
