package typings
package angularDashSignalrDashHubLib.ngSignalrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ngSignalr.Hub")
@js.native
class Hub () extends js.Object {
  var connection: signalrLib.SignalRNs.Connection = js.native
  var hubName: java.lang.String = js.native
  var proxy: signalrLib.SignalRNs.HubNs.Proxy = js.native
  def connect(): jqueryLib.JQueryPromise[_] = js.native
  def disconnect(): scala.Unit = js.native
  def invoke(method: java.lang.String, args: js.Any*): jqueryLib.JQueryDeferred[_] = js.native
  def on(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
}

