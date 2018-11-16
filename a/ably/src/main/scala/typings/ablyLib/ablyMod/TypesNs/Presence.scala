package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Presence extends js.Object {
  def get(params: RestPresenceParams): scala.Unit = js.native
  def get(params: RestPresenceParams, callback: paginatedResultCallback[PresenceMessage]): scala.Unit = js.native
  def get(params: paginatedResultCallback[PresenceMessage]): scala.Unit = js.native
  def get(
    params: paginatedResultCallback[PresenceMessage],
    callback: paginatedResultCallback[PresenceMessage]
  ): scala.Unit = js.native
  def history(params: RestPresenceHistoryParams): scala.Unit = js.native
  def history(params: RestPresenceHistoryParams, callback: paginatedResultCallback[PresenceMessage]): scala.Unit = js.native
  def history(params: paginatedResultCallback[PresenceMessage]): scala.Unit = js.native
  def history(
    params: paginatedResultCallback[PresenceMessage],
    callback: paginatedResultCallback[PresenceMessage]
  ): scala.Unit = js.native
}

