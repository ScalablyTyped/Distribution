package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimePresence extends js.Object {
  var syncComplete: scala.Boolean = js.native
  def enter(): scala.Unit = js.native
  def enter(data: errorCallback): scala.Unit = js.native
  def enter(data: errorCallback, callback: errorCallback): scala.Unit = js.native
  def enter(data: js.Any): scala.Unit = js.native
  def enter(data: js.Any, callback: errorCallback): scala.Unit = js.native
  def enterClient(clientId: java.lang.String): scala.Unit = js.native
  def enterClient(clientId: java.lang.String, data: errorCallback): scala.Unit = js.native
  def enterClient(clientId: java.lang.String, data: errorCallback, callback: errorCallback): scala.Unit = js.native
  def enterClient(clientId: java.lang.String, data: js.Any): scala.Unit = js.native
  def enterClient(clientId: java.lang.String, data: js.Any, callback: errorCallback): scala.Unit = js.native
  def get(Params: RealtimePresenceParams): scala.Unit = js.native
  def get(Params: RealtimePresenceParams, callback: realtimePresenceGetCallback): scala.Unit = js.native
  def get(Params: realtimePresenceGetCallback): scala.Unit = js.native
  def get(Params: realtimePresenceGetCallback, callback: realtimePresenceGetCallback): scala.Unit = js.native
  def history(ParamsOrCallback: RealtimePresenceHistoryParams): scala.Unit = js.native
  def history(
    ParamsOrCallback: RealtimePresenceHistoryParams,
    callback: paginatedResultCallback[PresenceMessage]
  ): scala.Unit = js.native
  def history(ParamsOrCallback: paginatedResultCallback[PresenceMessage]): scala.Unit = js.native
  def history(
    ParamsOrCallback: paginatedResultCallback[PresenceMessage],
    callback: paginatedResultCallback[PresenceMessage]
  ): scala.Unit = js.native
  def leave(): scala.Unit = js.native
  def leave(data: errorCallback): scala.Unit = js.native
  def leave(data: errorCallback, callback: errorCallback): scala.Unit = js.native
  def leave(data: js.Any): scala.Unit = js.native
  def leave(data: js.Any, callback: errorCallback): scala.Unit = js.native
  def leaveClient(clientId: java.lang.String): scala.Unit = js.native
  def leaveClient(clientId: java.lang.String, data: errorCallback): scala.Unit = js.native
  def leaveClient(clientId: java.lang.String, data: errorCallback, callback: errorCallback): scala.Unit = js.native
  def leaveClient(clientId: java.lang.String, data: js.Any): scala.Unit = js.native
  def leaveClient(clientId: java.lang.String, data: js.Any, callback: errorCallback): scala.Unit = js.native
  def subscribe(presenceOrCallback: PresenceAction): scala.Unit = js.native
  def subscribe(presenceOrCallback: PresenceAction, listener: messageCallback[PresenceMessage]): scala.Unit = js.native
  def subscribe(presenceOrCallback: messageCallback[PresenceMessage]): scala.Unit = js.native
  def subscribe(presenceOrCallback: messageCallback[PresenceMessage], listener: messageCallback[PresenceMessage]): scala.Unit = js.native
  def subscribe(presenceOrCallback: js.Array[PresenceAction]): scala.Unit = js.native
  def subscribe(presenceOrCallback: js.Array[PresenceAction], listener: messageCallback[PresenceMessage]): scala.Unit = js.native
  def unsubscribe(): scala.Unit = js.native
  def unsubscribe(presence: PresenceAction): scala.Unit = js.native
  def unsubscribe(presence: PresenceAction, listener: messageCallback[PresenceMessage]): scala.Unit = js.native
  def update(): scala.Unit = js.native
  def update(data: errorCallback): scala.Unit = js.native
  def update(data: errorCallback, callback: errorCallback): scala.Unit = js.native
  def update(data: js.Any): scala.Unit = js.native
  def update(data: js.Any, callback: errorCallback): scala.Unit = js.native
  def updateClient(clientId: java.lang.String): scala.Unit = js.native
  def updateClient(clientId: java.lang.String, data: errorCallback): scala.Unit = js.native
  def updateClient(clientId: java.lang.String, data: errorCallback, callback: errorCallback): scala.Unit = js.native
  def updateClient(clientId: java.lang.String, data: js.Any): scala.Unit = js.native
  def updateClient(clientId: java.lang.String, data: js.Any, callback: errorCallback): scala.Unit = js.native
}

