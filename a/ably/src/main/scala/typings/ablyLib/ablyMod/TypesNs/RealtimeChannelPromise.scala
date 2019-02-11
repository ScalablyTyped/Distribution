package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeChannelPromise extends RealtimeChannelBase {
  var presence: RealtimePresencePromise = js.native
  def attach(): js.Promise[scala.Unit] = js.native
  def detach(): js.Promise[scala.Unit] = js.native
  def history(): js.Promise[PaginatedResult[Message]] = js.native
  def history(params: RealtimeHistoryParams): js.Promise[PaginatedResult[Message]] = js.native
  def publish(messagesOrName: js.Any): js.Promise[scala.Unit] = js.native
  def publish(messagesOrName: js.Any, messageData: js.Any): js.Promise[scala.Unit] = js.native
  def subscribe(eventOrCallback: messageCallback[Message]): js.Promise[scala.Unit] = js.native
  def subscribe(eventOrCallback: messageCallback[Message], listener: messageCallback[Message]): js.Promise[scala.Unit] = js.native
  def subscribe(eventOrCallback: java.lang.String): js.Promise[scala.Unit] = js.native
  def subscribe(eventOrCallback: java.lang.String, listener: messageCallback[Message]): js.Promise[scala.Unit] = js.native
  def subscribe(eventOrCallback: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  def subscribe(eventOrCallback: js.Array[java.lang.String], listener: messageCallback[Message]): js.Promise[scala.Unit] = js.native
  def whenState(targetState: ChannelState): js.Promise[ChannelStateChange] = js.native
}

