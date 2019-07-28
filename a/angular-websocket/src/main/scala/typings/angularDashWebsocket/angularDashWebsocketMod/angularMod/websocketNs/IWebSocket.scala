package typings.angularDashWebsocket.angularDashWebsocketMod.angularMod.websocketNs

import typings.angular.angularMod.IPromise
import typings.std.CloseEvent
import typings.std.Event
import typings.std.MessageEvent
import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebSocket extends js.Object {
  /**
    * The initial timeout.
    */
  var initialTimeout: Double = js.native
  /**
    * Maximun timeout used to determine reconnection delay.
    */
  var maxTimeout: Double = js.native
  /**
    * List of callbacks to be executed when the socket is closed.
    */
  var onCloseCallbacks: js.Array[js.Function1[/* evt */ CloseEvent, Unit]] = js.native
  /**
    * List of callbacks to be executed when an error is received from the socket.
    */
  var onErrorCallbacks: js.Array[js.Function1[/* evt */ Event, Unit]] = js.native
  /**
    * List of callbacks to be executed when a message is received from the socket.
    */
  var onMessageCallbacks: js.Array[
    typings.angularDashWebsocket.angularDashWebsocketMod.angularMod.websocketNs.IWebSocketMessageHandler
  ] = js.native
  /**
    * List of callbacks to be executed when the socket is opened.
    */
  var onOpenCallbacks: js.Array[js.Function1[/* evt */ Event, Unit]] = js.native
  /**
    * Returns either the readyState value from the underlying WebSocket instance
    * or a proprietary value representing the internal state
    */
  var readyState: Double = js.native
  /**
    * Queue of send calls to be made on socket when socket is able to receive data.
    */
  var sendQueue: js.Array[
    typings.angularDashWebsocket.angularDashWebsocketMod.angularMod.websocketNs.IWebSocketQueueItem
  ] = js.native
  /**
    * WebSocket instance.
    */
  var socket: WebSocket = js.native
  /**
    * Closes the underlying socket, as long as no data is still being sent from the client.
    *
    * @param force if `true`, force close even if data is still being sent
    * @returns this instance, for method chaining
    */
  def close(): typings.angularDashWebsocket.angularDashWebsocketMod.angularMod.websocketNs.IWebSocket = js.native
  def close(force: Boolean): typings.angularDashWebsocket.angularDashWebsocketMod.angularMod.websocketNs.IWebSocket = js.native
  /**
    * Adds a callback to be executed each time a socket connection is closed for
    * this instance.
    *
    * @param event event object
    * @returns this instance, for method chaining
    */
  def onClose(callback: js.Function1[/* event */ CloseEvent, Unit]): typings.angularDashWebsocket.angularDashWebsocketMod.angularMod.websocketNs.IWebSocket = js.native
  /**
    * Adds a callback to be executed each time a socket connection is closed for
    * this instance.
    *
    * @param event event object
    * @returns this instance, for method chaining
    */
  def onError(callback: js.Function1[/* event */ Event, Unit]): typings.angularDashWebsocket.angularDashWebsocketMod.angularMod.websocketNs.IWebSocket = js.native
  /**
    * Adds a callback to be executed each time a socket connection has an error for
    * this instance.
    *
    * @param event event object
    * @returns this instance, for method chaining
    */
  def onMessage(callback: js.Function1[/* event */ MessageEvent, Unit]): typings.angularDashWebsocket.angularDashWebsocketMod.angularMod.websocketNs.IWebSocket = js.native
  def onMessage(
    callback: js.Function1[/* event */ MessageEvent, Unit],
    options: typings.angularDashWebsocket.angularDashWebsocketMod.angularMod.websocketNs.IWebSocketMessageOptions
  ): typings.angularDashWebsocket.angularDashWebsocketMod.angularMod.websocketNs.IWebSocket = js.native
  /**
    * Adds a callback to be executed each time a socket connection is opened for
    * this instance.
    *
    * @param event event object
    * @returns this instance, for method chaining
    */
  def onOpen(callback: js.Function1[/* event */ Event, Unit]): typings.angularDashWebsocket.angularDashWebsocketMod.angularMod.websocketNs.IWebSocket = js.native
  /**
    * Adds data to a queue, and attempts to send if the socket is ready.
    *
    * @param data data to send, if this is an object, it will be stringified before sending
    */
  def send(data: String): IPromise[_] = js.native
  def send(data: js.Object): IPromise[_] = js.native
}

