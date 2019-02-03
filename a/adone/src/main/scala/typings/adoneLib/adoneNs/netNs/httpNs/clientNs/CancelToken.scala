package typings
package adoneLib.adoneNs.netNs.httpNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.net.http.client.CancelToken")
@js.native
class CancelToken protected () extends js.Object {
  def this(executor: adoneLib.adoneNs.netNs.httpNs.clientNs.INs.Canceller) = this()
  var promise: js.Promise[Cancel] = js.native
  var reason: js.UndefOr[Cancel] = js.native
  def throwIfRequested(): scala.Unit = js.native
}

/* static members */
@JSGlobal("adone.net.http.client.CancelToken")
@js.native
object CancelToken extends js.Object {
  def source(): adoneLib.adoneNs.netNs.httpNs.clientNs.INs.CancelTokenSource = js.native
}

