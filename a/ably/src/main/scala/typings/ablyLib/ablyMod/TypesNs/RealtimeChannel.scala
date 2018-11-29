package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeChannel extends EventEmitter[channelEventCallback, ChannelEvent, ChannelState] {
  var errorReason: ErrorInfo = js.native
  var name: java.lang.String = js.native
  var presence: RealtimePresence = js.native
  var state: ChannelState = js.native
  def attach(): scala.Unit = js.native
  def attach(callback: standardCallback): scala.Unit = js.native
  def detach(): scala.Unit = js.native
  def detach(callback: standardCallback): scala.Unit = js.native
  def history(): scala.Unit = js.native
  def history(paramsOrCallback: RealtimePresenceHistoryParams): scala.Unit = js.native
  def history(paramsOrCallback: RealtimePresenceHistoryParams, callback: paginatedResultCallback[Message]): scala.Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message]): scala.Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message], callback: paginatedResultCallback[Message]): scala.Unit = js.native
  def publish(messagesOrName: js.Any): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: errorCallback): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: errorCallback, callback: errorCallback): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: js.Any): scala.Unit = js.native
  def publish(messagesOrName: js.Any, messageDataOrCallback: js.Any, callback: errorCallback): scala.Unit = js.native
  def setOptions(options: js.Any): scala.Unit = js.native
  def setOptions(options: js.Any, callback: errorCallback): scala.Unit = js.native
  def subscribe(eventOrCallback: messageCallback[Message]): scala.Unit = js.native
  def subscribe(eventOrCallback: messageCallback[Message], listener: messageCallback[Message]): scala.Unit = js.native
  def subscribe(eventOrCallback: java.lang.String): scala.Unit = js.native
  def subscribe(eventOrCallback: java.lang.String, listener: messageCallback[Message]): scala.Unit = js.native
  def subscribe(eventOrCallback: js.Array[java.lang.String]): scala.Unit = js.native
  def subscribe(eventOrCallback: js.Array[java.lang.String], listener: messageCallback[Message]): scala.Unit = js.native
  def unsubscribe(): scala.Unit = js.native
  def unsubscribe(eventOrCallback: messageCallback[Message]): scala.Unit = js.native
  def unsubscribe(eventOrCallback: messageCallback[Message], listener: messageCallback[Message]): scala.Unit = js.native
  def unsubscribe(eventOrCallback: java.lang.String): scala.Unit = js.native
  def unsubscribe(eventOrCallback: java.lang.String, listener: messageCallback[Message]): scala.Unit = js.native
}

