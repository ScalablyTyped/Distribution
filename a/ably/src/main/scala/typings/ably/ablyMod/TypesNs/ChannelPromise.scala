package typings.ably.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelPromise extends ChannelBase {
  var presence: PresencePromise = js.native
  def history(): js.Promise[PaginatedResult[Message]] = js.native
  def history(params: RestHistoryParams): js.Promise[PaginatedResult[Message]] = js.native
  def publish(messagesOrName: js.Any): js.Promise[Unit] = js.native
  def publish(messagesOrName: js.Any, messageData: js.Any): js.Promise[Unit] = js.native
}

