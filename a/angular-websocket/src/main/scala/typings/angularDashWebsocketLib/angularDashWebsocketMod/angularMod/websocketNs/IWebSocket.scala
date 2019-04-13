package typings
package angularDashWebsocketLib.angularDashWebsocketMod.angularMod.websocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebSocket extends js.Object {
  /**
    * The initial timeout.
    */
  var initialTimeout: scala.Double = js.native
  /**
    * Maximun timeout used to determine reconnection delay.
    */
  var maxTimeout: scala.Double = js.native
  /**
    * List of callbacks to be executed when the socket is closed.
    */
  var onCloseCallbacks: js.Array[js.Function1[/* evt */ stdLib.CloseEvent, scala.Unit]] = js.native
  /**
    * List of callbacks to be executed when an error is received from the socket.
    */
  var onErrorCallbacks: js.Array[js.Function1[/* evt */ stdLib.Event, scala.Unit]] = js.native
  /**
    * List of callbacks to be executed when a message is received from the socket.
    */
  var onMessageCallbacks: js.Array[IWebSocketMessageHandler] = js.native
  /**
    * List of callbacks to be executed when the socket is opened.
    */
  var onOpenCallbacks: js.Array[js.Function1[/* evt */ stdLib.Event, scala.Unit]] = js.native
  /**
    * Returns either the readyState value from the underlying WebSocket instance
    * or a proprietary value representing the internal state
    */
  var readyState: scala.Double = js.native
  /**
    * Queue of send calls to be made on socket when socket is able to receive data.
    */
  var sendQueue: js.Array[IWebSocketQueueItem] = js.native
  /**
    * WebSocket instance.
    */
  var socket: stdLib.WebSocket = js.native
  /**
    * Closes the underlying socket, as long as no data is still being sent from the client.
    *
    * @param force if `true`, force close even if data is still being sent
    * @returns this instance, for method chaining
    */
  def close(): IWebSocket = js.native
  def close(force: scala.Boolean): IWebSocket = js.native
  /**
    * Adds a callback to be executed each time a socket connection is closed for
    * this instance.
    *
    * @param event event object
    * @returns this instance, for method chaining
    */
  def onClose(callback: js.Function1[/* event */ stdLib.CloseEvent, scala.Unit]): IWebSocket = js.native
  /**
    * Adds a callback to be executed each time a socket connection is closed for
    * this instance.
    *
    * @param event event object
    * @returns this instance, for method chaining
    */
  def onError(callback: js.Function1[/* event */ stdLib.Event, scala.Unit]): IWebSocket = js.native
  /**
    * Adds a callback to be executed each time a socket connection has an error for
    * this instance.
    *
    * @param event event object
    * @returns this instance, for method chaining
    */
  def onMessage(callback: js.Function1[/* event */ stdLib.MessageEvent, scala.Unit]): IWebSocket = js.native
  def onMessage(
    callback: js.Function1[/* event */ stdLib.MessageEvent, scala.Unit],
    options: IWebSocketMessageOptions
  ): IWebSocket = js.native
  /**
    * Adds a callback to be executed each time a socket connection is opened for
    * this instance.
    *
    * @param event event object
    * @returns this instance, for method chaining
    */
  def onOpen(callback: js.Function1[/* event */ stdLib.Event, scala.Unit]): IWebSocket = js.native
  /**
    * Adds data to a queue, and attempts to send if the socket is ready.
    *
    * @param data data to send, if this is an object, it will be stringified before sending
    */
  def send(data: java.lang.String): angularLib.angularMod.IPromise[_] = js.native
  def send(data: js.Object): angularLib.angularMod.IPromise[_] = js.native
}

