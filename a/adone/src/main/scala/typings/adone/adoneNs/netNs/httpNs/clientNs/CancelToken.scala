package typings.adone.adoneNs.netNs.httpNs.clientNs

import typings.adone.adoneNs.netNs.httpNs.clientNs.INs.CancelTokenSource
import typings.adone.adoneNs.netNs.httpNs.clientNs.INs.Canceller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.net.http.client.CancelToken")
@js.native
class CancelToken protected () extends js.Object {
  def this(executor: Canceller) = this()
  var promise: js.Promise[Cancel] = js.native
  var reason: js.UndefOr[Cancel] = js.native
  def throwIfRequested(): Unit = js.native
}

/* static members */
@JSGlobal("adone.net.http.client.CancelToken")
@js.native
object CancelToken extends js.Object {
  def source(): CancelTokenSource = js.native
}

