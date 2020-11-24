package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelCallbacks extends ChannelBase {
  
  def history(): Unit = js.native
  def history(paramsOrCallback: js.UndefOr[scala.Nothing], callback: paginatedResultCallback[Message]): Unit = js.native
  def history(paramsOrCallback: RestHistoryParams): Unit = js.native
  def history(paramsOrCallback: RestHistoryParams, callback: paginatedResultCallback[Message]): Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message]): Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[Message], callback: paginatedResultCallback[Message]): Unit = js.native
  
  var presence: PresenceCallbacks = js.native
  
  def publish(messagesOrName: js.Any): Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: js.UndefOr[scala.Nothing], callback: errorCallback): Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: js.Any): Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: js.Any, callback: errorCallback): Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: errorCallback): Unit = js.native
  def publish(messagesOrName: js.Any, messagedataOrCallback: errorCallback, callback: errorCallback): Unit = js.native
}
