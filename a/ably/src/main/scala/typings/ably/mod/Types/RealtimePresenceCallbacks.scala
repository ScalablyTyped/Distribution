package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimePresenceCallbacks extends RealtimePresenceBase {
  
  def enter(): Unit = js.native
  def enter(data: js.UndefOr[scala.Nothing], callback: errorCallback): Unit = js.native
  def enter(data: js.Any): Unit = js.native
  def enter(data: js.Any, callback: errorCallback): Unit = js.native
  def enter(data: errorCallback): Unit = js.native
  def enter(data: errorCallback, callback: errorCallback): Unit = js.native
  
  def enterClient(clientId: String): Unit = js.native
  def enterClient(clientId: String, data: js.UndefOr[scala.Nothing], callback: errorCallback): Unit = js.native
  def enterClient(clientId: String, data: js.Any): Unit = js.native
  def enterClient(clientId: String, data: js.Any, callback: errorCallback): Unit = js.native
  def enterClient(clientId: String, data: errorCallback): Unit = js.native
  def enterClient(clientId: String, data: errorCallback, callback: errorCallback): Unit = js.native
  
  def get(): Unit = js.native
  def get(paramsOrCallback: js.UndefOr[scala.Nothing], callback: realtimePresenceGetCallback): Unit = js.native
  def get(paramsOrCallback: RealtimePresenceParams): Unit = js.native
  def get(paramsOrCallback: RealtimePresenceParams, callback: realtimePresenceGetCallback): Unit = js.native
  def get(paramsOrCallback: realtimePresenceGetCallback): Unit = js.native
  def get(paramsOrCallback: realtimePresenceGetCallback, callback: realtimePresenceGetCallback): Unit = js.native
  
  def history(): Unit = js.native
  def history(paramsOrCallback: js.UndefOr[scala.Nothing], callback: paginatedResultCallback[PresenceMessage]): Unit = js.native
  def history(paramsOrCallback: RealtimeHistoryParams): Unit = js.native
  def history(paramsOrCallback: RealtimeHistoryParams, callback: paginatedResultCallback[PresenceMessage]): Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[PresenceMessage]): Unit = js.native
  def history(
    paramsOrCallback: paginatedResultCallback[PresenceMessage],
    callback: paginatedResultCallback[PresenceMessage]
  ): Unit = js.native
  
  def leave(): Unit = js.native
  def leave(data: js.UndefOr[scala.Nothing], callback: errorCallback): Unit = js.native
  def leave(data: js.Any): Unit = js.native
  def leave(data: js.Any, callback: errorCallback): Unit = js.native
  def leave(data: errorCallback): Unit = js.native
  def leave(data: errorCallback, callback: errorCallback): Unit = js.native
  
  def leaveClient(clientId: String): Unit = js.native
  def leaveClient(clientId: String, data: js.UndefOr[scala.Nothing], callback: errorCallback): Unit = js.native
  def leaveClient(clientId: String, data: js.Any): Unit = js.native
  def leaveClient(clientId: String, data: js.Any, callback: errorCallback): Unit = js.native
  def leaveClient(clientId: String, data: errorCallback): Unit = js.native
  def leaveClient(clientId: String, data: errorCallback, callback: errorCallback): Unit = js.native
  
  def subscribe(presenceOrListener: js.Array[PresenceAction]): Unit = js.native
  def subscribe(
    presenceOrListener: js.Array[PresenceAction],
    listener: js.UndefOr[scala.Nothing],
    callbackWhenAttached: errorCallback
  ): Unit = js.native
  def subscribe(presenceOrListener: js.Array[PresenceAction], listener: messageCallback[PresenceMessage]): Unit = js.native
  def subscribe(
    presenceOrListener: js.Array[PresenceAction],
    listener: messageCallback[PresenceMessage],
    callbackWhenAttached: errorCallback
  ): Unit = js.native
  def subscribe(presenceOrListener: PresenceAction): Unit = js.native
  def subscribe(
    presenceOrListener: PresenceAction,
    listener: js.UndefOr[scala.Nothing],
    callbackWhenAttached: errorCallback
  ): Unit = js.native
  def subscribe(presenceOrListener: PresenceAction, listener: messageCallback[PresenceMessage]): Unit = js.native
  def subscribe(
    presenceOrListener: PresenceAction,
    listener: messageCallback[PresenceMessage],
    callbackWhenAttached: errorCallback
  ): Unit = js.native
  def subscribe(presenceOrListener: messageCallback[PresenceMessage]): Unit = js.native
  def subscribe(
    presenceOrListener: messageCallback[PresenceMessage],
    listener: js.UndefOr[scala.Nothing],
    callbackWhenAttached: errorCallback
  ): Unit = js.native
  def subscribe(presenceOrListener: messageCallback[PresenceMessage], listener: messageCallback[PresenceMessage]): Unit = js.native
  def subscribe(
    presenceOrListener: messageCallback[PresenceMessage],
    listener: messageCallback[PresenceMessage],
    callbackWhenAttached: errorCallback
  ): Unit = js.native
  
  def update(): Unit = js.native
  def update(data: js.UndefOr[scala.Nothing], callback: errorCallback): Unit = js.native
  def update(data: js.Any): Unit = js.native
  def update(data: js.Any, callback: errorCallback): Unit = js.native
  def update(data: errorCallback): Unit = js.native
  def update(data: errorCallback, callback: errorCallback): Unit = js.native
  
  def updateClient(clientId: String): Unit = js.native
  def updateClient(clientId: String, data: js.UndefOr[scala.Nothing], callback: errorCallback): Unit = js.native
  def updateClient(clientId: String, data: js.Any): Unit = js.native
  def updateClient(clientId: String, data: js.Any, callback: errorCallback): Unit = js.native
  def updateClient(clientId: String, data: errorCallback): Unit = js.native
  def updateClient(clientId: String, data: errorCallback, callback: errorCallback): Unit = js.native
}
