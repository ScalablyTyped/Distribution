package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Presence extends js.Object {
  def get(): scala.Unit = js.native
  def get(paramsOrCallback: RestPresenceParams): scala.Unit = js.native
  def get(paramsOrCallback: RestPresenceParams, callback: paginatedResultCallback[PresenceMessage]): scala.Unit = js.native
  def get(paramsOrCallback: paginatedResultCallback[PresenceMessage]): scala.Unit = js.native
  def get(
    paramsOrCallback: paginatedResultCallback[PresenceMessage],
    callback: paginatedResultCallback[PresenceMessage]
  ): scala.Unit = js.native
  def history(paramsOrCallback: RestHistoryParams): scala.Unit = js.native
  def history(paramsOrCallback: RestHistoryParams, callback: paginatedResultCallback[PresenceMessage]): scala.Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[PresenceMessage]): scala.Unit = js.native
  def history(
    paramsOrCallback: paginatedResultCallback[PresenceMessage],
    callback: paginatedResultCallback[PresenceMessage]
  ): scala.Unit = js.native
}

