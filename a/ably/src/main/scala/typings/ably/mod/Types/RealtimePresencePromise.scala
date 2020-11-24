package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimePresencePromise extends RealtimePresenceBase {
  
  def enter(): js.Promise[Unit] = js.native
  def enter(data: js.Any): js.Promise[Unit] = js.native
  
  def enterClient(clientId: String): js.Promise[Unit] = js.native
  def enterClient(clientId: String, data: js.Any): js.Promise[Unit] = js.native
  
  def get(): js.Promise[js.Array[PresenceMessage]] = js.native
  def get(params: RealtimePresenceParams): js.Promise[js.Array[PresenceMessage]] = js.native
  
  def history(): js.Promise[PaginatedResult[PresenceMessage]] = js.native
  def history(params: RealtimeHistoryParams): js.Promise[PaginatedResult[PresenceMessage]] = js.native
  
  def leave(): js.Promise[Unit] = js.native
  def leave(data: js.Any): js.Promise[Unit] = js.native
  
  def leaveClient(clientId: String): js.Promise[Unit] = js.native
  def leaveClient(clientId: String, data: js.Any): js.Promise[Unit] = js.native
  
  def subscribe(): js.Promise[Unit] = js.native
  def subscribe(action: js.UndefOr[PresenceAction], listener: messageCallback[PresenceMessage]): js.Promise[Unit] = js.native
  def subscribe(action: js.Array[PresenceAction]): js.Promise[Unit] = js.native
  def subscribe(action: js.Array[PresenceAction], listener: messageCallback[PresenceMessage]): js.Promise[Unit] = js.native
  def subscribe(action: PresenceAction): js.Promise[Unit] = js.native
  def subscribe(action: messageCallback[PresenceMessage]): js.Promise[Unit] = js.native
  def subscribe(action: messageCallback[PresenceMessage], listener: messageCallback[PresenceMessage]): js.Promise[Unit] = js.native
  
  def update(): js.Promise[Unit] = js.native
  def update(data: js.Any): js.Promise[Unit] = js.native
  
  def updateClient(clientId: String): js.Promise[Unit] = js.native
  def updateClient(clientId: String, data: js.Any): js.Promise[Unit] = js.native
}
