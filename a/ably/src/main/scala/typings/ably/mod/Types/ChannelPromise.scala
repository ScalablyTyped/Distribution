package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelPromise extends ChannelBase {
  
  def history(): js.Promise[PaginatedResult[Message]] = js.native
  def history(params: RestHistoryParams): js.Promise[PaginatedResult[Message]] = js.native
  
  var presence: PresencePromise = js.native
  
  def publish(messagesOrName: js.Any): js.Promise[Unit] = js.native
  def publish(messagesOrName: js.Any, messageData: js.Any): js.Promise[Unit] = js.native
}
