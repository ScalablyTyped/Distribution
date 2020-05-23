package typings.angularSignalrHub.ngSignalr

import typings.jquery.JQueryDeferred
import typings.jquery.JQueryPromise
import typings.signalr.SignalR.Connection
import typings.signalr.SignalR.Hub.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hub extends js.Object {
  var connection: Connection
  var hubName: String
  var proxy: Proxy
  def connect(): JQueryPromise[_]
  def disconnect(): Unit
  def invoke(method: String, args: js.Any*): JQueryDeferred[_]
  def on(event: String, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit
}

object Hub {
  @scala.inline
  def apply(
    connect: () => JQueryPromise[_],
    connection: Connection,
    disconnect: () => Unit,
    hubName: String,
    invoke: (String, /* repeated */ js.Any) => JQueryDeferred[_],
    on: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit,
    proxy: Proxy
  ): Hub = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), connection = connection.asInstanceOf[js.Any], disconnect = js.Any.fromFunction0(disconnect), hubName = hubName.asInstanceOf[js.Any], invoke = js.Any.fromFunction2(invoke), on = js.Any.fromFunction2(on), proxy = proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hub]
  }
}

