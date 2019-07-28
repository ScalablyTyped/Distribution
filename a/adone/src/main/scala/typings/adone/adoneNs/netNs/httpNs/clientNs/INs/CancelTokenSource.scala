package typings.adone.adoneNs.netNs.httpNs.clientNs.INs

import typings.adone.adoneNs.netNs.httpNs.clientNs.CancelToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelTokenSource extends js.Object {
  @JSName("cancel")
  var cancel_Original: Canceller = js.native
  var token: CancelToken = js.native
  def cancel(): Unit = js.native
  def cancel(message: String): Unit = js.native
}

