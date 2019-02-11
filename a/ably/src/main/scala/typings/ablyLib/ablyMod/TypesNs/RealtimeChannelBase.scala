package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeChannelBase extends EventEmitter[channelEventCallback, ChannelStateChange, ChannelEvent, ChannelState] {
  var errorReason: ErrorInfo = js.native
  var name: java.lang.String = js.native
  var state: ChannelState = js.native
  def setOptions(options: js.Any): scala.Unit = js.native
  def unsubscribe(): scala.Unit = js.native
  def unsubscribe(eventOrCallback: messageCallback[Message]): scala.Unit = js.native
  def unsubscribe(eventOrCallback: messageCallback[Message], listener: messageCallback[Message]): scala.Unit = js.native
  def unsubscribe(eventOrCallback: java.lang.String): scala.Unit = js.native
  def unsubscribe(eventOrCallback: java.lang.String, listener: messageCallback[Message]): scala.Unit = js.native
}

