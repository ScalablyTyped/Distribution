package typings.ably.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PresenceCallbacks extends js.Object {
  def get(): Unit = js.native
  def get(paramsOrCallback: RestPresenceParams): Unit = js.native
  def get(paramsOrCallback: RestPresenceParams, callback: paginatedResultCallback[PresenceMessage]): Unit = js.native
  def get(paramsOrCallback: paginatedResultCallback[PresenceMessage]): Unit = js.native
  def get(
    paramsOrCallback: paginatedResultCallback[PresenceMessage],
    callback: paginatedResultCallback[PresenceMessage]
  ): Unit = js.native
  def history(paramsOrCallback: RestHistoryParams): Unit = js.native
  def history(paramsOrCallback: RestHistoryParams, callback: paginatedResultCallback[PresenceMessage]): Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[PresenceMessage]): Unit = js.native
  def history(
    paramsOrCallback: paginatedResultCallback[PresenceMessage],
    callback: paginatedResultCallback[PresenceMessage]
  ): Unit = js.native
}

