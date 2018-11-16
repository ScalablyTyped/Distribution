package typings
package anyDashPromiseLib.anyDashPromiseMod.PromiseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Thenable[R] extends js.Object {
  def `then`[U](): Thenable[U] = js.native
  def `then`[U](onFulfilled: js.Function1[/* value */ R, U | Thenable[U]]): Thenable[U] = js.native
  def `then`[U](
    onFulfilled: js.Function1[/* value */ R, U | Thenable[U]],
    onRejected: js.Function1[/* error */ js.Any, U | Thenable[U] | scala.Unit]
  ): Thenable[U] = js.native
}

