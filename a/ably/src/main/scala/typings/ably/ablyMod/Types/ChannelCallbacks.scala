package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelCallbacks extends ChannelBase {
  var presence: PresenceCallbacks = js.native
  def history(): Unit = js.native
  def history(paramsOrCallback: RestHistoryParams): Unit = js.native
  def history(paramsOrCallback: RestHistoryParams, callback: paginatedResultCallback[Message]): Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message]): Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message], callback: paginatedResultCallback[Message]): Unit = js.native
  def publish(messagesOrName: js.Any): Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: js.Any): Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: js.Any, callback: errorCallback): Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: errorCallback): Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: errorCallback, callback: errorCallback): Unit = js.native
}

