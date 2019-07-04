package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimePresencePromise extends RealtimePresenceBase {
  def enter(): js.Promise[scala.Unit] = js.native
  def enter(data: js.Any): js.Promise[scala.Unit] = js.native
  def enterClient(clientId: java.lang.String): js.Promise[scala.Unit] = js.native
  def enterClient(clientId: java.lang.String, data: js.Any): js.Promise[scala.Unit] = js.native
  def get(): js.Promise[js.Array[PresenceMessage]] = js.native
  def get(params: RealtimePresenceParams): js.Promise[js.Array[PresenceMessage]] = js.native
  def history(): js.Promise[PaginatedResult[PresenceMessage]] = js.native
  def history(params: RealtimeHistoryParams): js.Promise[PaginatedResult[PresenceMessage]] = js.native
  def leave(): js.Promise[scala.Unit] = js.native
  def leave(data: js.Any): js.Promise[scala.Unit] = js.native
  def leaveClient(clientId: java.lang.String): js.Promise[scala.Unit] = js.native
  def leaveClient(clientId: java.lang.String, data: js.Any): js.Promise[scala.Unit] = js.native
  def subscribe(): js.Promise[scala.Unit] = js.native
  def subscribe(action: PresenceAction): js.Promise[scala.Unit] = js.native
  def subscribe(action: PresenceAction, listener: messageCallback[PresenceMessage]): js.Promise[scala.Unit] = js.native
  def subscribe(action: messageCallback[PresenceMessage]): js.Promise[scala.Unit] = js.native
  def subscribe(action: messageCallback[PresenceMessage], listener: messageCallback[PresenceMessage]): js.Promise[scala.Unit] = js.native
  def subscribe(action: js.Array[PresenceAction]): js.Promise[scala.Unit] = js.native
  def subscribe(action: js.Array[PresenceAction], listener: messageCallback[PresenceMessage]): js.Promise[scala.Unit] = js.native
  def update(): js.Promise[scala.Unit] = js.native
  def update(data: js.Any): js.Promise[scala.Unit] = js.native
  def updateClient(clientId: java.lang.String): js.Promise[scala.Unit] = js.native
  def updateClient(clientId: java.lang.String, data: js.Any): js.Promise[scala.Unit] = js.native
}

